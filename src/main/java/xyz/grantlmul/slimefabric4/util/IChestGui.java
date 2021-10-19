package xyz.grantlmul.slimefabric4.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import java.util.OptionalInt;

public interface IChestGui extends Inventory {
    OptionalInt open(ServerPlayerEntity playerEntity);
    Text getDisplayName();
    void setSlot(int x, int y, ItemStack stack, ChestGuiInteractionHandler handler);
    void fillSlots(int startX, int startY, int endX, int endY, ItemStack stack);
}
