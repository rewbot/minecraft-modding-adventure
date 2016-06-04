package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaLaconianHoe extends ItemHoe {
    public MmaLaconianHoe(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
