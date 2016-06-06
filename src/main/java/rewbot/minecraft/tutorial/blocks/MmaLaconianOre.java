package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/3/2016.
 */
public class MmaLaconianOre extends Block {

    public MmaLaconianOre(String unlocalizedName) {
        super(Material.rock);

        setUnlocalizedName(unlocalizedName);
        setHardness(3);
        setResistance(15);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
