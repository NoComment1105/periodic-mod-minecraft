package com.nocomment1105.Periodic.toolitems;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedDiamondTools implements ToolMaterial {
    public static final ReinforcedDiamondTools INSTANCE = new ReinforcedDiamondTools();
    @Override
    public int getDurability() {
        return 1717;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7;
    }

    @Override
    public float getAttackDamage() {
        return 7;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }
}
