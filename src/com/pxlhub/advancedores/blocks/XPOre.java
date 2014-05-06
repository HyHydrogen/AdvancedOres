package com.pxlhub.advancedores.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class XPOre extends Block {
	
	public XPOre() {
		
		super(Material.rock);
		setBlockName("xpOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypePiston);
		setHardness(3.0F);
		setResistance(7.5F);
		setHarvestLevel("pickaxe", 2);
	}
		
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 50);
	}
	
	 public int quantityDropped(Random p_149745_1_)
	    {
	        return 0;
	    }
	 
}

