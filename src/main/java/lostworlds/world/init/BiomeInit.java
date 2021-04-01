package lostworlds.world.init;

import java.util.function.Supplier;

import lostworlds.core.util.reference.ModReference;
import lostworlds.core.util.registry.ModRegistry;
import lostworlds.world.biome.ModBiomeMaker;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.RegistryObject;

public class BiomeInit 
{
	public static final RegistryObject<Biome> VOLCANO = createBiome("volcano", ModBiomeMaker::makeAVolcanoBiome);
	public static final RegistryKey<Biome> VOLCANO_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "volcano"));
	
	public static final RegistryObject<Biome> OIL_SANDS_DESERT = createBiome("oil_sands_desert", ModBiomeMaker::makeAOilSands);
	public static final RegistryKey<Biome> OIL_SANDS_DESERT_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "oil_sands_desert"));
	
	public static final RegistryObject<Biome> PERMIAN_DESERT = createBiome("permian_desert", ModBiomeMaker::makeAPermianDesert);
	public static final RegistryKey<Biome> PERMIAN_DESERT_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "permian_desert"));
	
	public static final RegistryObject<Biome> FLOOD_BASALT_PLAINS = createBiome("flood_basalt_plains", ModBiomeMaker::makeAFloodBasaltPlains);
	public static final RegistryKey<Biome> FLOOD_BASALT_PLAINS_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "flood_basalt_plains"));
	
	public static final RegistryObject<Biome> PERMIAN_PLAINS = createBiome("permian_plains", ModBiomeMaker::makeAPermianPlains);
	public static final RegistryKey<Biome> PERMIAN_PLAINS_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "permian_plains"));
	
	public static final RegistryObject<Biome> PERMIAN_OCEAN = createBiome("permian_ocean", BiomeMaker::warmOceanBiome);
	public static final RegistryKey<Biome> PERMIAN_OCEAN_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "permian_ocean"));

	public static final RegistryObject<Biome> PERMIAN_MOUNTAINS = createBiome("permian_mountains", BiomeMaker::warmOceanBiome);
	public static final RegistryKey<Biome> PERMIAN_MOUNTAINS_KEY = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(ModReference.ID, "permian_mountains"));
	
	//Registry
    public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome) 
    {
        return ModRegistry.BIOME_REGISTRY.register(name, biome);
    }
    
    public static void initBiomes() { }
    
    //Generation
    public static void addBiomesToOverworld(BiomeLoadingEvent event)
    {
    	if (event.getName().equals(VOLCANO.get().getRegistryName())) 
    	{
    		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(VOLCANO_KEY, 1));
    		BiomeDictionary.addTypes(VOLCANO_KEY, Type.HOT, Type.MOUNTAIN, Type.RARE);
    	}
    	if(event.getName().equals(OIL_SANDS_DESERT.get().getRegistryName()))
    	{
    		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(OIL_SANDS_DESERT_KEY, 1));
    		BiomeDictionary.addTypes(OIL_SANDS_DESERT_KEY, Type.HOT, Type.RARE);
    	}
    }
}
