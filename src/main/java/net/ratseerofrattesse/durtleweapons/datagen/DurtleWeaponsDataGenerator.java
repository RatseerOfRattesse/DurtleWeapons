package net.ratseerofrattesse.durtleweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DurtleWeaponsDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModEnglishUSLanguageProvider::new);
        pack.addProvider(ModEnglishCALanguageProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModItemTagProvider::new);
    }
}
