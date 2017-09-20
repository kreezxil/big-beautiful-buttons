package com.kreezcraft.bigbeautifulbuttons;

import com.kreezcraft.bigbeautifulbuttons.blocks.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BigBeautifulButtonsTab extends CreativeTabs {

	public BigBeautifulButtonsTab(String label) {
		super(BigBeautifulButtons.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitBlocks.DIAMOND_BLOCK_BUTTON);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}