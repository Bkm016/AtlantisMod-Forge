package ink.ptms.atlantis;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class AtlantisModConn implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.atlantis_mod.config.json");
    }
}
