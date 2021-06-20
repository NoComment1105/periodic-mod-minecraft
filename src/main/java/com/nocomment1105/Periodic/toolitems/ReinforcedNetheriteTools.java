package com.nocomment1105.Periodic.toolitems;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedNetheriteTools implements ToolMaterial {
    public static final ReinforcedNetheriteTools INSTANCE = new ReinforcedNetheriteTools();
    @Override
    public int getDurability() {
        return 2234;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7;
    }

    @Override
    public float getAttackDamage() {
        return 8;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
