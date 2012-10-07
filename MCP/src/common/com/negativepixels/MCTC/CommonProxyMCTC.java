package com.negativepixels.MCTC;

import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxyMCTC implements IGuiHandler{

 
 public void registerRenderThings() 
   {
   //unused server side. -- see ClientProxy for implementation
   }

 @Override
 public Object getServerGuiElement(int ID, EntityPlayer player, World world,
   int x, int y, int z) {
  // TODO Auto-generated method stub
  return null;
 }

 @Override
 public Object getClientGuiElement(int ID, EntityPlayer player, World world,
   int x, int y, int z) {
  // TODO Auto-generated method stub
  return null;
 }

public void doOneWayStuff(World world, int i, int j, int k,
  EntityLiving entityliving) {
 // TODO Auto-generated method stub
 
}

public void doKeyStuff() {
 // TODO Auto-generated method stub
 
}

public void doRenderStuff() {
 // TODO Auto-generated method stub
 
}


}