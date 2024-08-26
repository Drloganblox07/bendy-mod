
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.StudioWallBrokenBlock;
import net.mcreator.bendymod.block.StudioWallBottomPlanksBlock;
import net.mcreator.bendymod.block.StudioWallBottomBrokenBlock;
import net.mcreator.bendymod.block.StudioWallBlankBlock;
import net.mcreator.bendymod.block.StudioFloorBlock;
import net.mcreator.bendymod.block.StudioCeilingBlock;
import net.mcreator.bendymod.block.CutoutSinnyBlock;
import net.mcreator.bendymod.block.CutoutBendyBlock;
import net.mcreator.bendymod.BendyModMod;

public class BendyModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BendyModMod.MODID);
	public static final RegistryObject<Block> CUTOUT_BENDY = REGISTRY.register("cutout_bendy", () -> new CutoutBendyBlock());
	public static final RegistryObject<Block> CUTOUT_SINNY = REGISTRY.register("cutout_sinny", () -> new CutoutSinnyBlock());
	public static final RegistryObject<Block> STUDIO_WALL_BLANK = REGISTRY.register("studio_wall_blank", () -> new StudioWallBlankBlock());
	public static final RegistryObject<Block> STUDIO_WALL_BROKEN = REGISTRY.register("studio_wall_broken", () -> new StudioWallBrokenBlock());
	public static final RegistryObject<Block> STUDIO_WALL_BOTTOM_PLANKS = REGISTRY.register("studio_wall_bottom_planks", () -> new StudioWallBottomPlanksBlock());
	public static final RegistryObject<Block> STUDIO_WALL_BOTTOM_BROKEN = REGISTRY.register("studio_wall_bottom_broken", () -> new StudioWallBottomBrokenBlock());
	public static final RegistryObject<Block> STUDIO_FLOOR = REGISTRY.register("studio_floor", () -> new StudioFloorBlock());
	public static final RegistryObject<Block> STUDIO_CEILING = REGISTRY.register("studio_ceiling", () -> new StudioCeilingBlock());
}
