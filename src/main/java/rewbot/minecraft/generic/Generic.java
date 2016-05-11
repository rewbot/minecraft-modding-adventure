package rewbot.minecraft.generic;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import rewbot.minecraft.generic.blocks.BlockProperties;
import rewbot.minecraft.generic.blocks.BlockRenderRegister;
import rewbot.minecraft.generic.blocks.GenericBlock;
import rewbot.minecraft.generic.blocks.ItemBlockMeta;
import rewbot.minecraft.generic.items.GenericItem;

@Mod(modid = Generic.MODID, name = Generic.MODNAME, version = Generic.MODVER)
public class Generic {
    public static final String MODID = "generic";
    public static final String MODNAME = "Generic mod";
    public static final String MODVER = "0.0.0";

    @Mod.Instance(value = Generic.MODID)
    public static Generic instance;

    private static Item genericItem;
    private static Block genericBlock;
    public static Block blockProperties;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //event handler registry

        //blocks
        genericBlock = new GenericBlock();
        blockProperties = new BlockProperties("block_properties", Material.rock, .5f, .5f);
        GameRegistry.registerBlock(blockProperties, ItemBlockMeta.class, "block_properties");

        //items
        genericItem = new GenericItem();
        //GameRegistry.registerItem(genericItem, "genericItem"); //this is now handled in the item constructor

        BlockRenderRegister.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Item.getItemById(15), 64), new ItemStack(Blocks.dirt));

        GameRegistry.addRecipe(new ItemStack(Blocks.lapis_block),
                "AA",
                "AA",
                'A', Blocks.dirt);


        //register renders we need to register the .json file which handles the rendering of the Block when it’s in Item form
        if (event.getSide() == Side.CLIENT) {
            BlockRenderRegister.registerBlockRenderer();
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            //items
            ModelResourceLocation genericItemResource = new ModelResourceLocation(MODID + ":" + ((GenericItem) genericItem).getName(), "inventory");
            renderItem.getItemModelMesher().register(genericItem, 0, genericItemResource);

            //blocks
            ModelResourceLocation genericBlockResource = new ModelResourceLocation(MODID + ":" + ((GenericBlock) genericBlock).getName(), "inventory");
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(genericBlock), 0, genericBlockResource);
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
