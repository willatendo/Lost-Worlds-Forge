package library.slots;

import api.core.init.ItemInit;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class VileSlot extends Slot
{
	public VileSlot(IInventory inventory, int x, int z, int y) 
	{
		super(inventory, x, z, y);
	}
	
	@Override
	public boolean mayPlace(ItemStack stack) 
	{
		return isVile(stack);
	}
	
	public boolean isVile(ItemStack stack)
	{
		return stack.getItem() == ItemInit.EMPTY_VILE.get();
	}
}