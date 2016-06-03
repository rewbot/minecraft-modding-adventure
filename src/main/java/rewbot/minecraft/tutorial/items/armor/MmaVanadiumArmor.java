package rewbot.minecraft.tutorial.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import rewbot.minecraft.tutorial.MmaGlobal;
import rewbot.minecraft.tutorial.items.MmaItems;

/**
 * Created by ashepherd on 5/26/2016.
 */
public class MmaVanadiumArmor extends ItemArmor {

    public MmaVanadiumArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);

        setUnlocalizedName(unlocalizedName);
        setCreativeTab(MmaGlobal.mmaCreativeTab);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == MmaItems.vanadiumHelmet) {
            effectPlayer(player, Potion.nightVision, 0);
        }
        if (itemStack.getItem() == MmaItems.vanadiumChestplate) {
            effectPlayer(player, Potion.absorption, 1);
        }
        if (itemStack.getItem() == MmaItems.vanadiumLeggings) {
            effectPlayer(player, Potion.moveSpeed, 1);
        }
        if (itemStack.getItem() == MmaItems.vanadiumBoots) {
            effectPlayer(player, Potion.jump, 2);
        }

        if (isWearingFullSet(player, MmaItems.vanadiumHelmet, MmaItems.vanadiumChestplate, MmaItems.vanadiumLeggings, MmaItems.vanadiumBoots)) {
            effectPlayer(player, Potion.regeneration, 1);
        }

        //TODO: How can I add the custom items directly to survival inventory?
        //player.inventory.addItemStackToInventory(new ItemStack(MmaItems.copperIngot));
    }

    private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
        return (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet)
                && (player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate)
                && (player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings)
                && (player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots);
    }

    private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
        if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
            player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
        }
    }
}
