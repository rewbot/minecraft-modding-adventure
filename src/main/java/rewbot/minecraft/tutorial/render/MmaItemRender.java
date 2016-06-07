package rewbot.minecraft.tutorial.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.items.MmaItems;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItemRender {

    public static void registerItemRender() {
        //Ingots
        registerItem(MmaItems.copperIngot);

        //Gems
        registerItem(MmaItems.topazStone);

        //Fuels
        registerItem(MmaItems.treeResin);
    }

    private static void registerItem(Item item) {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        itemModelMesher.register(item, 0, new ModelResourceLocation(Main.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
