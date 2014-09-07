package com.MRG.LetsModReboot.init;

import com.MRG.LetsModReboot.item.ItemLMRB;
import com.MRG.LetsModReboot.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf(); 
	
	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
