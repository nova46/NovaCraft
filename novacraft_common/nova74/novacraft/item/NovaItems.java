package nova74.novacraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nova74.novacraft.lib.ItemIds;
import nova74.novacraft.lib.Strings;

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
    public static Item alloy2Shovel;
    public static Item alloy2Hatchet;
    public static Item alloy2Hoe;
    public static Item alloy2Sword;
    public static Item diaChisel;
    public static Item obsHandle;
    public static Item obsHilt;
    public static Item obsIronPick;
    public static Item obsIronShovel;
    public static Item obsIronHatchet;
    public static Item obsIronHoe;
    public static Item obsIronSword;
    public static Item obsAlloy1Pick;
    public static Item obsAlloy1Shovel;
    public static Item obsAlloy1Hatchet;
    public static Item obsAlloy1Hoe;
    public static Item obsAlloy1Sword;
    public static Item obsGoldPick;
    public static Item obsGoldShovel;
    public static Item obsGoldHatchet;
    public static Item obsGoldHoe;
    public static Item obsGoldSword;
    
    public static void init(){
//Define Items
  //Iron-Gold Alloy
    alloy1Ingot = new ItemNovaGeneric(ItemIds.ALLOY1_INGOT).setUnlocalizedName(Strings.ALLOY1_INGOT_NAME).setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy1Ingot, "Iron-Gold Alloy");
    
    alloy1Soft = new ItemNovaGeneric(ItemIds.ALLOY1_SOFT).setUnlocalizedName(Strings.ALLOY1_SOFT_NAME).setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy1Soft, "Soft Iron-Gold Alloy");

  //Iron-Gold Tools
    alloy1Pick = new ItemNovaPick(ItemIds.ALLOY1_PICK, NovaToolMaterial.Alloy1_Material).setUnlocalizedName(Strings.ALLOY1_PICK_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Pick,"Iron-Gold Pickaxe");
    
    alloy1Shovel = new ItemNovaShovel(ItemIds.ALLOY1_SHOVEL, NovaToolMaterial.Alloy1_Material).setUnlocalizedName(Strings.ALLOY1_SHOVEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Shovel, "Iron-Gold Shovel");
    
    alloy1Hatchet = new ItemNovaHatchet(ItemIds.ALLOY1_HATCHET, NovaToolMaterial.Alloy1_Material).setUnlocalizedName(Strings.ALLOY1_HATCHET_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Hatchet, "Iron-Gold Axe");
    
    alloy1Hoe = new ItemNovaHoe(ItemIds.ALLOY1_HOE, NovaToolMaterial.Alloy1_Material).setUnlocalizedName(Strings.ALLOY1_HOE_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy1Hoe, "Iron-Gold Hoe");
    
    alloy1Sword = new ItemNovaSword(ItemIds.ALLOY1_SWORD, NovaToolMaterial.Alloy1_Material).setUnlocalizedName(Strings.ALLOY1_SWORD_NAME).setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(alloy1Sword, "Iron-Gold Sword");
    
  //Gold-Diamond Alloy
    alloy2Ingot = new ItemNovaGeneric(ItemIds.ALLOY2_INGOT).setUnlocalizedName(Strings.ALLOY2_INGOT_NAME).setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(alloy2Ingot, "Gold-Diamond Alloy");
    
    alloy2Soft = new ItemNovaGeneric(ItemIds.ALLOY2_SOFT).setUnlocalizedName(Strings.ALLOY2_SOFT_NAME).setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(16);
    LanguageRegistry.addName(alloy2Soft, "Soft Gold-Diamond Alloy");
    
  //Gold-Diamond Tools
    alloy2Pick = new ItemNovaPick(ItemIds.ALLOY2_PICK, NovaToolMaterial.Alloy2_Material).setUnlocalizedName(Strings.ALLOY2_PICK_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy2Pick,"Gold-Diamond Pickaxe");
    
    alloy2Shovel = new ItemNovaShovel(ItemIds.ALLOY2_SHOVEL, NovaToolMaterial.Alloy2_Material).setUnlocalizedName(Strings.ALLOY2_SHOVEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy2Shovel, "Gold-Diamond Shovel");
    
    alloy2Hatchet = new ItemNovaHatchet(ItemIds.ALLOY2_HATCHET, NovaToolMaterial.Alloy2_Material).setUnlocalizedName(Strings.ALLOY2_HATCHET_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy2Hatchet, "Gold-Diamond Axe");
    
    alloy2Hoe = new ItemNovaHoe(ItemIds.ALLOY2_HOE, NovaToolMaterial.Alloy2_Material).setUnlocalizedName(Strings.ALLOY2_HOE_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(alloy2Hoe, "Gold-Diamond Hoe");
    
    alloy2Sword = new ItemNovaSword(ItemIds.ALLOY2_SWORD, NovaToolMaterial.Alloy2_Material).setUnlocalizedName(Strings.ALLOY2_SWORD_NAME).setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(alloy2Sword, "Gold-Diamond Sword");
    
  //Obsidian Tool Prerequisites
    diaChisel = new ItemNovaPick(ItemIds.DIA_CHISEL, NovaToolMaterial.Chisel_Material).setUnlocalizedName(Strings.DIA_CHISEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(diaChisel, "Diamond Chisel");
    
    obsHandle = new ItemNovaGeneric(ItemIds.OBS_HANDLE).setUnlocalizedName(Strings.OBS_HANDLE_NAME).setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(obsHandle, "Obsidian Handle");
    
    obsHilt = new ItemNovaGeneric(ItemIds.OBS_HILT).setUnlocalizedName(Strings.OBS_HILT_NAME).setCreativeTab(CreativeTabs.tabMaterials);
    LanguageRegistry.addName(obsHilt, "Obsidian Hilt");
    
  //Obsidian Iron Tools
    obsIronPick = new ItemNovaPick(ItemIds.OBS_IRON_PICK, NovaToolMaterial.Obs_Iron_Material).setUnlocalizedName(Strings.OBS_IRON_PICK_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsIronPick,"Iron Pickaxe (Obsidian Handle)");
    
    obsIronShovel = new ItemNovaShovel(ItemIds.OBS_IRON_SHOVEL, NovaToolMaterial.Obs_Iron_Material).setUnlocalizedName(Strings.OBS_IRON_SHOVEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsIronShovel,"Iron Shovel (Obsidian Handle)");
    
    obsIronHatchet = new ItemNovaHatchet(ItemIds.OBS_IRON_HATCHET, NovaToolMaterial.Obs_Iron_Material).setUnlocalizedName(Strings.OBS_IRON_HATCHET_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsIronHatchet,"Iron Axe (Obsidian Handle)");
    
    obsIronHoe = new ItemNovaHoe(ItemIds.OBS_IRON_HOE, NovaToolMaterial.Obs_Iron_Material).setUnlocalizedName(Strings.OBS_IRON_HOE_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsIronHoe,"Iron Hoe (Obsidian Handle)");
    
    obsIronSword = new ItemNovaSword(ItemIds.OBS_IRON_SWORD, NovaToolMaterial.Obs_Iron_Material).setUnlocalizedName(Strings.OBS_IRON_SWORD_NAME).setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(obsIronSword,"Iron Sword (Obsidian Hilt)");
    
  //Obsidian Iron-Gold Tools
    obsAlloy1Pick = new ItemNovaPick(ItemIds.OBS_ALLOY1_PICK, NovaToolMaterial.Obs_Alloy1_Material).setUnlocalizedName(Strings.OBS_ALLOY1_PICK_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsAlloy1Pick,"Iron-Gold Pickaxe (Obsidian Handle)");
    
    obsAlloy1Shovel = new ItemNovaShovel(ItemIds.OBS_ALLOY1_SHOVEL, NovaToolMaterial.Obs_Alloy1_Material).setUnlocalizedName(Strings.OBS_ALLOY1_SHOVEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsAlloy1Shovel, "Iron-Gold Shovel (Obsidian Handle)");
    
    obsAlloy1Hatchet = new ItemNovaHatchet(ItemIds.OBS_ALLOY1_HATCHET, NovaToolMaterial.Obs_Alloy1_Material).setUnlocalizedName(Strings.OBS_ALLOY1_HATCHET_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsAlloy1Hatchet, "Iron-Gold Axe (Obsidian Handle)");
    
    obsAlloy1Hoe = new ItemNovaHoe(ItemIds.OBS_ALLOY1_HOE, NovaToolMaterial.Obs_Alloy1_Material).setUnlocalizedName(Strings.OBS_ALLOY1_HOE_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsAlloy1Hoe, "Iron-Gold Hoe (Obsidian Handle)");
    
    obsAlloy1Sword = new ItemNovaSword(ItemIds.OBS_ALLOY1_SWORD, NovaToolMaterial.Obs_Alloy1_Material).setUnlocalizedName(Strings.OBS_ALLOY1_SWORD_NAME).setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(obsAlloy1Sword, "Iron-Gold Sword (Obsidian Hilt)");
    
  //Obsidian Gold Tools
    obsGoldPick = new ItemNovaPick(ItemIds.OBS_GOLD_PICK, NovaToolMaterial.Obs_Gold_Material).setUnlocalizedName(Strings.OBS_GOLD_PICK_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsGoldPick,"Golden Pickaxe (Obsidian Handle)");
    
    obsGoldShovel = new ItemNovaShovel(ItemIds.OBS_GOLD_SHOVEL, NovaToolMaterial.Obs_Gold_Material).setUnlocalizedName(Strings.OBS_GOLD_SHOVEL_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsGoldShovel,"Golden Shovel (Obsidian Handle)");
    
    obsGoldHatchet = new ItemNovaHatchet(ItemIds.OBS_GOLD_HATCHET, NovaToolMaterial.Obs_Gold_Material).setUnlocalizedName(Strings.OBS_GOLD_HATCHET_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsGoldHatchet,"Golden Axe (Obsidian Handle)");
    
    obsGoldHoe = new ItemNovaHoe(ItemIds.OBS_GOLD_HOE, NovaToolMaterial.Obs_Gold_Material).setUnlocalizedName(Strings.OBS_GOLD_HOE_NAME).setCreativeTab(CreativeTabs.tabTools);
    LanguageRegistry.addName(obsGoldHoe,"Golden Hoe (Obsidian Handle)");
    
    obsGoldSword = new ItemNovaSword(ItemIds.OBS_GOLD_SWORD, NovaToolMaterial.Obs_Gold_Material).setUnlocalizedName(Strings.OBS_GOLD_SWORD_NAME).setCreativeTab(CreativeTabs.tabCombat);
    LanguageRegistry.addName(obsGoldSword,"Golden Sword (Obsidian Hilt)");
    
   
//Recipes
    //ItemStacks
        ItemStack ironStack = new ItemStack(Item.ingotIron);
        ItemStack goldStack = new ItemStack(Item.ingotGold);
        ItemStack stickStack = new ItemStack(Item.stick);
        ItemStack diaStack = new ItemStack(Item.diamond);
        ItemStack obsStack = new ItemStack(Block.obsidian);
    
    //Iron-Gold Alloy
      //alloy1Ingot
        GameRegistry.addRecipe(new ItemStack(alloy1Ingot), "y", "x",
                'x', ironStack, 'y', goldStack);
      //alloy1Soft
        GameRegistry.addSmelting(alloy1Ingot.itemID, new ItemStack(alloy1Soft), 1.0F);
      
      //alloy1Pick
        GameRegistry.addRecipe(new ItemStack(alloy1Pick), "xxx", " y ", " y ",
                'x', alloy1Soft, 'y', stickStack);
      //alloy1Shovel
        GameRegistry.addRecipe(new ItemStack(alloy1Shovel), "x", "y", "y",
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
        
    //Gold-Diamond Alloy
      //alloy2Soft
        GameRegistry.addSmelting(alloy2Ingot.itemID, new ItemStack(alloy2Soft), 1.5F);
      //alloy2Pick
        GameRegistry.addRecipe(new ItemStack(alloy2Pick), "xxx", " y ", " y ",
                'x', alloy2Soft, 'y', stickStack);
      //alloy2Shovel
        GameRegistry.addRecipe(new ItemStack(alloy1Shovel), "x", "y", "y",
                'x', alloy2Soft, 'y', stickStack);
      //alloy2Hatchet
        GameRegistry.addRecipe(new ItemStack(alloy2Hatchet), "xx", "xy", " y",
                'x', alloy2Soft, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(alloy2Hatchet), "xx", "yx", "y ",
                'x', alloy2Soft, 'y', stickStack);
      //alloy2Hoe
        GameRegistry.addRecipe(new ItemStack(alloy2Hoe), "xx", " y", " y",
                'x', alloy2Soft, 'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(alloy2Hoe), "xx", "y ", "y ",
                'x', alloy2Soft, 'y', stickStack);
      //alloy2Sword
        GameRegistry.addRecipe(new ItemStack(alloy2Sword), "x", "x", "y",
                'x', alloy2Soft, 'y', stickStack);
        
    //Obsidian Tool Prerequisites
      //diaChisel
        GameRegistry.addRecipe(new ItemStack(diaChisel), "x", "y",
                'x', diaStack, 'y', stickStack);
      //obsHandle
        GameRegistry.addRecipe(new ItemStack(obsHandle, 4), "x ", "xy",
                'x', obsStack, 'y', diaChisel);
      //obsHandle
        GameRegistry.addRecipe(new ItemStack(obsHilt, 4), "xxx", " xy",
                'x', obsStack, 'y', diaChisel);
        
    //Obsidian Iron Tools
      //obsIronPick
        GameRegistry.addRecipe(new ItemStack(obsIronPick), "xxx", " y ", " y ",
                'x', ironStack, 'y', obsHandle);
      //alloy2Shovel
        GameRegistry.addRecipe(new ItemStack(obsIronShovel), "x", "y", "y",
                'x', ironStack, 'y', obsHandle);
      //obsIronHatchet
        GameRegistry.addRecipe(new ItemStack(obsIronHatchet), "xx", "xy", " y",
                'x', ironStack, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsIronHatchet), "xx", "yx", "y ",
                'x', ironStack, 'y', obsHandle);
      //alloy2Hoe
        GameRegistry.addRecipe(new ItemStack(obsIronHoe), "xx", " y", " y",
                'x', ironStack, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsIronHoe), "xx", "y ", "y ",
                'x', ironStack, 'y', obsHandle);
      //alloy2Sword
        GameRegistry.addRecipe(new ItemStack(obsIronSword), "x", "x", "y",
                'x', ironStack, 'y', obsHilt);
        
    //Obsidian Iron-Gold Tools
      //obsAlloy1Pick
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Pick), "xxx", " y ", " y ",
                'x', alloy1Soft, 'y', obsHandle);
      //obsAlloy1Shovel
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Shovel), "x", "y", "y",
                'x', alloy1Soft, 'y', obsHandle);
      //obsAlloy1Hatchet
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Hatchet), "xx", "xy", " y",
                'x', alloy1Soft, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Hatchet), "xx", "yx", "y ",
                'x', alloy1Soft, 'y', obsHandle);
      //obsAlloy1Hoe
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Hoe), "xx", " y", " y",
                'x', alloy1Soft, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Hoe), "xx", "y ", "y ",
                'x', alloy1Soft, 'y', obsHandle);
      //obsAlloy1Sword
        GameRegistry.addRecipe(new ItemStack(obsAlloy1Sword), "x", "x", "y",
                'x', alloy1Soft, 'y', obsHilt);
        
    //Obsidian Golden Tools
      //obsGoldPick
        GameRegistry.addRecipe(new ItemStack(obsGoldPick), "xxx", " y ", " y ",
                'x', goldStack, 'y', obsHandle);
      //obsGoldShovel
        GameRegistry.addRecipe(new ItemStack(obsGoldShovel), "x", "y", "y",
                'x', goldStack, 'y', obsHandle);
      //obsGoldHatchet
        GameRegistry.addRecipe(new ItemStack(obsGoldHatchet), "xx", "xy", " y",
                'x', goldStack, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsGoldHatchet), "xx", "yx", "y ",
                'x', goldStack, 'y', obsHandle);
      //obsGoldHoe
        GameRegistry.addRecipe(new ItemStack(obsGoldHoe), "xx", " y", " y",
                'x', goldStack, 'y', obsHandle);
        GameRegistry.addRecipe(new ItemStack(obsGoldHoe), "xx", "y ", "y ",
                'x', goldStack, 'y', obsHandle);
      //obsGoldSword
        GameRegistry.addRecipe(new ItemStack(obsGoldSword), "x", "x", "y",
                'x', goldStack, 'y', obsHilt);
      }
    
    }
