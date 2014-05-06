package com.pxlhub.advancedores.blocks;

import java.util.Random;

import com.pxlhub.advancedores.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MollioniteOre extends Block {
	
	public MollioniteOre() {
		
		super(Material.rock);
		setBlockName("mollioniteOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",2);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(7.5F);
		
	    }
		
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.mollioniteCrystal;
    }
}
