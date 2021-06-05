package ink.ptms.atlantis.mixin;

import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FluidState.class)
public abstract class FluidStateMixin {

    @Inject(method = "shouldRenderBackwardUpFace", at = @At("HEAD"), cancellable = true)
    private void onShouldRenderBackwardUpFace(IBlockReader r, BlockPos p, CallbackInfoReturnable<Boolean> c) {
        if (p.getY() >= 127) {
            c.setReturnValue(false);
        }
    }
}
