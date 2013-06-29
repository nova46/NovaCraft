package nova74.novacraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;

public class ItemAlloy1Hoe extends ItemHoe {

    public ItemAlloy1Hoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        this.setUnlocalizedName("alloy1Hoe");
        this.setCreativeTab(CreativeTabs.tabTools);
    }
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister iconRegister){
    itemIcon = iconRegister.registerIcon
        (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY1_HOE_NAME);
}

}
