package compressed_tech.creative_compressed_tech;

import compressed_tech.items.Items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab COMPRESSED_TECH_TAB = new CreativeModeTab("compressed_tech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.RAW_ZIRCON.get());
        }
    };
}
