package rewbot.minecraft.tutorial.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rewbot.minecraft.tutorial.blocks.AdventureBlocks;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        AdventureBlocks.initBlocks();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}
