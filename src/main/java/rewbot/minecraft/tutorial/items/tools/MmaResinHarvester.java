package rewbot.minecraft.tutorial.items.tools;

import net.minecraft.item.ItemAxe;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 5/30/2016.
 */
public class MmaResinHarvester extends ItemAxe {
    public MmaResinHarvester(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }
}
