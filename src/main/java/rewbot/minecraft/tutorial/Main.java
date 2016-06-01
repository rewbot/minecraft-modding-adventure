package rewbot.minecraft.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import rewbot.minecraft.tutorial.proxy.CommonProxy;

/**
 * Created by ashepherd on 5/10/2016.
 */
@Mod(modid = Main.MOD_ID, name = Main.MOD_NAME, version = Main.MOD_VERSION)
public class Main {
    public static final String MOD_ID = "mma";
    public static final String MOD_NAME = "Minecraft Modding Adventure";
    public static final String MOD_VERSION = "0.0.0";
    public static final String CLIENT_PROXY = "rewbot.minecraft.tutorial.proxy.ClientProxy";
    public static final String COMMON_PROXY = "rewbot.minecraft.tutorial.proxy.CommonProxy";

    @Mod.Instance(value = Main.MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent) {
        this.proxy.preInit(preEvent);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent) {
        this.proxy.postInit(postEvent);
    }
}
