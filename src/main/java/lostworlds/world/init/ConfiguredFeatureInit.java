package lostworlds.world.init;

import com.google.common.collect.ImmutableList;

import lostworlds.core.util.ModBlockStates;
import lostworlds.core.util.ModID;
import lostworlds.world.feature.ModFillerBlockType;
import lostworlds.world.feature.foliageplacer.GinkgoFoliagePlacer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.BlockStateFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.NoiseDependant;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ConfiguredFeatureInit 
{
    //Plants
	//Permian Desert Plant
	public static final ConfiguredFeature<?, ?> PATCH_PERMIAN_DESERT_PLANT_SMALL = register("patch_permian_desert_plant_small", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_PERMAIN_DESERT_CONFIG_SMALL).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
	public static final ConfiguredFeature<?, ?> PATCH_PERMIAN_DESERT_PLANT_MEDIUM = register("patch_permian_desert_plant_medium", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_PERMAIN_DESERT_CONFIG_MEDIUM).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
	public static final ConfiguredFeature<?, ?> PATCH_PERMIAN_DESERT_PLANT_LARGE = register("patch_permian_desert_plant_large", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_PERMAIN_DESERT_CONFIG_LARGE).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
	
	//Lush Permian Plants
	public static final ConfiguredFeature<?, ?> PATCH_PERMIAN_GROUND_FERNS = register("patch_permian_ground_ferns", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_PERMIAN_GROUND_FERNS_CONFIG).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
	public static final ConfiguredFeature<?, ?> PATCH_DICKSONIA = register("patch_dicksonia", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_DICKSONIA).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
	public static final ConfiguredFeature<?, ?> PATCH_TALL_DICKSONIA = register("patch_tall_dicksonia", Feature.RANDOM_PATCH.configured(ModBlockClusterFeatureConfig.DEFAULT_TALL_DICKSONIA).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP).squared().decorated(Placement.COUNT_NOISE.configured(new NoiseDependant(-0.8D, 0, 7))));

	//Trees
	//Trees
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CONIFER_TREE = register("conifer_tree", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlockStates.CONIFER_LOG), new SimpleBlockStateProvider(ModBlockStates.CONIFER_LEAVES), new SpruceFoliagePlacer(FeatureSpread.of(2, 1), FeatureSpread.of(0, 2), FeatureSpread.of(1, 1)), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).ignoreVines().build()));
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> GINKGO_TREE = register("ginkgo_tree", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlockStates.GINKGO_LOG), new SimpleBlockStateProvider(ModBlockStates.GINKGO_LEAVES), new GinkgoFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 7), new StraightTrunkPlacer(7, 2, 1), new TwoLayerFeature(2, 0, 2))).ignoreVines().build()));
	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> ARAUCARIA_TREE = register("araucaria_tree", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlockStates.ARAUCARIA_LOG), new SimpleBlockStateProvider(ModBlockStates.ARAUCARIA_LEAVES), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 1), new ForkyTrunkPlacer(11, 2, 2), new TwoLayerFeature(1, 0, 2))).ignoreVines().build()));

	public static final ConfiguredFeature<?, ?> SINGLE_CONIFER_TREE = register("single_conifer_tree", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(ConfiguredFeatureInit.CONIFER_TREE.weighted(0.5F)), ConfiguredFeatureInit.CONIFER_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

	public static final ConfiguredFeature<?, ?> CONIFER_TREES = register("conifer_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(ConfiguredFeatureInit.CONIFER_TREE.weighted(0.5F)), ConfiguredFeatureInit.CONIFER_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
	public static final ConfiguredFeature<?, ?> GINKGO_TREES = register("ginkgo_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(ConfiguredFeatureInit.GINKGO_TREE.weighted(0.5F)), ConfiguredFeatureInit.GINKGO_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
	public static final ConfiguredFeature<?, ?> ARAUCARIA_TREES = register("araucaria_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(ConfiguredFeatureInit.ARAUCARIA_TREE.weighted(0.5F)), ConfiguredFeatureInit.ARAUCARIA_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
	
	public static final ConfiguredFeature<?, ?> CONIFER_VEGETATION = register("conifer_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(CONIFER_TREE.weighted(0.33333334F)), CONIFER_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
	public static final ConfiguredFeature<?, ?> GINKGO_VEGETATION = register("gingko_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(GINKGO_TREE.weighted(0.33333334F)), GINKGO_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
	public static final ConfiguredFeature<?, ?> ARAUCARIA_VEGETATION = register("araucaria_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(ARAUCARIA_TREE.weighted(0.33333334F)), ARAUCARIA_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

	//Ores
	//Permian
	public static final ConfiguredFeature<?, ?> PERMIAN_COAL = register("permian_coal", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_COAL_ORE, 17)).range(128).squared().count(10));
	public static final ConfiguredFeature<?, ?> PERMIAN_COPPER = register("permian_copper", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_COPPER_ORE, 7)).range(128).squared().count(10));
	public static final ConfiguredFeature<?, ?> PERMIAN_IRON = register("permian_iron", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_IRON_ORE, 9)).range(64).squared().count(20));
	public static final ConfiguredFeature<?, ?> PERMIAN_GOLD = register("permian_gold", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_GOLD_ORE, 9)).range(32).squared().count(2));
	public static final ConfiguredFeature<?, ?> PERMIAN_REDSTONE = register("permian_redstone", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_REDSTONE_ORE, 8)).range(16).squared().count(8));
	public static final ConfiguredFeature<?, ?> PERMIAN_DIAMOND = register("permian_diamond", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_DIAMOND_ORE, 8)).range(16).squared());
	public static final ConfiguredFeature<?, ?> PERMIAN_LAPIS = register("permian_lapis", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.PERMIAN_STONE, ModBlockStates.PERMIAN_LAPIS_ORE, 7)).decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(16, 16))).squared());
	public static final ConfiguredFeature<?, ?> PERMIAN_EMERALD = register("permian_emerald", Feature.EMERALD_ORE.configured(new ReplaceBlockConfig(ModBlockStates.PERMIAN_STONE, ModBlockStates.PERMIAN_EMERALD_ORE)).decorated(Placement.EMERALD_ORE.configured(IPlacementConfig.NONE)));
	
	public static final ConfiguredFeature<?, ?> JURASSIC_COAL = register("jurassic_coal", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_COAL_ORE, 17)).range(128).squared().count(10));
	public static final ConfiguredFeature<?, ?> JURASSIC_COPPER = register("jurassic_copper", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_COPPER_ORE, 7)).range(128).squared().count(10));
	public static final ConfiguredFeature<?, ?> JURASSIC_IRON = register("jurassic_iron", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_IRON_ORE, 9)).range(64).squared().count(20));
	public static final ConfiguredFeature<?, ?> JURASSIC_GOLD = register("jurassic_gold", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_GOLD_ORE, 9)).range(32).squared().count(2));
	public static final ConfiguredFeature<?, ?> JURASSIC_REDSTONE = register("jurassic_redstone", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_REDSTONE_ORE, 8)).range(16).squared().count(8));
	public static final ConfiguredFeature<?, ?> JURASSIC_DIAMOND = register("jurassic_diamond", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_DIAMOND_ORE, 8)).range(16).squared());
	public static final ConfiguredFeature<?, ?> JURASSIC_LAPIS = register("jurassic_lapis", Feature.ORE.configured(new OreFeatureConfig(ModFillerBlockType.JURASSIC_STONE, ModBlockStates.JURASSIC_LAPIS_ORE, 7)).decorated(Placement.DEPTH_AVERAGE.configured(new DepthAverageConfig(16, 16))).squared());
	public static final ConfiguredFeature<?, ?> JURASSIC_EMERALD = register("jurassic_emerald", Feature.EMERALD_ORE.configured(new ReplaceBlockConfig(ModBlockStates.PERMIAN_STONE, ModBlockStates.JURASSIC_EMERALD_ORE)).decorated(Placement.EMERALD_ORE.configured(IPlacementConfig.NONE)));
	
	//Lakes
	//Permian
	public static final ConfiguredFeature<?, ?> PERMIAN_WATER_LAKE = FeatureInit.LAKES.configured(new BlockStateFeatureConfig(ModBlockStates.WATER)).decorated(Placement.WATER_LAKE.configured(new ChanceConfig(4)));
	public static final ConfiguredFeature<?, ?> PERMIAN_LAVA_LAKE = FeatureInit.LAKES.configured(new BlockStateFeatureConfig(ModBlockStates.LAVA)).decorated(Placement.LAVA_LAKE.configured(new ChanceConfig(80)));
	
	//Jurassic
	public static final ConfiguredFeature<?, ?> JURASSIC_WATER_LAKE = FeatureInit.JURASSIC_LAKES.configured(new BlockStateFeatureConfig(ModBlockStates.WATER)).decorated(Placement.WATER_LAKE.configured(new ChanceConfig(4)));
	public static final ConfiguredFeature<?, ?> JURASSIC_LAVA_LAKE = FeatureInit.JURASSIC_LAKES.configured(new BlockStateFeatureConfig(ModBlockStates.LAVA)).decorated(Placement.LAVA_LAKE.configured(new ChanceConfig(80)));
	
	public static void init()
	{
		Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;
		
		Registry.register(registry, new ResourceLocation(ModID.ID, "permian_water_lake"), PERMIAN_WATER_LAKE);
		Registry.register(registry, new ResourceLocation(ModID.ID, "permian_lava_lake"), PERMIAN_LAVA_LAKE);
		
		Registry.register(registry, new ResourceLocation(ModID.ID, "jurassic_water_lake"), JURASSIC_WATER_LAKE);
		Registry.register(registry, new ResourceLocation(ModID.ID, "jurassic_lava_lake"), JURASSIC_LAVA_LAKE);
	}
	
	public static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> configuredFeature) 
	{
		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, id, configuredFeature);
	}
}
