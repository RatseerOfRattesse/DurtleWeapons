package net.ratseerofrattesse.durtleweapons.item.weapon;

import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleweapons.DurtleWeapons;
import net.ratseerofrattesse.durtleweapons.entity.HeavenlyHarpoonEntity;

public class HeavenlyHarpoonItemRenderer{
    private static final TridentEntityModel modelTrident = new TridentEntityModel(TridentEntityModel.getTexturedModelData().createModel());
    public static final Identifier TEXTURE = Identifier.of(DurtleWeapons.MOD_ID,"textures/entity/heavenly_harpoon.png");

    public static void render(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer vertexConsumer2 = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, modelTrident.getLayer(TEXTURE), false, stack.hasGlint());
        modelTrident.render(matrices, vertexConsumer2, light, overlay);
        matrices.pop();
    }

    public Identifier getTexture(HeavenlyHarpoonEntity tridentEntity) {
        return TEXTURE;
    }
}
