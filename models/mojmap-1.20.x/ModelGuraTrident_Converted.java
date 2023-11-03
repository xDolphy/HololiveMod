// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGuraTrident_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "guratrident_converted"), "main");
	private final ModelPart guratrident;

	public ModelGuraTrident_Converted(ModelPart root) {
		this.guratrident = root.getChild("guratrident");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition guratrident = partdefinition.addOrReplaceChild("guratrident",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(0.0F, -31.0F, 4.0F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -26.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -26.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -27.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -28.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -29.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -27.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -28.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(0.0F, -29.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -4.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		guratrident.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}