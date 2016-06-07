package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.items.fuels.MmaTreeResin;
import rewbot.minecraft.tutorial.items.gems.MmaTopazStone;
import rewbot.minecraft.tutorial.items.ingots.MmaCopperIngot;
import rewbot.minecraft.tutorial.items.tools.*;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItems {
    //Tools
    //Harvest level set to wood so that you can only use them for specialized purpose
    public static Item.ToolMaterial RESINTOOLS = EnumHelper.addToolMaterial("RESINTOOLS", 0, 300, 8.0F, 0.0F, 0);

    //Ingots
    public static Item copperIngot;
    public static Item laconianIngot;

    //Gems
    public static Item topazStone;

    //Fuels
    public static Item treeResin;

    public static void initItems() {
        //Ingots
        GameRegistry.registerItem(copperIngot = new MmaCopperIngot("copperIngot"), "copperIngot");

        //Gems
        GameRegistry.registerItem(topazStone = new MmaTopazStone("topazStone"), "topazStone");

        //Fuels
        GameRegistry.registerItem(treeResin = new MmaTreeResin("treeResin"), "treeResin");

    }
}
