package com.negativepixels.MCTC;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockMagickaBench extends Block
{
        public BlockMagickaBench(int blockID)
    {
                super(blockID, Material.rock);
                
                blockIndexInTexture = 3;
        setHardness(2.0f);
        setResistance(5.0f);
        setStepSound(soundStoneFootstep);
        
        setBlockName("Magicka WorkBench");
    }
        @Override
        public String getTextureFile()
        {
                return "/MCTC/Terrain/terrain.png";
        }
}