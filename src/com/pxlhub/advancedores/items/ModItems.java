package com.pxlhub.advancedores.items;

import com.pxlhub.advancedores.help.Reference;
import com.pxlhub.advancedores.help.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {
	
	public static Item mollioniteCrystal; //Lists Mollionite Crystal
	public static ItemFood madeiralCakeSlice; //
	
	public static void loadItems()
	{
		//*Registers Mollionite Crystal
		mollioniteCrystal = new MollioniteCrystal().setTextureName(Reference.MODID + ":" + "mollioniteCrystal");
		RegisterHelper.registerItem(mollioniteCrystal);
		
		//*Registers Madeiral Cake Slice
		madeiralCakeSlice = (ItemFood) new MadeiralCakeSlice(2, 0.4F, false).setTextureName(Reference.MODID + ":" + "madeiralCakeSlice");
		RegisterHelper.registerItem(madeiralCakeSlice);
	}
}