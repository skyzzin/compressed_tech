package compressed_tech.tabs;

import compressed_tech.blocks.ModBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab COMPRESSED_TECH_TAB = new CreativeModeTab("compressed_tech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlock.CHIP_ART_MACHINERY.get());
        }
    };
}
