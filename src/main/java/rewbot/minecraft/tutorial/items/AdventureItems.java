package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class AdventureItems {
    //Ingots
    public static Item copperIngot;

    public static void initItems() {
        GameRegistry.registerItem(copperIngot = new AdventureItem("copperIngot"), "copperIngot");
    }
}
