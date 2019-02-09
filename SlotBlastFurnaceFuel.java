package com.doggie.RhoduimMod.blocks.machines.blast.slots;

import com.doggie.RhoduimMod.blocks.tileentities.TileEntityBlastFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBlastFurnaceFuel extends Slot {

	public SlotBlastFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
		
	}
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityBlastFurnace.isItemFuel(stack);
	}
    @Override
    public int getItemStackLimit(ItemStack stack) 
    {
    	return super.getItemStackLimit(stack);
    }
}
