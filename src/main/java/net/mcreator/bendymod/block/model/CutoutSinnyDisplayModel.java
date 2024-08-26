package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;

public class CutoutSinnyDisplayModel extends AnimatedGeoModel<CutoutSinnyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyDisplayItem animatable) {
		return new ResourceLocation("bendy_mod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyDisplayItem animatable) {
		return new ResourceLocation("bendy_mod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyDisplayItem entity) {
		return new ResourceLocation("bendy_mod", "textures/blocks/cutout_sinny.png");
	}
}
