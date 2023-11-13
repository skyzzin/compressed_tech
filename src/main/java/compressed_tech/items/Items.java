package compressed_tech.items;

import compressed_tech.CompressedTech;
import compressed_tech.creative_compressed_tech.CreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompressedTech.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));

    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
