package com.orcinuss.reinforcedtools.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;

public class ModBlocks{

	public static Block blockCompactedCoalBlock;
	public static Block blockNetheriumBlock;
	public static Block blockReinforcedIronBlock;
	public static Block blockReinforcedLapisBlock;
	public static Block blockReinforcedObsidianBlock;
	public static Block blockReinforcedQuartzBlock;
	
	public static void init() {
		
		blockCompactedCoalBlock = new BlockCompressed(MapColor.blackColor).setBlockName("CompactedCoalBlock").setBlockTextureName("rtm:compacted_coal_block");
		blockNetheriumBlock = new BlockCompressed(MapColor.netherrackColor).setBlockName("NetheriumBlock").setBlockTextureName("rtm:netherium_block");
		blockReinforcedIronBlock = new BlockCompressed(MapColor.ironColor).setStepSound(Block.soundTypeMetal).setBlockName("ReinforcedIronBlock").setBlockTextureName("rtm:reinforced_iron_block");
		blockReinforcedLapisBlock = new BlockCompressed(MapColor.lapisColor).setBlockName("ReinforcedIronBlock").setBlockTextureName("rtm:reinforced_lapis_block");
		blockReinforcedObsidianBlock = new BlockCompressed(MapColor.obsidianColor).setBlockName("ReinforcedIronBlock").setBlockTextureName("rtm:reinforced_obsidian_block");
		blockReinforcedQuartzBlock = new BlockCompressed(MapColor.quartzColor).setBlockName("ReinforcedIronBlock").setBlockTextureName("rtm:reinforced_quartz_block");

		GameRegistry.registerBlock(blockCompactedCoalBlock, "CompactedCoalBlock");
		GameRegistry.registerBlock(blockNetheriumBlock, "NetheriumBlock");
		GameRegistry.registerBlock(blockReinforcedIronBlock, "ReinforcedIronBlock");
		GameRegistry.registerBlock(blockReinforcedLapisBlock, "ReinforcedLapisBlock");
		GameRegistry.registerBlock(blockReinforcedObsidianBlock, "ReinforcedObsidianBlock");
		GameRegistry.registerBlock(blockReinforcedQuartzBlock, "ReinforcedQuartzBlock");
	}
}
