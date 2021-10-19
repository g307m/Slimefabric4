package xyz.grantlmul.slimefabric4.util;

import net.minecraft.item.Item;
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
    public ItemMeta(Item item) {
        this.itemStack = item.getDefaultStack();
    }
    private NbtCompound getDisplay() {
        return itemStack.getOrCreateSubNbt("display");
    }
    public ItemMeta setLore(int line, String newLore) {
        NbtCompound display = getDisplay();
        // get lore
        NbtList lore;
        try {
            lore = display.getList("Lore", NbtElement.STRING_TYPE);
        } catch (NullPointerException e) {
            lore = new NbtList();
        }
        NbtString loreString = NbtString.of(Text.Serializer.toJson(new LiteralText(newLore)));
        try {
            lore.set(line, loreString);
        } catch (IndexOutOfBoundsException e) {
            lore.add(line, loreString);
        }
        // set lore
        display.put("Lore", lore);
        // set modified display nbt
        itemStack.setSubNbt("display", display);
        return this;
    }
    public ItemMeta setLoreAmp(int line, String newLore) {
        return setLore(line, newLore.replace('&','§'));
    }
    public ItemMeta clearLore() {
        NbtCompound display = getDisplay();
        display.remove("Lore");
        itemStack.setSubNbt("display", display);
        return this;
    }
    public ItemMeta setName(String newName) {
        NbtCompound display = getDisplay();
        // set the name, no need to pull the old one since there is one line
        display.put("Name", NbtString.of(Text.Serializer.toJson(new LiteralText(newName))));
        // set display nbt for item
        itemStack.setSubNbt("display", display);
        return this;
    }
    public ItemMeta setNameAmp(String newName) {
        return setName(newName.replace('&','§'));
    }
    public ItemMeta clearName() {
        NbtCompound display = getDisplay();
        display.remove("Name");
        itemStack.setSubNbt("display", display);
        return this;
    }
    public ItemMeta setSubNbt(String key, NbtElement element) {
        itemStack.setSubNbt(key, element);
        return this;
    }
    public ItemStack getItemStack () {
        return itemStack;
    }
}
