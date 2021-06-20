package com.nocomment1105.Periodic.armouritems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ReinforcedDiamondArmour implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {472, 545, 580, 399};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }

    @Override
    public String getName() {
        return "diamond";
    }

    @Override
    public float getToughness() {
        return 2.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
