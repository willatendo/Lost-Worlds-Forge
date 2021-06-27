package api.core.init;

import library.Init;
import library.ModRegistry;
import library.slots.ModSignTileEntity;
import library.tileentities.AnalyserTileEntity;
import library.tileentities.DNAExtractorTileEntity;
import library.tileentities.DNAInjectorTileEntity;
import library.tileentities.FossilCleanerTileEntity;
import library.tileentities.FossilGrinderTileEntity;
import library.tileentities.KylixTileEntity;
import library.tileentities.TimeMachineTileEntity;
import library.util.ModUtil;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

@Init
public class TileEntityInit extends ModRegistry
{	
	//Machines
	public static final RegistryObject<TileEntityType<FossilCleanerTileEntity>> FOSSIL_CLEANER_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("fossil_cleaner_tile_entity", () -> TileEntityType.Builder.of(FossilCleanerTileEntity::new, BlockInit.FOSSIL_CLEANER.get()).build(null));
	public static final RegistryObject<TileEntityType<FossilGrinderTileEntity>> FOSSIL_GRINDER_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("fossil_grinder_tile_entity", () -> TileEntityType.Builder.of(FossilGrinderTileEntity::new, BlockInit.FOSSIL_GRINDER.get()).build(null));
	public static final RegistryObject<TileEntityType<DNAExtractorTileEntity>> DNA_EXTRACTOR_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("dna_extractor_tile_entity", () -> TileEntityType.Builder.of(DNAExtractorTileEntity::new, BlockInit.DNA_EXTRACTOR.get()).build(null));
	public static final RegistryObject<TileEntityType<AnalyserTileEntity>> ANALYSER_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("analyser_tile_entity", () -> TileEntityType.Builder.of(AnalyserTileEntity::new, BlockInit.ANALYSER.get()).build(null));
	public static final RegistryObject<TileEntityType<DNAInjectorTileEntity>> DNA_INJECTOR_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("dna_injector_tile_entity", () -> TileEntityType.Builder.of(DNAInjectorTileEntity::new, BlockInit.DNA_INJECTOR.get()).build(null));

	//Time Machine
	public static final RegistryObject<TileEntityType<TimeMachineTileEntity>> TIME_MACHINE_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("time_machine_tile_entity", () -> TileEntityType.Builder.of(TimeMachineTileEntity::new, BlockInit.TIME_MACHINE.get()).build(null));
	
	//Sign
	public static final RegistryObject<TileEntityType<ModSignTileEntity>> SIGN_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("sign_tile_entity", () -> TileEntityType.Builder.of(ModSignTileEntity::new, BlockInit.CONIFER_SIGN.get(), BlockInit.CONIFER_WALL_SIGN.get(), BlockInit.GINKGO_SIGN.get(), BlockInit.GINKGO_WALL_SIGN.get(), BlockInit.ARAUCARIA_SIGN.get(), BlockInit.ARAUCARIA_WALL_SIGN.get()).build(null));
	
	//Pottery
	public static final RegistryObject<TileEntityType<KylixTileEntity>> KYLIX_TILE_ENTITY = TILE_ENTITY_REGISTRY.register("kylix_tile_entity", () -> TileEntityType.Builder.of(KylixTileEntity::new, BlockInit.BAKED_KYLIX.get()).build(null));
	
	//Registry
	public static void initTileEntities() { ModUtil.LOGGER.debug("Registering: Mod Tile Entities"); }
}
                   