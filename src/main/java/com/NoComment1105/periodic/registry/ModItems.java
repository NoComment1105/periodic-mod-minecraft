package com.NoComment1105.Periodic.registry;
import com.NoComment1105.Periodic.items.UraniumSwordItem;
import com.NoComment1105.Periodic.items.UraniumToolMaterial;
import com.NoComment1105.Periodic.periodic;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item URANIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static ToolItem URANIUM_SWORD = new UraniumSwordItem(UraniumToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem URANIUM_SHOVEL = new ShovelItem(UraniumToolMaterial.INSTANCE, -3F, -3.0F, new Item.Settings().group(periodic.TOOL_GROUP));
    //Block Items
    public static final BlockItem URANIUM_BLOCK = new BlockItem(ModBlocks.URANIUM_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem URANIUM_ORE = new BlockItem(ModBlocks.URANIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem ALUMINIUM_BLOCK = new BlockItem(ModBlocks.ALUMINIUM_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem ALUMINIUM_ORE = new BlockItem(ModBlocks.ALUMINIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem POTASSIUM_ORE = new BlockItem(ModBlocks.POTASSIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));

    //registering the existance of the items note that blocks need an item form too
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium"), URANIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium_ore"), ALUMINIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "potassium_ore"), POTASSIUM_ORE);
    }

    public static class UraniumPickaxeItem extends PickaxeItem {
        public UraniumPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
        public static ToolItem URANIUM_PICKAXE = new UraniumPickaxeItem(UraniumToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class UraniumAxeItem extends AxeItem {
        public UraniumAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
        public static ToolItem URANIUM_AXE = new UraniumAxeItem(UraniumToolMaterial.INSTANCE, 2, -3.1F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class UraniumHoeItem extends HoeItem {
        public UraniumHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }
        public static ToolItem URANIUM_HOE = new UraniumHoeItem(UraniumToolMaterial.INSTANCE, -6, 0F, new Item.Settings().group(periodic.TOOL_GROUP));
    }
}