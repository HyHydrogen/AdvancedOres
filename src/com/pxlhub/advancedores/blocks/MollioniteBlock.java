package com.pxlhub.advancedores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MollioniteBlock extends Block {
	
	public MollioniteBlock() {
		
		super(Material.glass);
		setBlockName("mollioniteBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",2);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(7.5F);
		
	    }
}
