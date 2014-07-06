package com.orcinuss.reinforcedtools.item.tools;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemRTMPickaxe extends ItemPickaxe {
	
	public EnumRarity rarity;
	public ItemRTMPickaxe(Item.ToolMaterial material){
		this(material, EnumRarity.common);
	}
	public ItemRTMPickaxe(Item.ToolMaterial material, EnumRarity rarity){
		super(material);
		this.rarity = rarity;
		this.maxStackSize = 1;
		this.setCreativeTab(CreativeTab.RTM_TAB);
	}
}