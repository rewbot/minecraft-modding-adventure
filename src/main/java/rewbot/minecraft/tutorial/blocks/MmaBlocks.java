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

    //Blocks
    public static Block copperBlock;

    //Gems
    public static Block topazOre;

    public static void initBlocks() {
        //Ores
        GameRegistry.registerBlock(copperOre = new MmaBlock("copperOre", Material.rock, 3, 15), "copperOre");

        //Blocks
        GameRegistry.registerBlock(copperBlock = new MmaBlock("copperBlock", Material.rock, 3, 15), "copperBlock");

        //Gems
        GameRegistry.registerBlock(topazOre = new MmaBlock("topazOre", Material.rock, 3, 15), "topazOre");
    }
}
