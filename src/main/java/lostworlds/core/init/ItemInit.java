package lostworlds.core.init;

import lostworlds.common.items.DiscItem;
import lostworlds.common.items.ModFishBucketItem;
import lostworlds.common.items.ModSpawnEggItem;
import lostworlds.common.items.ModSpawnItem;
import lostworlds.common.items.WetPaperItem;
import lostworlds.common.tools.BrushItem;
import lostworlds.core.ModItemGroup;
import lostworlds.core.util.enums.ModItemTeir;
import lostworlds.core.util.registry.ModRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.RegistryObject;

public class ItemInit 
{
	//Items
	//Brush
	public static final RegistryObject<Item> BRUSH = ModRegistry.ITEM_REGISTRY.register("brush", () -> new BrushItem(ModItemTeir.BRUSH, 1.5F, -3.0F, standardProperties()));
	
	//Plaster
	public static final RegistryObject<Item> WET_PAPER = advancedItemRegister("wet_paper", new WetPaperItem(standardProperties()));

	//Procompsognathus triassicus
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_BONE = registerBone("procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_DNA = registerDNA("procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_EGG = registerEgg("procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_BABY = registerBabyDino(() -> EntityInit.PROCOMPSOGNATHUS_ENTITY.get(), "procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_MEAT = registerMeat("procompsognathus", FoodInit.RAW_PROCOMPSOGNATHUS_MEAT);
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_COOKED_MEAT = registerCookedMeat("procompsognathus", FoodInit.COOKED_PROCOMPSOGNATHUS_MEAT);
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_SPAWN_EGG = registerSpawnEgg("procompsognathus", () -> EntityInit.PROCOMPSOGNATHUS_ENTITY.get(), 0x125611, 0x143025, standardProperties());
	
	//Palaeoniscum
	public static final RegistryObject<Item> PALAEONISCUM_BONE = registerBone("palaeoniscum");
	public static final RegistryObject<Item> PALAEONISCUM_DNA = registerDNA("palaeoniscum");
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN = registerSpawn("palaeoniscum", standardProperties());
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN_BUCKET = registerSpawnBucket("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get(), standardProperties());
	public static final RegistryObject<Item> PALAEONISCUM_MEAT = registerFishMeat("palaeoniscum", FoodInit.PALAEONISCUM);
	public static final RegistryObject<Item> PALAEONISCUM_COOKED_MEAT = registerCookedFishMeat("palaeoniscum", FoodInit.COOKED_PROCOMPSOGNATHUS_MEAT);
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN_EGG = registerSpawnEgg("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get(), 0x1e2f4f, 0x2b1838, standardProperties());
	public static final RegistryObject<Item> PALAEONISCUM_BUCKET = registerEntityBucket("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get(), Fluids.WATER, standardProperties());
	
	//Nautilus
	public static final RegistryObject<Item> NAUTILUS_DNA = registerDNA("nautilus");
	public static final RegistryObject<Item> NAUTILUS_SPAWN = registerSpawn("nautilus", standardProperties());
	public static final RegistryObject<Item> NAUTILUS_SPAWN_BUCKET = registerSpawnBucket("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get(), standardProperties());
	public static final RegistryObject<Item> NAUTILUS_TENTICAL = advancedItemRegister("nautilus_tentical", new Item(standardProperties().food(FoodInit.NAUTILUS_TENTICAL)));
	public static final RegistryObject<Item> COOKED_NAUTILUS_TENTICAL = advancedItemRegister("cooked_nautilus_tentical", new Item(standardProperties().food(FoodInit.COOKED_NAUTILUS_TENTICAL)));
	public static final RegistryObject<Item> NAUTILUS_SPAWN_EGG = registerSpawnEgg("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get(), 0xd8cecd, 0x4f4841, standardProperties());
	public static final RegistryObject<Item> NAUTILUS_BUCKET = registerEntityBucket("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get(), Fluids.WATER, standardProperties());
		
	//Copper
	public static final RegistryObject<Item> COPPER_INGOT = simpleItemRegister("copper_ingot", standardProperties());
	public static final RegistryObject<Item> COPPER_NUGGET = simpleItemRegister("copper_nugget", standardProperties());
	
	//Oil and Plastic Stuff
	public static final RegistryObject<Item> OIL_BUCKET = simpleItemRegister("oil_bucket", standardProperties().maxStackSize(1));
	public static final RegistryObject<Item> MOLTEN_PLASTIC_BUCKET = simpleItemRegister("molten_plastic_bucket", standardProperties().maxStackSize(1));
	
	//Electronics
	public static final RegistryObject<Item> COPPER_WIRE = simpleItemRegister("copper_wire", standardProperties());	
	
	//Music
	@SuppressWarnings("deprecation")
	public static final RegistryObject<Item> JP_MUSIC_DISC = advancedItemRegister("jp_music_disc", new MusicDiscItem(15, SoundInit.LAZY_JP_MUSIC.get(), standardProperties().maxStackSize(1).rarity(Rarity.RARE)));
	
	//Storage
	public static final RegistryObject<Item> DISC = advancedItemRegister("disc", new DiscItem(standardProperties().maxStackSize(1)));
		
	//Crystal Scarab	
	public static final RegistryObject<Item> BROKEN_CRYSTAL_SCARAB_GEM = simpleItemRegister("broken_crystal_scarab_gem", standardProperties().rarity(Rarity.RARE));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_GEM = simpleItemRegister("crystal_scarab_gem", standardProperties().rarity(Rarity.EPIC));
	
	//Crystal Scarab Tools
	public static final RegistryObject<Item> CRYSTAL_SCARAB_SWORD = advancedItemRegister("crystal_scarab_sword", new SwordItem(ModItemTeir.SCARAB, 50, -2.4F, standardProperties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_SHOVEL = advancedItemRegister("crystal_scarab_shovel", new ShovelItem(ModItemTeir.SCARAB, 12.0F, -3.0F, standardProperties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_PICKAXE = advancedItemRegister("crystal_scarab_pickaxe", new PickaxeItem(ModItemTeir.SCARAB, 32, -2.8F, standardProperties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_AXE = advancedItemRegister("crystal_scarab_axe", new AxeItem(ModItemTeir.SCARAB, 70.0F, -3.2F, standardProperties().rarity(Rarity.EPIC)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_HOE = advancedItemRegister("crystal_scarab_hoe", new HoeItem(ModItemTeir.SCARAB, 10, -3.0F, standardProperties().rarity(Rarity.EPIC)));
	
	//Blocks
	//Copper
	public static final RegistryObject<BlockItem> COPPER_ORE = ModRegistry.ITEM_REGISTRY.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), standardProperties()));
	
	//Fossil
	public static final RegistryObject<BlockItem> STONE_FOSSIL = ModRegistry.ITEM_REGISTRY.register("stone_fossil", () -> new BlockItem(BlockInit.STONE_FOSSIL.get(), standardProperties()));
	public static final RegistryObject<BlockItem> EXPOSED_STONE_FOSSIL = ModRegistry.ITEM_REGISTRY.register("exposed_stone_fossil", () -> new BlockItem(BlockInit.EXPOSED_STONE_FOSSIL.get(), standardProperties()));
	public static final RegistryObject<BlockItem> PLASTERED_STONE_FOSSIL = ModRegistry.ITEM_REGISTRY.register("plastered_stone_fossil", () -> new BlockItem(BlockInit.PLASTERED_STONE_FOSSIL.get(), standardProperties()));

	//Museum Stuff
	public static final RegistryObject<BlockItem> ARCHAEOLOGY_TABLE = ModRegistry.ITEM_REGISTRY.register("archaeology_table", () -> new BlockItem(BlockInit.ARCHAEOLOGY_TABLE.get(), standardProperties()));

	
	//Volcanic Stuff
	public static final RegistryObject<BlockItem> VOLCANIC_ROCK = ModRegistry.ITEM_REGISTRY.register("volcanic_rock", () -> new BlockItem(BlockInit.VOLCANIC_ROCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> VOLCANIC_ROCK_STAIRS = ModRegistry.ITEM_REGISTRY.register("volcanic_rock_stairs", () -> new BlockItem(BlockInit.VOLCANIC_ROCK_STAIRS.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> VOLCANIC_ROCK_SLAB = ModRegistry.ITEM_REGISTRY.register("volcanic_rock_slab", () -> new BlockItem(BlockInit.VOLCANIC_ROCK_SLAB.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> VOLCANIC_ROCK_WALL = ModRegistry.ITEM_REGISTRY.register("volcanic_rock_wall", () -> new BlockItem(BlockInit.VOLCANIC_ROCK_WALL.get(), standardProperties()));	
	
	public static final RegistryObject<BlockItem> POLISHED_VOLCANIC_ROCK = ModRegistry.ITEM_REGISTRY.register("polished_volcanic_rock", () -> new BlockItem(BlockInit.POLISHED_VOLCANIC_ROCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> POLISHED_VOLCANIC_ROCK_STAIRS = ModRegistry.ITEM_REGISTRY.register("polished_volcanic_rock_stairs", () -> new BlockItem(BlockInit.POLISHED_VOLCANIC_ROCK_STAIRS.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> POLISHED_VOLCANIC_ROCK_SLAB = ModRegistry.ITEM_REGISTRY.register("polished_volcanic_rock_slab", () -> new BlockItem(BlockInit.POLISHED_VOLCANIC_ROCK_SLAB.get(), standardProperties()));	

	public static final RegistryObject<BlockItem> VOLCANIC_ASH = ModRegistry.ITEM_REGISTRY.register("volcanic_ash", () -> new BlockItem(BlockInit.VOLCANIC_ASH.get(), standardProperties()));
	
	//Light Concrete
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE =  ModRegistry.ITEM_REGISTRY.register("light_concrete", () -> new BlockItem(BlockInit.LIGHT_CONCRETE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE_STAIRS =  ModRegistry.ITEM_REGISTRY.register("light_concrete_stairs", () -> new BlockItem(BlockInit.LIGHT_CONCRETE_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE_SLAB =  ModRegistry.ITEM_REGISTRY.register("light_concrete_slab", () -> new BlockItem(BlockInit.LIGHT_CONCRETE_SLAB.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE_WALL =  ModRegistry.ITEM_REGISTRY.register("light_concrete_wall", () -> new BlockItem(BlockInit.LIGHT_CONCRETE_WALL.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_REGISTRY.register("light_concrete_pressure_plate", () -> new BlockItem(BlockInit.LIGHT_CONCRETE_PRESSURE_PLATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_CONCRETE_BUTTON =  ModRegistry.ITEM_REGISTRY.register("light_concrete_button", () -> new BlockItem(BlockInit.LIGHT_CONCRETE_BUTTON.get(), standardProperties()));
	
	//Polished Light Concrete
	public static final RegistryObject<BlockItem> POLISHED_LIGHT_CONCRETE =  ModRegistry.ITEM_REGISTRY.register("polished_light_concrete", () -> new BlockItem(BlockInit.POLISHED_LIGHT_CONCRETE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> POLISHED_LIGHT_CONCRETE_STAIRS =  ModRegistry.ITEM_REGISTRY.register("polished_light_concrete_stairs", () -> new BlockItem(BlockInit.POLISHED_LIGHT_CONCRETE_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> POLISHED_LIGHT_CONCRETE_SLAB =  ModRegistry.ITEM_REGISTRY.register("polished_light_concrete_slab", () -> new BlockItem(BlockInit.POLISHED_LIGHT_CONCRETE_SLAB.get(), standardProperties()));
	
	//Dark Concrete
	public static final RegistryObject<BlockItem> DARK_CONCRETE =  ModRegistry.ITEM_REGISTRY.register("dark_concrete", () -> new BlockItem(BlockInit.DARK_CONCRETE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> DARK_CONCRETE_STAIRS =  ModRegistry.ITEM_REGISTRY.register("dark_concrete_stairs", () -> new BlockItem(BlockInit.DARK_CONCRETE_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> DARK_CONCRETE_SLAB =  ModRegistry.ITEM_REGISTRY.register("dark_concrete_slab", () -> new BlockItem(BlockInit.DARK_CONCRETE_SLAB.get(), standardProperties()));
	public static final RegistryObject<BlockItem> DARK_CONCRETE_WALL =  ModRegistry.ITEM_REGISTRY.register("dark_concrete_wall", () -> new BlockItem(BlockInit.DARK_CONCRETE_WALL.get(), standardProperties()));
	public static final RegistryObject<BlockItem> DARK_CONCRETE_PRESSURE_PLATE = ModRegistry.ITEM_REGISTRY.register("dark_concrete_pressure_plate", () -> new BlockItem(BlockInit.DARK_CONCRETE_PRESSURE_PLATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> DARK_CONCRETE_BUTTON =  ModRegistry.ITEM_REGISTRY.register("dark_concrete_button", () -> new BlockItem(BlockInit.DARK_CONCRETE_BUTTON.get(), standardProperties()));
	
	//Polished Dark Concrete
	public static final RegistryObject<BlockItem> POLISHED_DARK_CONCRETE =  ModRegistry.ITEM_REGISTRY.register("polished_dark_concrete", () -> new BlockItem(BlockInit.POLISHED_DARK_CONCRETE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> POLISHED_DARK_CONCRETE_STAIRS =  ModRegistry.ITEM_REGISTRY.register("polished_dark_concrete_stairs", () -> new BlockItem(BlockInit.POLISHED_DARK_CONCRETE_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> POLISHED_DARK_CONCRETE_SLAB =  ModRegistry.ITEM_REGISTRY.register("polished_dark_concrete_slab", () -> new BlockItem(BlockInit.POLISHED_DARK_CONCRETE_SLAB.get(), standardProperties()));

	//Wooden Planks
	public static final RegistryObject<BlockItem> WOODEN_PLANKS =  ModRegistry.ITEM_REGISTRY.register("wooden_planks", () -> new BlockItem(BlockInit.WOODEN_PLANKS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_STAIRS =  ModRegistry.ITEM_REGISTRY.register("wooden_planks_stairs", () -> new BlockItem(BlockInit.WOODEN_PLANKS_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_SLAB =  ModRegistry.ITEM_REGISTRY.register("wooden_planks_slab", () -> new BlockItem(BlockInit.WOODEN_PLANKS_SLAB.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_FENCE =  ModRegistry.ITEM_REGISTRY.register("wooden_planks_fence", () -> new BlockItem(BlockInit.WOODEN_PLANKS_FENCE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_FENCE_GATE =  ModRegistry.ITEM_REGISTRY.register("wooden_planks_fence_gate", () -> new BlockItem(BlockInit.WOODEN_PLANKS_FENCE_GATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_PRESSURE_PLATE = ModRegistry.ITEM_REGISTRY.register("wooden_planks_pressure_plate", () -> new BlockItem(BlockInit.WOODEN_PLANKS_PRESSURE_PLATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WOODEN_PLANKS_BUTTON =  ModRegistry.ITEM_REGISTRY.register("wooden_planks_button", () -> new BlockItem(BlockInit.WOODEN_PLANKS_BUTTON.get(), standardProperties()));
		
	//Wooden Planks
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_STAIRS =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_stairs", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_SLAB =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_slab", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_SLAB.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_FENCE =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_fence", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_FENCE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_FENCE_GATE =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_fence_gate", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_FENCE_GATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_PRESSURE_PLATE = ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_pressure_plate", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_PRESSURE_PLATE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> REFINED_WOODEN_PLANKS_BUTTON =  ModRegistry.ITEM_REGISTRY.register("refined_wooden_planks_button", () -> new BlockItem(BlockInit.REFINED_WOODEN_PLANKS_BUTTON.get(), standardProperties()));
	
	//Pavement
	public static final RegistryObject<BlockItem> PAVEMENT =  ModRegistry.ITEM_REGISTRY.register("pavement", () -> new BlockItem(BlockInit.PAVEMENT.get(), standardProperties()));
	public static final RegistryObject<BlockItem> PAVEMENT_SLOPE =  ModRegistry.ITEM_REGISTRY.register("pavement_slope", () -> new BlockItem(BlockInit.PAVEMENT_SLOPE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> RAISED_PAVEMENT =  ModRegistry.ITEM_REGISTRY.register("raised_pavement", () -> new BlockItem(BlockInit.RAISED_PAVEMENT.get(), standardProperties()));
	
	//Roads
	public static final RegistryObject<BlockItem> GRAVEL_ROAD = ModRegistry.ITEM_REGISTRY.register("gravel_road", () -> new BlockItem(BlockInit.GRAVEL_ROAD.get(), standardProperties()));
	public static final RegistryObject<BlockItem> RAISED_GRAVEL_ROAD = ModRegistry.ITEM_REGISTRY.register("raised_gravel_road", () -> new BlockItem(BlockInit.RAISED_GRAVEL_ROAD.get(), standardProperties()));
		
	public static final RegistryObject<BlockItem> DIRT_ROAD = ModRegistry.ITEM_REGISTRY.register("dirt_road", () -> new BlockItem(BlockInit.DIRT_ROAD.get(), standardProperties()));
	public static final RegistryObject<BlockItem> RAISED_DIRT_ROAD = ModRegistry.ITEM_REGISTRY.register("raised_dirt_road", () -> new BlockItem(BlockInit.RAISED_DIRT_ROAD.get(), standardProperties()));
			
	public static final RegistryObject<BlockItem> PAVED_ROAD = ModRegistry.ITEM_REGISTRY.register("paved_road", () -> new BlockItem(BlockInit.PAVED_ROAD.get(), standardProperties()));
	public static final RegistryObject<BlockItem> RAISED_PAVED_ROAD = ModRegistry.ITEM_REGISTRY.register("raised_paved_road", () -> new BlockItem(BlockInit.RAISED_PAVED_ROAD.get(), standardProperties()));
		
	//Tile
	public static final RegistryObject<BlockItem> TILE =  ModRegistry.ITEM_REGISTRY.register("tile", () -> new BlockItem(BlockInit.TILE.get(), standardProperties()));
	public static final RegistryObject<BlockItem> TILE_STAIRS =  ModRegistry.ITEM_REGISTRY.register("tile_stairs", () -> new BlockItem(BlockInit.TILE_STAIRS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> TILE_SLAB =  ModRegistry.ITEM_REGISTRY.register("tile_slab", () -> new BlockItem(BlockInit.TILE_SLAB.get(), standardProperties()));

	//Metal Fence
	public static final RegistryObject<BlockItem> METAL_FENCE = ModRegistry.ITEM_REGISTRY.register("metal_fence", () -> new BlockItem(BlockInit.METAL_FENCE.get(), standardProperties()));

	//Clear Glass
	public static final RegistryObject<BlockItem> CLEAR_GLASS = ModRegistry.ITEM_REGISTRY.register("clear_glass", () -> new BlockItem(BlockInit.CLEAR_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> CLEAR_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("clear_glass_pane", () -> new BlockItem(BlockInit.CLEAR_GLASS_PANE.get(), standardProperties()));

	//Tinted Glass
	public static final RegistryObject<BlockItem> TINTED_GLASS = ModRegistry.ITEM_REGISTRY.register("tinted_glass", () -> new BlockItem(BlockInit.TINTED_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> TINTED_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("tinted_glass_pane", () -> new BlockItem(BlockInit.TINTED_GLASS_PANE.get(), standardProperties()));
	
	//Coloured Glass
	public static final RegistryObject<BlockItem> WHITE_GLASS = ModRegistry.ITEM_REGISTRY.register("white_glass", () -> new BlockItem(BlockInit.WHITE_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> WHITE_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("white_glass_pane", () -> new BlockItem(BlockInit.WHITE_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> LIGHT_GREY_GLASS = ModRegistry.ITEM_REGISTRY.register("light_grey_glass", () -> new BlockItem(BlockInit.LIGHT_GREY_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_GREY_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("light_grey_glass_pane", () -> new BlockItem(BlockInit.LIGHT_GREY_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> GREY_GLASS = ModRegistry.ITEM_REGISTRY.register("grey_glass", () -> new BlockItem(BlockInit.GREY_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> GREY_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("grey_glass_pane", () -> new BlockItem(BlockInit.GREY_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> BLACK_GLASS = ModRegistry.ITEM_REGISTRY.register("black_glass", () -> new BlockItem(BlockInit.BLACK_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> BLACK_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("black_glass_pane", () -> new BlockItem(BlockInit.BLACK_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> RED_GLASS = ModRegistry.ITEM_REGISTRY.register("red_glass", () -> new BlockItem(BlockInit.RED_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> RED_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("red_glass_pane", () -> new BlockItem(BlockInit.RED_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> ORANGE_GLASS = ModRegistry.ITEM_REGISTRY.register("orange_glass", () -> new BlockItem(BlockInit.ORANGE_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> ORANGE_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("orange_glass_pane", () -> new BlockItem(BlockInit.ORANGE_GLASS_PANE.get(), standardProperties()));	
	
	public static final RegistryObject<BlockItem> YELLOW_GLASS = ModRegistry.ITEM_REGISTRY.register("yellow_glass", () -> new BlockItem(BlockInit.YELLOW_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> YELLOW_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("yellow_glass_pane", () -> new BlockItem(BlockInit.YELLOW_GLASS_PANE.get(), standardProperties()));	
	
	public static final RegistryObject<BlockItem> LIME_GLASS = ModRegistry.ITEM_REGISTRY.register("lime_glass", () -> new BlockItem(BlockInit.LIME_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIME_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("lime_glass_pane", () -> new BlockItem(BlockInit.LIME_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> GREEN_GLASS = ModRegistry.ITEM_REGISTRY.register("green_glass", () -> new BlockItem(BlockInit.GREEN_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> GREEN_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("green_glass_pane", () -> new BlockItem(BlockInit.GREEN_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> CYAN_GLASS = ModRegistry.ITEM_REGISTRY.register("cyan_glass", () -> new BlockItem(BlockInit.CYAN_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> CYAN_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("cyan_glass_pane", () -> new BlockItem(BlockInit.CYAN_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> LIGHT_BLUE_GLASS = ModRegistry.ITEM_REGISTRY.register("light_blue_glass", () -> new BlockItem(BlockInit.LIGHT_BLUE_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIGHT_BLUE_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("light_blue_glass_pane", () -> new BlockItem(BlockInit.LIGHT_BLUE_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> BLUE_GLASS = ModRegistry.ITEM_REGISTRY.register("blue_glass", () -> new BlockItem(BlockInit.BLUE_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> BLUE_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("blue_glass_pane", () -> new BlockItem(BlockInit.BLUE_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> PURPLE_GLASS = ModRegistry.ITEM_REGISTRY.register("purple_glass", () -> new BlockItem(BlockInit.PURPLE_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> PURPLE_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("purple_glass_pane", () -> new BlockItem(BlockInit.PURPLE_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> MAGENTA_GLASS = ModRegistry.ITEM_REGISTRY.register("magenta_glass", () -> new BlockItem(BlockInit.MAGENTA_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> MAGENTA_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("magenta_glass_pane", () -> new BlockItem(BlockInit.MAGENTA_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> PINK_GLASS = ModRegistry.ITEM_REGISTRY.register("pink_glass", () -> new BlockItem(BlockInit.PINK_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> PINK_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("pink_glass_pane", () -> new BlockItem(BlockInit.PINK_GLASS_PANE.get(), standardProperties()));	
		
	public static final RegistryObject<BlockItem> BROWN_GLASS = ModRegistry.ITEM_REGISTRY.register("brown_glass", () -> new BlockItem(BlockInit.BROWN_GLASS.get(), standardProperties()));
	public static final RegistryObject<BlockItem> BROWN_GLASS_PANE = ModRegistry.ITEM_REGISTRY.register("brown_glass_pane", () -> new BlockItem(BlockInit.BROWN_GLASS_PANE.get(), standardProperties()));	

	//Coloured Blocks
	public static final RegistryObject<BlockItem> RED_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("red_decoration_block", () -> new BlockItem(BlockInit.RED_DECORATION_BLOCK.get(), standardProperties()));
	public static final RegistryObject<BlockItem> ORANGE_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("orange_decoration_block", () -> new BlockItem(BlockInit.ORANGE_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> YELLOW_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("yellow_decoration_block", () -> new BlockItem(BlockInit.YELLOW_DECORATION_BLOCK.get(), standardProperties()));
	public static final RegistryObject<BlockItem> LIME_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("lime_decoration_block", () -> new BlockItem(BlockInit.LIME_DECORATION_BLOCK.get(), standardProperties()));
	public static final RegistryObject<BlockItem> GREEN_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("green_decoration_block", () -> new BlockItem(BlockInit.GREEN_DECORATION_BLOCK.get(), standardProperties()));
	public static final RegistryObject<BlockItem> CYAN_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("cyan_decoration_block", () -> new BlockItem(BlockInit.CYAN_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> BLUE_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("blue_decoration_block", () -> new BlockItem(BlockInit.BLUE_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> LIGHT_BLUE_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("light_blue_decoration_block", () -> new BlockItem(BlockInit.LIGHT_BLUE_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> PURPLE_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("purple_decoration_block", () -> new BlockItem(BlockInit.PURPLE_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> MAGENTA_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("magenta_decoration_block", () -> new BlockItem(BlockInit.MAGENTA_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> PINK_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("pink_decoration_block", () -> new BlockItem(BlockInit.PINK_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> BROWN_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("brown_decoration_block", () -> new BlockItem(BlockInit.BROWN_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> GREY_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("grey_decoration_block", () -> new BlockItem(BlockInit.GREY_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> LIGHT_GREY_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("light_grey_decoration_block", () -> new BlockItem(BlockInit.LIGHT_GREY_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> WHITE_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("white_decoration_block", () -> new BlockItem(BlockInit.WHITE_DECORATION_BLOCK.get(), standardProperties()));	
	public static final RegistryObject<BlockItem> BLACK_DECORATION_BLOCK = ModRegistry.ITEM_REGISTRY.register("black_decoration_block", () -> new BlockItem(BlockInit.BLACK_DECORATION_BLOCK.get(), standardProperties()));
	
	//Thatch
	public static final RegistryObject<BlockItem> THATCH_BLOCK =  ModRegistry.ITEM_REGISTRY.register("thatch_block", () -> new BlockItem(BlockInit.THATCH_BLOCK.get(), standardProperties()));
	
	//Doors
	public static final RegistryObject<BlockItem> OUTDOOR_TOILET_DOOR = ModRegistry.ITEM_REGISTRY.register("outdoor_toilet_door", () -> new BlockItem(BlockInit.OUTDOOR_TOILET_DOOR.get(), standardProperties()));
	public static final RegistryObject<BlockItem> GLASS_SHOP_DOOR = ModRegistry.ITEM_REGISTRY.register("glass_shop_door", () -> new BlockItem(BlockInit.GLASS_SHOP_DOOR.get(), standardProperties()));
	public static final RegistryObject<BlockItem> VISITOR_CENTRE_DOOR = ModRegistry.ITEM_REGISTRY.register("visitor_centre_door", () -> new BlockItem(BlockInit.VISITOR_CENTRE_DOOR.get(), standardProperties()));
	public static final RegistryObject<BlockItem> INNOVATION_CENTRE_DOOR = ModRegistry.ITEM_REGISTRY.register("innovation_centre_door", () -> new BlockItem(BlockInit.INNOVATION_CENTRE_DOOR.get(), standardProperties()));
	public static final RegistryObject<BlockItem> SECURITY_DOOR = ModRegistry.ITEM_REGISTRY.register("security_door", () -> new BlockItem(BlockInit.SECURITY_DOOR.get(), standardProperties()));
	public static final RegistryObject<BlockItem> BACK_DOOR = ModRegistry.ITEM_REGISTRY.register("back_door", () -> new BlockItem(BlockInit.BACK_DOOR.get(), standardProperties()));
	
	//Registry
	
	//Item Registers
	//Standard Properties
	private static Properties standardProperties()
	{
		return new Item.Properties().group(ModItemGroup.TAB);
	}
	
	//Advanced Item Register
	private static RegistryObject<Item> advancedItemRegister(String id, Item item)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> item);
	}
	
	//Simple Item Register
	private static RegistryObject<Item> simpleItemRegister(String id, Item.Properties properties)
	{
		return advancedItemRegister(id, new Item(properties));
	}
	
	//Dinosaur Items Quick Register (They're all the same anyway)
	private static RegistryObject<Item> registerBone(String type) 
	{
		return simpleItemRegister(type + "_bone", standardProperties());
	}
	
	private static RegistryObject<Item> registerDNA(String type) 
	{
		return simpleItemRegister(type + "_dna", standardProperties());
	}
	
	private static RegistryObject<Item> registerEgg(String type) 
	{
		return simpleItemRegister(type + "_egg", standardProperties().maxStackSize(1));
	}
	
	private static RegistryObject<Item> registerSpawn(String id, Item.Properties properties)
	{
		return simpleItemRegister(id + "_spawn", properties);
	}
	
	private static RegistryObject<Item> registerBabyDino(NonNullSupplier<EntityType<?>> entity, String type) 
	{
		return advancedItemRegister(type + "_baby", new ModSpawnItem(entity, standardProperties().maxStackSize(1)));
	}
	
	private static RegistryObject<Item> registerSpawnBucket(String id, NonNullSupplier<EntityType<?>> entity, Item.Properties properties)
	{
		return advancedItemRegister(id + "_spawn_bucket", new ModFishBucketItem(entity, Fluids.WATER, properties));
	}
	
	private static RegistryObject<Item> registerMeat(String type, Food food) 
	{
		return simpleItemRegister("raw_" + type + "_meat", standardProperties().food(food));
	}
	
	private static RegistryObject<Item> registerFishMeat(String type, Food food) 
	{
		return simpleItemRegister(type, standardProperties().food(food));
	}
	
	private static RegistryObject<Item> registerCookedMeat(String type, Food food) 
	{
		return simpleItemRegister("cooked_" + type + "_meat", standardProperties().food(food));
	}
	
	private static RegistryObject<Item> registerCookedFishMeat(String type, Food food) 
	{
		return simpleItemRegister("cooked_" + type, standardProperties().food(food));
	}
	
	private static RegistryObject<Item> registerSpawnEgg(String id, NonNullSupplier<EntityType<?>> entity, int primaryColour, int secondaryColour, Item.Properties properties)
	{
		return advancedItemRegister(id + "_spawn_egg", new ModSpawnEggItem(entity, primaryColour, secondaryColour, properties));
	}
	
	private static RegistryObject<Item> registerEntityBucket(String id, NonNullSupplier<EntityType<?>> entity, Fluid fluid, Item.Properties properties)
	{
		return advancedItemRegister(id + "_bucket", new ModFishBucketItem(entity, fluid, properties));
	}
	
	public static void initItems() { }
}