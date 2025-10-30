package net.ratseerofrattesse.durtleweapons.mixin;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.ratseerofrattesse.durtleweapons.item.ModItems;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(DamageSource.class)
public class DamageSourceMixin{

    private static final Random random = new Random();
    private static final Logger log = LoggerFactory.getLogger(DamageSourceMixin.class);

    @Shadow
    @Nullable
    @Final
    private Entity attacker;

    @Shadow
    @Nullable
    @Final
    private Entity source;

    @Inject(method = "getDeathMessage", at = @At("HEAD"), cancellable = true)
    public void getDeathMessage(LivingEntity killed, CallbackInfoReturnable<Text> cir) {
        DamageSource damageSource = (DamageSource) (Object) this;

        String string = "death.attack." + damageSource.getType().msgId();

        if (this.attacker == null && this.source == null) {
            LivingEntity livingEntity2 = killed.getPrimeAdversary();
            String string2 = string + ".player";
            Text text;
            assert livingEntity2 != null;
            if (livingEntity2.getMainHandStack().getItem() == ModItems.RIGHTEOUS_HAND_OF_THE_FATHER) {
                int rhotfID = random.nextInt(5);
                String rhotfMSG = string + ".rhotf" + rhotfID;
                text = livingEntity2 != null
                        ? Text.translatable(rhotfMSG, killed.getDisplayName(), livingEntity2.getDisplayName())
                        : Text.translatable(rhotfMSG, killed.getDisplayName(), "God");
            } else {
                text = livingEntity2 != null
                        ? Text.translatable(string2, killed.getDisplayName(), livingEntity2.getDisplayName())
                        : Text.translatable(string, killed.getDisplayName());
            }

            cir.setReturnValue(text);
        } else {

            LivingEntity livingEntity2 = killed.getPrimeAdversary();
            String string2 = string + ".player";
            Text text = null;
            ItemStack itemStack = this.attacker instanceof LivingEntity livingEntity ? livingEntity.getMainHandStack() : ItemStack.EMPTY;
            assert livingEntity2 != null;
            if (itemStack.getItem() == ModItems.RIGHTEOUS_HAND_OF_THE_FATHER) {
                int msgID = random.nextInt(4);
                String msg = string + ".rhotf" + msgID;
                text = livingEntity2 != null
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName())
                        : Text.translatable(msg, killed.getDisplayName(), "God");
            } else if (itemStack.getItem() == ModItems.THE_HOLY_HAXE) {
                int msgID = random.nextInt(4);
                String msg = string + ".holyhaxe" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "God", itemStack.toHoverableText());
            }  else if (itemStack.getItem() == ModItems.TRINITY_TRENCH_DIGGER) {
                int msgID = random.nextInt(4);
                String msg = string + ".ttd" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "Lucifer", itemStack.toHoverableText());
            }  else if (itemStack.getItem() == ModItems.HEAVENLY_HARVESTER) {
                int msgID = random.nextInt(4);
                String msg = string + ".harvester" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "the Grim Reaper", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.NOTCHS_NAPALM) {
                int msgID = random.nextInt(4);
                String msg = string + ".napalm" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "Notch", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.MOJANGS_MACE) {
                int msgID = random.nextInt(4);
                String msg = string + ".mojang" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "Mojang", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.GOD_GETS_FIRST_PICK) {
                int msgID = random.nextInt(4);
                String msg = string + ".ggfp" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "God", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.TRUMPS_TUFF_TARIFFS) {
                int msgID = random.nextInt(4);
                String msg = string + ".ttt" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "the Trump Adminstration", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.HEAVENLY_HARPOON) {
                int msgID = random.nextInt(4);
                String msg = string + ".harpoon" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "Heaven", itemStack.toHoverableText());
            } else if (itemStack.getItem() == ModItems.GODS_TWELVE_GAUGE) {
                int msgID = random.nextInt(4);
                String msg = string + ".12gauge" + msgID;
                text = livingEntity2 != null && !itemStack.isEmpty()
                        ? Text.translatable(msg, killed.getDisplayName(), livingEntity2.getDisplayName(), itemStack.toHoverableText())
                        : Text.translatable(msg, killed.getDisplayName(), "God", itemStack.toHoverableText());
            } else if (itemStack.contains(DataComponentTypes.CUSTOM_NAME)) {
                Text text2;
                if (this.attacker == null) {
                    assert this.source != null;
                    text2 = this.source.getDisplayName();
                } else {
                    text2 = this.attacker.getDisplayName();
                }

                assert text2 != null;

                text = !itemStack.isEmpty() && itemStack.contains(DataComponentTypes.CUSTOM_NAME)
                        ? Text.translatable(string + ".item", killed.getDisplayName(), text2, itemStack.toHoverableText())
                        : Text.translatable(string, killed.getDisplayName(), text2);

            }else {
                text = livingEntity2 != null
                        ? Text.translatable(string2, killed.getDisplayName(), livingEntity2.getDisplayName())
                        : Text.translatable(string, killed.getDisplayName());
            }


            assert text != null;
            log.info(text.getString());

            cir.setReturnValue(text);
        }
    }
}
