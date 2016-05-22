package rewbot.minecraft.tutorial.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.blocks.AdventureBlocks;

/**
 * Created by ashepherd on 5/16/2016.
 */
public class MmaBlockRender {

    public static void registerBlockRender() {
        //Ores
        registerBlock(AdventureBlocks.copperOre);

        //Blocks
        registerBlock(AdventureBlocks.copperBlock);

        //Gems
        registerBlock(AdventureBlocks.topazOre);
    }

    private static void registerBlock(Block block) {
        ItemModelMesher itemModelMesher =  Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        itemModelMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Main.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
