package com.github.ustc_zzzz.fluidbypassrenderdemo;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("fluidbypassrenderdemo")
public class FluidBypassRenderDemo
{
    private static final Logger LOGGER = LogManager.getLogger(FluidBypassRenderDemo.class);

    public FluidBypassRenderDemo() {
        LOGGER.info("Fluid bypass render demo");
    }
}
