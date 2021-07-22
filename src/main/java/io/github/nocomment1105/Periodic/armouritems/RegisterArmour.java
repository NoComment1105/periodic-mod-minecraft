package io.github.nocomment1105.Periodic.armouritems;

import io.github.nocomment1105.Periodic.periodic;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterArmour {

    public static final ArmorMaterial customArmorMaterial = new AluminiumArmour();
    public static final ArmorMaterial customArmorMaterial2 = new ReinforcedAluminiumArmour();
    public static final ArmorMaterial customArmorMaterial3 = new ReinforcedDiamondArmour();
    public static final ArmorMaterial customArmorMaterial4 = new ReinforcedNetheriteArmour();
    // Aluminium
    public static final Item ALUMINIUM_HELMET = new ArmorItem(customArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_CHESTPLATE = new ArmorItem(customArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_LEGGINGS = new ArmorItem(customArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item ALUMINIUM_BOOTS = new ArmorItem(customArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(periodic.ARMOUR_GROUP));
    // Reinforced Aluminium
    public static final Item REINFORCED_ALUMINIUM_HELMET = new ArmorItem(customArmorMaterial2, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_ALUMINIUM_CHESTPLATE = new ArmorItem(customArmorMaterial2, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_ALUMINIUM_LEGGINGS = new ArmorItem(customArmorMaterial2, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_ALUMINIUM_BOOTS = new ArmorItem(customArmorMaterial2, EquipmentSlot.FEET, new Item.Settings().group(periodic.ARMOUR_GROUP));
    // Reinforced Diamond
    public static final Item REINFORCED_DIAMOND_HELMET = new ArmorItem(customArmorMaterial3, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_DIAMOND_CHESTPLATE = new ArmorItem(customArmorMaterial3, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_DIAMOND_LEGGINGS = new ArmorItem(customArmorMaterial3, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_DIAMOND_BOOTS = new ArmorItem(customArmorMaterial3, EquipmentSlot.FEET, new Item.Settings().group(periodic.ARMOUR_GROUP));
    // Reinforced Netherite
    public static final Item REINFORCED_NETHERITE_HELMET = new ArmorItem(customArmorMaterial4, EquipmentSlot.HEAD, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_NETHERITE_CHESTPLATE = new ArmorItem(customArmorMaterial4, EquipmentSlot.CHEST, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_NETHERITE_LEGGINGS = new ArmorItem(customArmorMaterial4, EquipmentSlot.LEGS, new Item.Settings().group(periodic.ARMOUR_GROUP));
    public static final Item REINFORCED_NETHERITE_BOOTS = new ArmorItem(customArmorMaterial4, EquipmentSlot.FEET, new Item.Settings().group(periodic.ARMOUR_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_helmet"), ALUMINIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_chestplate"), ALUMINIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_leggings"), ALUMINIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "aluminium_boots"), ALUMINIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_aluminium_helmet"), REINFORCED_ALUMINIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_aluminium_chestplate"), REINFORCED_ALUMINIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_aluminium_leggings"), REINFORCED_ALUMINIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_aluminium_boots"), REINFORCED_ALUMINIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_helmet"), REINFORCED_DIAMOND_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_chestplate"), REINFORCED_DIAMOND_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_leggings"), REINFORCED_DIAMOND_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_boots"), REINFORCED_DIAMOND_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_helmet"), REINFORCED_NETHERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_chestplate"), REINFORCED_NETHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_leggings"), REINFORCED_NETHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_boots"), REINFORCED_NETHERITE_BOOTS);
    }
}
