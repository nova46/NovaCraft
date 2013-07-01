package nova74.novacraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nova74.novacraft.lib.ItemIds;

public class NovaItems {
//Declare Items
    public static Item alloy1Ingot;
    public static Item alloy1Soft;
    public static Item alloy1Pick;
    public static Item alloy1Shovel;
    public static Item alloy1Hatchet;
    public static Item alloy1Hoe;
    public static Item alloy1Sword;
    public static Item alloy2Ingot;
    public static Item alloy2Soft;
    public static Item alloy2Pick;
//    public static Item alloy2Shovel;
//    public static Item alloy2Hatchet;
//    public static Item alloy2Hoe;
//    public static Item alloy2Sword;
    public static Item diaChisel;
    public static Item obsHandle;
    
    public static void init(){
//Define Items
  //Alloy1
    alloy1Ingot = new ItemNovaGeneric(ItemIds.ALLOY1INGOT).setUnlocalizedName("alloy1Ingot").setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy1Ingot, "Iron-Gold Alloy");
    
    alloy1Soft = new ItemNovaGeneric(ItemIds.ALLOY1SOFT).setUnlocalizedName("alloy1Soft").setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy1Soft, "Soft Iron-Gold Alloy");

    alloy1Pick = new ItemNovaPick(ItemIds.ALLOY1PICK, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Pick").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Pick,"Iron-Gold Pickaxe");
    
    alloy1Shovel = new ItemNovaShovel(ItemIds.ALLOY1SHOVEL, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Shovel").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Shovel, "Iron-Gold Shovel");
    
    alloy1Hatchet = new ItemNovaHatchet(ItemIds.ALLOY1HATCHET, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Hatchet").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Hatchet, "Iron-Gold Axe");
    
    alloy1Hoe = new ItemNovaHoe(ItemIds.ALLOY1HOE, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Hoe").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Hoe, "Iron-Gold Hoe");
    
    alloy1Sword = new ItemNovaSword(ItemIds.ALLOY1SWORD, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Sword").setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(alloy1Sword, "Iron-Gold Sword");
    
  //Alloy2
    alloy2Ingot = new ItemNovaGeneric(ItemIds.ALLOY2INGOT).setUnlocalizedName("alloy2Ingot").setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy2Ingot, "Gold-Diamond Alloy");
    
    alloy2Soft = new ItemNovaGeneric(ItemIds.ALLOY2SOFT).setUnlocalizedName("alloy2Soft").setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy2Soft, "Soft Gold-Diamond Alloy");

    alloy2Pick = new ItemNovaPick(ItemIds.ALLOY2PICK, NovaToolMaterial.Alloy2Material).setUnlocalizedName("alloy2Pick").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy2Pick,"Gold-Diamond Pickaxe");
    
//    alloy2Shovel = new ItemNovaShovel(ItemIds.ALLOY2SHOVEL, NovaToolMaterial.Alloy2Material).setUnlocalizedName("alloy2Shovel").setCreativeTab(CreativeTabs.tabTools);
//    LanguageRegistry.addName(alloy2Shovel, "Gold-Diamond Shovel");
//    
//    alloy2Hatchet = new ItemNovaHatchet(ItemIds.ALLOY2HATCHET, NovaToolMaterial.Alloy2Material).setUnlocalizedName("alloy1Hatchet").setCreativeTab(CreativeTabs.tabTools);
//    LanguageRegistry.addName(alloy2Hatchet, "Gold-Diamond Axe");
//    
//    alloy2Hoe = new ItemNovaHoe(ItemIds.ALLOY2HOE, NovaToolMaterial.Alloy2Material).setUnlocalizedName("alloy2Hoe").setCreativeTab(CreativeTabs.tabTools);
//    LanguageRegistry.addName(alloy2Hoe, "Gold-Diamond Hoe");
//    
//    alloy2Sword = new ItemNovaSword(ItemIds.ALLOY2SWORD, NovaToolMaterial.Alloy2Material).setUnlocalizedName("alloy2Sword").setCreativeTab(CreativeTabs.tabCombat);
//    LanguageRegistry.addName(alloy2Sword, "Gold-Diamond Sword");
    
  //after alloys
    diaChisel = new ItemNovaPick(ItemIds.DIACHISEL, NovaToolMaterial.ChiselMaterial).setUnlocalizedName("diaChisel").setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(diaChisel, "Diamond Chisel");
    
    obsHandle = new ItemNovaGeneric(ItemIds.OBSHANDLE).setUnlocalizedName("obsHandle").setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(obsHandle, "Obsidian Handle");
    
   
//Define Recipes
  //ItemStacks
    ItemStack ironStack = new ItemStack(Item.ingotIron);
    ItemStack goldStack = new ItemStack(Item.ingotGold);
    ItemStack stickStack = new ItemStack(Item.stick);
    ItemStack diaStack = new ItemStack(Item.diamond);
    ItemStack obsStack = new ItemStack(Block.obsidian);
    
  //alloy1Ingot
    GameRegistry.addRecipe(new ItemStack(alloy1Ingot), "y", "x",
            'x', ironStack, 'y', goldStack);
  //alloy1Soft
    GameRegistry.addSmelting(alloy1Ingot.itemID, new ItemStack(alloy1Soft), 1.0F);
  //alloy1Shovel
    GameRegistry.addRecipe(new ItemStack(alloy1Shovel), "x", "y", "y",
            'x', alloy1Soft, 'y', stickStack);
  //alloy1Pick
    GameRegistry.addRecipe(new ItemStack(alloy1Pick), "xxx", " y ", " y ",
            'x', alloy1Soft, 'y', stickStack);
  //alloy1Hatchet
    GameRegistry.addRecipe(new ItemStack(alloy1Hatchet), "xx", "xy", " y",
            'x', alloy1Soft, 'y', stickStack);
    GameRegistry.addRecipe(new ItemStack(alloy1Hatchet), "xx", "yx", "y ",
            'x', alloy1Soft, 'y', stickStack);
  //alloy1Hoe
    GameRegistry.addRecipe(new ItemStack(alloy1Hoe), "xx", " y", " y",
            'x', alloy1Soft, 'y', stickStack);
    GameRegistry.addRecipe(new ItemStack(alloy1Hoe), "xx", "y ", "y ",
            'x', alloy1Soft, 'y', stickStack);
  //alloy1Sword
    GameRegistry.addRecipe(new ItemStack(alloy1Sword), "x", "x", "y",
            'x', alloy1Soft, 'y', stickStack);
  //alloy2Ingot
    GameRegistry.addRecipe(new ItemStack(alloy2Ingot, 3), "xxx", "yyy",
            'x', goldStack, 'y', diaStack);
  //alloy2Soft
    GameRegistry.addSmelting(alloy2Ingot.itemID, new ItemStack(alloy2Soft), 1.5F);
    
  //alloy2Pick
    GameRegistry.addRecipe(new ItemStack(alloy2Pick), "xxx", " y ", " y ",
            'x', alloy2Soft, 'y', stickStack);
//after alloys
  //diaChisel
    GameRegistry.addRecipe(new ItemStack(diaChisel), "x", "y",
            'x', diaStack, 'y', stickStack);
  //obsHandle
    GameRegistry.addRecipe(new ItemStack(obsHandle, 4), "x ", "xy",
            'x', obsStack, 'y', diaChisel);
  }

}
