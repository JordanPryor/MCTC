package com.negativepixels.MCTC;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItememptyRune extends Item
{
    public ItememptyRune(int i)
    {
        super(i);
        maxStackSize = 16;
    }
    @Override
    public String getTextureFile()
    {
            return "/MCTC/GUI/allitems.png";
    }
}
