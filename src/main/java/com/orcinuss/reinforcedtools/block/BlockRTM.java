package com.orcinuss.reinforcedtools.block;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockRTM extends BlockCompressed{

	public BlockRTM(MapColor color) {
		super(color);
		this.setHardness(5);
		this.setCreativeTab(CreativeTab.RTM_TAB);
		this.setStepSound(soundTypePiston);
	}

}
