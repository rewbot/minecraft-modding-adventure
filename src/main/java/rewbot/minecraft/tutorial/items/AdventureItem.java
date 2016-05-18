package rewbot.minecraft.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class AdventureItem extends Item {

    public AdventureItem(String name) {
        super();

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
