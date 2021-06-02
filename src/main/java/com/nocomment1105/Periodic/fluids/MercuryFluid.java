package com.nocomment1105.Periodic.fluids;

import com.nocomment1105.Periodic.periodic;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.Random;

public abstract class MercuryFluid extends BaseFluid {
    @Override
    public Fluid getStill() {
        return periodic.STILL_MERCURY;
    }
    @Override
    public Fluid getFlowing() {
        return periodic.FLOWING_MERCURY;
    }
    @Override
    public Item getBucketItem() {
        return periodic.MERCURY_BUCKET;
    }
    @Override
    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {
        if (!state.isStill() && !(Boolean)state.get(FALLING)) {
            if (random.nextInt(64) == 0) {
                world.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
            }
        }
    }
    @Override
    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.ITEM_BUCKET_FILL);
    }
    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        // method_15741 (in 1.16) converts the LEVEL_1_8 of the fluid state to the Level_15 the fluid block uses
        // getBlockStateLevel replaced this in 1.17pre-1+
        return periodic.MERCURY.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }
        public static class Flowing extends MercuryFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }
        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }
        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }
    public static class Still extends MercuryFluid {
        @Override
        // How high the fluid sits when in one block space
        public int getLevel(FluidState fluidState) {
            return 8;
        }
        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
