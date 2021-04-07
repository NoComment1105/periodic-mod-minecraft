package com.nocomment1105.Periodic.mixin;

import com.nocomment1105.Periodic.periodic;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class NetherOregen {
    @Mixin(DefaultBiomeFeatures.class)
    public static class DefaultBiomeFeaturesMixin {
        @Inject(method = "addNetherMineables(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
        private static void addNetherMineables(GenerationSettings.Builder builder, CallbackInfo ci) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, periodic.ORE_SILVER_ORE_NETHER);
        }
    }
}
