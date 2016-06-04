package rewbot.minecraft.tutorial.items.ingots;

import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/3/2016.
 */
public class MmaLaconianIngot extends Item {

    public MmaLaconianIngot(String name) {
        super();

        setUnlocalizedName(name);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
