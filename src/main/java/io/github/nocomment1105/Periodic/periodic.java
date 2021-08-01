package io.github.nocomment1105.Periodic;

import io.github.nocomment1105.Periodic.configuredfeatures.PeriodicConfiguredFeatures;
import io.github.nocomment1105.Periodic.armouritems.RegisterArmour;
import io.github.nocomment1105.Periodic.registry.ModBlocks;
import io.github.nocomment1105.Periodic.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.nocomment1105.Periodic.registry.ModItems.*;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedDiamondAxeItem.REINFORCED_DIAMOND_AXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedDiamondHoeItem.REINFORCED_DIAMOND_HOE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedDiamondPickaxeItem.REINFORCED_DIAMOND_PICKAXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedNetheriteAxeItem.REINFORCED_NETHERITE_AXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedNetheriteHoeItem.REINFORCED_NETHERITE_HOE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedNetheritePickaxeItem.REINFORCED_NETHERITE_PICKAXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumAxeItem.REINFORCED_URANIUM_AXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumHoeItem.REINFORCED_URANIUM_HOE;
import static io.github.nocomment1105.Periodic.registry.ModItems.ReinforcedUraniumPickaxeItem.REINFORCED_URANIUM_PICKAXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.UraniumAxeItem.URANIUM_AXE;
import static io.github.nocomment1105.Periodic.registry.ModItems.UraniumHoeItem.URANIUM_HOE;
import static io.github.nocomment1105.Periodic.registry.ModItems.UraniumPickaxeItem.URANIUM_PICKAXE;

public class periodic implements ModInitializer {
    public static final String MOD_ID = "periodic";
    //creates the creative tab
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.URANIUM));
    public static final ItemGroup ARMOUR_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "armour"), () -> new ItemStack(RegisterArmour.ALUMINIUM_CHESTPLATE));
    public static final ItemGroup TOOL_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "tools"), () -> new ItemStack(URANIUM_SWORD));
    @Override
    public void onInitialize() {
        //initialising blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        RegisterArmour.register();
        PeriodicConfiguredFeatures.register();
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
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_pickaxe"), REINFORCED_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_sword"), REINFORCED_DIAMOND_SWORD);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_shovel"), REINFORCED_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_diamond_axe"), REINFORCED_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier("periodic","reinforced_diamond_hoe"), REINFORCED_DIAMOND_HOE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_pickaxe"), REINFORCED_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_sword"), REINFORCED_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_shovel"), REINFORCED_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("periodic", "reinforced_netherite_axe"), REINFORCED_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("periodic","reinforced_netherite_hoe"), REINFORCED_NETHERITE_HOE);
    }
    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
