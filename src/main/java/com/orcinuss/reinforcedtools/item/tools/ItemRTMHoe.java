package com.orcinuss.reinforcedtools.item.tools;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemRTMHoe extends ItemHoe{
	public EnumRarity rarity;
	public ItemRTMHoe(Item.ToolMaterial material){
		this(material, EnumRarity.common);
	}
	public ItemRTMHoe(Item.ToolMaterial material, EnumRarity rarity){
		super(material);
		this.rarity = rarity;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}
