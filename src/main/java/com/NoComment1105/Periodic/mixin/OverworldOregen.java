package com.NoComment1105.Periodic.mixin;

import com.NoComment1105.Periodic.periodic;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class OverworldOregen {
    @Mixin(DefaultBiomeFeatures.class)
    public static class DefaultBiomeFeaturesMixin {
        @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
        private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, periodic.ORE_URANIUM_ORE_OVERWORLD);
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, periodic.ORE_ALUMINIUM_ORE_OVERWORLD);
        }

    }
}
