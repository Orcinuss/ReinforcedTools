package com.orcinuss.reinforcedtools.handler;

import com.orcinuss.reinforcedtools.init.ModBlocks;
import com.orcinuss.reinforcedtools.init.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.itemCompressedCoal){
			return 8 * TileEntityFurnace.getItemBurnTime(new ItemStack(Items.coal));
		}
		else if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.blockCompactedCoalBlock)){
			return 72 * TileEntityFurnace.getItemBurnTime(new ItemStack(Items.coal));
		}
		return 0;
	}

}
