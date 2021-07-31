package io.github.nocomment1105.Periodic.registry;

import io.github.nocomment1105.Periodic.periodic;
import io.github.nocomment1105.Periodic.toolitems.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item URANIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item ALUMINIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item POTASSIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item SILVER = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item STEEL = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item SULFUR = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item RAW_ALUMINIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final Item GOLD_AMALGAM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));
    public static final FlintAndSteelItem MATCHES = new FlintAndSteelItem(new Item.Settings().maxDamage(1).group(periodic.ITEM_GROUP));
    public static final Item LOGO = new Item(new Item.Settings());
    // Tools
    public static ToolItem URANIUM_SWORD = new UraniumSwordItem(UraniumTools.INSTANCE, 0, -2.4F, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem URANIUM_SHOVEL = new ShovelItem(UraniumTools.INSTANCE, -3F, -3.0F, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_URANIUM_SWORD = new ReinforcedUraniumSwordItem(ReinforcedUraniumTools.INSTANCE, 0, -2.4f, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_URANIUM_SHOVEL = new ShovelItem(ReinforcedUraniumTools.INSTANCE, -3, -3, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_DIAMOND_SHOVEL = new ShovelItem(ReinforcedDiamondTools.INSTANCE, -2.5f, -3, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_NETHERITE_SHOVEL = new ShovelItem(ReinforcedNetheriteTools.INSTANCE, -2.5f, -3, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_DIAMOND_SWORD = new SwordItem(UraniumTools.INSTANCE, 1, -2.4F, new Item.Settings().group(periodic.TOOL_GROUP));
    public static ToolItem REINFORCED_NETHERITE_SWORD = new SwordItem(UraniumTools.INSTANCE, 2, -2.4F, new Item.Settings().group(periodic.TOOL_GROUP));
    //Block Items
    public static final BlockItem URANIUM_BLOCK = new BlockItem(ModBlocks.URANIUM_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem URANIUM_ORE = new BlockItem(ModBlocks.URANIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem ALUMINIUM_BLOCK = new BlockItem(ModBlocks.ALUMINIUM_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem ALUMINIUM_ORE = new BlockItem(ModBlocks.ALUMINIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem POTASSIUM_ORE = new BlockItem(ModBlocks.POTASSIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem POTASSIUM_LANTERN = new BlockItem(ModBlocks.POTASSIUM_LANTERN, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem SILVER_BLOCK = new BlockItem(ModBlocks.SILVER_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem SILVER_ORE = new BlockItem(ModBlocks.SILVER_ORE, new Item.Settings().group(periodic.ITEM_GROUP));

    //registering the existence of the items note that blocks need an item form too
    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium"), URANIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium"), ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "potassium"), POTASSIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "silver"), SILVER);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "sulfur"), SULFUR);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "steel"), STEEL);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "raw_aluminium"), RAW_ALUMINIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "gold_amalgam"), GOLD_AMALGAM);
        // Blocks
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "aluminium_ore"), ALUMINIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "potassium_ore"), POTASSIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "silver_ore"), SILVER_ORE);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "k_lantern"), POTASSIUM_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "matches"), MATCHES);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "logo"), LOGO);
        // Torch
        Registry.register(Registry.ITEM, new Identifier("periodic", "potassium_torch"), (BlockItem)(new
                WallStandingBlockItem(ModBlocks.POTASSIUM_TORCH, ModBlocks.POTASSIUM_WALL_TORCH, new FabricItemSettings()
                .group(periodic.ITEM_GROUP))));

    }

    // Uranium Tool Properties
    public static class UraniumPickaxeItem extends PickaxeItem {
        public UraniumPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem URANIUM_PICKAXE = new UraniumPickaxeItem(UraniumTools.INSTANCE, -2, -2.8F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class UraniumAxeItem extends AxeItem {
        public UraniumAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem URANIUM_AXE = new UraniumAxeItem(UraniumTools.INSTANCE, 2, -3.1F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class UraniumHoeItem extends HoeItem {
        public UraniumHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem URANIUM_HOE = new UraniumHoeItem(UraniumTools.INSTANCE, -5, 0F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    // Reinforced Uranium Tool properties
    public static class ReinforcedUraniumPickaxeItem extends PickaxeItem {
        public ReinforcedUraniumPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_URANIUM_PICKAXE = new UraniumPickaxeItem(UraniumTools.INSTANCE, -2, -2.8F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedUraniumAxeItem extends AxeItem {
        public ReinforcedUraniumAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_URANIUM_AXE = new UraniumAxeItem(UraniumTools.INSTANCE, 2, -3.1F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedUraniumHoeItem extends HoeItem {
        public ReinforcedUraniumHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_URANIUM_HOE = new UraniumHoeItem(UraniumTools.INSTANCE, -5, 0F, new Item.Settings().group(periodic.TOOL_GROUP));
    }

    // Reinforced Diamond Tool Properties
    public static class ReinforcedDiamondPickaxeItem extends PickaxeItem {
        public ReinforcedDiamondPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_DIAMOND_PICKAXE =
                new ReinforcedDiamondPickaxeItem(ReinforcedDiamondTools.INSTANCE, -3, -2.8F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedDiamondAxeItem extends AxeItem {
        public ReinforcedDiamondAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_DIAMOND_AXE = new ReinforcedDiamondAxeItem(ReinforcedDiamondTools.INSTANCE, 1, -3F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedDiamondHoeItem extends HoeItem {
        public ReinforcedDiamondHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_DIAMOND_HOE = new ReinforcedDiamondHoeItem(ReinforcedDiamondTools.INSTANCE, -7, 0F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedNetheritePickaxeItem extends PickaxeItem {
        public ReinforcedNetheritePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_NETHERITE_PICKAXE = new ReinforcedNetheritePickaxeItem(ReinforcedNetheriteTools.INSTANCE, -3, -2.8F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedNetheriteAxeItem extends AxeItem {
        public ReinforcedNetheriteAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_NETHERITE_AXE = new ReinforcedNetheriteAxeItem(ReinforcedNetheriteTools.INSTANCE, 1, -3F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }

    public static class ReinforcedNetheriteHoeItem extends HoeItem {
        public ReinforcedNetheriteHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
            super(material, attackDamage, attackSpeed, settings);
        }

        public static ToolItem REINFORCED_NETHERITE_HOE =
                new ReinforcedNetheriteHoeItem(ReinforcedNetheriteTools.INSTANCE, -8, 0F,
                new Item.Settings().group(periodic.TOOL_GROUP));
    }
}