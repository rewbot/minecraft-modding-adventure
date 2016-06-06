package rewbot.minecraft.tutorial.items.fuels;

import net.minecraft.item.Item;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/30/2016.
 */
public class MmaTreeResin extends Item {
    public MmaTreeResin(String unlocalizedName) {
        super();

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
