package com.kreezcraft.bigbeautifulbuttons.blocks;

import com.kreezcraft.bigbeautifulbuttons.BigBeautifulButtons;
import com.kreezcraft.bigbeautifulbuttons.client.IHasModel;
import com.kreezcraft.bigbeautifulbuttons.items.InitItems;

import net.minecraft.block.BlockButtonStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class StoneButton extends BlockButtonStone implements IHasModel {
	
	protected String name;
	protected final AxisAlignedBB BIG_BUTTON = new AxisAlignedBB(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375);

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return BIG_BUTTON; 
	}

	public StoneButton(String name) {
		super();
		this.name = name;
		setUnlocalizedName(BigBeautifulButtons.MODID + "." + name);
		setCreativeTab(BigBeautifulButtons.creativeTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		
	}

	@Override
	public void registerModels() {
		BigBeautifulButtons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
