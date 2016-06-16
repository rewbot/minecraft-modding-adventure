package rewbot.minecraft.tutorial.world;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;

import java.util.Random;

/**
 * Created by ashepherd on 6/15/2016.
 */
public class MmaWorldGen implements IWorldGenerator {
    private WorldGenerator laconianOre;

    public MmaWorldGen() {
        laconianOre = new WorldGenMinable(MmaBlocks.laconianOre.getDefaultState(), 4);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimensionId()) {
            case 0: //Overworld
                runGenerator(laconianOre, world, random, chunkX, chunkZ, 50, 0, 64);
                break;
            case -1: //Nether
                break;
            case 1: //The End
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
