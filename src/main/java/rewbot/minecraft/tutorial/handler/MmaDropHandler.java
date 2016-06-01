package rewbot.minecraft.tutorial.handler;

import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rewbot.minecraft.tutorial.items.AdventureItems;
import rewbot.minecraft.tutorial.items.tools.MmaResinHarvester;
import rewbot.minecraft.tutorial.items.tools.MmaShaleMattock;

import java.util.Random;

/**
 * Created by ashepherd on 5/30/2016.
 */
public class MmaDropHandler {

    @SubscribeEvent
    public void addEntityDrop(LivingDropsEvent event) {
        if (event.entity instanceof EntityChicken) {
            ItemStack copperIngot = new ItemStack(AdventureItems.copperIngot, 1);
            event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, copperIngot));
        }
    }

    @SubscribeEvent
    public void addBlockDrop(BlockEvent.HarvestDropsEvent event) {
        if (event.state.getBlock() == Blocks.gravel) {
            Random rand = new Random();
            ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
            if(holding != null && holding.getItem() instanceof MmaShaleMattock) {
                event.drops.clear();
                event.drops.add(new ItemStack(AdventureItems.viscinousGel, rand.nextInt(4)));
            }
        }

        if (event.state.getBlock() == Blocks.log) {
            if (event.state.getValue(BlockOldLog.VARIANT) == BlockPlanks.EnumType.SPRUCE) {
                ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
                if(holding != null && holding.getItem() instanceof MmaResinHarvester) {
                    event.drops.clear();
                    event.drops.add(new ItemStack(AdventureItems.treeResin, 2));
                }
            }
        }
    }
}
