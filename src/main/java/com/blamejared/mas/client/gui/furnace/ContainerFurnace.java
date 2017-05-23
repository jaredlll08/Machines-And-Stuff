package com.blamejared.mas.client.gui.furnace;

import com.blamejared.mas.client.gui.base.ContainerBase;
import com.blamejared.mas.client.gui.slot.*;
import com.blamejared.mas.tileentities.machine.TileEntityMachineFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ContainerFurnace extends ContainerBase {
    
    public ContainerFurnace(InventoryPlayer invPlayer, TileEntityMachineFurnace tile) {
        
        addSlotToContainer(new SlotMachineInput(tile, 0, 44, 35));
        addSlotToContainer(new SlotOutput(tile.itemStackHandler, 1, 116, 35));
        for(int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 142));
        }
        
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
            }
        }
        
    }
    
    
}
