package io.github.nocomment1105.Periodic.registry;

import io.github.nocomment1105.Periodic.block.PeriodicTorchBlock;
import io.github.nocomment1105.Periodic.block.PeriodicWallTorchBlock;
import io.github.nocomment1105.Periodic.fluids.MercuryFluid;
import io.github.nocomment1105.Periodic.periodic;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.nocomment1105.Periodic.registry.ModParticles.*;

public class ModBlocks {
    //creating a block NEED REPEATING FOR EACH BLOCK
    public static final Block URANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(5f, 35f).sounds(BlockSoundGroup.METAL).luminance(7));
    public static final Block URANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool().strength(3f, 15f).sounds(BlockSoundGroup.STONE).luminance(5));
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
    public static final LanternBlock POTASSIUM_LANTERN = new LanternBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 0)
            .strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> 15).nonOpaque());
    //Torches
    public static final PeriodicTorchBlock POTASSIUM_TORCH = new PeriodicTorchBlock(FabricBlockSettings.of(Material.DECORATION).noCollision()
            .breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD), POTASSIUM_FLAME);

    public static final WallTorchBlock POTASSIUM_WALL_TORCH = new PeriodicWallTorchBlock(FabricBlockSettings.copyOf(POTASSIUM_TORCH)
            , POTASSIUM_FLAME);
    //fluids
    public static FlowableFluid STILL_MERCURY;
    public static FlowableFluid FLOWING_MERCURY;
    public static Item MERCURY_BUCKET;
    public static Block MERCURY;

    //registering blocks existance, Registry.register() need doing for each block
    public static void registerBlocks() {
        // Blocks
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_block"), URANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_block"), ALUMINIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "aluminium_ore"), ALUMINIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "potassium_ore"), POTASSIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "potassium_lantern"), POTASSIUM_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "silver_block"), SILVER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "silver_ore"), SILVER_ORE);
        // fluids
        STILL_MERCURY = Registry.register(Registry.FLUID, new Identifier("periodic", "mercury"), new MercuryFluid.Still());
        FLOWING_MERCURY = Registry.register(Registry.FLUID, new Identifier("periodic","flowing_mercury"), new MercuryFluid.Flowing());
        MERCURY_BUCKET = Registry.register(Registry.ITEM, new Identifier("periodic", "mercury_bucket"), new BucketItem(STILL_MERCURY, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(periodic.ITEM_GROUP)));
        MERCURY = Registry.register(Registry.BLOCK, new Identifier("periodic", "mercury"), new FluidBlock(STILL_MERCURY, FabricBlockSettings.copy(Blocks.WATER)){});
        // Torch
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "potassium_torch"), POTASSIUM_TORCH);
        Registry.register(Registry.BLOCK, new Identifier(periodic.MOD_ID, "potassium_wall_torch"), POTASSIUM_WALL_TORCH);
    }
}
