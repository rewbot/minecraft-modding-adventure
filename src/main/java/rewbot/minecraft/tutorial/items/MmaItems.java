package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.items.armor.*;
import rewbot.minecraft.tutorial.items.fuels.MmaTreeResing;
import rewbot.minecraft.tutorial.items.fuels.MmaViscinousGel;
import rewbot.minecraft.tutorial.items.ingots.MmaLaconianIngot;
import rewbot.minecraft.tutorial.items.tools.*;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItems {
    //Tools
    //See ToolMaterial Enum for more info
    public static Item.ToolMaterial VANADIUMTOOLS = EnumHelper.addToolMaterial("VANADIUMTOOLS", 3, 800, 8.0F, 4.0F, 10); //Maybe modify to Laconian tools?
    //Harvest level set to wood so that you can only use them for specialized purpose
    public static Item.ToolMaterial GELTOOLS = EnumHelper.addToolMaterial("GELTOOLS", 0, 300, 8.0F, 0.0F, 0); //Maybe modify to Laconian tools?
    public static Item.ToolMaterial RESINTOOLS = EnumHelper.addToolMaterial("RESINTOOLS", 0, 300, 8.0F, 0.0F, 0); //Maybe modify to Laconian tools?

    public static Item vanadiumPickaxe;
    public static Item vanadiumAxe;
    public static Item vanadiumSpade;
    public static Item vanadiumHoe;
    public static Item vanadiumSword;

    public static Item shaleMattock;
    public static Item resinHarvester;

    //Armor
    public static ItemArmor.ArmorMaterial VANADIUMARMOR = EnumHelper.addArmorMaterial("VANADIUMARMOR", Main.MOD_ID + ":" + "vanadium", 16, new int[]{2, 5, 3, 1, }, 30);

    public static Item vanadiumHelmet;
    public static Item vanadiumChestplate;
    public static Item vanadiumLeggings;
    public static Item vanadiumBoots;

    //Ingots
    public static Item copperIngot;
    public static Item laconianIngot;

    //Gems
    public static Item topazStone;

    //Fuels
    public static Item treeResin;
    public static Item viscinousGel;

    public static void initItems() {
        //Tools
        GameRegistry.registerItem(vanadiumPickaxe = new MmaVanadiumPickaxe("vanadiumPickaxe", VANADIUMTOOLS), "vanadiumPickaxe");
        GameRegistry.registerItem(vanadiumAxe = new MmaVanadiumAxe("vanadiumAxe", VANADIUMTOOLS), "vanadiumAxe");
        GameRegistry.registerItem(vanadiumSpade = new MmaVanadiumSpade("vanadiumSpade", VANADIUMTOOLS), "vanadiumSpade");
        GameRegistry.registerItem(vanadiumHoe = new MmaVanadiumHoe("vanadiumHoe", VANADIUMTOOLS), "vanadiumHoe");
        GameRegistry.registerItem(vanadiumSword = new MmaVanadiumSword("vanadiumSword", VANADIUMTOOLS), "vanadiumSword");
        GameRegistry.registerItem(shaleMattock = new MmaShaleMattock("shaleMattock", GELTOOLS), "shaleMattock");
        GameRegistry.registerItem(resinHarvester = new MmaResinHarvester("resinHarvester", RESINTOOLS), "resinHarvester");


        //Armor
        GameRegistry.registerItem(vanadiumHelmet = new MmaVanadiumArmor("vanadiumHelmet", VANADIUMARMOR, 1, 0), "vanadiumHelmet");
        GameRegistry.registerItem(vanadiumChestplate = new MmaVanadiumArmor("vanadiumChestplate", VANADIUMARMOR, 1, 1), "vanadiumChestplate");
        GameRegistry.registerItem(vanadiumLeggings = new MmaVanadiumArmor("vanadiumLeggings", VANADIUMARMOR, 2, 2), "vanadiumLeggings");
        GameRegistry.registerItem(vanadiumBoots = new MmaVanadiumArmor("vanadiumBoots", VANADIUMARMOR, 1, 3), "vanadiumBoots");


        //Ingots
        GameRegistry.registerItem(copperIngot = new MmaItem("copperIngot"), "copperIngot");
        GameRegistry.registerItem(laconianIngot = new MmaLaconianIngot("laconianIngot"), "laconianIngot");

        //Gems
        GameRegistry.registerItem(topazStone = new MmaItem("topazStone"), "topazStone");

        //Fuels
        GameRegistry.registerItem(treeResin = new MmaTreeResing("treeResin"), "treeResin");
        GameRegistry.registerItem(viscinousGel = new MmaViscinousGel("viscinousGel"), "viscinousGel");

    }
}
