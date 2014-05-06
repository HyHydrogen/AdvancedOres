package com.pxlhub.advancedores.main;

import com.pxlhub.advancedores.help.Reference;
import com.pxlhub.advancedores.help.RegisterHelper;
import com.pxlhub.advancedores.items.ModItems;
import com.pxlhub.advancedores.blocks.ModBlocks;
import com.pxlhub.advancedores.recipes.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)

public class AdvancedOres {
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.loadBlocks();
		ModItems.loadItems();
		RegisterHelper.loadGen();
		RecipeHelper.loadRecipes();
	}
}
