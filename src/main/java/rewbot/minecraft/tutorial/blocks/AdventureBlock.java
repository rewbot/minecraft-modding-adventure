package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class AdventureBlock extends Block {

    public AdventureBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);

        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
