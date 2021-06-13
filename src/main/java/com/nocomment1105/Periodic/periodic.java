package com.nocomment1105.Periodic;

import com.nocomment1105.Periodic.ConfiguredFeatures.PeriodicConfiguredFeatures;
import com.nocomment1105.Periodic.items.RegisterArmour;
import com.nocomment1105.Periodic.registry.ModBlocks;
import com.nocomment1105.Periodic.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

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
    }
}
