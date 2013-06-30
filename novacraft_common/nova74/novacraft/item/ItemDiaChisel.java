package nova74.novacraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDiaChisel extends ItemPickaxe {
    public ItemDiaChisel(int id, EnumToolMaterial par2) {
        super(id, par2);
            this.setUnlocalizedName("diaChisel");
            this.setCreativeTab(CreativeTabs.tabTools); 
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + Strings.DIA_CHISEL_NAME);
    }

}
