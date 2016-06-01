package rewbot.minecraft.tutorial.handler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import rewbot.minecraft.tutorial.items.AdventureItems;

/**
 * Created by ashepherd on 5/31/2016.
 */
public class MmaFuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == AdventureItems.treeResin) {
            return 800;
        }
        if (fuel.getItem() == AdventureItems.viscinousGel) {
            return 2400;
        }

        return 0;
    }
}
