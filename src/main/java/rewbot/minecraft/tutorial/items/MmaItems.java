package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.Main;
import rewbot.minecraft.tutorial.items.armor.MmaLaconianArmor;
import rewbot.minecraft.tutorial.items.ingots.MmaLaconianIngot;
import rewbot.minecraft.tutorial.items.tools.MmaLaconianPickaxe;
import rewbot.minecraft.tutorial.items.tools.MmaLaconianSword;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class MmaItems {

    public static Item.ToolMaterial LACONIANTOOLS = EnumHelper.addToolMaterial("LACONIANTOOLS", 3, 800, 8.0F, 4.0F, 10);
    public static ItemArmor.ArmorMaterial LACONIANARMOR = EnumHelper.addArmorMaterial("LACONIANARMOR", Main.MOD_ID + ":" + "laconian", 16, new int[]{2, 5, 3, 1 }, 30);

    //Ingots
    public static Item laconianIngot;

    //Tools
    public static Item laconianPickaxe;
    public static Item laconianSword;

    //Armor
    public static Item laconianHelmet;
    public static Item laconianChestplate;
    public static Item laconianLeggings;
    public static Item laconianBoots;

    public static void initItems() {
        GameRegistry.registerItem(laconianIngot = new MmaLaconianIngot("laconianIngot"), "laconianIngot");
        GameRegistry.registerItem(laconianPickaxe = new MmaLaconianPickaxe("laconianPickaxe", LACONIANTOOLS), "laconianPickaxe");
        GameRegistry.registerItem(laconianSword = new MmaLaconianSword("laconianSword", LACONIANTOOLS), "laconianSword");

        GameRegistry.registerItem(laconianHelmet = new MmaLaconianArmor("laconianHelmet", LACONIANARMOR, 1, 0), "laconianHelmet");
        GameRegistry.registerItem(laconianChestplate = new MmaLaconianArmor("laconianChestplate", LACONIANARMOR, 1, 1), "laconianChestplate");
        GameRegistry.registerItem(laconianLeggings = new MmaLaconianArmor("laconianLeggings", LACONIANARMOR, 2, 2), "laconianLeggings");
        GameRegistry.registerItem(laconianBoots = new MmaLaconianArmor("laconianBoots", LACONIANARMOR, 1, 3), "laconianBoots");
    }
}
