package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;
import rewbot.minecraft.tutorial.items.MmaItems;

import java.util.Random;

/**
 * Created by ashepherd on 6/7/2016.
 */
public class MmaTopazOre extends Block {

    public MmaTopazOre(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);

        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
         return MmaItems.topazStone;
    }

    public int quantityDropped(Random rand) {

        return rand.nextInt(5) + 1;
    }
}
