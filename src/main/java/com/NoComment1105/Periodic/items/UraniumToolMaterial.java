package com.NoComment1105.Periodic.items;

import com.NoComment1105.Periodic.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UraniumToolMaterial  implements ToolMaterial {
    public static final UraniumToolMaterial INSTANCE = new UraniumToolMaterial();
    @Override
    public int getDurability() {
        return 650;
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
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.URANIUM);
    }
}
