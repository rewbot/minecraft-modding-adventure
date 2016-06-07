package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/7/2016.
 */
public class MmaCopperBlock extends Block {

    public MmaCopperBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);

        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
