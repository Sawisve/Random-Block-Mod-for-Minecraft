// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsper extends EntityModel<Entity> {
	private final ModelRenderer spar;

	public Modelsper() {
		textureWidth = 16;
		textureHeight = 16;

		spar = new ModelRenderer(this);
		spar.setRotationPoint(0.0F, 13.0F, 0.0F);
		setRotationAngle(spar, 0.0F, 1.5708F, 0.0F);
		spar.setTextureOffset(5, 0).addBox(-1.5F, -2.5F, -5.0F, 2.0F, 6.0F, 1.0F, 0.0F, true);
		spar.setTextureOffset(5, 0).addBox(-1.3F, -1.5F, -7.0F, 1.0F, 4.0F, 2.0F, 0.0F, true);
		spar.setTextureOffset(5, 0).addBox(-1.0F, -0.5F, -8.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		spar.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -4.0F, 2.0F, 2.0F, 12.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		spar.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}