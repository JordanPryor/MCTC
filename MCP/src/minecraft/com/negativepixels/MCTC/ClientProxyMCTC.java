package com.negativepixels.MCTC;

import com.negativepixels.MCTC.CommonProxyMCTC;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyMCTC extends CommonProxyMCTC{


 @Override
 public void registerRenderThings() 
   {  
  MinecraftForgeClient.preloadTexture("/MCTC/Terrain/terrain.png");
  MinecraftForgeClient.preloadTexture("/MCTC/GUI/allitems.png");
   }
}