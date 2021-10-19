package xyz.grantlmul.slimefabric4;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.util.ActionResult;
import xyz.grantlmul.slimefabric4.command.Commands;
import xyz.grantlmul.slimefabric4.event.BlockPlaceCallback;

@Environment(EnvType.SERVER)
public class Slimefabric4Server implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        BlockPlaceCallback.EVENT.register((context -> {
            context.getPlayer().sendMessage(context.getStack().getName(), true);
            return ActionResult.PASS;
        }));
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> Commands.registerCommands(dispatcher));
    }
}
