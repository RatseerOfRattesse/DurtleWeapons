package net.ratseerofrattesse.durtleweapons.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.ratseerofrattesse.durtleweapons.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Weapons
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.RIGHTEOUS_HAND_OF_THE_FATHER);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.THE_HOLY_HAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.TRINITY_TRENCH_DIGGER);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.HEAVENLY_HARVESTER);
        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE).add(ModItems.NOTCHS_NAPALM);
        getOrCreateTagBuilder(ItemTags.MACE_ENCHANTABLE).add(ModItems.MOJANGS_MACE);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.MOJANGS_MACE).add(ModItems.HEAVENLY_HARPOON).add(ModItems.GODS_TWELVE_GAUGE);
        getOrCreateTagBuilder(ItemTags.BREAKS_DECORATED_POTS).add(ModItems.MOJANGS_MACE).add(ModItems.HEAVENLY_HARPOON);
        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(ModItems.MOJANGS_MACE);
        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE).add(ModItems.MOJANGS_MACE);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.GOD_GETS_FIRST_PICK).add(ModItems.TRUMPS_TUFF_TARIFFS);
        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE).add(ModItems.HEAVENLY_HARPOON);
        getOrCreateTagBuilder(ItemTags.CROSSBOW_ENCHANTABLE).add(ModItems.GODS_TWELVE_GAUGE);

    }
}