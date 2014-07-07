package com.orcinuss.reinforcedtools.item.tools;

import com.google.common.collect.Sets;
import com.orcinuss.reinforcedtools.creativetab.CreativeTab;
import com.orcinuss.reinforcedtools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemRTMHarvester extends ItemTool{

    private static final Set blocksToBreak = Sets.newHashSet(new Block[]{Blocks.glowstone});

    public EnumRarity rarity;
    public ItemRTMHarvester(ToolMaterial material)
    {
        this(material, EnumRarity.common);
    }
    public ItemRTMHarvester(Item.ToolMaterial material, EnumRarity rarity ){
        super(5.0F, material, blocksToBreak);
        this.rarity = rarity;
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTab.RTM_TAB);
    }

    //ItemStack BlockHarvesterStack = new ItemStack(ModItems.toolBlockHarvester, BlockHarvesterStack.addEnchantment(Enchantment.silkTouch, 1));
}
