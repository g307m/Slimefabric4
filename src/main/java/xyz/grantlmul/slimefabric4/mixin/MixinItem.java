package xyz.grantlmul.slimefabric4.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.grantlmul.slimefabric4.event.ItemUseCallback;

@Mixin(Item.class)
public abstract class MixinItem {
    @Shadow public abstract TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand);

    @Inject(method = "use", at = @At("HEAD"))
    private void sf4_runOnUse(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir) {
        TypedActionResult<ItemStack> result = ItemUseCallback.EVENT.invoker().use(world, user, hand);
        if (result != null)
            if (result.getResult() == ActionResult.FAIL)
                cir.setReturnValue(result);
    }
}
