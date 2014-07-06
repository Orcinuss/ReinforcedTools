package com.orcinuss.reinforcedtools.item.tools;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;

public class ItemRTMBow extends ItemBow{
	public EnumRarity rarity;
	public ItemRTMBow(Item.ToolMaterial material){
		this(material, EnumRarity.common);
	}
	public ItemRTMBow(Item.ToolMaterial material, EnumRarity rarity){
		super();
		this.rarity = rarity;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}
