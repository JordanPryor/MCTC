package com.negativepixels.MCTC;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockMarble extends Block
{
        public BlockMarble(int blockID)
    {
                super(blockID, Material.rock);
                
                blockIndexInTexture = 0;
        setHardness(2.0f);
        setResistance(5.0f);
        setStepSound(soundStoneFootstep);
        
        setBlockName("Marble");
    }
        @Override
        public String getTextureFile()
        {
                return "/MCTC/Terrain/terrain.png";
        }
}