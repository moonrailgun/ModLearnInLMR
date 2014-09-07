package com.MRG.LetsModReboot;

import com.MRG.LetsModReboot.handler.ConfigurationHandler;
import com.MRG.LetsModReboot.init.ModItems;
import com.MRG.LetsModReboot.proxy.IProxy;
import com.MRG.LetsModReboot.reference.Reference;
import com.MRG.LetsModReboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_ID, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot 
{
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//config,handle etc.
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler() );
		LogHelper.info("Pre Initialization Complete!");
		
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		//register GUI,tileEntities,crafting recipes etc.
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
	}
}
