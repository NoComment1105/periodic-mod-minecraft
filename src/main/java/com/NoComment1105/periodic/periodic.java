package com.NoComment1105.Periodic;

import com.NoComment1105.Periodic.registry.ModBlocks;
import com.NoComment1105.Periodic.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class periodic implements ModInitializer {

    //defining mod name
    public static final String MOD_ID = "periodic";

    //creates the creative tab
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.URANIUM));

    public static final ConfiguredFeature<?, ?> ORE_URANIUM_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.URANIUM_ORE.getDefaultState(),
                    3)) // vein size
                    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    12, // min y level
                    24))) // max y level
                    .spreadHorizontally().repeat(10); // number of veins per chunk

    @Override
    public void onInitialize() {
        //initialising blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        //registering my ore generation
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("periodic", "ore_uranium_ore_overworld"), ORE_URANIUM_ORE_OVERWORLD);

    }
}
