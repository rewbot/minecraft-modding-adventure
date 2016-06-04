package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/3/2016.
 */
public class MmaLaconianOre extends Block {

    public MmaLaconianOre(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
