package com.orcinuss.reinforcedtools.init;

import com.orcinuss.reinforcedtools.creativetab.CreativeTab;
import com.orcinuss.reinforcedtools.item.ItemRTM;
import com.orcinuss.reinforcedtools.item.tools.ItemRTMAxe;
import com.orcinuss.reinforcedtools.item.tools.ItemRTMHoe;
import com.orcinuss.reinforcedtools.item.tools.ItemRTMPickaxe;
import com.orcinuss.reinforcedtools.item.tools.ItemRTMShovel;
import com.orcinuss.reinforcedtools.item.tools.ItemRTMSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static Item.ToolMaterial RTQUARTZ = EnumHelper.addToolMaterial("RTQUARTZ", 0, 256, 5.0F, 0.5F, 50);
	public static Item.ToolMaterial NETHERIUM = EnumHelper.addToolMaterial("NETHERIUM", 1, 192, 4.0F, 1.8F, 7);
	public static Item.ToolMaterial RTIRON = EnumHelper.addToolMaterial("RTIRON", 2, 512, 6.0F, 2.3F, 14);
	public static Item.ToolMaterial RTLAPIS = EnumHelper.addToolMaterial("RTLAPIS", 2, 1152, 5.5F, 2.6F, 22);
	public static Item.ToolMaterial RTOBSIDIAN = EnumHelper.addToolMaterial("RTOBSIDIAN", 3, 1792, 8.0F, 2.8F, 10);
	
	public static Item itemCompressedCoal;
	public static Item itemCompressedLapis;
	public static Item itemCompressedQuartz;
	public static Item itemHardenedIronIngot;
	public static Item itemHardenedLapisChunk;
	public static Item itemHardenedQuartzChunk;
	/**public static Item itemRecurveLimb;
	public static Item itemNetheriumRecurveLimb;
	public static Item itemReinforcedIronRecurveLimb;
	public static Item itemReinforcedLapisRecurveLimb;
	public static Item itemReinforcedObsidianRecurveLimb;*/
	public static Item itemNetheriumIngot;
	public static Item itemReinforcedIronIngot;
	public static Item itemReinforcedLapisIngot;
	public static Item itemReinforcedObsidianIngot;
	public static Item itemReinforcedQuartzIngot;
	public static Item toolNetheriumPickaxe;
	public static Item toolNetheriumAxe;
	public static Item toolNetheriumShovel;
	public static Item toolNetheriumHoe;
	public static Item toolNetheriumSword;
	//public static Item toolNetheriumBow;
	public static Item toolReinforcedIronPickaxe;
	public static Item toolReinforcedIronAxe;
	public static Item toolReinforcedIronShovel;
	public static Item toolReinforcedIronHoe;
	public static Item toolReinforcedIronSword;
	//public static Item toolReinforcedIronBow;
	public static Item toolReinforcedLapisPickaxe;
	public static Item toolReinforcedLapisAxe;
	public static Item toolReinforcedLapisShovel;
	public static Item toolReinforcedLapisHoe;
	public static Item toolReinforcedLapisSword;
	//public static Item toolReinforcedLapisBow;
	public static Item toolReinforcedObsidianPickaxe;
	public static Item toolReinforcedObsidianAxe;
	public static Item toolReinforcedObsidianShovel;
	public static Item toolReinforcedObsidianHoe;
	public static Item toolReinforcedObsidianSword;
	//public static Item toolReinforcedObsidianBow;
	//public static Item toolReinforcedQuartzShears;

	public static void init(){
		itemCompressedCoal = new ItemRTM().setUnlocalizedName("CompressedCoal").setTextureName("rtm:compressed_coal");
		itemCompressedLapis = new ItemRTM().setUnlocalizedName("CompressedLapis").setTextureName("rtm:compressed_lapis");
		itemCompressedQuartz = new ItemRTM().setUnlocalizedName("CompressedQuartz").setTextureName("rtm:compressed_quartz");
		itemHardenedIronIngot = new ItemRTM().setUnlocalizedName("HardenedIronIngot").setTextureName("rtm:hardened_iron_ingot");
		itemHardenedLapisChunk = new ItemRTM().setUnlocalizedName("HardenedLapisChunk").setTextureName("rtm:hardened_lapis_chunk");
		itemHardenedQuartzChunk = new ItemRTM().setUnlocalizedName("HardenedQuartzChunk").setTextureName("rtm:hardened_quartz_chunk");
		/**itemRecurveLimb = new ItemRTM().setUnlocalizedName("RecurveLimb").setTextureName("rtm:recurve_limb");
		itemNetheriumRecurveLimb = new ItemRTM().setUnlocalizedName("NetheriumRecurveLimb").setTextureName("rtm:netherium_recurve_limb");
		itemReinforcedIronRecurveLimb = new ItemRTM().setUnlocalizedName("ReinforcedIronRecurveLimb").setTextureName("rtm:reinforced_iron_recurve_limb");
		itemReinforcedLapisRecurveLimb = new ItemRTM().setUnlocalizedName("ReinforcedLapisRecurveLimb").setTextureName("rtm:reinforced_lapis_recurve_limb");
		itemReinforcedObsidianRecurveLimb = new ItemRTM().setUnlocalizedName("ReinforcedObsidianRecurveLimb").setTextureName("rtm:reinforced_obsidian_recurve_limb");*/
		itemNetheriumIngot = new ItemRTM().setUnlocalizedName("NethiriumIngot").setTextureName("rtm:netherium_ingot");
		itemReinforcedIronIngot = new ItemRTM().setUnlocalizedName("ReinforcedIronIngot").setTextureName("rtm:reinforced_iron_ingot");
		itemReinforcedLapisIngot = new ItemRTM().setUnlocalizedName("ReinforcedLapisIngot").setTextureName("rtm:reinforced_lapis_ingot");
		itemReinforcedObsidianIngot = new ItemRTM().setUnlocalizedName("ReinforcedObsidianIngot").setTextureName("rtm:reinforced_obsidian_ingot");
		itemReinforcedQuartzIngot = new ItemRTM().setUnlocalizedName("ReinforcedQuartzIngot").setTextureName("rtm:reinforced_quartz_ingot");
		
		toolNetheriumPickaxe = new ItemRTMPickaxe(NETHERIUM).setUnlocalizedName("NetheriumPickaxe").setTextureName("rtm:netherium_pickaxe");
		toolNetheriumAxe = new ItemRTMAxe(NETHERIUM).setUnlocalizedName("NetheriumAxe").setTextureName("rtm:netherium_axe");
		toolNetheriumShovel = new ItemRTMShovel(NETHERIUM).setUnlocalizedName("NetheriumShovel").setTextureName("rtm:netherium_shovel");
		toolNetheriumHoe = new ItemRTMHoe(NETHERIUM).setUnlocalizedName("NetheriumHoe").setTextureName("rtm:netherium_hoe");
		toolNetheriumSword = new ItemRTMSword(NETHERIUM).setUnlocalizedName("NetheriumSword").setTextureName("rtm:netherium_sword");
		//toolNetheriumBow = new ItemBow().setUnlocalizedName("NetheriumBow").setTextureName("rtm:netherium_bow");
		toolReinforcedIronPickaxe = new ItemRTMPickaxe(RTIRON).setUnlocalizedName("ReinforcedIronPickaxe").setTextureName("rtm:reinforced_iron_pickaxe");
		toolReinforcedIronAxe = new ItemRTMAxe(RTIRON).setUnlocalizedName("ReinforcedIronAxe").setTextureName("rtm:reinforced_iron_axe");
		toolReinforcedIronShovel = new ItemRTMShovel(RTIRON).setUnlocalizedName("ReinforcedIronShovel").setTextureName("rtm:reinforced_iron_shovel");
		toolReinforcedIronHoe = new ItemRTMHoe(RTIRON).setUnlocalizedName("ReinforcedIronHoe").setTextureName("rtm:reinforced_iron_hoe");
		toolReinforcedIronSword = new ItemRTMSword(RTIRON).setUnlocalizedName("ReinforcedIronSword").setTextureName("rtm:reinforced_iron_sword");
		//toolReinforcedIronBow = new ItemBow().setUnlocalizedName("ReinforcedIronBow").setTextureName("rtm:reinforced_iron_bow");
		toolReinforcedLapisPickaxe = new ItemRTMPickaxe(RTLAPIS).setUnlocalizedName("ReinforcedLapisPickaxe").setTextureName("rtm:reinforced_lapis_pickaxe");
		toolReinforcedLapisAxe = new ItemRTMAxe(RTLAPIS).setUnlocalizedName("ReinforcedLapisAxe").setTextureName("rtm:reinforced_lapis_axe");
		toolReinforcedLapisShovel = new ItemRTMShovel(RTLAPIS).setUnlocalizedName("ReinforcedLapisShovel").setTextureName("rtm:reinforced_lapis_shovel");
		toolReinforcedLapisHoe = new ItemRTMHoe(RTLAPIS).setUnlocalizedName("ReinforcedLapisHoe").setTextureName("rtm:reinforced_lapis_hoe");
		toolReinforcedLapisSword = new ItemRTMSword(RTLAPIS).setUnlocalizedName("ReinforcedLapisSword").setTextureName("rtm:reinforced_lapis_sword");
		//toolReinforcedLapisBow = new ItemBow().setUnlocalizedName("ReinforcedLapisBow").setTextureName("rtm:reinforced_lapis_bow");
		toolReinforcedObsidianPickaxe = new ItemRTMPickaxe(RTOBSIDIAN).setUnlocalizedName("ReinforcedObsidianPickaxe").setTextureName("rtm:reinforced_obsidian_pickaxe");
		toolReinforcedObsidianAxe = new ItemRTMAxe(RTOBSIDIAN).setUnlocalizedName("ReinforcedObsidianAxe").setTextureName("rtm:reinforced_obsidian_axe");
		toolReinforcedObsidianShovel = new ItemRTMShovel(RTOBSIDIAN).setUnlocalizedName("ReinforcedObsidianShovel").setTextureName("rtm:reinforced_obsidian_shovel");
		toolReinforcedObsidianHoe = new ItemRTMHoe(RTOBSIDIAN).setUnlocalizedName("ReinforcedObsidianHoe").setTextureName("rtm:reinforced_obsidian_hoe");
		toolReinforcedObsidianSword = new ItemRTMSword(RTOBSIDIAN).setUnlocalizedName("ReinforcedObsidianSword").setTextureName("rtm:reinforced_obsidian_sword");
		//toolReinforcedObsidianBow = new ItemBow().setUnlocalizedName("ReinforcedObsdianBow").setTextureName("rtm:reinforced_obsidian_bow");
		//toolReinforcedQuartzShears = new ItemShears().setUnlocalizedName("ReinforcedQuartzShears").setTextureName("rtm:reinforced_quartz_shears");
		
		GameRegistry.registerItem(itemCompressedCoal, "CompressedCoal");
		GameRegistry.registerItem(itemCompressedLapis, "CompressedLapis");
		GameRegistry.registerItem(itemCompressedQuartz, "CompressedQuartz");
		GameRegistry.registerItem(itemHardenedIronIngot, "HardenedIronIngot");
		GameRegistry.registerItem(itemHardenedLapisChunk, "HardenedLapisChunk");
		GameRegistry.registerItem(itemHardenedQuartzChunk, "HardenedQuartzChunk");
		/**GameRegistry.registerItem(itemRecurveLimb, "RecurveLimb");
		GameRegistry.registerItem(itemNetheriumRecurveLimb, "NetheriumRecurveLimb");
		GameRegistry.registerItem(itemReinforcedIronRecurveLimb, "ReinforcedIronRecurveLimb");
		GameRegistry.registerItem(itemReinforcedLapisRecurveLimb, "ReinforcedLapisRecurveLimb");
		GameRegistry.registerItem(itemReinforcedObsidianRecurveLimb, "ReinforcedObsidianRecurveLimb");*/
		GameRegistry.registerItem(itemNetheriumIngot, "NetheriumIngot");
		GameRegistry.registerItem(itemReinforcedIronIngot, "ReinforcedIronIngot");
		GameRegistry.registerItem(itemReinforcedLapisIngot, "ReinforcedLapisIngot");
		GameRegistry.registerItem(itemReinforcedObsidianIngot, "ReinforcedObsidianIngot");
		GameRegistry.registerItem(itemReinforcedQuartzIngot, "ReinforcedQuartzIngot");
		
		GameRegistry.registerItem(toolNetheriumPickaxe, "NetheriumPickAxe");
		GameRegistry.registerItem(toolNetheriumAxe, "NetheriumAxe");
		GameRegistry.registerItem(toolNetheriumShovel, "NetheriumShovel");
		GameRegistry.registerItem(toolNetheriumHoe, "NetheriumHoe");
		GameRegistry.registerItem(toolNetheriumSword, "NetheriumSword");
		//GameRegistry.registerItem(toolNetheriumBow, "NetheriumBow");
		GameRegistry.registerItem(toolReinforcedIronPickaxe, "ReinforcedIronPickAxe");
		GameRegistry.registerItem(toolReinforcedIronAxe, "ReinforcedIronAxe");
		GameRegistry.registerItem(toolReinforcedIronShovel, "ReinforcedIronShovel");
		GameRegistry.registerItem(toolReinforcedIronHoe, "ReinforcedIronHoe");
		GameRegistry.registerItem(toolReinforcedIronSword, "ReinforcedIronSword");
		//GameRegistry.registerItem(toolReinforcedIronBow, "ReinforcedIronBow");
		GameRegistry.registerItem(toolReinforcedLapisPickaxe, "ReinforcedLapisPickAxe");
		GameRegistry.registerItem(toolReinforcedLapisAxe, "ReinforcedLapisAxe");
		GameRegistry.registerItem(toolReinforcedLapisShovel, "ReinforcedLapisShovel");
		GameRegistry.registerItem(toolReinforcedLapisHoe, "ReinforcedLapisHoe");
		GameRegistry.registerItem(toolReinforcedLapisSword, "ReinforcedLapisSword");
		//GameRegistry.registerItem(toolReinforcedLapisBow, "ReinforcedLapisBow");
		GameRegistry.registerItem(toolReinforcedObsidianPickaxe, "ReinforcedObsidianPickAxe");
		GameRegistry.registerItem(toolReinforcedObsidianAxe, "ReinforcedObsidianAxe");
		GameRegistry.registerItem(toolReinforcedObsidianShovel, "ReinforcedObsidianShovel");
		GameRegistry.registerItem(toolReinforcedObsidianHoe, "ReinforcedObsidianHoe");
		GameRegistry.registerItem(toolReinforcedObsidianSword, "ReinforcedObsidianSword");
		//GameRegistry.registerItem(toolReinforcedObsidianBow, "ReinforcedObsidianBow");
		//GameRegistry.registerItem(toolReinforcedQuartzShears, "ReinforcedQuartzShears");
	}
}
