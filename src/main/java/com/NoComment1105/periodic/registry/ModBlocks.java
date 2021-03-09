package com.NoComment1105.Periodic.registry;

import com.NoComment1105.Periodic.periodic;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //creating a block NEED REPEATING FOR EACH BLOCK
    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f, 35f).sounds(BlockSoundGroup.METAL).luminance(4));
    public static final Block URANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 15f).sounds(BlockSoundGroup.STONE).luminance(4));
    public static final Block ALUMINIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f,40f).sounds(BlockSoundGroup.METAL));
    public static final Block ALUMINIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f,15f).sounds(BlockSoundGroup.STONE));

    //registering blocks existance, Registry.register() need doing for each block
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_ore"), ALUMINIUM_ORE);
    }
}