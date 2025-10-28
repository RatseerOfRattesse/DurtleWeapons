package net.ratseerofrattesse.durtleweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;

public class ModItems {
    public static void registerModItems() {
        DurtleWeapons.LOGGER.info("Registering workplace-safe weaponry...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            //entries.add(LESSER_FIRMAMENT_PICKAXE);
        });
    }
}
