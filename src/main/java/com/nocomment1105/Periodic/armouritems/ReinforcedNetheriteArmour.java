package com.nocomment1105.Periodic.armouritems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ReinforcedNetheriteArmour implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {529, 611, 651, 448};
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
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }

    @Override
    public String getName() {
        return "reinforced_netherite";
    }

    @Override
    public float getToughness() {
        return 3.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.15f;
    }
}
