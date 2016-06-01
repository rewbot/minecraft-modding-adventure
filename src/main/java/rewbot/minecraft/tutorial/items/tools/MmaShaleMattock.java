package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.ItemSpade;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/30/2016.
 */
public class MmaShaleMattock extends ItemSpade {
    public MmaShaleMattock(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
