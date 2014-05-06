package com.pxlhub.advancedores.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import com.pxlhub.advancedores.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class AdvancedOresOverworld implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		//If Dimension is <Dimension>, run function
		
		switch(world.provider.dimensionId) {
			case -1:
				generateNether(world, random, chunkX*16, chunkZ*16);
				break;
			case 0:
				generateXPOre(world, random, chunkX*16, chunkZ*16);
				generateMollioniteOre(world, random, chunkX*16, chunkZ*16);
				break;
			case 1:
				generateEnd(world, random, chunkX*16, chunkZ*16);
				break;
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	private void generateXPOre(World world, Random random, int x, int z) {
		for (int i = 0; i < 5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(20);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.xpOre, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
}
	private void generateMollioniteOre(World world, Random random, int x, int z) {
		for (int i = 0; i < 2; i++) {
				int chunkX = x + random.nextInt(16);
				int chunkY = random.nextInt(10);
				int chunkZ = z + random.nextInt(16);
				
			(new WorldGenMinable(ModBlocks.mollioniteOre, 2)).generate(world, random, chunkX, chunkY, chunkZ);
	}
}
	private void generateNether(World world, Random random, int x, int z) {
		
	}

}
