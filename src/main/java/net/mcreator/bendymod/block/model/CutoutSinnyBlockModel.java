package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;

public class CutoutSinnyBlockModel extends AnimatedGeoModel<CutoutSinnyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyTileEntity animatable) {
		return new ResourceLocation("bendy_mod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyTileEntity animatable) {
		return new ResourceLocation("bendy_mod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyTileEntity entity) {
		return new ResourceLocation("bendy_mod", "textures/blocks/cutout_sinny.png");
	}
}
