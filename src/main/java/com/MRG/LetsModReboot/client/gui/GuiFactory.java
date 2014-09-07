package com.MRG.LetsModReboot.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		// TODO 自动生成的方法存根
		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(
			RuntimeOptionCategoryElement element) {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
