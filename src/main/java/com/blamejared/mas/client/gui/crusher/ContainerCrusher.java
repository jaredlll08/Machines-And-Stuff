package com.blamejared.mas.client.gui.crusher;

import com.blamejared.mas.client.gui.base.ContainerBase;
import com.blamejared.mas.client.gui.slot.*;
import com.blamejared.mas.tileentities.machine.TileEntityMachineCrusher;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ContainerCrusher extends ContainerBase {
    
    public ContainerCrusher(InventoryPlayer invPlayer, TileEntityMachineCrusher tile) {
        
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
