package nova74.novacraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import nova74.novacraft.lib.Reference;

public class ItemNovaSword extends ItemSword {
    public ItemNovaSword(int id, EnumToolMaterial par2) {
        super(id, par2); 
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName());
    }

}
