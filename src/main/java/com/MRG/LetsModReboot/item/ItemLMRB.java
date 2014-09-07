package com.MRG.LetsModReboot.item;

import com.MRG.LetsModReboot.reference.Reference;
import com.MRG.LetsModReboot.utility.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLMRB extends Item{
	public ItemLMRB(){
		super();
	}
	
	@Override
	public String getUnlocalizedName()
	{
		LogHelper.info("UnlocalizedName------------------" + String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
		LogHelper.info("UnlocalizedName------------------" + String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
	
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
    	LogHelper.info("UnwrappedUnlocalizedName------------------" + unlocalizedName.substring(unlocalizedName.indexOf(".") + 1));
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
