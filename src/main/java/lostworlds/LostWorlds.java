package lostworlds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lostworlds.common.items.ModSpawnEggItem;
import lostworlds.core.init.BlockInit;
import lostworlds.core.util.ModID;
import lostworlds.core.util.registry.ModRegistry;
import lostworlds.core.vanilla.properties.ModFlammables;
import lostworlds.core.vanilla.properties.ModStrippables;
import lostworlds.world.dimension.permian.PermianDimension;
import lostworlds.world.dimension.permian.PermianDimensionRenderInfo;
import lostworlds.world.feature.init.Mobs;
import lostworlds.world.feature.init.Ores;
import lostworlds.world.init.BiomeInit;
import net.minecraft.block.ComposterBlock;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(ModID.ID)

public class LostWorlds
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static boolean DISABLE_IN_DEV = false;

	public LostWorlds() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);

        //Main Objects
        ModRegistry.registry();  
        
        //Lib - 3.0.30
        GeckoLib.initialize();
        
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, Ores::generateOre);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, BiomeInit::addBiomesToOverworld);
        MinecraftForge.EVENT_BUS.addListener((BiomeLoadingEvent event) -> Mobs.addMobSpawning(event));
    }

	
    @SuppressWarnings("deprecation")
	private void setup(final FMLCommonSetupEvent event)
    {
    	DeferredWorkQueue.runLater(() -> 
    	{
    		ComposterBlock.add(0.6F, BlockInit.CONIFER_LEAVES.get());
    		ComposterBlock.add(0.6F, BlockInit.GINKGO_LEAVES.get());
    		ComposterBlock.add(0.4F, BlockInit.SMALL_PERMIAN_DESERT_PLANT.get());
    		ComposterBlock.add(0.6F, BlockInit.MEDIUM_PERMIAN_DESERT_PLANT.get());
    		ComposterBlock.add(0.8F, BlockInit.LARGE_PERMIAN_DESERT_PLANT.get());
    		ComposterBlock.add(0.6F, BlockInit.PERMIAN_GROUND_FERNS.get());
    		ComposterBlock.add(0.6F, BlockInit.CONIFER_SAPLING.get());
    	});
    	
    	event.enqueueWork(() -> {
    		PermianDimension.init();
    	});
    }

	public void clientSetup(FMLClientSetupEvent event) 
    {
        DimensionRenderInfo permian = new PermianDimensionRenderInfo();
        DimensionRenderInfo.EFFECTS.put(new ResourceLocation(ModID.ID, "permian_render"), permian);
    }
    
    private void loadComplete(FMLLoadCompleteEvent event)
    {
    	ModStrippables.strippingMap();
    	ModFlammables.flammables();
    }
    
    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		ModSpawnEggItem.initSpawnEggs();
	}
}
