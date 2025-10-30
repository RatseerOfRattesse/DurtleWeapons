package net.ratseerofrattesse.durtleweapons;

import net.fabricmc.api.ModInitializer;
import net.ratseerofrattesse.durtleweapons.entity.registry.ModEntities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DurtleWeapons implements ModInitializer {

    public static final String MOD_ID = "durtleweapons";

    public static final Logger LOGGER = LoggerFactory.getLogger("DurtleWeapons");

    @Override
    public void onInitialize() {

        LOGGER.info("Cramming flesh into the vitals... LOADED.");
        ModEntities.init();

    }
}
