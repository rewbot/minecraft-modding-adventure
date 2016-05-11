package rewbot.minecraft.generic;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import rewbot.minecraft.generic.blocks.GenericBlock;

import java.util.Collection;
import java.util.Random;

/**
 * Created by ashepherd on 3/10/2016.
 */
public class GenericWorldGenerator extends WorldGenerator {

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        //GenericBlock block = new GenericBlock();
        //WorldGenMinable minable = new WorldGenMinable((IBlockState)block.getBlockState(), 1, BlockHelper.forBlock(new GenericBlock()));



        System.out.println("About to set block state");
        Block lavaBlock = new Block(Material.lava);

        worldIn.setBlockState(position, (IBlockState) lavaBlock.getBlockState());
        System.out.println("Block state set to: " + lavaBlock.getBlockState().toString());

        // minable.generate(worldIn, rand, new Block(Material.lava));
        return true;
    }
}
