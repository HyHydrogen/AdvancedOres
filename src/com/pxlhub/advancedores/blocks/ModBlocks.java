package com.pxlhub.advancedores.blocks;

import com.pxlhub.advancedores.help.Reference;
import com.pxlhub.advancedores.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block xpOre;           //Lists XP Ore
	public static Block mollioniteOre;   //Lists Mollionite Ore
	public static Block mollioniteBlock; //Lists Mollionite Block
	public static Block madeiralOre;   //Lists Madeiral Ore
	
	public static void loadBlocks()
	{
		//*Registers XP Ore
		xpOre = new XPOre().setBlockTextureName(Reference.MODID + ":" + "xpOre");
		RegisterHelper.registerBlock(xpOre);
		
		//*Registers Mollionite Ore
		mollioniteOre = new MollioniteOre().setBlockTextureName(Reference.MODID + ":" + "mollioniteOre");
		RegisterHelper.registerBlock(mollioniteOre);
		
		//*Registers Mollionite Block
		mollioniteBlock = new MollioniteBlock().setBlockTextureName(Reference.MODID + ":" + "mollioniteBlock");
		RegisterHelper.registerBlock(mollioniteBlock);
		
		//*Registers Madeiral Ore
		madeiralOre = new MadeiralOre().setBlockTextureName(Reference.MODID + ":" + "madeiralOre");
		RegisterHelper.registerBlock(madeiralOre);
	}
}