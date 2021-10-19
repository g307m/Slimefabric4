package xyz.grantlmul.slimefabric4.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.LiteralText;
import net.minecraft.text.NbtText;
import net.minecraft.text.Text;

public class ItemMeta {
    private final ItemStack itemStack;
    public ItemMeta(ItemStack itemStack) {
        this.itemStack = itemStack;
    }
    private NbtCompound getDisplay() {
        NbtCompound display;
        try {
            display = itemStack.getSubNbt("display");
        } catch (NullPointerException e) {
            display = new NbtCompound();
            itemStack.setSubNbt("display", new NbtCompound());
        }
        return display;
    }
    public void setLore(int line, String newLore) {
        NbtCompound display = getDisplay();
        // get lore
        assert display != null;
        NbtList lore = display.getList("Lore", NbtElement.STRING_TYPE);
        lore.set(line, NbtString.of(Text.Serializer.toJson(new LiteralText(newLore))));
        // set lore
        display.put("Lore", lore);
        // set modified display nbt
        itemStack.setSubNbt("display", display);
    }
    public void clearLore() {
        NbtCompound display = getDisplay();
        // clear lore
        assert display != null;
        display.remove("Lore");
        // set new display
        itemStack.setSubNbt("display", display);
    }
    public void setName(String newName) {
        NbtCompound display = getDisplay();
        // set the name, no need to pull the old one since there is one line
        assert display != null;
        display.put("Name", NbtString.of(Text.Serializer.toJson(new LiteralText(newName))));
        // set display nbt for item
        itemStack.setSubNbt("display", display);
    }
    public void clearName() {
        NbtCompound display = getDisplay();
        display.remove("Name");
        itemStack.setSubNbt("display", display);
    }
    public void setSubNbt(String key, NbtElement element) {
        itemStack.setSubNbt(key, element);
    }
    public ItemStack getItemStack () {
        return itemStack;
    }
}
