package com.nocomment1105.Periodic.items;

import com.nocomment1105.Periodic.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedUraniumToolMaterial implements ToolMaterial {
    public static final ReinforcedUraniumToolMaterial INSTANCE = new ReinforcedUraniumToolMaterial();
    @Override
    public int getDurability() {
        return 715;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }
    @Override
    public float getAttackDamage() {
        return 6.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
        return 16;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.URANIUM);
    }
}
