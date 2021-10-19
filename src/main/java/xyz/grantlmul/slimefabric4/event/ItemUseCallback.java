package xyz.grantlmul.slimefabric4.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface ItemUseCallback {
    Event<ItemUseCallback> EVENT = EventFactory.createArrayBacked(ItemUseCallback.class,
            (listeners) -> (world, player, hand) -> {
                for (ItemUseCallback listener : listeners) {
                    return listener.use(world, player, hand);
                }
                return null;
            });

    TypedActionResult<ItemStack> use(World world, ServerPlayerEntity player, Hand hand);
}
