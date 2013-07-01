package nova74.novacraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import nova74.novacraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNovaGeneric extends Item {
    public ItemNovaGeneric(int par1) {
        super(par1);
    }

  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister iconRegister){
      itemIcon = iconRegister.registerIcon
              (Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName());
  }

}
