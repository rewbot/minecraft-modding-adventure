package rewbot.minecraft.tutorial.handler;


import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;
import rewbot.minecraft.tutorial.items.tools.MmaLaconianPickaxe;

import java.util.Random;

/**
 * Created by ashepherd on 6/4/2016.
 */
public class MmaDemonOreDropHandler {

    @SubscribeEvent
    public void addBlockDrop(BlockEvent.HarvestDropsEvent event) {

        if (event.state.getBlock() == MmaBlocks.demonOre) {
            ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);

            if(holding != null && holding.getItem() instanceof MmaLaconianPickaxe) {
                MmaBlocks.demonOre.reduceDangerLevel();
                onDropSpawnFriendly(event.world, event.pos);
            } else {
                event.drops.clear();
                MmaBlocks.demonOre.increaseDangerLevel();
                onDropSpawnMonster(event.world, event.pos);
            }
        }
    }

    private EntityMob generateMonster(World worldIn) {
        EntityMob monster = null;

        if (MmaBlocks.demonOre.getDangerLevel() <= 5) {
            monster = getLevelOneMonster(worldIn);
        } else if (MmaBlocks.demonOre.getDangerLevel() > 5) {
            monster = getLevelTwoMonster(worldIn);
        } else if (MmaBlocks.demonOre.getDangerLevel() > 10) {
            monster = new EntityWither(worldIn);
        }

        return monster;
    }

    private EntityMob getLevelTwoMonster(World worldIn) {
        Random random = new Random();
        EntityMob monster = null;

        switch (random.nextInt(3)){
            case 0: //Zombie
                monster = new EntityWitch(worldIn);
                break;
            case 1: //Skeleton
                monster = new EntityBlaze(worldIn);
                break;
            case 2: //Creeper
                monster = new EntityCreeper(worldIn);
                break;
        }
        return monster;
    }

    private EntityMob getLevelOneMonster(World worldIn) {
        Random random = new Random();
        EntityMob monster = null;

        switch (random.nextInt(5)){
            case 0: //Zombie
                monster = new EntityZombie(worldIn);
                break;
            case 1: //Skeleton
                monster = new EntitySkeleton(worldIn);
                break;
            case 2: //Pig Zombie
                monster = new EntityPigZombie(worldIn);
                break;
            case 3: //Spider
                monster = new EntitySpider(worldIn);
                break;
            case 4: //Cave Spider
                monster = new EntityCaveSpider(worldIn);
                break;
        }
        return monster;
    }

    private void onDropSpawnMonster(World worldIn, BlockPos pos)
    {
        int dangerLevel = 0;
        if (MmaBlocks.demonOre.getDangerLevel() <= 5) {
            dangerLevel = MmaBlocks.demonOre.getDangerLevel();
        } else if(MmaBlocks.demonOre.getDangerLevel() > 5 && MmaBlocks.demonOre.getDangerLevel() <= 10) {
            dangerLevel = MmaBlocks.demonOre.getDangerLevel() - 5;
        } else if (MmaBlocks.demonOre.getDangerLevel() > 10) {
            dangerLevel = MmaBlocks.demonOre.getDangerLevel() - 10;
        }

        for (int numMonsters = 1; numMonsters <= dangerLevel; numMonsters++) {
            EntityMob monster = generateMonster(worldIn);
            if (monster == null) {
                return;
            }

            monster.setPosition(pos.getX(), pos.getY(), pos.getZ());
            worldIn.spawnEntityInWorld(monster);
        }
    }

    public void onDropSpawnFriendly(World worldIn, BlockPos pos) {
        EntityChicken chicken = new EntityChicken(worldIn);
        chicken.setPosition(pos.getX(), pos.getY(), pos.getZ());
        worldIn.spawnEntityInWorld(chicken);
    }
}
