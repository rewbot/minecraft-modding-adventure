package rewbot.minecraft.tutorial.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;
import rewbot.minecraft.tutorial.items.MmaItems;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaRecipes {

    public static void initRecipes() {
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
}
