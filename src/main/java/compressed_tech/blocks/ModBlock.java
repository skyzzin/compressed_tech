package compressed_tech.blocks;

import compressed_tech.CompressedTech;
import compressed_tech.blocks.custom.CustomBlock;
import compressed_tech.blocks.custom.ZirconLampBlock;
import compressed_tech.tabs.CreativeTab;
import compressed_tech.items.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedTech.MOD_ID);

    public static final RegistryObject<Block> CHIP_ART_MACHINERY = registerBlock("chip_art_machinery",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()
            ), CreativeTab.COMPRESSED_TECH_TAB);

    public static final RegistryObject<Block> COMPRESSED_IRON_BLOCK = registerBlock("compressed_iron_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()
            ), CreativeTab.COMPRESSED_TECH_TAB);

    public static final RegistryObject<Block> REINFORCED_REDSTONE_BLOCK = registerBlock("reinforced_redstone_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()
            ), CreativeTab.COMPRESSED_TECH_TAB);
    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            ()-> new CustomBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()
            ), CreativeTab.COMPRESSED_TECH_TAB);

    public static final RegistryObject<Block> ZIRCON_LAMP = registerBlock("zircon_lamp",
            ()-> new ZirconLampBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(ZirconLampBlock.LIT) ? 15 : 0)), CreativeTab.COMPRESSED_TECH_TAB);


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block,CreativeModeTab tab){
        return Items.ITEMS.register(name,()->new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
