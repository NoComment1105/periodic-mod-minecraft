package io.github.nocomment1105.Periodic.registry;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.registry.Registry;
import io.github.nocomment1105.Periodic.periodic;


public final class ModParticles {
    public static final DefaultParticleType POTASSIUM_FLAME = register("potassium_flame");

    private static DefaultParticleType register(String name) {
        return Registry.register(Registry.PARTICLE_TYPE, periodic.id(name), FabricParticleTypes.simple());
    }
}
