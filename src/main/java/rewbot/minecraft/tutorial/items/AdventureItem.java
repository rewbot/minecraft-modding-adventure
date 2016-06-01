package rewbot.minecraft.tutorial.items;

import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/17/2016.
 */
public class AdventureItem extends Item {

    public AdventureItem(String name) {
        super();

        setUnlocalizedName(name);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
