package compressed_tech;


import com.mojang.logging.LogUtils;
import compressed_tech.blocks.ModBlock;
import compressed_tech.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;



@Mod(CompressedTech.MOD_ID)
public class CompressedTech{
    public static final String MOD_ID = "compressed_tech";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CompressedTech(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //Import Items
        Items.register(modEventBus);
        ModBlock.register(modEventBus);

        //
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event){

    }

    @Mod.EventBusSubscriber(modid = MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }


}