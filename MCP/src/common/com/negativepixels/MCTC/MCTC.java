package com.negativepixels.MCTC;



import net.minecraft.src.Block;
import net.minecraft.src.BlockHalfSlab;
import net.minecraft.src.BlockStairs;
import net.minecraft.src.BlockWoodSlab;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid = "NegativePiXels_MCTC-PREMAGICKA", name = "Minecraft Total Conversion[Pre-Magicka]", version = "Alpha 0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MCTC
{
	 
	 @Instance
	 public static MCTC instance;
	 
	  //block statics
	  public static Block marble;
	  public static Block ebonyore;
      public static Block magickaworkbench;
	  
	  //item statics
	  public static Item ingotebony;
	  public static Item emptyrune;

	  
	     
	     
	 @PreInit
	    public void load(FMLPreInitializationEvent e)
	    {

	    //block inputs
	    marble = new BlockMarble(230).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("marble").setCreativeTab(CreativeTabs.tabBlock);
	    ebonyore = new BlockEbonyOre(231).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("oreebony").setCreativeTab(CreativeTabs.tabBlock);
	    magickaworkbench = new BlockMagickaBench(232).setStepSound(Block.soundWoodFootstep).setHardness(3F).setResistance(1.0F).setBlockName("marble").setCreativeTab(CreativeTabs.tabBlock);

	    
	    //item inputs
	    ingotebony = new ItemingotEbony(8002).setIconIndex(0).setItemName("ingotebony").setCreativeTab(CreativeTabs.tabMaterials);
	    emptyrune = new ItememptyRune(8003).setIconIndex(5).setItemName("emptyrune").setCreativeTab(CreativeTabs.tabMaterials);
	    
	    
	    
	    //game registers (blocks only)
	    GameRegistry.registerBlock(marble);
	    GameRegistry.registerBlock(ebonyore);
	    GameRegistry.registerBlock(magickaworkbench);


	    //language registry (blocks and items)
	    LanguageRegistry.addName(marble, "Marble");
	    LanguageRegistry.addName(ebonyore, "Ebony Ore");
	    LanguageRegistry.addName(magickaworkbench, "Magicka WorkBench");
	    
	    
	    //LanguageRegistry.addName(item, "item name");
	    LanguageRegistry.addName (ingotebony, "Ebony Ingot");
	    LanguageRegistry.addName (emptyrune, "Blank Rune");
	    

	    }
	 @cpw.mods.fml.common.Mod.PreInit
	 public void PreInit(FMLPreInitializationEvent event){
	  System.out.println("Minecraft Total Conversion & MCTC Magicka Loaded Successfully!");
  }
}