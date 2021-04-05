package com.nocomment1105.Periodic.client;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import static com.nocomment1105.Periodic.registry.ModBlocks.POTASSIUM_LANTERN;

public class ModInitializer implements net.fabricmc.api.ModInitializer {
    @Override
    public void onInitialize() {
        BlockRenderLayerMap.INSTANCE.putBlock(POTASSIUM_LANTERN, RenderLayer.getCutout());
    }
}
