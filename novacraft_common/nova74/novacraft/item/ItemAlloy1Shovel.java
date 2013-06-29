package nova74.novacraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAlloy1Shovel extends ItemSpade {
    public ItemAlloy1Shovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
            this.setUnlocalizedName("alloy1Shovel");
            this.setCreativeTab(CreativeTabs.tabTools);
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY1_SHOVEL_NAME);
    }
}
