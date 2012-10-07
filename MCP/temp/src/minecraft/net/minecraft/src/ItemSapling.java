package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.BlockSapling;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class ItemSapling extends ItemBlock {

   public ItemSapling(int p_i3681_1_) {
      super(p_i3681_1_);
      this.func_77656_e(0);
      this.func_77627_a(true);
   }

   public int func_77647_b(int p_77647_1_) {
      return p_77647_1_;
   }

   @SideOnly(Side.CLIENT)
   public int func_77617_a(int p_77617_1_) {
      return Block.field_71987_y.func_71858_a(0, p_77617_1_);
   }

   public String func_77667_c(ItemStack p_77667_1_) {
      int var2 = p_77667_1_.func_77960_j();
      if(var2 < 0 || var2 >= BlockSapling.field_72270_a.length) {
         var2 = 0;
      }

      return super.func_77658_a() + "." + BlockSapling.field_72270_a[var2];
   }
}
