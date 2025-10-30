package net.ratseerofrattesse.durtleweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;

public class ModItemGroups {
    public static final ItemGroup DURTLEWEAPONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DurtleWeapons.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DURTLE))
                    .displayName(Text.translatable("itemgroup.durtleweapons.durtleweapons"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DURTLE);
                        entries.add(ModItems.BIG_DURTLE);
                        entries.add(ModItems.RIGHTEOUS_HAND_OF_THE_FATHER);
                        entries.add(ModItems.THE_HOLY_HAXE);
                        entries.add(ModItems.TRINITY_TRENCH_DIGGER);
                        entries.add(ModItems.HEAVENLY_HARVESTER);
                        entries.add(ModItems.NOTCHS_NAPALM);
                        entries.add(ModItems.MOJANGS_MACE);
                        entries.add(ModItems.GOD_GETS_FIRST_PICK);
                        entries.add(ModItems.TRUMPS_TUFF_TARIFFS);
                        entries.add(ModItems.HEAVENLY_HARPOON);
                        entries.add(ModItems.GODS_TWELVE_GAUGE);
                    }).build());

    public static void registerItemGroups() {
        DurtleWeapons.LOGGER.info("Organizing weaponry stockpiles...");
    }
}
