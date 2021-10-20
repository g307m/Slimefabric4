package xyz.grantlmul.slimefabric4.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import org.apache.logging.log4j.core.jmx.Server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.OptionalInt;

public abstract class ChestGui implements IChestGui {
    private DefaultedList<ItemStack> inventory;
    private Method getHandlerCreator(int height) {
        if (height > 6 )
            throw new IndexOutOfBoundsException("Height for screen handler is over 6!");
        if (height < 1)
            throw new IndexOutOfBoundsException("Height for screen handler is under 1!");

        Method method = null;
        try {
            if (height == 3 || height == 6)
                method = GenericContainerScreenHandler.class.getMethod("createGeneric9x" + height, int.class, PlayerInventory.class, Inventory.class);
            else
                method = GenericContainerScreenHandler.class.getMethod("createGeneric9x" + height, int.class, PlayerInventory.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }
    private final Method handlerCreator;
    private final int height;
    public ChestGui(int height) {
        this.height = height;
        this.handlerCreator = getHandlerCreator(height);
        this.inventory = DefaultedList.ofSize(size(), ItemStack.EMPTY);
    }

    @Override
    public OptionalInt open(ServerPlayerEntity player) {
        return player.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                (i, playerInventory1, playerEntity1) -> {
                    try {
                        if (height == 3 || height == 6)
                            return (ScreenHandler) handlerCreator.invoke(GenericContainerScreenHandler.class, i, player.getInventory(), this);
                        else
                            return (ScreenHandler) handlerCreator.invoke(GenericContainerScreenHandler.class, i, player.getInventory());
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return null;
                }, getDisplayName()
        ));
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("container.gui");
    }

    @Override
    public int size() {
        return this.height*9;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStack(int slot) {
        if (slot > this.size())
            return ItemStack.EMPTY;
        return inventory.get(slot);
    }

    @Override
    public ItemStack removeStack(int slot, int amount) {
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeStack(int slot) {
        return inventory.get(slot);
    }

    @Override
    public void setStack(int slot, ItemStack stack) { }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return false;
    }

    @Override
    public void clear() { }

    @Override
    public void setSlot(int x, int y, ItemStack stack, ChestGuiInteractionHandler handler) {
        inventory.set((y*9)+x, stack);
    }

    @Override
    public void fillSlots(int startX, int startY, int endX, int endY, ItemStack stack) {
        for (int i = (startY*9)+startX; i < (endY*9)+endX; i++) {
            inventory.set(i, stack);
        }
        this.markDirty();
    }

}
