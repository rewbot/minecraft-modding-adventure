package rewbot.minecraft.tutorial.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rewbot.minecraft.tutorial.blocks.AdventureBlocks;
import rewbot.minecraft.tutorial.crafting.MmaRecipes;
import rewbot.minecraft.tutorial.crafting.MmaSmelting;
import rewbot.minecraft.tutorial.handler.MmaDropHandler;
import rewbot.minecraft.tutorial.handler.MmaFuelHandler;
import rewbot.minecraft.tutorial.items.AdventureItems;
import rewbot.minecraft.tutorial.world.MmaWorldGen;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        AdventureBlocks.initBlocks();
        AdventureItems.initItems();
        MmaRecipes.initRecipes();
        MmaSmelting.initSmelting();
    }

    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MmaDropHandler());
        GameRegistry.registerFuelHandler(new MmaFuelHandler());
        GameRegistry.registerWorldGenerator(new MmaWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent postEvent) {

    }
}
