package net.ratseerofrattesse.durtleweapons.client;

import net.fabricmc.api.ClientModInitializer;
import net.ratseerofrattesse.durtleweapons.entity.registry.ModEntityRenderers;
import net.ratseerofrattesse.durtleweapons.item.ModItemGroups;
import net.ratseerofrattesse.durtleweapons.item.ModItems;
import net.ratseerofrattesse.durtleweapons.item.ModModelProviders;

public class DurtleWeaponsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModEntityRenderers.init();
        ModModelProviders.init();
    }
}
