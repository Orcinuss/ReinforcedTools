package com.orcinuss.reinforcedtools.item;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.Item;

public class ItemRTM extends Item{

	public ItemRTM(){
		this.maxStackSize = 64;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}
