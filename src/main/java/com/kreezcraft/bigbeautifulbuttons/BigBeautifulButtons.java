package com.kreezcraft.bigbeautifulbuttons;

import com.kreezcraft.bigbeautifulbuttons.proxy.CommonProxy;
import com.kreezcraft.bigbeautifulbuttons.recipes.ModRecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BigBeautifulButtons.MODID, name = BigBeautifulButtons.NAME, version = BigBeautifulButtons.VERSION)
public class BigBeautifulButtons {

	public static final String MODID = "bigbeautifulbuttons";
	public static final String NAME = "Big Beautiful Buttons";
	public static final String VERSION = "1.12.2-1.1.3";
	
	@Mod.Instance(MODID)
	public static BigBeautifulButtons instance;
	
	public static final BigBeautifulButtonsTab creativeTab = new BigBeautifulButtonsTab("Big Beautiful Buttons");

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	@SidedProxy(serverSide = "com.kreezcraft.bigbeautifulbuttons.proxy.CommonProxy", clientSide = "com.kreezcraft.bigbeautifulbuttons.proxy.ClientProxy")
	public static CommonProxy proxy;

}