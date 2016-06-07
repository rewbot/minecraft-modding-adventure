package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class MmaBlocks {
    //Ores
    public static Block copperOre;
    public static MmaDemonOre demonOre;

    //Blocks
    public static Block copperBlock;

    //Gems
    public static Block topazOre;

    public static void initBlocks() {
        //Ores
        GameRegistry.registerBlock(copperOre = new MmaCopperOre("copperOre", Material.rock, 3, 15), "copperOre");
        GameRegistry.registerBlock(demonOre = new MmaDemonOre("demonOre"), "demonOre");

        //Blocks
        GameRegistry.registerBlock(copperBlock = new MmaCopperBlock("copperBlock", Material.rock, 3, 15), "copperBlock");

        //Gems
        GameRegistry.registerBlock(topazOre = new MmaTopazOre("topazOre", Material.rock, 3, 15), "topazOre");
    }
}
