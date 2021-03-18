package com.NoComment1105.Periodic;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class UraniumBlock extends Block implements BlockEntityProvider {
    public UraniumBlock(AbstractBlock.Settings settings) {
        super(settings);
    }
    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        if (!entity.isFireImmune() && entity instanceof LivingEntity && !EnchantmentHelper.hasFrostWalker((LivingEntity)entity)) {
            entity.damage(DamageSource.HOT_FLOOR, 1.0F);
        }

        super.onSteppedOn(world, pos, entity);
    }
    @Override
    public BlockEntity createBlockEntity(BlockView blockView) {
        return new UraniumBlockEntity();
    }
}