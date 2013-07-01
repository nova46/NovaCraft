package nova74.novacraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import nova74.novacraft.lib.Reference;

public class BlockNovaGeneric extends Block {
    public BlockNovaGeneric(int par1, Material par2Material) {
        super(par1, par2Material);
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon
                (Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName2());
    }
}
