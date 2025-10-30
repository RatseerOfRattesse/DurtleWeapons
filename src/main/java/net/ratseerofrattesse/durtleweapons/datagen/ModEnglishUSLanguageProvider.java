package net.ratseerofrattesse.durtleweapons.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.ratseerofrattesse.durtleweapons.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishUSLanguageProvider extends FabricLanguageProvider {
    public ModEnglishUSLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        //Mod Icon
        translationBuilder.add("tooltip.durtleweapons.durtle", "§7An ancient duck-turtle god.§7.");
        translationBuilder.add(ModItems.DURTLE, "Durtle");
        translationBuilder.add(ModItems.BIG_DURTLE, "Durtle");

        //idi0cy's Set
        translationBuilder.add(ModItems.RIGHTEOUS_HAND_OF_THE_FATHER, "Righteous Hand of the Father");
        translationBuilder.add("tooltip.durtleweapons.righteous_hand_of_the_father1", "§7Legends say that God has a crucifix for his hand§7");
        translationBuilder.add("tooltip.durtleweapons.righteous_hand_of_the_father2", "§7- like a pirate has a hook, but holy.§7");
        translationBuilder.add("tooltip.durtleweapons.righteous_hand_of_the_father3", "§7The wielder of this blade carved it from§7");
        translationBuilder.add("tooltip.durtleweapons.righteous_hand_of_the_father4", "§7God's wrist himself, in act of deicide.§7");
        translationBuilder.add("death.attack.player.rhotf0", "%1$s was slain. It was the will of God.");
        translationBuilder.add("death.attack.player.rhotf1", "%2$s was only doing the work of God when they slew %1$s.");
        translationBuilder.add("death.attack.player.rhotf2", "%2$s murdered %1$s. They are morally justified.");
        translationBuilder.add("death.attack.player.rhotf3", "%1$s was on the opposite side of a crusade.");
        translationBuilder.add(ModItems.THE_HOLY_HAXE, "The Holy Haxe");
        translationBuilder.add("tooltip.durtleweapons.holyhaxe1", "§7This axe was once the property of God, but§7");
        translationBuilder.add("tooltip.durtleweapons.holyhaxe2", "§7was taken from him by a man with supernatural§7");
        translationBuilder.add("tooltip.durtleweapons.holyhaxe3", "§7abilities, called 'b-hopping'. The man proceeded§7");
        translationBuilder.add("tooltip.durtleweapons.holyhaxe4", "§7to enchant this axe with his abilities.§7");
        translationBuilder.add("death.attack.player.holyhaxe0", "%1$s's watchdog wasn't strong enough to stop %3$s.");
        translationBuilder.add("death.attack.player.holyhaxe1", "%2$s's anticheat wasn't enough to counter %3$s.");
        translationBuilder.add("death.attack.player.holyhaxe2", "%2$s was op-abusing against %1$s.");
        translationBuilder.add("death.attack.player.holyhaxe3", "%1$s got de-opped.");
        translationBuilder.add(ModItems.TRINITY_TRENCH_DIGGER, "Trinity Trench Digger");
        translationBuilder.add("tooltip.durtleweapons.ttd1", "§7A shovel taken from Heaven's landscaping industry by§7");
        translationBuilder.add("tooltip.durtleweapons.ttd2", "§7a rogue angel, after becoming angry with his management.§7");
        translationBuilder.add("tooltip.durtleweapons.ttd3", "§7He abandoned Heaven and dug straight down into the Earth§7");
        translationBuilder.add("tooltip.durtleweapons.ttd4", "§7with it, creating a massive cavern. His name was Lucifer.§7");
        translationBuilder.add("death.attack.player.ttd0", "%1$s had their grave dug by the %3$s.");
        translationBuilder.add("death.attack.player.ttd1", "%1$s tripped into three ditches. Didn't come out of the last one.");
        translationBuilder.add("death.attack.player.ttd2", "%1$s is going to need 3 more lives.");
        translationBuilder.add("death.attack.player.ttd3", "%1$s got grounded.");
        translationBuilder.add(ModItems.HEAVENLY_HARVESTER, "Heavenly Harvester");
        translationBuilder.add("tooltip.durtleweapons.harvester1", "§7A hoe from Heaven's fields, cast down from the clouds by§7");
        translationBuilder.add("tooltip.durtleweapons.harvester2", "§7an angel for reasons unknown. When discovered, its soul§7");
        translationBuilder.add("tooltip.durtleweapons.harvester3", "§7reaping power inspired a mythos surrounding a pseudo-mythical§7");
        translationBuilder.add("tooltip.durtleweapons.harvester4", "§7figure in a long black cloak that took souls to their destinations.§7");
        translationBuilder.add("death.attack.player.harvester0", "%1$s's soul was reaped by the the %3$s.");
        translationBuilder.add("death.attack.player.harvester1", "%2$s prayed for a bountiful harvest. %1$s was delivered.");
        translationBuilder.add("death.attack.player.harvester2", "%1$s was a weed to be plucked out by Heaven's hands.");
        translationBuilder.add("death.attack.player.harvester3", "%1$s couldn't survive the divine pesticides.");
        translationBuilder.add(ModItems.NOTCHS_NAPALM, "Notch's Napalm");
        translationBuilder.add("tooltip.durtleweapons.napalm1", "§7It's a little known fact that Sweden played a part in the§7");
        translationBuilder.add("tooltip.durtleweapons.napalm2", "§7War on Terror. Notch was a drone operator in Sweden's army,§7");
        translationBuilder.add("tooltip.durtleweapons.napalm3", "§7and his exceptional command unit was named Notch's Napalm.§7");
        translationBuilder.add("tooltip.durtleweapons.napalm4", "§7This weapon is a remnant of one of the drones under his command.§7");
        translationBuilder.add("death.attack.arrow.napalm0", "%1$s's death count went up a Notch.");
        translationBuilder.add("death.attack.arrow.napalm1", "%1$s was burned at the stake.");
        translationBuilder.add("death.attack.arrow.napalm2", "%1$s got to relive Vietnam.");
        translationBuilder.add("death.attack.arrow.napalm3", "%1$s was taken out by the Swedish Government.");
        translationBuilder.add(ModItems.MOJANGS_MACE, "Mojang's Mace");
        translationBuilder.add("tooltip.durtleweapons.mojang1", "§7When Mojang first published Minecraft, they installed a multitude§7");
        translationBuilder.add("tooltip.durtleweapons.mojang2", "§7of anti-piracy software. This mace is among those inventions. When§7");
        translationBuilder.add("tooltip.durtleweapons.mojang3", "§7a Minecraft instance detects an illegitimate account, the Mace will§7");
        translationBuilder.add("tooltip.durtleweapons.mojang4", "§7be notified and promptly ICBM its way onto the pirate's house.§7");
        translationBuilder.add("death.attack.player.mojang0", "%1$s was acquired by Microsoft");
        translationBuilder.add("death.attack.player.mojang1", "%1$s poisoned a frog.");
        translationBuilder.add("death.attack.player.mojang2", "%1$s didn't win the mob vote.");
        translationBuilder.add("death.attack.player.mojang3", "%1$s was taken out by the Swedish Government.");
        translationBuilder.add(ModItems.GOD_GETS_FIRST_PICK, "God Gets First Pick");
        translationBuilder.add("tooltip.durtleweapons.ggfp1", "§7This pickaxe represents the interests of Heaven Incorporated.§7");
        translationBuilder.add("tooltip.durtleweapons.ggfp2", "§7Viewing of this pickaxe automatically signs your agreement to the§7");
        translationBuilder.add("tooltip.durtleweapons.ggfp3", "§7Heaven Incorporated Terms of Service. Heaven Inc. is released from§7");
        translationBuilder.add("tooltip.durtleweapons.ggfp4", "§7liability of any harm subsequently suffered from viewing this pick.§7");
        translationBuilder.add("death.attack.player.ggfp0", "%1$s was terraformed.");
        translationBuilder.add("death.attack.player.ggfp1", "%1$s stood in the way of %1$s's tuff.");
        translationBuilder.add("death.attack.player.ggfp2", "%1$s fate was decided.");
        translationBuilder.add("death.attack.player.ggfp3", "%1$s assets were resources to be refined.");
        translationBuilder.add(ModItems.TRUMPS_TUFF_TARIFFS, "Trump's Tuff Tariffs");
        translationBuilder.add("tooltip.durtleweapons.ttt1", "§7The original Trump Administration used to run a Minecraft Server where§7");
        translationBuilder.add("tooltip.durtleweapons.ttt2", "§7Donald Trump and Jeffrey Epstein would experiment with designs for the§7");
        translationBuilder.add("tooltip.durtleweapons.ttt3", "§7facilities on Epstein Island. Occasionally the administration would also§7");
        translationBuilder.add("tooltip.durtleweapons.ttt4", "§7trap deported aliens in the server and make bad Minecraft ARGs from it.§7");
        translationBuilder.add("death.attack.player.ttt0", "%1$s was deported by ICE.");
        translationBuilder.add("death.attack.player.ttt1", "%1$s tried releasing the Epstein files.");
        translationBuilder.add("death.attack.player.ttt2", "%1$s started a Twitter drama with Trump.");
        translationBuilder.add("death.attack.player.ttt3", "%1$s lost the swing states.");
        translationBuilder.add(ModItems.HEAVENLY_HARPOON, "Heavenly Harpoon");
        translationBuilder.add("tooltip.durtleweapons.harpoon1", "§7The angels often played war games with weapons like this. All angels are§7");
        translationBuilder.add("tooltip.durtleweapons.harpoon2", "§7immortal, but only if they pay their taxes on time. This harpoon was cast§7");
        translationBuilder.add("tooltip.durtleweapons.harpoon3", "§7down in light of an unintended casualty. The angel was stabbed through his§7");
        translationBuilder.add("tooltip.durtleweapons.harpoon4", "§7chest with this harpoon - capture the flag was never the same after this.§7");
        translationBuilder.add("death.attack.trident.harpoon0", "%1$s was smited from the heavens.");
        translationBuilder.add("death.attack.trident.harpoon1", "Heaven pierced %1$s.");
        translationBuilder.add("death.attack.trident.harpoon2", "%1$s was trampled by Heaven's heel.");
        translationBuilder.add("death.attack.trident.harpoon3", "%1$s was pincered by %2$s.");
        translationBuilder.add("death.attack.player.harpoon0", "%1$s was smited from the heavens.");
        translationBuilder.add("death.attack.player.harpoon1", "Heaven pierced %1$s.");
        translationBuilder.add("death.attack.player.harpoon2", "%1$s was trampled by Heaven's heel.");
        translationBuilder.add("death.attack.player.harpoon3", "%1$s was pincered by %2$s.");
        translationBuilder.add(ModItems.GODS_TWELVE_GAUGE, "God's Twelve Gauge");
        translationBuilder.add("tooltip.durtleweapons.12gauge1", "§7On gloomy days when he felt down, God would use this mighty§7");
        translationBuilder.add("tooltip.durtleweapons.12gauge2", "§7railgun-shotgun amalgamation to take out his anger. Usually he'd§7");
        translationBuilder.add("tooltip.durtleweapons.12gauge3", "§7come down to hell and have a cup with Satan, then hover over the§7");
        translationBuilder.add("tooltip.durtleweapons.12gauge4", "§7Lake of Fire and shoot sinners. This weapon ultimately shot him.§7");
        translationBuilder.add("death.attack.arrow.12gauge0", "%1$s was peppered with holy buckshot.");
        translationBuilder.add("death.attack.arrow.12gauge1", "%1$s wasn't wearing Kevlar.");
        translationBuilder.add("death.attack.arrow.12gauge2", "%1$s brought a sword to %2$s's gunfight.");
        translationBuilder.add("death.attack.arrow.12gauge3", "%1$s was hunted to extinction.");

        //Itemgroup
        translationBuilder.add("itemgroup.durtleweapons.durtleweapons", "DurtleWeapons");

    }
}
