package com.orcinuss.reinforcedtools.item.tools;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemRTMShovel extends ItemSpade{
	public EnumRarity rarity;
	public ItemRTMShovel(Item.ToolMaterial material){
		this(material, EnumRarity.common);
	}
	public ItemRTMShovel(Item.ToolMaterial material, EnumRarity rarity){
		super(material);
		this.rarity = rarity;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}
