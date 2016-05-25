package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.ItemSpade;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/22/2016.
 */
public class MmaVanadiumSpade extends ItemSpade {
    public MmaVanadiumSpade(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
