package rewbot.minecraft.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.items.AdventureItems;

/**
 * Created by ashepherd on 5/19/2016.
 */
public class MmaCreativeTab extends CreativeTabs {

    public MmaCreativeTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return AdventureItems.copperIngot;
    }
}
