package com.orcinuss.reinforcedtools.configuration;

import java.io.File;

import com.orcinuss.reinforcedtools.reference.Reference;
import com.orcinuss.reinforcedtools.util.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static boolean compressedCoalAsFuel = false;
    public static boolean compactedCoalBlockAsFuel = false;
    public static boolean gHarvesterAutoSilkTouch = false;
	
	public static void init(File configFile){
		// Create the configuration object from the given configuration file
		if(configuration == null){
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	public static void loadConfiguration(){

        compressedCoalAsFuel = configuration.getBoolean("compressedCoalAsFuel", Configuration.CATEGORY_GENERAL, true, "Use compressed coal as a fuel source? Equal to 8 pieces of coal");
        compactedCoalBlockAsFuel = configuration.getBoolean("compressedCoalBlockAsFuel", Configuration.CATEGORY_GENERAL, false, "Use compressed coal blocks as a fuel source. Equal to 72 pieces of coal");
        gHarvesterAutoSilkTouch = configuration.getBoolean("gHarvesterAutoSilkTouch", Configuration.CATEGORY_GENERAL, false, "Should the glowstone harvester automatically get the Silk Touch enchant? Requires client restart!");

        if(configuration.hasChanged()){
			configuration.save();
		}
		LogHelper.info("Configuration File Loaded");
	}
	
	@SubscribeEvent
	public void onConfiguationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
			// Resync configuration file
			loadConfiguration();
		}
	}
}
