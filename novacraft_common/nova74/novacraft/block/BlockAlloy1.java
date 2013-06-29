package nova74.novacraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;

public class BlockAlloy1 extends Block {

    public BlockAlloy1(int par1, Material par2Material) {
        super(par1, par2Material);
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(4.0F);
        setResistance(10.0F);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon
                (Reference.MOD_ID.toLowerCase() + ":" + Strings.ALLOY1_BLOCK_NAME);
    }

}
