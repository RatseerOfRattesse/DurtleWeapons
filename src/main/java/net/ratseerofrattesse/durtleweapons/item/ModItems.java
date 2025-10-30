package net.ratseerofrattesse.durtleweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;
import net.ratseerofrattesse.durtleweapons.item.weapon.HeavenlyHarpoonItem;

import java.util.List;

public class ModItems {

    public static final Item DURTLE = registerItem("durtle", new Item(new Item.Settings().rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleweapons.durtle"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item BIG_DURTLE = registerItem("big_durtle", new Item(new Item.Settings().rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleweapons.durtle"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RIGHTEOUS_HAND_OF_THE_FATHER = registerItem("righteous_hand_of_the_father",
            new SwordItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleweapons.righteous_hand_of_the_father1"));
            tooltip.add(Text.translatable("tooltip.durtleweapons.righteous_hand_of_the_father2"));
            tooltip.add(Text.translatable("tooltip.durtleweapons.righteous_hand_of_the_father3"));
            tooltip.add(Text.translatable("tooltip.durtleweapons.righteous_hand_of_the_father4"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item THE_HOLY_HAXE = registerItem("the_holy_haxe",
            new AxeItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5.0f, -3.0F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.holyhaxe1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.holyhaxe2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.holyhaxe3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.holyhaxe4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item TRINITY_TRENCH_DIGGER = registerItem("trinity_trench_digger",
            new ShovelItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5f, -3.0F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttd1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttd2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttd3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttd4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item HEAVENLY_HARVESTER = registerItem("heavenly_harvester",
            new HoeItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.NETHERITE, -4.0f, 0.0F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harvester1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harvester2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harvester3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harvester4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item NOTCHS_NAPALM = registerItem("notchs_napalm",
            new BowItem(
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .maxDamage(2031)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.napalm1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.napalm2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.napalm3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.napalm4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item MOJANGS_MACE = registerItem("mojangs_mace",
            new MaceItem(
                    new Item.Settings()
                            .rarity(Rarity.EPIC)
                            .maxDamage(2031)
                            .component(DataComponentTypes.TOOL, MaceItem.createToolComponent())
                            .attributeModifiers(MaceItem.createAttributeModifiers())
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.mojang1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.mojang2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.mojang3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.mojang4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item GOD_GETS_FIRST_PICK = registerItem("god_gets_first_pick",
            new PickaxeItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ggfp1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ggfp2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ggfp3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ggfp4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item TRUMPS_TUFF_TARIFFS = registerItem("trumps_tuff_tariffs",
            new PickaxeItem(ToolMaterials.NETHERITE,
                    new Item.Settings()
                            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0F, -2.8F))
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttt1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttt2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttt3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.ttt4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item HEAVENLY_HARPOON = registerItem("heavenly_harpoon",
            new HeavenlyHarpoonItem(
                    new Item.Settings()
                            .attributeModifiers(TridentItem.createAttributeModifiers())
                            .maxDamage(2031)
                            .component(DataComponentTypes.TOOL, TridentItem.createToolComponent())
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harpoon1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harpoon2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harpoon3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.harpoon4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item GODS_TWELVE_GAUGE = registerItem("gods_twelve_gauge",
            new CrossbowItem(
                    new Item.Settings()
                            .maxDamage(2031)
                            .rarity(Rarity.EPIC)
                            .fireproof()){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleweapons.12gauge1"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.12gauge2"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.12gauge3"));
                    tooltip.add(Text.translatable("tooltip.durtleweapons.12gauge4"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DurtleWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DurtleWeapons.LOGGER.info("Registering workplace-safe weaponry...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            //entries.add();
        });
    }
}
