package com.pxlhub.advancedores.recipes;

import net.minecraft.item.ItemStack;

import com.pxlhub.advancedores.blocks.ModBlocks;
import com.pxlhub.advancedores.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHelper {

	//Method used in AdvancedOres Class to register Recipes.
	public static void loadRecipes() {
		
		//Mollionite Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mollioniteBlock, 1), new Object[] {"CCC","CCC","CCC",'C', ModItems.mollioniteCrystal});
		//Mollionite Crystal from Mollionite Block
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mollioniteCrystal, 9), new ItemStack(ModBlocks.mollioniteBlock, 1));
	}
}
