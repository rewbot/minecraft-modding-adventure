package rewbot.minecraft.generic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommand;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.generic.Generic;
import rewbot.minecraft.generic.GenericWorldGenerator;
import rewbot.minecraft.generic.items.GenericItem;

import java.util.Random;

/**
 * Created by ashepherd on 3/7/2016.
 */
public class GenericBlock extends Block {

    private final String name = "genericBlock";

    public GenericBlock() {
        super(Material.ground);
        setHardness(.5f);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(Generic.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    public String getName() {
        return name;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        System.out.println("Entered getItemDropped" + ":" + this.getName());
        state.getBlock();
        return Item.getItemFromBlock(Blocks.command_block);
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        System.out.println("onBlockDestroyed");

        pos.add(1000, 0, 0);

//        Block lavaBlock = new Block(Material.lava);
//        state.getBlock();
//        worldIn.setBlockState(pos.up(), (IBlockState) lavaBlock.getBlockState());

//        WorldGenerator worldGenerator = new WorldGenerator() {
//            @Override
//            public boolean generate(World worldIn, Random rand, BlockPos position) {
//                return false;
//            }
//        };


        //TODO: place a block of lava where the block used to be
    }

    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {

    }
}
