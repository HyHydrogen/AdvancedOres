package com.pxlhub.advancedores.blocks;

import java.util.Random;

import com.pxlhub.advancedores.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MadeiralOre extends Block {
	
	public MadeiralOre() {
		
		super(Material.rock);
		setBlockName("madeiralOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe",2);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(7.5F);
		
	    }
		
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.madeiralCakeSlice; 
    }
    
    @Override
    public int quantityDropped(Random par1Random) {
            return 1 + par1Random.nextInt(3);
    }
}
