package nova74.novacraft;

import nova74.novacraft.block.NovaBlocks;
import nova74.novacraft.core.proxy.CommonProxy;
import nova74.novacraft.item.NovaItems;
import nova74.novacraft.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class NovaCraft {
    
    @Instance(Reference.MOD_ID)
    public static NovaCraft instance = new NovaCraft();
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy serverSide = new CommonProxy();
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        serverSide.registerInformation();
        NovaItems.init();
        NovaBlocks.init();
    }
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }
}
