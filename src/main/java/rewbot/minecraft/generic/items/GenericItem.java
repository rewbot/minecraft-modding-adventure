package rewbot.minecraft.generic.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by ashepherd on 3/3/2016.
 */
public class GenericItem extends Item {
    private final String genericItem = "genericItem";

    public String getName() {
        return genericItem;
    }

    public GenericItem() {
        GameRegistry.registerItem(this, genericItem);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("genericItem");
    }

//    @Override
//    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
//    {
//        worldIn.
//
//        return itemStackIn;
//    }
}
