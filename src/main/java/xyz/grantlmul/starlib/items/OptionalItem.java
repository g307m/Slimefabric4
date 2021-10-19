package xyz.grantlmul.starlib.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xyz.grantlmul.slimefabric4.util.Head;

public class OptionalItem extends Item {
    private final ItemStack fallback;
    public OptionalItem(Settings settings, ItemStack fallback) {
        super(settings);
        this.fallback = fallback;
    }
    public OptionalItem(Settings settings, Item fallback) {
        this(settings, fallback.getDefaultStack());
    }
    public OptionalItem(Settings settings, Head fallback) {
        this(settings, fallback.getHead());
    }

    public ItemStack getFallback() {
        return this.fallback;
    }
}
