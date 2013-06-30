package nova74.novacraft.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAlloy2Pick extends ItemPickaxe {
    public ItemAlloy2Pick(int id, EnumToolMaterial alloy1Material) {
        super(id, alloy1Material);
            this.setUnlocalizedName("alloy2Pick");
            this.setCreativeTab(CreativeTabs.tabTools); 
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY2_PICK_NAME);
    }

}
