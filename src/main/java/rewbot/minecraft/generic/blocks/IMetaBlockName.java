package rewbot.minecraft.generic.blocks;

import net.minecraft.item.ItemStack;

/**
 * Created by ashepherd on 3/13/2016.
 */
public interface IMetaBlockName {
    String getSpecialName(ItemStack stack);
}
