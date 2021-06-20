package com.nocomment1105.Periodic.configuredfeatures;

import com.nocomment1105.Periodic.registry.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class PeriodicConfiguredFeatures {
    // Overworld Generation
    public static final ConfiguredFeature<?, ?> ORE_URANIUM_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.URANIUM_ORE.getDefaultState(),
                    4)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create
                    (YOffset.fixed(6), YOffset.fixed(36))))).spreadHorizontally().repeat(10);
    public static final ConfiguredFeature<?, ?> ORE_ALUMINIUM_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ALUMINIUM_ORE.getDefaultState(),
                    12)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create
                    (YOffset.fixed(10), YOffset.fixed(60))))).spreadHorizontally().repeat(13);
    // End Generation
    public static final ConfiguredFeature<?, ?> ORE_POTASSIUM_ORE_END = Feature.ORE
            .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.POTASSIUM_ORE.getDefaultState(),
                    5)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create
                    (YOffset.fixed(10), YOffset.fixed(80))))).spreadHorizontally().repeat(10);
    // Nether Generation
    public static final ConfiguredFeature<?, ?> ORE_SILVER_ORE_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, ModBlocks.SILVER_ORE.getDefaultState(),
                    6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create
                    (YOffset.fixed(60), YOffset.fixed(128))))).spreadHorizontally().repeat(11);
    // Fluid generating in world
    public static final ConfiguredFeature<?, ?> FLUID_MERCURY_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.MERCURY.getDefaultState(),
                    12)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create
                    (YOffset.fixed(12), YOffset.fixed(48))))).spreadHorizontally().repeat(1);

    public static void register() {
        //registering my ore generation
        // Overworld
        RegistryKey<ConfiguredFeature<?, ?>> oreUraniumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("periodic", "ore_uranium_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreUraniumOverworld.getValue(), ORE_URANIUM_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreUraniumOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreAluminiumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("periodic", "ore_aluminium_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminiumOverworld.getValue(), ORE_ALUMINIUM_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminiumOverworld);

        // End
        RegistryKey<ConfiguredFeature<?, ?>> orePotassiumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("periodic", "ore_potassium_ore_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePotassiumEnd.getValue(), ORE_POTASSIUM_ORE_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, orePotassiumEnd);

        // Nether
        RegistryKey<ConfiguredFeature<?, ?>> oreSilverNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("periodic", "ore_silver_ore_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverNether.getValue(), ORE_SILVER_ORE_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverNether);

        // Fluid
        RegistryKey<ConfiguredFeature<?, ?>> fluidMercuryOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("periodic", "fluid_mercury_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, fluidMercuryOverworld.getValue(), FLUID_MERCURY_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, fluidMercuryOverworld);
    }
}