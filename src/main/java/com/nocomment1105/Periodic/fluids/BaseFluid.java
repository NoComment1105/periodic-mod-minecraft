package com.nocomment1105.Periodic.fluids;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class BaseFluid extends FlowableFluid {
    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }
    @Override
    protected boolean isInfinite() {
        return false;
    }
    // Perform actions when the fluid goes into a replaceable block.
    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
       final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
       Block.dropStacks(state, world, pos, blockEntity);
    }
    // returns whether the given fluid can flow into this Fluidstate
    @Override
    protected boolean canBeReplacedWith(FluidState fluidState, BlockView blockView, BlockPos blockPos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !fluid.isIn(FluidTags.WATER);
    }
    @Override
    // Water is 4 in overworld, Lava is 4 in nether. Lava is 2 in overworld
    protected int getFlowSpeed(WorldView worldView) {
        return 3;
    }
    @Override
    protected int getLevelDecreasePerBlock(WorldView worldView) {
        return 2;
    }
    @Override
    public int getTickRate(WorldView worldView) {
        return 8;
    }
    @Override
    protected float getBlastResistance() {
        return 100.0f;
    }
}
