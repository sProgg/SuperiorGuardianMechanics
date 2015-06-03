package SGM.lib;

import SGM.SGMMain;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ForgeEventHandler {
	
	@SubscribeEvent
	public void skinninghandler(EntityInteractEvent event){
		
		
		if(event.isCanceled() || !(event.target instanceof EntityCow)) {
			return;
		}
		
		ItemStack heldItem = event.entityPlayer.inventory.getCurrentItem();
		if (!(heldItem.getItem() instanceof ItemShears)) {
			return;
		}
		Item Hide = SGMMain.itemHide;
		
		if (heldItem.stackSize == 1) {
			 event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Hide));
			 event.target.attackEntityFrom(DamageSource.generic, 9);
			 event.entityPlayer.playSound("mob.sheep.shear", 1, 1);
			 heldItem.damageItem(10, event.entityPlayer);
		}
		 else if (!event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Hide)))
         {
        	 event.entityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(Hide, 1, 0), false);
         }

		 event.setCanceled(true);
	}
		
		
	}
	
	


