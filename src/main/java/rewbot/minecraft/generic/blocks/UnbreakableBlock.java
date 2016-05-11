package rewbot.minecraft.generic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;

import java.util.Random;

/**
 * Created by ashepherd on 3/8/2016.
 */
public class UnbreakableBlock extends Block {

    public UnbreakableBlock() {
        super(Material.rock);
        setBlockUnbreakable();
    }

    public void levitateBlock() {
        BlockPos position = new BlockPos(this.getBlockBoundsMaxX(), this.getBlockBoundsMaxY(), this.getBlockBoundsMaxZ());

    }


}
