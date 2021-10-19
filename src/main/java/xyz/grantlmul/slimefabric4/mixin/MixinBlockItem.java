package xyz.grantlmul.slimefabric4.mixin;

import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.ActionResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.grantlmul.slimefabric4.event.BlockPlaceCallback;

@Mixin(BlockItem.class)
public class MixinBlockItem {
    @Inject(method = "Lnet/minecraft/item/BlockItem;place(Lnet/minecraft/item/ItemPlacementContext;)Lnet/minecraft/util/ActionResult;", at = @At(value = "INVOKE", target = "net/minecraft/world/World.emitGameEvent (Lnet/minecraft/entity/Entity;Lnet/minecraft/world/event/GameEvent;Lnet/minecraft/util/math/BlockPos;)V"))
    private void sf4_runOnPlace(ItemPlacementContext context, CallbackInfoReturnable<ActionResult> cir) {
        if (cir.getReturnValue() != ActionResult.FAIL) {
            ActionResult result = BlockPlaceCallback.EVENT.invoker().place(context);
            if (result == ActionResult.FAIL)
                cir.cancel();
        }
    }
}
