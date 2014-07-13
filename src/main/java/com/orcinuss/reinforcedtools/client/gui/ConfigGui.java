package com.orcinuss.reinforcedtools.client.gui;

import java.util.List;

import com.orcinuss.reinforcedtools.configuration.ConfigurationHandler;
import com.orcinuss.reinforcedtools.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ConfigGui extends GuiConfig{

	public ConfigGui(GuiScreen guiScreen){
		super(guiScreen,
			new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
			Reference.MOD_ID,
			false, false,
			GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}

}
