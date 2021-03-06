package SGM;

import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shamprog.SGM.proxies.SGMClientProxy;
import shamprog.SGM.proxies.SGMCommonProxy;
import SGM.lib.Constants;
import SGM.lib.ForgeEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod (modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)

public class SGMMain {
	
	@Instance("SGM")
	public static SGMMain instance;
	
	@SidedProxy(clientSide = "shamprog.SGM.proxies.SGMClientProxy", serverSide = "shamprog.SGM.proxies.SGMCommonProxy")
	public static SGMClientProxy proxy;
	public static SGMCommonProxy cproxy;
	public static ForgeEventHandler eventHandler = new ForgeEventHandler();
	public static Item itemHide;
	public static Block alchemiter;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	MinecraftForge.EVENT_BUS.register(eventHandler);
    	
    }
    
	@EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	//proxy.registerRenderers();
    	
    	alchemiter = new BlockAlchemiter();
    	itemHide = new ItemHide();
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.leather,1), new ItemStack(Items.clay_ball), new ItemStack(itemHide));
    	GameRegistry.registerItem(itemHide, "Hide");
    	GameRegistry.registerBlock(alchemiter, "Alchemiter");
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }    

}

