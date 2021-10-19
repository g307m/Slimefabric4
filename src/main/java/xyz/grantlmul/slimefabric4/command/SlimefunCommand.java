package xyz.grantlmul.slimefabric4.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.*;
import net.minecraft.nbt.visitor.NbtTextFormatter;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import xyz.grantlmul.slimefabric4.util.ItemMeta;

class SlimefunCommand {
    private SlimefunCommand() {}
    static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        LiteralCommandNode<ServerCommandSource> slimefunCommandNode = dispatcher.register(CommandManager.literal("slimefun").then(CommandManager.literal("guide").executes(context -> {
            try {
                ItemMeta guideItem = new ItemMeta(Items.ENCHANTED_BOOK.getDefaultStack());
                guideItem.setName("§aSlimefun Guide §7(Chest GUI)");
                guideItem.setLore(0,"§eRight Click §8\u21E8 §7Browse Items");
                guideItem.setLore(1, "§eShift + Right Click §8\u21E8 §7Open Settings / Credits");
                guideItem.setSubNbt("slimefunGuide", NbtByte.of(true));
                context.getSource().getPlayer().giveItemStack(guideItem.getItemStack());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 1;
        })));
        dispatcher.register(CommandManager.literal("sf").redirect(slimefunCommandNode));
        dispatcher.register(CommandManager.literal("slimefun:slimefun").redirect(slimefunCommandNode));
        dispatcher.register(CommandManager.literal("slimefun:sf").redirect(slimefunCommandNode));
    }
}
