package net.ratseerofrattesse.durtleweapons.entity.registry;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.ratseerofrattesse.durtleweapons.entity.HeavenlyHarpoonEntityRenderer;

import java.util.Map;

public class ModEntityRenderers {
    public static void init() {
        EntityRendererRegistry.register(ModEntities.HEAVENLY_HARPOON, HeavenlyHarpoonEntityRenderer::new);
    }
}
