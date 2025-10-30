package net.ratseerofrattesse.durtleweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;
import net.ratseerofrattesse.durtleweapons.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Mod Icon
        itemModelGenerator.register(ModItems.DURTLE, Models.GENERATED);
        registerBigWeapon(itemModelGenerator, ModItems.BIG_DURTLE);

        //idi0cy's set
        registerBigWeapon(itemModelGenerator, ModItems.RIGHTEOUS_HAND_OF_THE_FATHER);
        registerBigWeapon(itemModelGenerator, ModItems.THE_HOLY_HAXE);
        registerBigWeapon(itemModelGenerator, ModItems.TRINITY_TRENCH_DIGGER);
        registerBigWeapon(itemModelGenerator, ModItems.HEAVENLY_HARVESTER);
        registerBigWeapon(itemModelGenerator, ModItems.MOJANGS_MACE);
        registerBigWeapon(itemModelGenerator, ModItems.GOD_GETS_FIRST_PICK);
        registerBigWeapon(itemModelGenerator, ModItems.TRUMPS_TUFF_TARIFFS);
        itemModelGenerator.register(ModItems.HEAVENLY_HARPOON, Models.GENERATED);
    }

    private void registerBigWeapon(ItemModelGenerator itemModelGenerator, Item item){
        itemModelGenerator.register(item, BIG_WEAPON);
    }

    public static final Model BIG_WEAPON = registerItemTemplateModel("big_weapon", TextureKey.LAYER0);

    private static Model registerItemTemplateModel(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(DurtleWeapons.MOD_ID, "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
