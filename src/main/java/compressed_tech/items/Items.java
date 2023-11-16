package compressed_tech.items;

import compressed_tech.CompressedTech;
import compressed_tech.items.custom.CustomItem;
import compressed_tech.tabs.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompressedTech.MOD_ID);

    public static final RegistryObject<Item> CHIP_COPPER = ITEMS.register("chip_copper",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));
    public static final RegistryObject<Item> CHIP_EMERALD = ITEMS.register("chip_emerald",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));
    public static final RegistryObject<Item> CHIP_IRON = ITEMS.register("chip_iron",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));
    public static final RegistryObject<Item> CHIP_LAPIS = ITEMS.register("chip_lapis",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));
    public static final RegistryObject<Item> CHIP_ROCKIUM = ITEMS.register("chip_rockium",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));

    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));
    public static final RegistryObject<Item> REINFORCED_REDSTONE = ITEMS.register("reinforced_redstone",
            ()-> new Item(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));

    public static final RegistryObject<Item> RANDOM_BALL = ITEMS.register("random_ball",
            ()-> new CustomItem(new Item.Properties().tab(CreativeTab.COMPRESSED_TECH_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
