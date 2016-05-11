package rewbot.minecraft.generic.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import rewbot.minecraft.generic.Generic;


/**
 * Created by ashepherd on 3/15/2016.
 */
public class BlockRenderRegister {

    public static void preInit() {
        ResourceLocation blockPropWhiteLoc = new ResourceLocation("generic:block_properties_white");
        System.out.println(blockPropWhiteLoc.getResourceDomain() + blockPropWhiteLoc.getResourcePath());

        ResourceLocation blockPropBlackLoc = new ResourceLocation("generic:block_properties_black");
        System.out.println(blockPropBlackLoc.getResourceDomain() + blockPropBlackLoc.getResourcePath());

        ModelBakery.registerItemVariants(Item.getItemFromBlock(Generic.blockProperties), blockPropBlackLoc, blockPropWhiteLoc);
    }

    public static void reg(Block block, int meta, String file) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Generic.MODID + ":" + file, "inventory");
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(block), meta, modelResourceLocation);
    }

    public static void registerBlockRenderer() {
        reg(Generic.blockProperties, 0, "block_properties_white");
        reg(Generic.blockProperties, 1, "block_properties_black");
    }
}
