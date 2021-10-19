package xyz.grantlmul.slimefabric4.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.command.ServerCommandSource;

public class Commands {
    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher) {
        SlimefunCommand.register(dispatcher);
    }
}
