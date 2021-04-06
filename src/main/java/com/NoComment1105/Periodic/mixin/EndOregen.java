package com.NoComment1105.Periodic.mixin;

import com.NoComment1105.Periodic.periodic;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class EndOregen {
    @Mixin(DefaultBiomeCreator.class)
    public static class DefaultBiomeCreatorMixin {
        @Inject(method = "composeEndSpawnSettings(Lnet/minecraft/world/biome/GenerationSettings$Builder;)Lnet/minecraft/world/biome/Biome;", at = @At("HEAD"))
        private static void addEndOres(GenerationSettings.Builder builder, CallbackInfoReturnable<Biome> cir) {
            builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, periodic.ORE_POTASSIUM_ORE_END);
        }
    }
}
