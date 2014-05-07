package com.pxlhub.advancedores.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabAO extends CreativeTabs {

	public CreativeTabAO(int ID, String langName) {
		super(ID, langName);

	}

	@Override
	public Item getTabIconItem() {
		return Items.melon; //placeholder for now.
	}

}