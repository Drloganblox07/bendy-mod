package net.mcreator.bendymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.init.BendyModModBlockEntities;
import net.mcreator.bendymod.block.renderer.CutoutSinnyTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutBendyTileRenderer;
import net.mcreator.bendymod.BendyModMod;

@Mod.EventBusSubscriber(modid = BendyModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BendyModModBlockEntities.CUTOUT_BENDY.get(), CutoutBendyTileRenderer::new);
		event.registerBlockEntityRenderer(BendyModModBlockEntities.CUTOUT_SINNY.get(), CutoutSinnyTileRenderer::new);
	}
}
