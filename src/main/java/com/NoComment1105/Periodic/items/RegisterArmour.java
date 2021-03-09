package com.NoComment1105.Periodic.items;

import com.NoComment1105.Periodic.periodic;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterArmour {

    public static final ArmorMaterial customArmorMaterial = new AluminiumArmour();
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(periodic.ARMOUR_GROUP));
    // If you made a new material, this is where you would note it.
    public static final Item ALUMINIUM_HELMET = new ArmorItem(customArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_CHESTPLATE = new ArmorItem(customArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_LEGGINGS = new ArmorItem(customArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_BOOTS = new ArmorItem(customArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(periodic.ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_helmet"), ALUMINIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_chestplate"), ALUMINIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_leggings"), ALUMINIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_boots"), ALUMINIUM_BOOTS);
    }
}
