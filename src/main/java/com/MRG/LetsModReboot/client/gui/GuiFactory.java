package com.MRG.LetsModReboot.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.IModGuiFactory;

public class GuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		// TODO �Զ����ɵķ������
		return ModGuiConfig.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(
			RuntimeOptionCategoryElement element) {
		// TODO �Զ����ɵķ������
		return null;
	}
	
}
