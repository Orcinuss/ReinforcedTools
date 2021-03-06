package com.orcinuss.reinforcedtools.init;

import com.orcinuss.reinforcedtools.configuration.ConfigurationHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemHardenedIronIngot, 1), new Object[] {Items.iron_ingot, ModItems.itemCompressedCoal});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemHardenedLapisChunk, 1), new Object[] {ModItems.itemCompressedLapis, ModItems.itemCompressedCoal});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemHardenedQuartzChunk, 1), new Object[] {ModItems.itemCompressedQuartz, ModItems.itemCompressedCoal});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemNetheriumIngot, 1), new Object[] {Items.netherbrick, ModItems.itemHardenedIronIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemReinforcedLapisIngot, 1), new Object[] {ModItems.itemHardenedLapisChunk, ModItems.itemHardenedIronIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemReinforcedObsidianIngot, 1), new Object[] {Blocks.obsidian, ModItems.itemHardenedIronIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemReinforcedQuartzIngot, 1), new Object[] {ModItems.itemHardenedQuartzChunk, ModItems.itemHardenedIronIngot});

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCompressedCoal, 1), new Object[] {"XXX", "X X", "XXX", Character.valueOf('X'), Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCompressedLapis, 1), new Object[] {"XXX", "X X", "XXX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.itemCompressedQuartz, 1), new Object[] {"XXX", "X X", "XXX", Character.valueOf('X'), Items.quartz});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianPickaxe, 1), new Object[] {"XXX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumAxe, 1), new Object[] {" XX", " YX", " Y ", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronAxe, 1), new Object[] {" XX", " YX", " Y ", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisAxe, 1), new Object[] {" XX", " YX", " Y ", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianAxe, 1), new Object[] {" XX", " YX", " Y ", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianAxe, 1), new Object[] {"XX ", "XY ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumShovel, 1), new Object[] {"X", "Y", "Y", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronShovel, 1), new Object[] {"X", "Y", "Y", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisShovel, 1), new Object[] {"X", "Y", "Y", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianShovel, 1), new Object[] {"X", "Y", "Y", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumHoe, 1), new Object[] {" XX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronHoe, 1), new Object[] {" XX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisHoe, 1), new Object[] {" XX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianHoe, 1), new Object[] {" XX", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumHoe, 1), new Object[] {"XX ", " Y ", " Y ", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronHoe, 1), new Object[] {"XX ", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisHoe, 1), new Object[] {"XX ", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianHoe, 1), new Object[] {"XX ", " Y ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolNetheriumSword, 1), new Object[] {"X", "X", "Y", Character.valueOf('X'), ModItems.itemNetheriumIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedIronSword, 1), new Object[] {"X", "X", "Y", Character.valueOf('X'), ModItems.itemReinforcedIronIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedLapisSword, 1), new Object[] {"X", "X", "Y", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot, Character.valueOf('Y'), Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolReinforcedObsidianSword, 1), new Object[] {"X", "X", "Y", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot, Character.valueOf('Y'), Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockCompactedCoalBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemCompressedCoal});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockNetheriumBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemNetheriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockReinforcedIronBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemReinforcedIronIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockReinforcedLapisBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemReinforcedLapisIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockReinforcedObsidianBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemReinforcedObsidianIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blockReinforcedQuartzBlock, 1), new Object[] {"XXX", "XXX", "XXX", Character.valueOf('X'), ModItems.itemReinforcedQuartzIngot});

        if(ConfigurationHandler.gHarvesterAutoSilkTouch == true){
            addEnchantedRecipe(ModItems.toolGlowstoneHarvesterEnchanted, Enchantment.silkTouch, 1, new Object[] { "X X", " X ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedQuartzIngot, Character.valueOf('Y'), ModItems.itemReinforcedIronIngot});
            //GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolGlowstoneHarvesterEnchanted, 1), new Object[] { "X X", " X ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedQuartzIngot, Character.valueOf('Y'), ModItems.itemReinforcedIronIngot});
        }
        else if(ConfigurationHandler.gHarvesterAutoSilkTouch == false){
            GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolGlowstoneHarvester, 1), new Object[] { "X X", " X ", " Y ", Character.valueOf('X'), ModItems.itemReinforcedQuartzIngot, Character.valueOf('Y'), ModItems.itemReinforcedIronIngot});
            addEnchantedRecipe(ModItems.toolGlowstoneHarvesterEnchanted, Enchantment.silkTouch, 1, new Object[] { "X X", " Y ", " Z ", Character.valueOf('X'), Items.diamond, Character.valueOf('Y'), ModItems.toolGlowstoneHarvester, Character.valueOf('Z'), Items.emerald});
            //GameRegistry.addShapedRecipe(new ItemStack(ModItems.toolGlowstoneHarvesterEnchanted, 1), new Object[] { "X X", " Y ", " Z ", Character.valueOf('X'), Items.diamond, Character.valueOf('Y'), ModItems.toolGlowstoneHarvester, Character.valueOf('Z'), Items.emerald});
        }

        GameRegistry.addSmelting(new ItemStack(ModItems.itemHardenedIronIngot), new ItemStack(ModItems.itemReinforcedIronIngot), 0.3F);
	
	}

    public static void addEnchantedRecipe(Item item, Enchantment enchantment, int enchantmentLevel, Object[] ingredientArray)
    {
        ItemStack result = new ItemStack(item);
        if (enchantment != null) {
            result.addEnchantment(enchantment, enchantmentLevel);
        }

        GameRegistry.addShapedRecipe(result, ingredientArray);
    }
}