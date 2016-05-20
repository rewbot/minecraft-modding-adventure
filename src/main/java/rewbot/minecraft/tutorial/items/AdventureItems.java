package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class AdventureItems {
    //Ingots
    public static Item copperIngot;

    //Gems
    public static Item topazStone;

    public static void initItems() {
        //Ingots
        GameRegistry.registerItem(copperIngot = new AdventureItem("copperIngot"), "copperIngot");

        //Gems
        GameRegistry.registerItem(topazStone = new AdventureItem("topazStone"), "topazStone");
    }
}
