package com.NoComment1105.periodic;

import com.NoComment1105.periodic.registry.ModBlocks;
import com.NoComment1105.periodic.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class periodic implements ModInitializer {

    //defining mod name
    public static final String MOD_ID = "periodic";

    //creates the creative tab
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.URANIUM));

    //More Complicated Item group for the creative menu, allows addition of vanilla items too, also allows order change
    //public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "other"))
    //        .icon(() -> new ItemStack(Blocks.LECTERN))
    //        .appendItems(stacks -> {
    //            stacks.add(new ItemStack(ModBlocks.URANIUM_BLOCK));
    //            stacks.add(new ItemStack(Items.APPLE));
    //            stacks.add(new ItemStack(ModItems.URANIUM));
    //            stacks.add(new ItemStack(Blocks.GLOWSTONE));
    //        })
    //        .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        //initialising blocks and items
    }
}
