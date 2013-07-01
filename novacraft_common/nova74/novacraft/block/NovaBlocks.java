package nova74.novacraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nova74.novacraft.item.NovaItems;
import nova74.novacraft.lib.BlockIds;
import nova74.novacraft.lib.Reference;
import nova74.novacraft.lib.Strings;

public class NovaBlocks {
    //Declare Blocks
    public static Block alloy1Block;
    public static Block ironLantern;
    
    public static void init(){
        //Define Blocks
      //alloy1Block
        alloy1Block = new BlockNovaGeneric(BlockIds.ALLOY1_BLOCK, Material.iron)
            .setUnlocalizedName("alloy1Block")
            .setCreativeTab(CreativeTabs.tabBlock)
            .setHardness(4.0F)
            .setResistance(10.0F);
        GameRegistry.registerBlock(alloy1Block, Reference.MOD_ID + Strings.ALLOY1_BLOCK_NAME);
        LanguageRegistry.addName(alloy1Block, "Iron-Gold Block");
        
      //ironLantern
        ironLantern = new BlockNovaGeneric(BlockIds.IRON_LANTERN, Material.iron)
            .setUnlocalizedName("ironLantern")
            .setCreativeTab(CreativeTabs.tabDecorations)
            .setHardness(5.0F)
            .setResistance(10.0F)
            .setLightValue(1.0F);
        GameRegistry.registerBlock(ironLantern, Reference.MOD_ID + Strings.IRON_LANTERN_NAME);
        LanguageRegistry.addName(ironLantern, "Iron Lantern");
        
//Recipes
    //ItemStacks
        ItemStack glasspaneStack = new ItemStack(Block.thinGlass);
        ItemStack torchStack = new ItemStack(Block.torchWood);
        ItemStack ironStack = new ItemStack(Item.ingotIron);
        
    //Alloy1
      //alloy1Block get
        GameRegistry.addRecipe(new ItemStack(alloy1Block), "xxx", "xxx","xxx",
                'x', NovaItems.alloy1Ingot);
      //alloy1Block give
        GameRegistry.addRecipe(new ItemStack(NovaItems.alloy1Ingot, 9), "x",
                'x', alloy1Block);
    //Iron Lantern
      //lantern get
        GameRegistry.addRecipe(new ItemStack(ironLantern), "xxx", "xyx","zzz",
                'x', glasspaneStack, 'y', torchStack, 'z', ironStack);
    }
}
