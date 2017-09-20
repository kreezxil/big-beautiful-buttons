package com.kreezcraft.bigbeautifulbuttons.items;

import com.kreezcraft.bigbeautifulbuttons.BigBeautifulButtons;
import com.kreezcraft.bigbeautifulbuttons.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(BigBeautifulButtons.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
	}

	public void registerItemModel() {
		BigBeautifulButtons.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		BigBeautifulButtons.proxy.registerItemRenderer(this, 0, "inventory");
	}

}