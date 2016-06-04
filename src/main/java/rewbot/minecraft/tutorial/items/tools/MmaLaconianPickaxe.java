package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.ItemPickaxe;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaLaconianPickaxe extends ItemPickaxe {
    public MmaLaconianPickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
