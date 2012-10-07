package com.negativepixels.MCTC;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockEbonyOre extends Block
{
        public BlockEbonyOre(int blockID)
    {
                super(blockID, Material.rock);
                
                blockIndexInTexture = 1;
        setHardness(2.0f);
        setResistance(5.0f);
        setStepSound(soundStoneFootstep);
        
        setBlockName("Marble");
        setBlockName("Ebony Ore");
        }
            public int idDropped(int i, Random random, int j)
            {
            return MCTC.ingotebony.shiftedIndex;
            }
            public int quantityDropped(Random random)
            {
            return 1;
            }
        @Override
        public String getTextureFile()
        {
                return "/MCTC/Terrain/terrain.png";
        }
}