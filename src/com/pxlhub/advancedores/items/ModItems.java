package com.pxlhub.advancedores.items;

import com.pxlhub.advancedores.help.Reference;
import com.pxlhub.advancedores.help.RegisterHelper;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item mollioniteCrystal; //Lists Mollionite Crystal
	
	public static void loadItems()
	{
		//*Registers Mollionite Crystal
		mollioniteCrystal = new MollioniteCrystal().setTextureName(Reference.MODID + ":" + "mollioniteCrystal");
		RegisterHelper.registerItem(mollioniteCrystal);
		
		//*Registers Madeiral Cake
		madeiralCake = new MadeiralCake(2, 0.4F, false).setTextureName(Reference.MODID + ":" + "madeiralCake");
		RegisterHelper.registerItem(madeiralCake);
	}
}