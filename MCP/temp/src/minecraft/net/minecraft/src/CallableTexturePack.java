package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

@SideOnly(Side.CLIENT)
public class CallableTexturePack implements Callable {

   // $FF: synthetic field
   final Minecraft field_79002_a;


   public CallableTexturePack(Minecraft p_i3012_1_) {
      this.field_79002_a = p_i3012_1_;
   }

   public String func_79001_a() {
      return this.field_79002_a.field_71474_y.field_74346_m;
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_79001_a();
   }
}
