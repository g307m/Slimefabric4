package xyz.grantlmul.slimefabric4.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface ItemUseCallback {
    Event<ItemUseCallback> EVENT = EventFactory.createArrayBacked(ItemUseCallback.class,
            (listeners) -> (world, user, hand) -> {
                for (ItemUseCallback listener : listeners) {
                    return listener.use(world, user, hand);
                }
                return null;
            });

    TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand);
}
