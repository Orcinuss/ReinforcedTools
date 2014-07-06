package com.orcinuss.reinforcedtools;

import com.orcinuss.reinforcedtools.configuration.ConfigurationHandler;
import com.orcinuss.reinforcedtools.handler.FuelHandler;
import com.orcinuss.reinforcedtools.init.ModBlocks;
import com.orcinuss.reinforcedtools.init.ModItems;
import com.orcinuss.reinforcedtools.init.Recipes;
import com.orcinuss.reinforcedtools.proxy.IProxy;
import com.orcinuss.reinforcedtools.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ReinforcedTools {
	
	@Instance(Reference.MOD_ID)
	public static ReinforcedTools instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@EventHandler // Before MC Starts
    public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		ModBlocks.init();
    }
	@EventHandler // While MC Runs
    public void init(FMLInitializationEvent event){
		
		Recipes.init();
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	@EventHandler // When MC shuts Down
    public void postInit(FMLPostInitializationEvent event){
    	
    }
}
