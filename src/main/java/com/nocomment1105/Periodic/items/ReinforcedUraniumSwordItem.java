package com.nocomment1105.Periodic.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ReinforcedUraniumSwordItem extends SwordItem {

    public ReinforcedUraniumSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (!target.isDead()){
            target.applyStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 65, 1));
        }
        return true;
    }

}
