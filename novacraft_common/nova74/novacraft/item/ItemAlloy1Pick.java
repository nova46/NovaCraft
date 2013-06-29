package nova74.novacraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;

public class ItemAlloy1Pick extends ItemPickaxe {
    public ItemAlloy1Pick(int id, EnumToolMaterial alloy1Material) {
        super(id, alloy1Material);
            this.setUnlocalizedName("alloy1Pick");
            this.setCreativeTab(CreativeTabs.tabTools); 
        }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon
            (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY1_PICK_NAME);
    }

}
