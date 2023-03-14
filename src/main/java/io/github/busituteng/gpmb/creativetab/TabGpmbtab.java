
package io.github.busituteng.gpmb.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.github.busituteng.gpmb.item.ItemPotatomagiccircle;
import io.github.busituteng.gpmb.ElementsGpmbMod;

@ElementsGpmbMod.ModElement.Tag
public class TabGpmbtab extends ElementsGpmbMod.ModElement {
	public TabGpmbtab(ElementsGpmbMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgpmbtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemPotatomagiccircle.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
