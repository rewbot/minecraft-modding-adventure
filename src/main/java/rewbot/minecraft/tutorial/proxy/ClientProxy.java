package rewbot.minecraft.tutorial.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ashepherd on 5/12/2016.
 */
public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent) {
        super.preInit(preEvent);
    }

    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent postEvent) {
        super.postInit(postEvent);
    }
}
