package com.NoComment1105.Periodic.items;

import com.NoComment1105.Periodic.periodic;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterArmour {

    public static final ArmorMaterial customArmorMaterial = new UraniumArmour();
    public static final Item URANIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    // If you made a new material, this is where you would note it.
    public static final Item URANIUM_HELMET = new ArmorItem(customArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item URANIUM_CHESTPLATE = new ArmorItem(customArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item URANIUM_LEGGINGS = new ArmorItem(customArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item URANIUM_BOOTS = new ArmorItem(customArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(periodic.ITEM_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_helmet"), URANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_chestplate"), URANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_leggings"), URANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_boots"), URANIUM_BOOTS);
    }
}
