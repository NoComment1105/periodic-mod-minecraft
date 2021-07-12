package me.nocomment1105.Periodic.toolitems;

import me.nocomment1105.Periodic.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UraniumTools implements ToolMaterial {
    public static final UraniumTools INSTANCE = new UraniumTools();
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
        return 5.0F;
    }
    @Override
    public int getMiningLevel() {
        return 2;
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
