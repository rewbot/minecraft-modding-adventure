package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.ItemAxe;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaLaconianAxe extends ItemAxe {
    public MmaLaconianAxe(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
