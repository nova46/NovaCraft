package nova74.novacraft.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
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
    
    public static void init(){
//Define Items

    alloy1Ingot = new ItemAlloy1Ingot(ItemIds.ALLOY1INGOT).setUnlocalizedName("alloy1Ingot");
    LanguageRegistry.addName(alloy1Ingot, "Iron-Gold Alloy");
    
    alloy1Soft = new ItemAlloy1Soft(ItemIds.ALLOY1SOFT).setUnlocalizedName("alloy1Soft");
    LanguageRegistry.addName(alloy1Soft, "Soft Iron-Gold Alloy");

    alloy1Pick = new ItemAlloy1Pick(ItemIds.ALLOY1PICK, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Pick");
    LanguageRegistry.addName(alloy1Pick,"Iron-Gold Pickaxe");
    
    alloy1Shovel = new ItemAlloy1Shovel(ItemIds.ALLOY1SHOVEL, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Shovel");
    LanguageRegistry.addName(alloy1Shovel, "Iron-Gold Shovel");
    
    alloy1Hatchet = new ItemAlloy1Hatchet(ItemIds.ALLOY1HATCHET, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Hatchet");
    LanguageRegistry.addName(alloy1Hatchet, "Iron-Gold Axe");
    
    alloy1Hoe = new ItemAlloy1Hoe(ItemIds.ALLOY1HOE, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Hoe");
    LanguageRegistry.addName(alloy1Hoe, "Iron-Gold Hoe");
    
    alloy1Sword = new ItemAlloy1Sword(ItemIds.ALLOY1SWORD, NovaToolMaterial.Alloy1Material).setUnlocalizedName("alloy1Sword");
    LanguageRegistry.addName(alloy1Sword, "Iron-Gold Sword");
    
   
//Define Recipes
  //ItemStacks
    ItemStack ironStack = new ItemStack(Item.ingotIron);
    ItemStack goldStack = new ItemStack(Item.ingotGold);
    ItemStack stickStack = new ItemStack(Item.stick);
    
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
  }

}
