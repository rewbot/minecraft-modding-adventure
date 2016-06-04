package rewbot.minecraft.tutorial.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;
import rewbot.minecraft.tutorial.items.MmaItems;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaRecipes {

    public static void initRecipes() {
        initCopperRecipes();
        initLaconianRecipes();
    }

    private static void initCopperRecipes() {
        //addRecipe takes Java varargs as it's second argument. They let you pass any number of objects of a specific type, in this case object
        GameRegistry.addRecipe(new ItemStack(MmaBlocks.copperBlock),
                "###",
                "###",
                "###",
                '#', MmaItems.copperIngot
        );

        GameRegistry.addShapelessRecipe(new ItemStack(MmaItems.copperIngot, 9),
                MmaBlocks.copperBlock
        );
    }

    private static void initLaconianRecipes() {
        //Shaped
        //Sword
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianSword),
                " * ",
                " * ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );

        //Pickaxe
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianPickaxe),
                "***",
                " # ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );

        //Axe
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianAxe),
                "** ",
                "*# ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );

        //Hoe
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianHoe),
                "** ",
                " # ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );

        //Spade
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianSpade),
                " * ",
                " # ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );

        //Helmet
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianHelmet),
                "###",
                "# #",
                "   ",
                '#', MmaItems.laconianIngot
        );

        //Chestplate
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianChestplate),
                "# #",
                "###",
                "###",
                '#', MmaItems.laconianIngot
        );

        //Leggings
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianLeggings),
                "###",
                "# #",
                "# #",
                '#', MmaItems.laconianIngot
        );

        //Boots
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianBoots),
                "   ",
                "# #",
                "# #",
                '#', MmaItems.laconianIngot
        );

        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(MmaBlocks.laconianOre, 64), Items.diamond);
    }
}
