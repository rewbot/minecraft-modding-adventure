package rewbot.minecraft.tutorial.items.tools;

    import net.minecraft.item.ItemSword;
import rewbot.minecraft.tutorial.MmaGlobal;

/**
 * Created by ashepherd on 6/12/2016.
 */
public class MmaLaconianSword extends ItemSword {

    public MmaLaconianSword(String unlocalizedName, ToolMaterial material) {
        super(material);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }

}
