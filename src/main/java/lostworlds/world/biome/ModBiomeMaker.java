package lostworlds.world.biome;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;

public class ModBiomeMaker 
{
	public static int getSkyColorWithTemperatureModifier(float temperature) 
	{
		float lvt_1_1_ = temperature / 3.0F;
		lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
		return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
	}
	
	public static Biome makeAVolcanoBiome() 
	{
		MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
		
		BiomeGenerationSettings.Builder biomegenerationsettings$builder = (new BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244181_m);
		DefaultBiomeFeatures.withStrongholdAndMineshaft(biomegenerationsettings$builder);
		biomegenerationsettings$builder.withStructure(StructureFeatures.RUINED_PORTAL_MOUNTAIN);
		DefaultBiomeFeatures.withCavesAndCanyons(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withMonsterRoom(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withCommonOverworldBlocks(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withOverworldOres(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withDisks(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withBadlandsGrass(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withEmeraldOre(biomegenerationsettings$builder);
		DefaultBiomeFeatures.withLavaLakes(biomegenerationsettings$builder);
		
		return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.EXTREME_HILLS).depth(1.0F).scale(0.5F).temperature(0.2F).downfall(0.3F).setEffects((new BiomeAmbience.Builder()).withGrassColor(0x1c1c1c1c).setWaterColor(0x333333).setWaterFogColor(0x0c0c0c).setFogColor(0x636363).withSkyColor(getSkyColorWithTemperatureModifier(0.2F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(mobspawninfo$builder.copy()).withGenerationSettings(biomegenerationsettings$builder.build()).build();
	}
}
