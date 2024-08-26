
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;
import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;
import net.mcreator.bendymod.BendyModMod;

public class BendyModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BendyModMod.MODID);
	public static final RegistryObject<Item> CUTOUT_BENDY = REGISTRY.register(BendyModModBlocks.CUTOUT_BENDY.getId().getPath(),
			() -> new CutoutBendyDisplayItem(BendyModModBlocks.CUTOUT_BENDY.get(), new Item.Properties().tab(BendyModModTabs.TAB_BENDY_PROPS)));
	public static final RegistryObject<Item> CUTOUT_SINNY = REGISTRY.register(BendyModModBlocks.CUTOUT_SINNY.getId().getPath(), () -> new CutoutSinnyDisplayItem(BendyModModBlocks.CUTOUT_SINNY.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STUDIO_WALL_BLANK = block(BendyModModBlocks.STUDIO_WALL_BLANK, BendyModModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_WALL_BROKEN = block(BendyModModBlocks.STUDIO_WALL_BROKEN, BendyModModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_WALL_BOTTOM_PLANKS = block(BendyModModBlocks.STUDIO_WALL_BOTTOM_PLANKS, BendyModModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_WALL_BOTTOM_BROKEN = block(BendyModModBlocks.STUDIO_WALL_BOTTOM_BROKEN, BendyModModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_FLOOR = block(BendyModModBlocks.STUDIO_FLOOR, BendyModModTabs.TAB_BENDY_BLOCKS);
	public static final RegistryObject<Item> STUDIO_CEILING = block(BendyModModBlocks.STUDIO_CEILING, BendyModModTabs.TAB_BENDY_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
