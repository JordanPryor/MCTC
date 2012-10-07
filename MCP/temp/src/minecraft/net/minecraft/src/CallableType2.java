package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

@SideOnly(Side.CLIENT)
public class CallableType2 implements Callable {

   // $FF: synthetic field
   final Minecraft field_74503_a;


   public CallableType2(Minecraft p_i3007_1_) {
      this.field_74503_a = p_i3007_1_;
   }

   public String func_74502_a() {
      return "Client";
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_74502_a();
   }
}
