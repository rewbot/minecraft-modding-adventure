package rewbot.minecraft.generic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;


/**
 * Created by ashepherd on 3/13/2016.
 */
public class BlockProperties extends Block implements IMetaBlockName {

    public static final PropertyEnum TYPE = PropertyEnum.create("type", EnumType.class);
    public static final PropertyEnum SKY = PropertyEnum.create("sky", EnumType.class);
    private final String name;

    public BlockProperties(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        name = unlocalizedName;
        setUnlocalizedName(unlocalizedName);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(hardness);
        setResistance(resistance);
        System.out.println("DEFAULT STATE: " + this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
        setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
    }

    public String getName() {
        return name;
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[]{TYPE, SKY});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(TYPE, meta == 0 ? EnumType.WHITE : EnumType.BLACK);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumType type = (EnumType) state.getValue(TYPE);
        return type.getId();
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        list.add(new ItemStack(itemIn, 1, 0)); //Meta 0 WHITE
        list.add(new ItemStack(itemIn, 1, 1)); //Meta 1 BLACK
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return stack.getItemDamage() == 0 ? "white" : "black";
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        return state.withProperty(SKY, ((World)worldIn).canBlockSeeSky(pos));
    }
}

