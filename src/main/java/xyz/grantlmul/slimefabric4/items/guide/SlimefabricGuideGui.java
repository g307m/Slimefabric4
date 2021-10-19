package xyz.grantlmul.slimefabric4.items.guide;

import net.minecraft.item.Items;
import xyz.grantlmul.slimefabric4.util.ChestGui;

public class SlimefabricGuideGui extends ChestGui {
    public SlimefabricGuideGui() {
        super(6);
        this.fillSlots(0,0,9,0, Items.GRAY_STAINED_GLASS_PANE.getDefaultStack());
    }
}
