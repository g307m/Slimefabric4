package xyz.grantlmul.slimefabric4.items.guide;

import net.minecraft.server.network.ServerPlayerEntity;

public class SlimefabricGuide {
    public SlimefabricGuide() {}
    public void openGuide(ServerPlayerEntity player) {
        SlimefabricGuideGui gui = new SlimefabricGuideGui();
        gui.open(player);
    }
}
