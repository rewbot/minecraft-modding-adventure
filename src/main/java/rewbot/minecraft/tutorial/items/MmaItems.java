package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.items.ingots.MmaLaconianIngot;
import rewbot.minecraft.tutorial.items.tools.MmaLaconianPickaxe;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItems {

    public static Item.ToolMaterial LACONIANTOOLS = EnumHelper.addToolMaterial("LACONIANTOOLS", 3, 800, 8.0F, 4.0F, 10);

    //Ingots
    public static Item laconianIngot;

    //Tools
    public static Item laconianPickaxe;

    public static void initItems() {
        GameRegistry.registerItem(laconianIngot = new MmaLaconianIngot("laconianIngot"), "laconianIngot");
        GameRegistry.registerItem(laconianPickaxe = new MmaLaconianPickaxe("laconianPickaxe", LACONIANTOOLS), "laconianPickaxe");
    }
}
