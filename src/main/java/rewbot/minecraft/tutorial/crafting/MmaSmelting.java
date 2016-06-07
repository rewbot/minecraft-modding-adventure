package rewbot.minecraft.tutorial.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;
import rewbot.minecraft.tutorial.items.MmaItems;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaSmelting {

    public static void initSmelting() {
        GameRegistry.addSmelting(MmaBlocks.copperOre, new ItemStack(MmaItems.copperIngot), 0);
    }
}
