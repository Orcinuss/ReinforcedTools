package com.orcinuss.reinforcedtools.item.tools;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;

public class ItemRTMShears extends ItemShears{
	public EnumRarity rarity;
	public ItemRTMShears(Item.ToolMaterial material){
		this(material, EnumRarity.common);
	}
	public ItemRTMShears(Item.ToolMaterial material, EnumRarity rarity){
		super();
		this.rarity = rarity;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}
