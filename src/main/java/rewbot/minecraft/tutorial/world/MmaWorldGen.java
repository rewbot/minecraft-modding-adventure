package rewbot.minecraft.tutorial.world;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;

import java.util.Random;

/**
 * Created by ashepherd on 5/31/2016.
 */
public class MmaWorldGen implements IWorldGenerator {
    //Ores
    private WorldGenerator copperOre;
    private WorldGenerator laconianOre;

    //Gems
    private WorldGenerator topazOre;

    public MmaWorldGen() {
        copperOre = new MmaWorldGenMinable(MmaBlocks.copperOre.getDefaultState(), 8);
        topazOre = new MmaWorldGenMinable(MmaBlocks.topazOre.getDefaultState(), 8);
        laconianOre = new MmaWorldGenMinable(MmaBlocks.laconianOre.getDefaultState(), 4);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimensionId()) {
            case 0: //Overworld
                //Ores
                runGenerator(copperOre, world, random, chunkX, chunkZ, 50, 0, 228);
                runGenerator(laconianOre, world, random, chunkX, chunkZ, 10, 0, 64);
                //Gems
                runGenerator(topazOre, world, random, chunkX, chunkZ, 10, 0, 128);
                break;
            case -1: //nether
                //Nether Ores
                break;
            case 1: //The End
                //End Ores
                break;
        }
    }

    private void runGenerator (WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
            throw new IllegalArgumentException("Minimum or Maximum height out of bounds");
        }

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chanceToSpawn; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
