package rewbot.minecraft.tutorial.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.blocks.AdventureBlocks;
import rewbot.minecraft.tutorial.items.AdventureItems;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaSmelting {

    public static void initSmelting() {
        GameRegistry.addSmelting(AdventureBlocks.copperOre, new ItemStack(AdventureItems.copperIngot), 0);
    }
}
