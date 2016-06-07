package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.items.armor.*;
import rewbot.minecraft.tutorial.items.fuels.MmaTreeResin;
import rewbot.minecraft.tutorial.items.gems.MmaTopazStone;
import rewbot.minecraft.tutorial.items.ingots.MmaCopperIngot;
import rewbot.minecraft.tutorial.items.ingots.MmaLaconianIngot;
import rewbot.minecraft.tutorial.items.tools.*;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItems {
    //Tools
    //See ToolMaterial Enum for more info
    public static Item.ToolMaterial LACONIANTOOLS = EnumHelper.addToolMaterial("LACONIANTOOLS", 3, 800, 8.0F, 4.0F, 10);
    //Harvest level set to wood so that you can only use them for specialized purpose
    public static Item.ToolMaterial RESINTOOLS = EnumHelper.addToolMaterial("RESINTOOLS", 0, 300, 8.0F, 0.0F, 0);

    public static Item laconianPickaxe;
    public static Item laconianAxe;
    public static Item laconianSpade;
    public static Item laconianHoe;
    public static Item laconianSword;

    //Armor
    public static ItemArmor.ArmorMaterial LACONIANARMOR = EnumHelper.addArmorMaterial("LACONIANARMOR", Main.MOD_ID + ":" + "laconian", 16, new int[]{2, 5, 3, 1, }, 30);

    public static Item laconianHelmet;
    public static Item laconianChestplate;
    public static Item laconianLeggings;
    public static Item laconianBoots;

    //Ingots
    public static Item copperIngot;
    public static Item laconianIngot;

    //Gems
    public static Item topazStone;

    //Fuels
    public static Item treeResin;

    public static void initItems() {
        //Tools
        GameRegistry.registerItem(laconianPickaxe = new MmaLaconianPickaxe("laconianPickaxe", LACONIANTOOLS), "laconianPickaxe");
        GameRegistry.registerItem(laconianAxe = new MmaLaconianAxe("laconianAxe", LACONIANTOOLS), "laconianAxe");
        GameRegistry.registerItem(laconianSpade = new MmaLaconianSpade("laconianSpade", LACONIANTOOLS), "laconianSpade");
        GameRegistry.registerItem(laconianHoe = new MmaLaconianHoe("laconianHoe", LACONIANTOOLS), "laconianHoe");
        GameRegistry.registerItem(laconianSword = new MmaLaconianSword("laconianSword", LACONIANTOOLS), "laconianSword");

        //Armor
        GameRegistry.registerItem(laconianHelmet = new MmaLaconianArmor("laconianHelmet", LACONIANARMOR, 1, 0), "laconianHelmet");
        GameRegistry.registerItem(laconianChestplate = new MmaLaconianArmor("laconianChestplate", LACONIANARMOR, 1, 1), "laconianChestplate");
        GameRegistry.registerItem(laconianLeggings = new MmaLaconianArmor("laconianLeggings", LACONIANARMOR, 2, 2), "laconianLeggings");
        GameRegistry.registerItem(laconianBoots = new MmaLaconianArmor("laconianBoots", LACONIANARMOR, 1, 3), "laconianBoots");


        //Ingots
        GameRegistry.registerItem(copperIngot = new MmaCopperIngot("copperIngot"), "copperIngot");
        GameRegistry.registerItem(laconianIngot = new MmaLaconianIngot("laconianIngot"), "laconianIngot");

        //Gems
        GameRegistry.registerItem(topazStone = new MmaTopazStone("topazStone"), "topazStone");

        //Fuels
        GameRegistry.registerItem(treeResin = new MmaTreeResin("treeResin"), "treeResin");

    }
}
