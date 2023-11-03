package net.mcreator.hololivemodfortnite.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.hololivemodfortnite.entity.GuraTridentEntity;
import net.mcreator.hololivemodfortnite.client.model.ModelGuraTrident_Converted;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GuraTridentRenderer extends EntityRenderer<GuraTridentEntity> {
	private static final ResourceLocation texture = new ResourceLocation("hololivemodfortnite:textures/entities/guratrident.png");
	private final ModelGuraTrident_Converted model;

	public GuraTridentRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelGuraTrident_Converted(context.bakeLayer(ModelGuraTrident_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(GuraTridentEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(GuraTridentEntity entity) {
		return texture;
	}
}
