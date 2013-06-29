package nova74.novacraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAlloy1Ingot extends Item {
    public ItemAlloy1Ingot(int par1) {
        super(par1);
        setUnlocalizedName("alloy1Ingot");
        setCreativeTab(CreativeTabs.tabMaterials);
    }

  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister iconRegister){
      itemIcon = iconRegister.registerIcon
              (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY1_INGOT_NAME);
  }

}
