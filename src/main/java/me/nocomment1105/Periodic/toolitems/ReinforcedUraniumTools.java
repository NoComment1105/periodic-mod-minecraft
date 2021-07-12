package me.nocomment1105.Periodic.toolitems;

import me.nocomment1105.Periodic.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedUraniumTools implements ToolMaterial {
    public static final ReinforcedUraniumTools INSTANCE = new ReinforcedUraniumTools();
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
        return 5.0F;
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
