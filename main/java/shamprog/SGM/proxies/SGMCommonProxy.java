package shamprog.SGM.proxies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class SGMCommonProxy implements IGuiHandler{
	
	 public void registerRenderers()
	    {
	        // Nothing here as the server doesn't render graphics!
	    }
	 
	 public void registerKeybindings () {}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

}
