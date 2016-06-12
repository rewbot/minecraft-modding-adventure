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
        initLaconianRecipes();
    }

    private static void initLaconianRecipes() {
        //Shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(MmaBlocks.laconianOre, 64), Items.diamond);

        //Shaped
        //Pickaxe
        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianPickaxe),
                "***",
                " # ",
                " # ",
                '*', MmaItems.laconianIngot,
                '#', Items.stick
        );


//        //Helmet
//        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianHelmet),
//                "###",
//                "# #",
//                "   ",
//                '#', MmaItems.laconianIngot
//        );
//
//        //Chestplate
//        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianChestplate),
//                "# #",
//                "###",
//                "###",
//                '#', MmaItems.laconianIngot
//        );
//
//        //Leggings
//        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianLeggings),
//                "###",
//                "# #",
//                "# #",
//                '#', MmaItems.laconianIngot
//        );
//
//        //Boots
//        GameRegistry.addRecipe(new ItemStack(MmaItems.laconianBoots),
//                "   ",
//                "# #",
//                "# #",
//                '#', MmaItems.laconianIngot
//        );
    }
}
