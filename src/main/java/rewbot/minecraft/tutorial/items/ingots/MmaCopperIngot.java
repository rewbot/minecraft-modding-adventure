package rewbot.minecraft.tutorial.items.ingots;

import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/7/2016.
 */
public class MmaCopperIngot extends Item {

    public MmaCopperIngot(String name) {
        super();

        setUnlocalizedName(name);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
