package com.NoComment1105.periodic.registry;

import com.NoComment1105.periodic.periodic;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    //creating a block NEED REPEATING FOR EACH BLOCK
    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5f,35f)
            .sounds(BlockSoundGroup.METAL)
            .luminance(2));

    //registering blocks existance, Registry.register() need doing for each block
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
    }
}
