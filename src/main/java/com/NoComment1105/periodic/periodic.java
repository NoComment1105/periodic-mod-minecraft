package com.nocomment1105.Periodic;

import com.nocomment1105.Periodic.items.RegisterArmour;
import com.nocomment1105.Periodic.registry.ModBlocks;
import com.nocomment1105.Periodic.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static com.nocomment1105.Periodic.registry.ModItems.*;
import static com.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumAxeItem.REINFORCED_URANIUM_AXE;
import static com.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumHoeItem.REINFORCED_URANIUM_HOE;
import static com.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumPickaxeItem.REINFORCED_URANIUM_PICKAXE;
import static com.nocomment1105.Periodic.registry.ModItems.UraniumAxeItem.URANIUM_AXE;
import static com.nocomment1105.Periodic.registry.ModItems.UraniumHoeItem.URANIUM_HOE;
import static com.nocomment1105.Periodic.registry.ModItems.UraniumPickaxeItem.URANIUM_PICKAXE;


public class periodic implements ModInitializer {
    public static final String MOD_ID = "periodic";
    //creates the creative tab
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.URANIUM));
    public static final ItemGroup ARMOUR_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "armour"), () -> new ItemStack(RegisterArmour.ALUMINIUM_CHESTPLATE));
    public static final ItemGroup TOOL_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tools"), () -> new ItemStack(URANIUM_SWORD));
    //Setting ore generation characteristics
    public static final ConfiguredFeature<?, ?> ORE_URANIUM_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.URANIUM_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    6, // min y level
                    36))) // max y level
            .spreadHorizontally().repeat(10); // number of veins per chunk
    public static final ConfiguredFeature<?, ?> ORE_ALUMINIUM_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ALUMINIUM_ORE.getDefaultState(),
                    12)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    10, // bottom offset (don't place in the bottom X)
                    0, // min y level (don't place withing X block of maximum)
                    60))) // max y level (maximum)
            .spreadHorizontally().repeat(13 ); // number of veins per chunk

    public static  ConfiguredFeature<?, ?> ORE_POTASSIUM_ORE_END = Feature.ORE
            .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.POTASSIUM_ORE.getDefaultState(),
                    5))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    10,
                    0,
                    80)))
            .spreadHorizontally()
            .repeat(10);
    public static ConfiguredFeature<?, ?> ORE_SILVER_ORE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, ModBlocks.SILVER_ORE.getDefaultState(),
                    6))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    60,
                    0,
                    128)))
            .spreadHorizontally()
            .repeat(11);

    @Override
    public void onInitialize() {
        //initialising blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        RegisterArmour.register();
        //registering my ore generation
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("periodic", "ore_uranium_ore_overworld"), ORE_URANIUM_ORE_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("periodic", "ore_aluminium_ore_overworld"), ORE_ALUMINIUM_ORE_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("periodic", "ore_potassium_ore_end"), ORE_POTASSIUM_ORE_END);
        // Registering Tools
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_pickaxe"), URANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_sword"), URANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_shovel"), URANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("periodic", "uranium_axe"), URANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("periodic","uranium_hoe"), URANIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_uranium_pickaxe"), REINFORCED_URANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_uranium_sword"), REINFORCED_URANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_uranium_shovel"), REINFORCED_URANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_uranium_axe"), REINFORCED_URANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("periodic","reinforced_uranium_hoe"), REINFORCED_URANIUM_HOE);
    }
}
