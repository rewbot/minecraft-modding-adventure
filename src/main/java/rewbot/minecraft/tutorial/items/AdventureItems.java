package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.items.tools.*;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class AdventureItems {
    //Tools
    //See ToolMaterial Enum for more info
    public static Item.ToolMaterial VANADIUMTOOLS = EnumHelper.addToolMaterial("VANADIUMTOOLS", 3, 800, 8.0F, 4.0F, 10); //Maybe modify to Laconian tools?

    public static Item vanadiumPickaxe;
    public static Item vanadiumAxe;
    public static Item vanadiumSpade;
    public static Item vanadiumHoe;
    public static Item vanadiumSword;

    //Ingots
    public static Item copperIngot;

    //Gems
    public static Item topazStone;

    public static void initItems() {
        //Tools
        GameRegistry.registerItem(vanadiumPickaxe = new MmaVanadiumPickaxe("vanadiumPickaxe", VANADIUMTOOLS), "vanadiumPickaxe");
        GameRegistry.registerItem(vanadiumAxe = new MmaVanadiumAxe("vanadiumAxe", VANADIUMTOOLS), "vanadiumAxe");
        GameRegistry.registerItem(vanadiumSpade = new MmaVanadiumSpade("vanadiumSpade", VANADIUMTOOLS), "vanadiumSpade");
        GameRegistry.registerItem(vanadiumHoe = new MmaVanadiumHoe("vanadiumHoe", VANADIUMTOOLS), "vanadiumHoe");
        GameRegistry.registerItem(vanadiumSword = new MmaVanadiumSword("vanadiumSword", VANADIUMTOOLS), "vanadiumSword");

        //Ingots
        GameRegistry.registerItem(copperIngot = new AdventureItem("copperIngot"), "copperIngot");

        //Gems
        GameRegistry.registerItem(topazStone = new AdventureItem("topazStone"), "topazStone");
    }
}
