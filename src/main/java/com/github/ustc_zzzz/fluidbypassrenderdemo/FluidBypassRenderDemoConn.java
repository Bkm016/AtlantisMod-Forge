package com.github.ustc_zzzz.fluidbypassrenderdemo;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class FluidBypassRenderDemoConn implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.fluidbypassrenderdemo.config.json");
    }
}
