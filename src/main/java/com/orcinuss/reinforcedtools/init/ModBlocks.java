package com.orcinuss.reinforcedtools.init;

import com.orcinuss.reinforcedtools.block.BlockRTM;
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
		
		blockCompactedCoalBlock = new BlockRTM(MapColor.blackColor).setBlockName("CompactedCoalBlock").setBlockTextureName("rtm:compacted_coal_block");
		blockNetheriumBlock = new BlockRTM(MapColor.netherrackColor).setBlockName("NetheriumBlock").setBlockTextureName("rtm:netherium_block");
		blockReinforcedIronBlock = new BlockRTM(MapColor.ironColor).setStepSound(Block.soundTypeMetal).setBlockName("ReinforcedIronBlock").setBlockTextureName("rtm:reinforced_iron_block");
		blockReinforcedLapisBlock = new BlockRTM(MapColor.lapisColor).setBlockName("ReinforcedLapisBlock").setBlockTextureName("rtm:reinforced_lapis_block");
		blockReinforcedObsidianBlock = new BlockRTM(MapColor.obsidianColor).setBlockName("ReinforcedObsidianBlock").setBlockTextureName("rtm:reinforced_obsidian_block");
		blockReinforcedQuartzBlock = new BlockRTM(MapColor.quartzColor).setBlockName("ReinforcedQuartzBlock").setBlockTextureName("rtm:reinforced_quartz_block");

		GameRegistry.registerBlock(blockCompactedCoalBlock, "CompactedCoalBlock");
		GameRegistry.registerBlock(blockNetheriumBlock, "NetheriumBlock");
		GameRegistry.registerBlock(blockReinforcedIronBlock, "ReinforcedIronBlock");
		GameRegistry.registerBlock(blockReinforcedLapisBlock, "ReinforcedLapisBlock");
		GameRegistry.registerBlock(blockReinforcedObsidianBlock, "ReinforcedObsidianBlock");
		GameRegistry.registerBlock(blockReinforcedQuartzBlock, "ReinforcedQuartzBlock");
	}
}
