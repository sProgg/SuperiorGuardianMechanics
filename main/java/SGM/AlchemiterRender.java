package SGM;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class AlchemiterRender extends TileEntitySpecialRenderer {
	
	private static ResourceLocation texture = new ResourceLocation("SGM:textures/models/ModelAlchemiter");

	private ModelAlchemiter model;
	
	public AlchemiterRender()
	{
		
		
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double x,
			double y, double z, float f) {
		// TODO Auto-generated method 50stub
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.05f, (float) y + 1.5f, (float) z + 0.5f);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
			this.model.render(p_78088_1_, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_);
		
	}


	

	
}
