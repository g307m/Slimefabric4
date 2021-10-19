package xyz.grantlmul.slimefabric4;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;
import xyz.grantlmul.slimefabric4.command.Commands;
import xyz.grantlmul.slimefabric4.event.BlockPlaceCallback;
import xyz.grantlmul.slimefabric4.event.ItemUseCallback;
import xyz.grantlmul.slimefabric4.items.guide.SlimefabricGuideGui;

@Environment(EnvType.SERVER)
public class SlimefabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        BlockPlaceCallback.EVENT.register((context -> {
            context.getPlayer().sendMessage(context.getStack().getName(), true);
            return ActionResult.PASS;
        }));
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> Commands.registerCommands(dispatcher));
        ItemUseCallback.EVENT.register((world, player, hand) -> {
            ItemStack handItem = player.getMainHandStack();
            if (handItem.isOf(Items.ENCHANTED_BOOK)) {
                if (handItem.getNbt().getBoolean("slimefunGuide")) {
                    SlimefabricGuideGui gui = new SlimefabricGuideGui();
                    gui.open(player);
                }
            }
            return TypedActionResult.pass(handItem);
        });
    }
}
