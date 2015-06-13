package SGM;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHide extends Item
{
    public ItemHide()
    {
          super();
          setCreativeTab(CreativeTabs.tabMisc);
          setUnlocalizedName("itemhide");
    }

    @Override
    public void registerIcons(IIconRegister iconRegister)
    {
          itemIcon = iconRegister.registerIcon("SGM:itemhide");
    }
}
