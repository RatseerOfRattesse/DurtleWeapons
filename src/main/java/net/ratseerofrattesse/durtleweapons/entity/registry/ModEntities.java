package net.ratseerofrattesse.durtleweapons.entity.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;
import net.ratseerofrattesse.durtleweapons.entity.HeavenlyHarpoonEntity;

public class ModEntities {
    public static final EntityType<HeavenlyHarpoonEntity> HEAVENLY_HARPOON = FabricEntityTypeBuilder.<HeavenlyHarpoonEntity>create(SpawnGroup.MISC, HeavenlyHarpoonEntity::new).dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();

    public static void init() {
        Registry.register(Registries.ENTITY_TYPE, Identifier.of(DurtleWeapons.MOD_ID, "heavenly_harpoon"), HEAVENLY_HARPOON);
    }
}
