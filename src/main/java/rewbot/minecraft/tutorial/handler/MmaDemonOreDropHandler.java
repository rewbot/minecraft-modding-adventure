package rewbot.minecraft.tutorial.handler;


import net.minecraft.entity.monster.*;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import rewbot.minecraft.tutorial.blocks.MmaBlocks;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ashepherd on 6/4/2016.
 */
public class MmaDemonOreDropHandler {

    private List<EntityMob> monsters = new ArrayList<EntityMob>();

    @SubscribeEvent
    public void addBlockDrop(BlockEvent.HarvestDropsEvent event) {

        if (event.state.getBlock() == MmaBlocks.demonOre) {
            event.drops.clear();
            onDropSpawnMonster(event.world, event.pos);
        }
    }

    private EntityMob populateMonster(World worldIn) {
        Random random = new Random();
        EntityMob monster = null;

        //Level 1 Monsters
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
        //Random type of monster to spawn
        //Random number of monsters
        //Bonus: each block broken increases the chance that more monsters will spawn, maybe even rank them
        //Bonus: check to see if there is a block just above the block broken. If so, spawn them in front of the block (so they don't get stuck)
        Random random = new Random();

        for (int numMonsters = 0; numMonsters < random.nextInt(5) + 1; numMonsters++) {
            EntityMob monster = populateMonster(worldIn);
            monster.setPosition(pos.getX(), pos.getY(), pos.getZ());
            worldIn.spawnEntityInWorld(monster);
        }
    }

    public void onDropSpawnFriendly(World worldIn, BlockPos pos) {
        throw new NotImplementedException();
    }
}
