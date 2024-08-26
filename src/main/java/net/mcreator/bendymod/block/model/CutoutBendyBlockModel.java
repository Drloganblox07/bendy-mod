package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;

public class CutoutBendyBlockModel extends AnimatedGeoModel<CutoutBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendy_mod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyTileEntity animatable) {
		return new ResourceLocation("bendy_mod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyTileEntity entity) {
		return new ResourceLocation("bendy_mod", "textures/blocks/cutout_bendy.png");
	}
}
