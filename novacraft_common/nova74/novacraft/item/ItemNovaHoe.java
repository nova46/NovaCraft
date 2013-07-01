package nova74.novacraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import nova74.novacraft.lib.Reference;

public class ItemNovaHoe extends ItemHoe {
    public ItemNovaHoe(int id, EnumToolMaterial par2) {
        super(id, par2); 
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName());
    }

}
