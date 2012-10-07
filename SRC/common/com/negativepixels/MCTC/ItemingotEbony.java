package com.negativepixels.MCTC;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemingotEbony extends Item
{
    public ItemingotEbony(int i)
    {
        super(i);
        maxStackSize = 64;
    }
    @Override
    public String getTextureFile()
    {
            return "/MCTC/GUI/allitems.png";
    }
}
