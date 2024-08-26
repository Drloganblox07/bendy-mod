package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;

public class CutoutBendyDisplayModel extends AnimatedGeoModel<CutoutBendyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyDisplayItem animatable) {
		return new ResourceLocation("bendy_mod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyDisplayItem animatable) {
		return new ResourceLocation("bendy_mod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyDisplayItem entity) {
		return new ResourceLocation("bendy_mod", "textures/blocks/cutout_bendy.png");
	}
}
