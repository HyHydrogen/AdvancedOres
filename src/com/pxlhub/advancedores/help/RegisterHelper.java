package com.pxlhub.advancedores.help;

import com.pxlhub.advancedores.worldgen.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper {
	
	//Method used in ModBlocks Class to register Blocks.
	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, Reference.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	
	//Method used in ModItem Class to register Items.
	public static void registerItem(Item item) {
		GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
	
	//Method used in AdvancedOres Class to register World Generation.
	public static void loadGen() {
		GameRegistry.registerWorldGenerator(new AdvancedOresOverworld(), 1);
	}
}