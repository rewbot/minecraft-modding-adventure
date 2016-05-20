package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;
import rewbot.minecraft.tutorial.items.AdventureItems;

import java.util.Random;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class AdventureBlock extends Block {

    public AdventureBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);

        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == AdventureBlocks.topazOre ? AdventureItems.topazStone : Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random rand) {
        return this == AdventureBlocks.topazOre ? 1 + rand.nextInt(5) : 1;
    }
}
