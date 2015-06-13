package SGM.lib;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class AlchemiterGUI extends GuiScreen{
	
	int guiWidth = 221;
	int guiHeight = 7;
	public static final int GUI_ID = 20;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		super.drawScreen(x, y, ticks);
		
		mc.renderEngine.bindTexture(new ResourceLocation(null));
		
	}
	

}
