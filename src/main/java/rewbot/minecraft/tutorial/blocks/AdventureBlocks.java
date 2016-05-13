package rewbot.minecraft.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class AdventureBlocks {
    public static Block copperOre;

    public static void initBlocks() {
        //Ores
        GameRegistry.registerBlock(new AdventureBlock("copperOre", Material.rock, 3, 15), "copperOre");
    }
}
