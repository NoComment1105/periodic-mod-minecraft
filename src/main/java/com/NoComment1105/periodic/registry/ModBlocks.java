package com.nocomment1105.Periodic.registry;

import com.nocomment1105.Periodic.periodic;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //creating a block NEED REPEATING FOR EACH BLOCK
    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f, 35f).sounds(BlockSoundGroup.METAL).luminance(5));
    public static final Block URANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 15f).sounds(BlockSoundGroup.STONE).luminance(7));
    public static final Block ALUMINIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f, 40f).sounds(BlockSoundGroup.METAL));
    public static final Block ALUMINIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 15f).sounds(BlockSoundGroup.STONE));
    public static final Block POTASSIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 18f).sounds(BlockSoundGroup.STONE));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f, 20f).sounds(BlockSoundGroup.METAL));
    public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 5f).sounds(BlockSoundGroup.STONE));
    //Lantern
    public static final LanternBlock POTASSIUM_LANTERN = new LanternBlock(AbstractBlock.Settings.of(Material.METAL).requiresTool()
            .strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque());

    //registering blocks existance, Registry.register() need doing for each block
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_ore"), ALUMINIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "potassium_ore"), POTASSIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "k_lantern"), POTASSIUM_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "silver_ore"), SILVER_ORE);
    }
}