 package lostworlds.core.init; 

import lostworlds.common.entities.ModBoatEntity.ModBoatType;
import lostworlds.common.items.DiscItem;
import lostworlds.common.items.FieldGuideItem;
import lostworlds.common.items.FoodSeedsItem;
import lostworlds.common.items.GreatAukEggItem;
import lostworlds.common.items.ModBlockItem;
import lostworlds.common.items.ModBoatItem;
import lostworlds.common.items.ModFishBucketItem;
import lostworlds.common.items.ModSignItem;
import lostworlds.common.items.ModSlabBurnableItem;
import lostworlds.common.items.ModSpawnBucketItem;
import lostworlds.common.items.ModSpawnEggItem;
import lostworlds.common.items.ModWoodBurnableItem;
import lostworlds.common.items.WetPaperItem;
import lostworlds.common.items.timebooks.JurassicTimeBook;
import lostworlds.common.items.timebooks.PermianTimeBook;
import lostworlds.common.tools.BrushItem;
import lostworlds.core.ModItemGroups;
import lostworlds.core.util.ModUtil;
import lostworlds.core.util.enums.ModItemTeir;
import lostworlds.core.util.registry.ModRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
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
	public static final RegistryObject<Item> LEATHER_BRUSH = brushItemRegister("leather_brush", ModItemTeir.LEATHER_BRUSH);
	public static final RegistryObject<Item> IRON_BRUSH = brushItemRegister("iron_brush", ModItemTeir.IRON_BRUSH);
	public static final RegistryObject<Item> GOLD_BRUSH = brushItemRegister("gold_brush", ModItemTeir.GOLD_BRUSH);
	public static final RegistryObject<Item> DIAMOND_BRUSH = brushItemRegister("diamond_brush", ModItemTeir.DIAMOND_BRUSH);
	
	//Plaster
	public static final RegistryObject<Item> WET_PAPER = itemRegister("wet_paper", new WetPaperItem(properties().tab(ModItemGroups.ITEMS_TAB)));

	//Field Guide
	public static final RegistryObject<Item> FEILD_GUIDE = itemRegister("field_guide", new FieldGuideItem(properties().stacksTo(1).tab(ModItemGroups.ITEMS_TAB)));
	
	//Syringe
	public static final RegistryObject<Item> EMPTY_SYRINGE = plainItemRegister("empty_syringe", properties().stacksTo(1).tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> BLOOD_SYRINGE = plainItemRegister("blood_syringe", properties().stacksTo(1).tab(ModItemGroups.ITEMS_TAB));
	
	//Viles
	public static final RegistryObject<Item> EMPTY_VILE = plainItemRegister("empty_vile", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> BLOOD_VILE = plainItemRegister("blood_vile", properties().tab(ModItemGroups.ITEMS_TAB));

	//Time Books
	public static final RegistryObject<Item> PERMIAN_TIME_BOOK = itemRegister("permian_time_book", new PermianTimeBook(properties().stacksTo(1).rarity(Rarity.RARE).tab(ModItemGroups.ITEMS_TAB)));
	public static final RegistryObject<Item> JURASSIC_TIME_BOOK = itemRegister("jurassic_time_book", new JurassicTimeBook(properties().stacksTo(1).rarity(Rarity.RARE).tab(ModItemGroups.ITEMS_TAB)));
	
	//Time Lord's Staff
	public static final RegistryObject<Item> TIME_LORDS_STAFF = plainItemRegister("time_lords_staff", new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	
	//Leaf Litter
	public static final RegistryObject<Item> FERN_LITTER = plainItemRegister("fern_litter", properties().food(FoodInit.FERN_LITTER).stacksTo(16).tab(ModItemGroups.FOOD_TAB));
	public static final RegistryObject<Item> COOKED_FERN_LITTER = plainItemRegister("cooked_fern_litter", properties().food(FoodInit.BOILED_FERN_LITTER).stacksTo(16).tab(ModItemGroups.FOOD_TAB));
	
	public static final RegistryObject<Item> CYCAD_SEEDS = itemRegister("cycad_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	public static final RegistryObject<Item> OSMUNDA_SEEDS = itemRegister("osmunda_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	public static final RegistryObject<Item> DUISBERGIA_SEEDS = itemRegister("duisbergia_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	public static final RegistryObject<Item> CEPHALOTAXUS_SEEDS = itemRegister("cephalotaxus_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	public static final RegistryObject<Item> LYCOPHYTA_SEEDS = itemRegister("lycophyta_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	public static final RegistryObject<Item> DILLHOFFIA_SEEDS = itemRegister("dillhoffia_seeds", new FoodSeedsItem(properties().food(FoodInit.SEED).stacksTo(16).tab(ModItemGroups.FOOD_TAB)));
	
	public static final RegistryObject<Item> PALEO_SALAD = plainItemRegister("paleo_salad", properties().food(FoodInit.SEED).stacksTo(8).tab(ModItemGroups.FOOD_TAB));

	//Procompsognathus
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_DNA = registerDNAItem("procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_DNA_DISC = registerDNADiscItem("procompsognathus");
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_MEAT = registerRawMeat("procompsognathus", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_COOKED_MEAT = registerCookedMeat("procompsognathus", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PROCOMPSOGNATHUS_SPAWN_EGG = registerFishSpawnItemEgg("procompsognathus", () -> EntityInit.PROCOMPSOGNATHUS_ENTITY.get(), 0x125611, 0x143025);
	
	//Palaeoniscum
	public static final RegistryObject<Item> PALAEONISCUM_DNA = registerDNAItem("palaeoniscum");
	public static final RegistryObject<Item> PALAEONISCUM_DNA_DISC = registerDNADiscItem("palaeoniscum");
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN = registerFishSpawnItem("palaeoniscum");
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN_BUCKET = registerSpawnItemBucket("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get());
	public static final RegistryObject<Item> PALAEONISCUM_MEAT = registerRawFishMeat("palaeoniscum", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PALAEONISCUM_COOKED_MEAT = registerCookedFishMeat("palaeoniscum", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PALAEONISCUM_SPAWN_EGG = registerFishSpawnItemEgg("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get(), 0x1e2f4f, 0x2b1838);
	public static final RegistryObject<Item> PALAEONISCUM_BUCKET = registerEntityBucket("palaeoniscum", () -> EntityInit.PALAEONISCUM_ENTITY.get());
	
	//Nautilus
	public static final RegistryObject<Item> NAUTILUS_DNA = registerDNAItem("nautilus");
	public static final RegistryObject<Item> NAUTILUS_DNA_DISC = registerDNADiscItem("nautilus");
	public static final RegistryObject<Item> NAUTILUS_SPAWN = registerFishSpawnItem("nautilus");
	public static final RegistryObject<Item> NAUTILUS_SPAWN_BUCKET = registerSpawnItemBucket("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get());
	public static final RegistryObject<Item> NAUTILUS_TENTICAL = itemRegister("nautilus_tentical", new Item(properties().food(FoodInit.RAW_MEDIUM_DINOSAUR_MEAT)));
	public static final RegistryObject<Item> COOKED_NAUTILUS_TENTICAL = itemRegister("cooked_nautilus_tentical", new Item(properties().food(FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT)));
	public static final RegistryObject<Item> NAUTILUS_SPAWN_EGG = registerFishSpawnItemEgg("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get(), 0xd8cecd, 0x4f4841);
	public static final RegistryObject<Item> NAUTILUS_BUCKET = registerEntityBucket("nautilus", () -> EntityInit.NAUTILUS_ENTITY.get());
		
	//Rhinesuchus
	public static final RegistryObject<Item> RHINESUCHUS_DNA = registerDNAItem("rhinesuchus");
	public static final RegistryObject<Item> RHINESUCHUS_DNA_DISC = registerDNADiscItem("rhinesuchus");
	public static final RegistryObject<Item> RHINESUCHUS_SPAWN = registerFishSpawnItem("rhinesuchus");
	public static final RegistryObject<Item> RHINESUCHUS_SPAWN_BUCKET = registerSpawnBucketItem("rhinesuchus", () -> EntityInit.RHINESUCHUS_ENTITY.get());
	public static final RegistryObject<Item> RHINESUCHUS_MEAT = registerRawMeat("rhinesuchus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> RHINESUCHUS_COOKED_MEAT = registerCookedMeat("rhinesuchus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> RHINESUCHUS_SPAWN_EGG = registerFishSpawnItemEgg("rhinesuchus", () -> EntityInit.RHINESUCHUS_ENTITY.get(), 0xceaa7b, 0x1c1308);
	
	//Dimetrodon
	public static final RegistryObject<Item> DIMETRODON_DNA = registerDNAItem("dimetrodon");
	public static final RegistryObject<Item> DIMETRODON_DNA_DISC = registerDNADiscItem("dimetrodon");
	public static final RegistryObject<Item> DIMETRODON_MEAT = registerRawMeat("dimetrodon", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> DIMETRODON_COOKED_MEAT = registerCookedMeat("dimetrodon", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> DIMETRODON_SPAWN_EGG = registerFishSpawnItemEgg("dimetrodon", () -> EntityInit.DIMETRODON_ENTITY.get(), 0x378ca8, 0x152875);
	
	//Edaphosaurus
	public static final RegistryObject<Item> EDAPHOSAURUS_DNA = registerDNAItem("edaphosaurus");
	public static final RegistryObject<Item> EDAPHOSAURUS_DNA_DISC = registerDNADiscItem("edaphosaurus");
	public static final RegistryObject<Item> EDAPHOSAURUS_MEAT = registerRawMeat("edaphosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> EDAPHOSAURUS_COOKED_MEAT = registerCookedMeat("edaphosaurus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> EDAPHOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("edaphosaurus", () -> EntityInit.EDAPHOSAURUS_ENTITY.get(), 0x96af42, 0x2a3016);

	//Gorgonops
	public static final RegistryObject<Item> GORGONOPS_DNA = registerDNAItem("gorgonops");
	public static final RegistryObject<Item> GORGONOPS_DNA_DISC = registerDNADiscItem("gorgonops");
	public static final RegistryObject<Item> GORGONOPS_MEAT = registerRawMeat("gorgonops", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GORGONOPS_COOKED_MEAT = registerCookedMeat("gorgonops", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GORGONOPS_SPAWN_EGG = registerFishSpawnItemEgg("gorgonops", () -> EntityInit.GORGONOPS_ENTITY.get(), 0x967d46, 0x4f2f1a);

	//Carnotaurus
	public static final RegistryObject<Item> CARNOTAURUS_DNA = registerDNAItem("carnotaurus");
	public static final RegistryObject<Item> CARNOTAURUS_DNA_DISC = registerDNADiscItem("carnotaurus");
	public static final RegistryObject<Item> CARNOTAURUS_MEAT = registerRawMeat("carnotaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CARNOTAURUS_COOKED_MEAT = registerCookedMeat("carnotaurus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CARNOTAURUS_SPAWN_EGG = registerFishSpawnItemEgg("carnotaurus", () -> EntityInit.CARNOTAURUS_ENTITY.get(), 0x682324, 0x171c06);
	//Tyrannosaurus
	public static final RegistryObject<Item> TYRANNOSAURUS_DNA = registerDNAItem("tyrannosaurus");
	public static final RegistryObject<Item> TYRANNOSAURUS_DNA_DISC = registerDNADiscItem("tyrannosaurus");
	public static final RegistryObject<Item> TYRANNOSAURUS_MEAT = registerRawMeat("tyrannosaurus", FoodInit.RAW_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> TYRANNOSAURUS_COOKED_MEAT = registerCookedMeat("tyrannosaurus", FoodInit.COOKED_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> TYRANNOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("tyrannosaurus", () -> EntityInit.TYRANNOSAURUS_ENTITY.get(), 0x92b541, 0x125134);

	//Allosaurus
	public static final RegistryObject<Item> ALLOSAURUS_DNA = registerDNAItem("allosaurus");
	public static final RegistryObject<Item> ALLOSAURUS_DNA_DISC = registerDNADiscItem("allosaurus");
	public static final RegistryObject<Item> ALLOSAURUS_MEAT = registerRawMeat("allosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> ALLOSAURUS_COOKED_MEAT = registerCookedMeat("allosaurus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> ALLOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("allosaurus", () -> EntityInit.ALLOSAURUS_ENTITY.get(), 0x687c35, 0x26300c);
	
	//Giganotosaurus
	public static final RegistryObject<Item> GIGANOTOSAURUS_DNA = registerDNAItem("giganotosaurus");
	public static final RegistryObject<Item> GIGANOTOSAURUS_DNA_DISC = registerDNADiscItem("giganotosaurus");
	public static final RegistryObject<Item> GIGANOTOSAURUS_MEAT = registerRawMeat("giganotosaurus", FoodInit.RAW_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GIGANOTOSAURUS_COOKED_MEAT = registerCookedMeat("giganotosaurus", FoodInit.COOKED_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GIGANOTOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("giganotosaurus", () -> EntityInit.GIGANOTOSAURUS_ENTITY.get(), 0xd8a734, 0x4f391c);
	
	//Suchomimus
	public static final RegistryObject<Item> SUCHOMIMUS_DNA = registerDNAItem("suchomimus");
	public static final RegistryObject<Item> SUCHOMIMUS_DNA_DISC = registerDNADiscItem("suchomimus");
	public static final RegistryObject<Item> SUCHOMIMUS_MEAT = registerRawMeat("suchomimus", FoodInit.RAW_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> SUCHOMIMUS_COOKED_MEAT = registerCookedMeat("suchomimus", FoodInit.COOKED_LARGE_DINOSAUR_MEAT);
	public static final RegistryObject<Item> SUCHOMIMUS_SPAWN_EGG = registerFishSpawnItemEgg("suchomimus", () -> EntityInit.SUCHOMIMUS_ENTITY.get(), 0x6a94c1, 0x110f54);
	
	//Tetraceratops
	public static final RegistryObject<Item> TETRACERATOPS_DNA = registerDNAItem("tetraceratops");
	public static final RegistryObject<Item> TETRACERATOPS_DNA_DISC = registerDNADiscItem("tetraceratops");
	public static final RegistryObject<Item> TETRACERATOPS_MEAT = registerRawMeat("tetraceratops", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> TETRACERATOPS_COOKED_MEAT = registerCookedMeat("tetraceratops", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> TETRACERATOPS_SPAWN_EGG = registerFishSpawnItemEgg("tetraceratops", () -> EntityInit.TETRACERATOPS_ENTITY.get(), 0x873624, 0x543b11);
	//Great Auk
	public static final RegistryObject<Item> GREAT_AUK_DNA = registerDNAItem("great_auk");
	public static final RegistryObject<Item> GREAT_AUK_DNA_DISC = registerDNADiscItem("great_auk");
	public static final RegistryObject<Item> GREAT_AUK_MEAT = registerRawMeat("great_auk", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GREAT_AUK_COOKED_MEAT = registerCookedMeat("great_auk", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> GREAT_AUK_EGG = itemRegister("great_auk_egg", new GreatAukEggItem(properties().stacksTo(16)));
	public static final RegistryObject<Item> GREAT_AUK_SPAWN_EGG = registerFishSpawnItemEgg("great_auk", () -> EntityInit.GREAT_AUK_ENTITY.get(), 0x000000, 0xFFFFFF);

	//Ouranosaurus
	public static final RegistryObject<Item> OURANOSAURUS_DNA = registerDNAItem("ouranosaurus");
	public static final RegistryObject<Item> OURANOSAURUS_DNA_DISC = registerDNADiscItem("ouranosaurus");
	public static final RegistryObject<Item> OURANOSAURUS_MEAT = registerRawMeat("ouranosaurus", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OURANOSAURUS_COOKED_MEAT = registerCookedMeat("ouranosaurus", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OURANOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("ouranosaurus", () -> EntityInit.OURANOSAURUS_ENTITY.get(), 0x2b3187, 0x1da6e5);

	//Fukuvenator
	public static final RegistryObject<Item> FUKUVENATOR_DNA = registerDNAItem("fukuivenator");
	public static final RegistryObject<Item> FUKUVENATOR_DNA_DISC = registerDNADiscItem("fukuivenator");
	public static final RegistryObject<Item> FUKUVENATOR_MEAT = registerRawMeat("fukuivenator", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> FUKUVENATOR_COOKED_MEAT = registerCookedMeat("fukuivenator", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> FUKUVENATOR_SPAWN_EGG = registerFishSpawnItemEgg("fukuivenator", () -> EntityInit.FUKUIVENATOR_ENTITY.get(), 0xbb6ad8, 0x44284f);
	
	//Psittacosaurus
	public static final RegistryObject<Item> PSITTACOSAURUS_DNA = registerDNAItem("psittacosaurus");
	public static final RegistryObject<Item> PSITTACOSAURUS_DNA_DISC = registerDNADiscItem("psittacosaurus");
	public static final RegistryObject<Item> PSITTACOSAURUS_MEAT = registerRawMeat("psittacosaurus", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PSITTACOSAURUS_COOKED_MEAT = registerCookedMeat("psittacosaurus", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PSITTACOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("psittacosaurus", () -> EntityInit.PSITTACOSAURUS_ENTITY.get(), 0x6d4d20, 0x434c16);
	
	//Cryolophosaurus
	public static final RegistryObject<Item> CRYOLOPHOSAURUS_DNA = registerDNAItem("cryolophosaurus");
	public static final RegistryObject<Item> CRYOLOPHOSAURUS_DNA_DISC = registerDNADiscItem("cryolophosaurus");
	public static final RegistryObject<Item> CRYOLOPHOSAURUS_MEAT = registerRawMeat("cryolophosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CRYOLOPHOSAURUS_COOKED_MEAT = registerCookedMeat("cryolophosaurus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CRYOLOPHOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("cryolophosaurus", () -> EntityInit.CRYOLOPHOSAURUS_ENTITY.get(), 0xcec21e, 0xce791e);

	//Ostromia
	public static final RegistryObject<Item> OSTROMIA_DNA = registerDNAItem("ostromia");
	public static final RegistryObject<Item> OSTROMIA_DNA_DISC = registerDNADiscItem("ostromia");
	public static final RegistryObject<Item> OSTROMIA_MEAT = registerRawMeat("ostromia", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OSTROMIA_COOKED_MEAT = registerCookedMeat("ostromia", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OSTROMIA_SPAWN_EGG = registerFishSpawnItemEgg("ostromia", () -> EntityInit.OSTROMIA_ENTITY.get(), 0x3c8370, 0x1f3970);
	
	//Protosuchus
	public static final RegistryObject<Item> PROTOSUCHUS_DNA = registerDNAItem("protosuchus");
	public static final RegistryObject<Item> PROTOSUCHUS_DNA_DISC = registerDNADiscItem("protosuchus");
	public static final RegistryObject<Item> PROTOSUCHUS_MEAT = registerRawMeat("protosuchus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PROTOSUCHUS_COOKED_MEAT = registerCookedMeat("protosuchus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> PROTOSUCHUS_SPAWN_EGG = registerFishSpawnItemEgg("protosuchus", () -> EntityInit.PROTOSUCHUS_ENTITY.get(), 0x773617, 0x470b0a);
	
	//Diictodon
	public static final RegistryObject<Item> DIICTODON_DNA = registerDNAItem("diictodon");
	public static final RegistryObject<Item> DIICTODON_DNA_DISC = registerDNADiscItem("diictodon");
	public static final RegistryObject<Item> DIICTODON_MEAT = registerRawMeat("diictodon", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> DIICTODON_COOKED_MEAT = registerCookedMeat("diictodon", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> DIICTODON_SPAWN_EGG = registerFishSpawnItemEgg("diictodon", () -> EntityInit.DIICTODON_ENTITY.get(), 0x8e7022, 0x7a4334);
	
	//Kentrosaurus
	public static final RegistryObject<Item> KENTROSAURUS_DNA = registerDNAItem("kentrosaurus");
	public static final RegistryObject<Item> KENTROSAURUS_DNA_DISC = registerDNADiscItem("kentrosaurus");
	public static final RegistryObject<Item> KENTROSAURUS_MEAT = registerRawMeat("kentrosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> KENTROSAURUS_COOKED_MEAT = registerCookedMeat("kentrosaurus", FoodInit.COOKED_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> KENTROSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("kentrosaurus", () -> EntityInit.KENTROSAURUS_ENTITY.get(), 0xd99760, 0x612c00);
	
	//Chilesaurus
	public static final RegistryObject<Item> CHILESAURUS_DNA = registerDNAItem("chilesaurus");
	public static final RegistryObject<Item> CHILESAURUS_DNA_DISC = registerDNADiscItem("chilesaurus");
	public static final RegistryObject<Item> CHILESAURUS_MEAT = registerRawMeat("chilesaurus", FoodInit.RAW_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CHILESAURUS_COOKED_MEAT = registerCookedMeat("chilesaurus", FoodInit.COOKED_SMALL_DINOSAUR_MEAT);
	public static final RegistryObject<Item> CHILESAURUS_SPAWN_EGG = registerFishSpawnItemEgg("chilesaurus", () -> EntityInit.CHILESAURUS_ENTITY.get(), 0xb08533, 0x283c3f);
	
	/*//Ophthalmosaurus
	public static final RegistryObject<Item> OPHTHALMOSAURUS_DNA = registerDNAItem("ophthalmosaurus");
	public static final RegistryObject<Item> OPHTHALMOSAURUS_DNA_DISC = registerDNADiscItem("ophthalmosaurus");
	public static final RegistryObject<Item> OPHTHALMOSAURUS_MEAT = registerRawMeat("ophthalmosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OPHTHALMOSAURUS_COOKED_MEAT = registerCookedMeat("ophthalmosaurus", FoodInit.RAW_MEDIUM_DINOSAUR_MEAT);
	public static final RegistryObject<Item> OPHTHALMOSAURUS_SPAWN_EGG = registerFishSpawnItemEgg("ophthalmosaurus", () -> EntityInit.OPHTHALMOSAURUS_ENTITY.get(), 0x75767c, 0x2e3948);*/
	
	//Mud Ball
	public static final RegistryObject<Item> MUD_BALL = plainItemRegister("mud_ball", properties().tab(ModItemGroups.ITEMS_TAB));
	
	//Copper	
	public static final RegistryObject<Item> COPPER_INGOT = plainItemRegister("copper_ingot", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> COPPER_NUGGET = plainItemRegister("copper_nugget", properties().tab(ModItemGroups.ITEMS_TAB));
	
	//Electronics
	public static final RegistryObject<Item> COPPER_WIRE = plainItemRegister("copper_wire", properties().tab(ModItemGroups.ITEMS_TAB));	
	public static final RegistryObject<Item> COMPUTER_FAN = plainItemRegister("computer_fan", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> COMPUTER_SCREEN = plainItemRegister("computer_screen", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> COMPUTER_FRAME = plainItemRegister("computer_frame", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> COMPUTER_STORAGE_PORT = plainItemRegister("computer_storage_port", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> MOTHERBOARD = plainItemRegister("motherboard", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> CPU = plainItemRegister("cpu", properties().tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> RAM = plainItemRegister("ram", properties().tab(ModItemGroups.ITEMS_TAB));	
		
	//Storage
	public static final RegistryObject<Item> STORAGE_DISC = itemRegister("storage_disc", new DiscItem("storage_disc", properties().stacksTo(1).tab(ModItemGroups.ITEMS_TAB)));
		
	//Crystal Scarab	
	public static final RegistryObject<Item> BROKEN_CRYSTAL_SCARAB_GEM = plainItemRegister("broken_crystal_scarab_gem", properties().rarity(Rarity.RARE).tab(ModItemGroups.ITEMS_TAB));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_GEM = plainItemRegister("crystal_scarab_gem", properties().rarity(Rarity.EPIC).tab(ModItemGroups.ITEMS_TAB));
	
	//Crystal Scarab Tools
	public static final RegistryObject<Item> CRYSTAL_SCARAB_SWORD = itemRegister("crystal_scarab_sword", new SwordItem(ModItemTeir.SCARAB, 50, -2.4F, properties().rarity(Rarity.EPIC).tab(ModItemGroups.TOOLS_TAB)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_SHOVEL = itemRegister("crystal_scarab_shovel", new ShovelItem(ModItemTeir.SCARAB, 12.0F, -3.0F, properties().rarity(Rarity.EPIC).tab(ModItemGroups.TOOLS_TAB)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_PICKAXE = itemRegister("crystal_scarab_pickaxe", new PickaxeItem(ModItemTeir.SCARAB, 32, -2.8F, properties().rarity(Rarity.EPIC).tab(ModItemGroups.TOOLS_TAB)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_AXE = itemRegister("crystal_scarab_axe", new AxeItem(ModItemTeir.SCARAB, 70.0F, -3.2F, properties().rarity(Rarity.EPIC).tab(ModItemGroups.TOOLS_TAB)));
	public static final RegistryObject<Item> CRYSTAL_SCARAB_HOE = itemRegister("crystal_scarab_hoe", new HoeItem(ModItemTeir.SCARAB, 10, -3.0F, properties().rarity(Rarity.EPIC).tab(ModItemGroups.TOOLS_TAB)));
		
	//Blocks
	//Ore
	public static final RegistryObject<Item> COPPER_ORE = registerBlockItem("copper_ore", () -> BlockInit.COPPER_ORE.get(), ModItemGroups.ITEMS_TAB);
	
	//Fossil
	public static final RegistryObject<Item> STONE_FOSSIL = registerFossilBlockItem("stone_fossil", () -> BlockInit.STONE_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_STONE_FOSSIL = registerFossilBlockItem("exposed_stone_fossil", () -> BlockInit.EXPOSED_STONE_FOSSIL.get());

	public static final RegistryObject<Item> SANDSTONE_FOSSIL = registerFossilBlockItem("sandstone_fossil", () -> BlockInit.SANDSTONE_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_SANDSTONE_FOSSIL = registerFossilBlockItem("exposed_sandstone_fossil", () -> BlockInit.EXPOSED_SANDSTONE_FOSSIL.get());
	
	public static final RegistryObject<Item> RED_SANDSTONE_FOSSIL = registerFossilBlockItem("red_sandstone_fossil", () -> BlockInit.RED_SANDSTONE_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_RED_SANDSTONE_FOSSIL = registerFossilBlockItem("exposed_red_sandstone_fossil", () -> BlockInit.EXPOSED_RED_SANDSTONE_FOSSIL.get());

	public static final RegistryObject<Item> TERRACOTTA_FOSSIL = registerFossilBlockItem("terracotta_fossil", () -> BlockInit.TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_terracotta_fossil", () -> BlockInit.EXPOSED_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> RED_TERRACOTTA_FOSSIL = registerFossilBlockItem("red_terracotta_fossil", () -> BlockInit.RED_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_RED_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_red_terracotta_fossil", () -> BlockInit.EXPOSED_RED_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> ORANGE_TERRACOTTA_FOSSIL = registerFossilBlockItem("orange_terracotta_fossil", () -> BlockInit.ORANGE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_ORANGE_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_orange_terracotta_fossil", () -> BlockInit.EXPOSED_ORANGE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> YELLOW_TERRACOTTA_FOSSIL = registerFossilBlockItem("yellow_terracotta_fossil", () -> BlockInit.YELLOW_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_YELLOW_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_yellow_terracotta_fossil", () -> BlockInit.EXPOSED_YELLOW_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> LIME_TERRACOTTA_FOSSIL = registerFossilBlockItem("lime_terracotta_fossil", () -> BlockInit.LIME_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_LIME_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_lime_terracotta_fossil", () -> BlockInit.EXPOSED_LIME_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> GREEN_TERRACOTTA_FOSSIL = registerFossilBlockItem("green_terracotta_fossil", () -> BlockInit.GREEN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_GREEN_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_green_terracotta_fossil", () -> BlockInit.EXPOSED_GREEN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> CYAN_TERRACOTTA_FOSSIL = registerFossilBlockItem("cyan_terracotta_fossil", () -> BlockInit.CYAN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_CYAN_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_cyan_terracotta_fossil", () -> BlockInit.EXPOSED_CYAN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_FOSSIL = registerFossilBlockItem("light_blue_terracotta_fossil", () -> BlockInit.LIGHT_BLUE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_LIGHT_BLUE_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_light_blue_terracotta_fossil", () -> BlockInit.EXPOSED_LIGHT_BLUE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> BLUE_TERRACOTTA_FOSSIL = registerFossilBlockItem("blue_terracotta_fossil", () -> BlockInit.BLUE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_BLUE_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_blue_terracotta_fossil", () -> BlockInit.EXPOSED_BLUE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> MAGENTA_TERRACOTTA_FOSSIL = registerFossilBlockItem("magenta_terracotta_fossil", () -> BlockInit.MAGENTA_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_MAGENTA_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_magenta_terracotta_fossil", () -> BlockInit.EXPOSED_MAGENTA_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> PURPLE_TERRACOTTA_FOSSIL = registerFossilBlockItem("purple_terracotta_fossil", () -> BlockInit.PURPLE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_PURPLE_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_purple_terracotta_fossil", () -> BlockInit.EXPOSED_PURPLE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> PINK_TERRACOTTA_FOSSIL = registerFossilBlockItem("pink_terracotta_fossil", () -> BlockInit.PINK_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_PINK_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_pink_terracotta_fossil", () -> BlockInit.EXPOSED_PINK_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> BROWN_TERRACOTTA_FOSSIL = registerFossilBlockItem("brown_terracotta_fossil", () -> BlockInit.BROWN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_BROWN_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_brown_terracotta_fossil", () -> BlockInit.EXPOSED_BROWN_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> BLACK_TERRACOTTA_FOSSIL = registerFossilBlockItem("black_terracotta_fossil", () -> BlockInit.BLACK_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_BLACK_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_black_terracotta_fossil", () -> BlockInit.EXPOSED_BLACK_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> GREY_TERRACOTTA_FOSSIL = registerFossilBlockItem("grey_terracotta_fossil", () -> BlockInit.GREY_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_GREY_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_grey_terracotta_fossil", () -> BlockInit.EXPOSED_GREY_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> LIGHT_GREY_TERRACOTTA_FOSSIL = registerFossilBlockItem("light_grey_terracotta_fossil", () -> BlockInit.LIGHT_GREY_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_LIGHT_GREY_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_light_grey_terracotta_fossil", () -> BlockInit.EXPOSED_LIGHT_GREY_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> WHITE_TERRACOTTA_FOSSIL = registerFossilBlockItem("white_terracotta_fossil", () -> BlockInit.WHITE_TERRACOTTA_FOSSIL.get());
	public static final RegistryObject<Item> EXPOSED_WHITE_TERRACOTTA_FOSSIL = registerFossilBlockItem("exposed_white_terracotta_fossil", () -> BlockInit.EXPOSED_WHITE_TERRACOTTA_FOSSIL.get());
	
	public static final RegistryObject<Item> PLASTERED_FOSSIL = registerFossilBlockItem("plastered_fossil", () -> BlockInit.PLASTERED_FOSSIL.get());

	//Fossil Processing
	//public static final RegistryObject<Item> FOSSIL_CLEANER = registerMachinesBlockItem("fossil_cleaner", () -> BlockInit.FOSSIL_CLEANER.get());	
	
	public static final RegistryObject<Item> POWER_SUPPLY_BLOCK = registerMachinesBlockItem("power_supply_block", () -> BlockInit.POWER_SUPPLY_BLOCK.get());

	//Mud
	public static final RegistryObject<Item> MUD = registerNatureBlockItem("mud", () -> BlockInit.MUD.get());

	//Nesting Block
	public static final RegistryObject<Item> NESTING_BLOCK = registerNatureBlockItem("nesting_block", () -> BlockInit.NESTING_BLOCK.get());

	//Time Machine
	public static final RegistryObject<Item> TIME_MACHINE = registerMachinesBlockItem("time_machine", () -> BlockInit.TIME_MACHINE.get());
	
	//Museum Stuff
	public static final RegistryObject<Item> ARCHAEOLOGY_TABLE = registerMachinesBlockItem("archaeology_table", () -> BlockInit.ARCHAEOLOGY_TABLE.get());
	//Volcanic Stuff
	public static final RegistryObject<Item> VOLCANIC_ROCK = registerDecorativeBlockItem("volcanic_rock", () -> BlockInit.VOLCANIC_ROCK.get());	
	public static final RegistryObject<Item> VOLCANIC_ROCK_STAIRS = registerDecorativeBlockItem("volcanic_rock_stairs", () -> BlockInit.VOLCANIC_ROCK_STAIRS.get());	
	public static final RegistryObject<Item> VOLCANIC_ROCK_SLAB = registerDecorativeBlockItem("volcanic_rock_slab", () -> BlockInit.VOLCANIC_ROCK_SLAB.get());	
	public static final RegistryObject<Item> VOLCANIC_ROCK_WALL = registerDecorativeBlockItem("volcanic_rock_wall", () -> BlockInit.VOLCANIC_ROCK_WALL.get());	
	
	public static final RegistryObject<Item> POLISHED_VOLCANIC_ROCK = registerDecorativeBlockItem("polished_volcanic_rock", () -> BlockInit.POLISHED_VOLCANIC_ROCK.get());	
	public static final RegistryObject<Item> POLISHED_VOLCANIC_ROCK_STAIRS = registerDecorativeBlockItem("polished_volcanic_rock_stairs", () -> BlockInit.POLISHED_VOLCANIC_ROCK_STAIRS.get());	
	public static final RegistryObject<Item> POLISHED_VOLCANIC_ROCK_SLAB = registerDecorativeBlockItem("polished_volcanic_rock_slab", () -> BlockInit.POLISHED_VOLCANIC_ROCK_SLAB.get());	

	public static final RegistryObject<Item> VOLCANIC_ASH = registerDecorativeBlockItem("volcanic_ash", () -> BlockInit.VOLCANIC_ASH.get());

	//Tunnel
	public static final RegistryObject<Item> DIICTODON_BURROW = registerNatureBlockItem("diictodon_burrow", () -> BlockInit.DIICTODON_BURROW.get());
	public static final RegistryObject<Item> TUNNELED_SOIL = registerNatureBlockItem("tunneled_soil", () -> BlockInit.TUNNELED_SOIL.get());

	//Mossy Dirt
	public static final RegistryObject<Item> MOSSY_DIRT = registerDecorativeBlockItem("mossy_dirt", () -> BlockInit.MOSSY_DIRT.get());
	
	//Permian
	//Sand
	public static final RegistryObject<Item> PERMIAN_SAND = registerDecorativeBlockItem("permian_sand", () -> BlockInit.PERMIAN_SAND.get());

	//Stone
	public static final RegistryObject<Item> PERMIAN_STONE = registerDecorativeBlockItem("permian_stone", () -> BlockInit.PERMIAN_STONE.get());
	public static final RegistryObject<Item> PERMIAN_STONE_STAIRS = registerDecorativeBlockItem("permian_stone_stairs", () -> BlockInit.PERMIAN_STONE_STAIRS.get());
	public static final RegistryObject<Item> PERMIAN_STONE_SLAB = registerDecorativeBlockItem("permian_stone_slab", () -> BlockInit.PERMIAN_STONE_SLAB.get());

	public static final RegistryObject<Item> PERMIAN_COPPER_ORE = registerDecorativeBlockItem("permian_copper_ore", () -> BlockInit.PERMIAN_COPPER_ORE.get());
	public static final RegistryObject<Item> PERMIAN_GOLD_ORE = registerDecorativeBlockItem("permian_gold_ore", () -> BlockInit.PERMIAN_GOLD_ORE.get());
	public static final RegistryObject<Item> PERMIAN_IRON_ORE = registerDecorativeBlockItem("permian_iron_ore", () -> BlockInit.PERMIAN_IRON_ORE.get());
	public static final RegistryObject<Item> PERMIAN_COAL_ORE = registerDecorativeBlockItem("permian_coal_ore", () -> BlockInit.PERMIAN_COAL_ORE.get());
	public static final RegistryObject<Item> PERMIAN_LAPIS_ORE = registerDecorativeBlockItem("permian_lapis_ore", () -> BlockInit.PERMIAN_LAPIS_ORE.get());
	public static final RegistryObject<Item> PERMIAN_DIAMOND_ORE = registerDecorativeBlockItem("permian_diamond_ore", () -> BlockInit.PERMIAN_DIAMOND_ORE.get());
	public static final RegistryObject<Item> PERMIAN_REDSTONE_ORE = registerDecorativeBlockItem("permian_redstone_ore", () -> BlockInit.PERMIAN_REDSTONE_ORE.get());
	public static final RegistryObject<Item> PERMIAN_EMERALD_ORE = registerDecorativeBlockItem("permian_emerald_ore", () -> BlockInit.PERMIAN_EMERALD_ORE.get());

	public static final RegistryObject<Item> PERMIAN_COBBLESTONE = registerDecorativeBlockItem("permian_cobblestone", () -> BlockInit.PERMIAN_COBBLESTONE.get());
	public static final RegistryObject<Item> PERMIAN_COBBLESTONE_STAIRS = registerDecorativeBlockItem("permian_cobblestone_stairs", () -> BlockInit.PERMIAN_COBBLESTONE_STAIRS.get());
	public static final RegistryObject<Item> PERMIAN_COBBLESTONE_SLAB = registerDecorativeBlockItem("permian_cobblestone_slab", () -> BlockInit.PERMIAN_COBBLESTONE_SLAB.get());
	public static final RegistryObject<Item> PERMIAN_COBBLESTONE_WALL = registerDecorativeBlockItem("permian_cobblestone_wall", () -> BlockInit.PERMIAN_COBBLESTONE_WALL.get());

	public static final RegistryObject<Item> PERMIAN_STONE_BRICKS = registerDecorativeBlockItem("permian_stone_bricks", () -> BlockInit.PERMIAN_STONE_BRICKS.get());
	public static final RegistryObject<Item> PERMIAN_STONE_BRICK_STAIRS = registerDecorativeBlockItem("permian_stone_brick_stairs", () -> BlockInit.PERMIAN_STONE_BRICK_STAIRS.get());
	public static final RegistryObject<Item> PERMIAN_STONE_BRICK_SLAB = registerDecorativeBlockItem("permian_stone_brick_slab", () -> BlockInit.PERMIAN_STONE_BRICK_SLAB.get());
	public static final RegistryObject<Item> PERMIAN_STONE_BRICK_WALL = registerDecorativeBlockItem("permian_stone_brick_wall", () -> BlockInit.PERMIAN_STONE_BRICK_WALL.get());

	//Flora
	public static final RegistryObject<Item> SMALL_PERMIAN_DESERT_PLANT = registerNatureBlockItem("small_permian_desert_plant", () -> BlockInit.SMALL_PERMIAN_DESERT_PLANT.get());
	public static final RegistryObject<Item> MEDIUM_PERMIAN_DESERT_PLANT = registerNatureBlockItem("medium_permian_desert_plant", () -> BlockInit.MEDIUM_PERMIAN_DESERT_PLANT.get());
	public static final RegistryObject<Item> LARGE_PERMIAN_DESERT_PLANT = registerNatureBlockItem("large_permian_desert_plant", () -> BlockInit.LARGE_PERMIAN_DESERT_PLANT.get());

	public static final RegistryObject<Item> GROUND_FERNS = registerNatureBlockItem("ground_ferns", () -> BlockInit.GROUND_FERNS.get());
	public static final RegistryObject<Item> DICKSONIA = registerNatureBlockItem("dicksonia", () -> BlockInit.DICKSONIA.get());
	public static final RegistryObject<Item> TALL_DICKSONIA = registerNatureBlockItem("tall_dicksonia", () -> BlockInit.TALL_DICKSONIA.get());
	public static final RegistryObject<Item> CYCAD = registerNatureBlockItem("cycad", () -> BlockInit.CYCAD.get());
	public static final RegistryObject<Item> OSMUNDA = registerNatureBlockItem("osmunda", () -> BlockInit.OSMUNDA.get());
	public static final RegistryObject<Item> DUISBERGIA = registerNatureBlockItem("duisbergia", () -> BlockInit.DUISBERGIA.get());
	public static final RegistryObject<Item> CEPHALOTAXUS = registerNatureBlockItem("cephalotaxus", () -> BlockInit.CEPHALOTAXUS.get());
	public static final RegistryObject<Item> LYCOPHYTA = registerNatureBlockItem("lycophyta", () -> BlockInit.LYCOPHYTA.get());
	public static final RegistryObject<Item> DILLHOFFIA = registerNatureBlockItem("dillhoffia", () -> BlockInit.DILLHOFFIA.get());

	public static final RegistryObject<Item> DEAD_SPONGE_COLONY = registerNatureBlockItem("dead_sponge_colony", () -> BlockInit.DEAD_SPONGE_COLONY.get());
	public static final RegistryObject<Item> SPONGE_COLONY = registerNatureBlockItem("sponge_colony", () -> BlockInit.SPONGE_COLONY.get());
	
	//Jurassic
	//Stone
	public static final RegistryObject<Item> JURASSIC_STONE = registerDecorativeBlockItem("jurassic_stone", () -> BlockInit.JURASSIC_STONE.get());
	public static final RegistryObject<Item> JURASSIC_STONE_STAIRS = registerDecorativeBlockItem("jurassic_stone_stairs", () -> BlockInit.JURASSIC_STONE_STAIRS.get());
	public static final RegistryObject<Item> JURASSIC_STONE_SLAB = registerDecorativeBlockItem("jurassic_stone_slab", () -> BlockInit.JURASSIC_STONE_SLAB.get());

	public static final RegistryObject<Item> JURASSIC_COPPER_ORE = registerDecorativeBlockItem("jurassic_copper_ore", () -> BlockInit.JURASSIC_COPPER_ORE.get());
	public static final RegistryObject<Item> JURASSIC_GOLD_ORE = registerDecorativeBlockItem("jurassic_gold_ore", () -> BlockInit.JURASSIC_GOLD_ORE.get());
	public static final RegistryObject<Item> JURASSIC_IRON_ORE = registerDecorativeBlockItem("jurassic_iron_ore", () -> BlockInit.JURASSIC_IRON_ORE.get());
	public static final RegistryObject<Item> JURASSIC_COAL_ORE = registerDecorativeBlockItem("jurassic_coal_ore", () -> BlockInit.JURASSIC_COAL_ORE.get());
	public static final RegistryObject<Item> JURASSIC_LAPIS_ORE = registerDecorativeBlockItem("jurassic_lapis_ore", () -> BlockInit.JURASSIC_LAPIS_ORE.get());
	public static final RegistryObject<Item> JURASSIC_DIAMOND_ORE = registerDecorativeBlockItem("jurassic_diamond_ore", () -> BlockInit.JURASSIC_DIAMOND_ORE.get());
	public static final RegistryObject<Item> JURASSIC_REDSTONE_ORE = registerDecorativeBlockItem("jurassic_redstone_ore", () -> BlockInit.JURASSIC_REDSTONE_ORE.get());
	public static final RegistryObject<Item> JURASSIC_EMERALD_ORE = registerDecorativeBlockItem("jurassic_emerald_ore", () -> BlockInit.JURASSIC_EMERALD_ORE.get());
	
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE = registerDecorativeBlockItem("mossy_jurassic_stone", () -> BlockInit.MOSSY_JURASSIC_STONE.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_STAIRS = registerDecorativeBlockItem("mossy_jurassic_stone_stairs", () -> BlockInit.MOSSY_JURASSIC_STONE_STAIRS.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_SLAB = registerDecorativeBlockItem("mossy_jurassic_stone_slab", () -> BlockInit.MOSSY_JURASSIC_STONE_SLAB.get());
	
	public static final RegistryObject<Item> JURASSIC_COBBLESTONE = registerDecorativeBlockItem("jurassic_cobblestone", () -> BlockInit.JURASSIC_COBBLESTONE.get());
	public static final RegistryObject<Item> JURASSIC_COBBLESTONE_STAIRS = registerDecorativeBlockItem("jurassic_cobblestone_stairs", () -> BlockInit.JURASSIC_COBBLESTONE_STAIRS.get());
	public static final RegistryObject<Item> JURASSIC_COBBLESTONE_SLAB = registerDecorativeBlockItem("jurassic_cobblestone_slab", () -> BlockInit.JURASSIC_COBBLESTONE_SLAB.get());
	public static final RegistryObject<Item> JURASSIC_COBBLESTONE_WALL = registerDecorativeBlockItem("jurassic_cobblestone_wall", () -> BlockInit.JURASSIC_COBBLESTONE_WALL.get());
	
	public static final RegistryObject<Item> MOSSY_JURASSIC_COBBLESTONE = registerDecorativeBlockItem("mossy_jurassic_cobblestone", () -> BlockInit.MOSSY_JURASSIC_COBBLESTONE.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_COBBLESTONE_STAIRS = registerDecorativeBlockItem("mossy_jurassic_cobblestone_stairs", () -> BlockInit.MOSSY_JURASSIC_COBBLESTONE_STAIRS.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_COBBLESTONE_SLAB = registerDecorativeBlockItem("mossy_jurassic_cobblestone_slab", () -> BlockInit.MOSSY_JURASSIC_COBBLESTONE_SLAB.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_COBBLESTONE_WALL = registerDecorativeBlockItem("mossy_jurassic_cobblestone_wall", () -> BlockInit.MOSSY_JURASSIC_COBBLESTONE_WALL.get());
	
	public static final RegistryObject<Item> JURASSIC_STONE_BRICKS = registerDecorativeBlockItem("jurassic_stone_bricks", () -> BlockInit.JURASSIC_STONE_BRICKS.get());
	public static final RegistryObject<Item> JURASSIC_STONE_BRICK_STAIRS = registerDecorativeBlockItem("jurassic_stone_brick_stairs", () -> BlockInit.JURASSIC_STONE_BRICK_STAIRS.get());
	public static final RegistryObject<Item> JURASSIC_STONE_BRICK_SLAB = registerDecorativeBlockItem("jurassic_stone_brick_slab", () -> BlockInit.JURASSIC_STONE_BRICK_SLAB.get());
	public static final RegistryObject<Item> JURASSIC_STONE_BRICK_WALL = registerDecorativeBlockItem("jurassic_stone_brick_wall", () -> BlockInit.JURASSIC_STONE_BRICK_WALL.get());
	
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_BRICKS = registerDecorativeBlockItem("mossy_jurassic_stone_bricks", () -> BlockInit.MOSSY_JURASSIC_STONE_BRICKS.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_BRICK_STAIRS = registerDecorativeBlockItem("mossy_jurassic_stone_brick_stairs", () -> BlockInit.MOSSY_JURASSIC_STONE_BRICK_STAIRS.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_BRICK_SLAB = registerDecorativeBlockItem("mossy_jurassic_stone_brick_slab", () -> BlockInit.MOSSY_JURASSIC_STONE_BRICK_SLAB.get());
	public static final RegistryObject<Item> MOSSY_JURASSIC_STONE_BRICK_WALL = registerDecorativeBlockItem("mossy_jurassic_stone_brick_wall", () -> BlockInit.MOSSY_JURASSIC_STONE_BRICK_WALL.get());
	
	//Conifer
	public static final RegistryObject<Item> CONIFER_LOG = registerBuringBlockItem("conifer_log", () -> BlockInit.CONIFER_LOG.get());
	public static final RegistryObject<Item> CONIFER_WOOD = registerBuringBlockItem("conifer_wood", () -> BlockInit.CONIFER_WOOD.get());
	public static final RegistryObject<Item> STRIPPED_CONIFER_LOG = registerBuringBlockItem("stripped_conifer_log", () -> BlockInit.STRIPPED_CONIFER_LOG.get());
	public static final RegistryObject<Item> STRIPPED_CONIFER_WOOD = registerBuringBlockItem("stripped_conifer_wood", () -> BlockInit.STRIPPED_CONIFER_WOOD.get());
	public static final RegistryObject<Item> CONIFER_LEAVES = registerDecorativeBlockItem("conifer_leaves", () -> BlockInit.CONIFER_LEAVES.get());
	public static final RegistryObject<Item> CONIFER_SAPLING = registerBuringBlockItem("conifer_sapling", () -> BlockInit.CONIFER_SAPLING.get());
	public static final RegistryObject<Item> CONIFER_PLANKS = registerBuringBlockItem("conifer_planks", () -> BlockInit.CONIFER_PLANKS.get());
	public static final RegistryObject<Item> CONIFER_STAIRS = registerBuringBlockItem("conifer_stairs", () -> BlockInit.CONIFER_STAIRS.get());
	public static final RegistryObject<Item> CONIFER_SLAB = registerBuringSlabItem("conifer_slab", () -> BlockInit.CONIFER_SLAB.get());
	public static final RegistryObject<Item> CONIFER_FENCE = registerBuringBlockItem("conifer_fence", () -> BlockInit.CONIFER_FENCE.get());
	public static final RegistryObject<Item> CONIFER_FENCE_GATE = registerBuringBlockItem("conifer_fence_gate", () -> BlockInit.CONIFER_FENCE_GATE.get());
	public static final RegistryObject<Item> CONIFER_PRESSURE_PLATE = registerBuringBlockItem("conifer_pressure_plate", () -> BlockInit.CONIFER_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> CONIFER_BUTTON = registerBuringBlockItem("conifer_button", () -> BlockInit.CONIFER_BUTTON.get());
	public static final RegistryObject<Item> CONIFER_TRAPDOOR = registerBuringBlockItem("conifer_trapdoor", () -> BlockInit.CONIFER_TRAPDOOR.get()); 
	public static final RegistryObject<Item> CONIFER_DOOR = registerDecorativeBlockItem("conifer_door", () -> BlockInit.CONIFER_DOOR.get());
	public static final RegistryObject<ModSignItem> CONIFER_SIGN = ModRegistry.ITEM_REGISTRY.register("conifer_sign", () -> new ModSignItem(BlockInit.CONIFER_SIGN.get(), BlockInit.CONIFER_WALL_SIGN.get(), properties()));
	public static final RegistryObject<ModBoatItem> CONIFER_BOAT = registerBoatItem("conifer_boat", ModBoatType.CONIFER);

	//Ginkgo
	public static final RegistryObject<Item> GINKGO_LOG = registerBuringBlockItem("ginkgo_log", () -> BlockInit.GINKGO_LOG.get());
	public static final RegistryObject<Item> GINKGO_WOOD = registerBuringBlockItem("ginkgo_wood", () -> BlockInit.GINKGO_WOOD.get());
	public static final RegistryObject<Item> STRIPPED_GINKGO_LOG = registerBuringBlockItem("stripped_ginkgo_log", () -> BlockInit.STRIPPED_GINKGO_LOG.get());
	public static final RegistryObject<Item> STRIPPED_GINKGO_WOOD = registerBuringBlockItem("stripped_ginkgo_wood", () -> BlockInit.STRIPPED_GINKGO_WOOD.get());
	public static final RegistryObject<Item> GINKGO_LEAVES = registerDecorativeBlockItem("ginkgo_leaves", () -> BlockInit.GINKGO_LEAVES.get());
	public static final RegistryObject<Item> GINKGO_SAPLING = registerBuringBlockItem("ginkgo_sapling", () -> BlockInit.GINKGO_SAPLING.get());
	public static final RegistryObject<Item> GINKGO_PLANKS = registerBuringBlockItem("ginkgo_planks", () -> BlockInit.GINKGO_PLANKS.get());
	public static final RegistryObject<Item> GINKGO_STAIRS = registerBuringBlockItem("ginkgo_stairs", () -> BlockInit.GINKGO_STAIRS.get());
	public static final RegistryObject<Item> GINKGO_SLAB = registerBuringSlabItem("ginkgo_slab", () -> BlockInit.GINKGO_SLAB.get());
	public static final RegistryObject<Item> GINKGO_FENCE = registerBuringBlockItem("ginkgo_fence", () -> BlockInit.GINKGO_FENCE.get());
	public static final RegistryObject<Item> GINKGO_FENCE_GATE = registerBuringBlockItem("ginkgo_fence_gate", () -> BlockInit.GINKGO_FENCE_GATE.get());
	public static final RegistryObject<Item> GINKGO_PRESSURE_PLATE = registerBuringBlockItem("ginkgo_pressure_plate", () -> BlockInit.GINKGO_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> GINKGO_BUTTON = registerBuringBlockItem("ginkgo_button", () -> BlockInit.GINKGO_BUTTON.get());
	public static final RegistryObject<Item> GINKGO_TRAPDOOR = registerBuringBlockItem("ginkgo_trapdoor", () -> BlockInit.GINKGO_TRAPDOOR.get()); 
	public static final RegistryObject<Item> GINKGO_DOOR = registerBuringBlockItem("ginkgo_door", () -> BlockInit.GINKGO_DOOR.get());
	public static final RegistryObject<ModSignItem> GINKGO_SIGN = ModRegistry.ITEM_REGISTRY.register("ginkgo_sign", () -> new ModSignItem(BlockInit.GINKGO_SIGN.get(), BlockInit.GINKGO_WALL_SIGN.get(), properties()));
	public static final RegistryObject<ModBoatItem> GINKGO_BOAT = registerBoatItem("ginkgo_boat", ModBoatType.GINKGO);

	//Araucaria
	public static final RegistryObject<Item> ARAUCARIA_LOG = registerBuringBlockItem("araucaria_log", () -> BlockInit.ARAUCARIA_LOG.get());
	public static final RegistryObject<Item> ARAUCARIA_WOOD = registerBuringBlockItem("araucaria_wood", () -> BlockInit.ARAUCARIA_WOOD.get());
	public static final RegistryObject<Item> STRIPPED_ARAUCARIA_LOG = registerBuringBlockItem("stripped_araucaria_log", () -> BlockInit.STRIPPED_ARAUCARIA_LOG.get());
	public static final RegistryObject<Item> STRIPPED_ARAUCARIA_WOOD = registerBuringBlockItem("stripped_araucaria_wood", () -> BlockInit.STRIPPED_ARAUCARIA_WOOD.get());
	public static final RegistryObject<Item> ARAUCARIA_LEAVES = registerDecorativeBlockItem("araucaria_leaves", () -> BlockInit.ARAUCARIA_LEAVES.get());
	public static final RegistryObject<Item> ARAUCARIA_SAPLING = registerBuringBlockItem("araucaria_sapling", () -> BlockInit.ARAUCARIA_SAPLING.get());
	public static final RegistryObject<Item> ARAUCARIA_PLANKS = registerBuringBlockItem("araucaria_planks", () -> BlockInit.ARAUCARIA_PLANKS.get());
	public static final RegistryObject<Item> ARAUCARIA_STAIRS = registerBuringBlockItem("araucaria_stairs", () -> BlockInit.ARAUCARIA_STAIRS.get());
	public static final RegistryObject<Item> ARAUCARIA_SLAB = registerBuringBlockItem("araucaria_slab", () -> BlockInit.ARAUCARIA_SLAB.get());
	public static final RegistryObject<Item> ARAUCARIA_FENCE = registerBuringBlockItem("araucaria_fence", () -> BlockInit.ARAUCARIA_FENCE.get());
	public static final RegistryObject<Item> ARAUCARIA_FENCE_GATE = registerBuringBlockItem("araucaria_fence_gate", () -> BlockInit.ARAUCARIA_FENCE_GATE.get());
	public static final RegistryObject<Item> ARAUCARIA_PRESSURE_PLATE = registerBuringBlockItem("araucaria_pressure_plate", () -> BlockInit.ARAUCARIA_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> ARAUCARIA_BUTTON = registerBuringBlockItem("araucaria_button", () -> BlockInit.ARAUCARIA_BUTTON.get());
	public static final RegistryObject<Item> ARAUCARIA_TRAPDOOR = registerBuringBlockItem("araucaria_trapdoor", () -> BlockInit.ARAUCARIA_TRAPDOOR.get());
	public static final RegistryObject<Item> ARAUCARIA_DOOR = registerBuringBlockItem("araucaria_door", () -> BlockInit.ARAUCARIA_DOOR.get());
	public static final RegistryObject<ModSignItem> ARAUCARIA_SIGN = ModRegistry.ITEM_REGISTRY.register("araucaria_sign", () -> new ModSignItem(BlockInit.ARAUCARIA_SIGN.get(), BlockInit.ARAUCARIA_WALL_SIGN.get(), properties()));
	public static final RegistryObject<ModBoatItem> ARAUCARIA_BOAT = registerBoatItem("araucaria_boat", ModBoatType.ARAUCARIA);
	
	//Light Concrete
	public static final RegistryObject<Item> LIGHT_CONCRETE =  registerDecorativeBlockItem("light_concrete", () -> BlockInit.LIGHT_CONCRETE.get());
	public static final RegistryObject<Item> LIGHT_CONCRETE_STAIRS =  registerDecorativeBlockItem("light_concrete_stairs", () -> BlockInit.LIGHT_CONCRETE_STAIRS.get());
	public static final RegistryObject<Item> LIGHT_CONCRETE_SLAB =  registerDecorativeBlockItem("light_concrete_slab", () -> BlockInit.LIGHT_CONCRETE_SLAB.get());
	public static final RegistryObject<Item> LIGHT_CONCRETE_WALL =  registerDecorativeBlockItem("light_concrete_wall", () -> BlockInit.LIGHT_CONCRETE_WALL.get());
	public static final RegistryObject<Item> LIGHT_CONCRETE_PRESSURE_PLATE = registerDecorativeBlockItem("light_concrete_pressure_plate", () -> BlockInit.LIGHT_CONCRETE_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> LIGHT_CONCRETE_BUTTON =  registerDecorativeBlockItem("light_concrete_button", () -> BlockInit.LIGHT_CONCRETE_BUTTON.get());
	
	//Polished Light Concrete
	public static final RegistryObject<Item> POLISHED_LIGHT_CONCRETE =  registerDecorativeBlockItem("polished_light_concrete", () -> BlockInit.POLISHED_LIGHT_CONCRETE.get());
	public static final RegistryObject<Item> POLISHED_LIGHT_CONCRETE_STAIRS =  registerDecorativeBlockItem("polished_light_concrete_stairs", () -> BlockInit.POLISHED_LIGHT_CONCRETE_STAIRS.get());
	public static final RegistryObject<Item> POLISHED_LIGHT_CONCRETE_SLAB =  registerDecorativeBlockItem("polished_light_concrete_slab", () -> BlockInit.POLISHED_LIGHT_CONCRETE_SLAB.get());
	
	//Dark Concrete
	public static final RegistryObject<Item> DARK_CONCRETE =  registerDecorativeBlockItem("dark_concrete", () -> BlockInit.DARK_CONCRETE.get());
	public static final RegistryObject<Item> DARK_CONCRETE_STAIRS =  registerDecorativeBlockItem("dark_concrete_stairs", () -> BlockInit.DARK_CONCRETE_STAIRS.get());
	public static final RegistryObject<Item> DARK_CONCRETE_SLAB =  registerDecorativeBlockItem("dark_concrete_slab", () -> BlockInit.DARK_CONCRETE_SLAB.get());
	public static final RegistryObject<Item> DARK_CONCRETE_WALL =  registerDecorativeBlockItem("dark_concrete_wall", () -> BlockInit.DARK_CONCRETE_WALL.get());
	public static final RegistryObject<Item> DARK_CONCRETE_PRESSURE_PLATE = registerDecorativeBlockItem("dark_concrete_pressure_plate", () -> BlockInit.DARK_CONCRETE_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> DARK_CONCRETE_BUTTON =  registerDecorativeBlockItem("dark_concrete_button", () -> BlockInit.DARK_CONCRETE_BUTTON.get());
	
	//Polished Dark Concrete
	public static final RegistryObject<Item> POLISHED_DARK_CONCRETE =  registerDecorativeBlockItem("polished_dark_concrete", () -> BlockInit.POLISHED_DARK_CONCRETE.get());
	public static final RegistryObject<Item> POLISHED_DARK_CONCRETE_STAIRS =  registerDecorativeBlockItem("polished_dark_concrete_stairs", () -> BlockInit.POLISHED_DARK_CONCRETE_STAIRS.get());
	public static final RegistryObject<Item> POLISHED_DARK_CONCRETE_SLAB =  registerDecorativeBlockItem("polished_dark_concrete_slab", () -> BlockInit.POLISHED_DARK_CONCRETE_SLAB.get());

	//Wooden Planks
	public static final RegistryObject<Item> WOODEN_PLANKS =  registerDecorativeBlockItem("wooden_planks", () -> BlockInit.WOODEN_PLANKS.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_STAIRS =  registerDecorativeBlockItem("wooden_planks_stairs", () -> BlockInit.WOODEN_PLANKS_STAIRS.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_SLAB =  registerDecorativeBlockItem("wooden_planks_slab", () -> BlockInit.WOODEN_PLANKS_SLAB.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_FENCE =  registerDecorativeBlockItem("wooden_planks_fence", () -> BlockInit.WOODEN_PLANKS_FENCE.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_FENCE_GATE =  registerDecorativeBlockItem("wooden_planks_fence_gate", () -> BlockInit.WOODEN_PLANKS_FENCE_GATE.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_PRESSURE_PLATE = registerDecorativeBlockItem("wooden_planks_pressure_plate", () -> BlockInit.WOODEN_PLANKS_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> WOODEN_PLANKS_BUTTON =  registerDecorativeBlockItem("wooden_planks_button", () -> BlockInit.WOODEN_PLANKS_BUTTON.get());
		
	//Wooden Planks
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS =  registerDecorativeBlockItem("refined_wooden_planks", () -> BlockInit.REFINED_WOODEN_PLANKS.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_STAIRS =  registerDecorativeBlockItem("refined_wooden_planks_stairs", () -> BlockInit.REFINED_WOODEN_PLANKS_STAIRS.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_SLAB =  registerDecorativeBlockItem("refined_wooden_planks_slab", () -> BlockInit.REFINED_WOODEN_PLANKS_SLAB.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_FENCE =  registerDecorativeBlockItem("refined_wooden_planks_fence", () -> BlockInit.REFINED_WOODEN_PLANKS_FENCE.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_FENCE_GATE =  registerDecorativeBlockItem("refined_wooden_planks_fence_gate", () -> BlockInit.REFINED_WOODEN_PLANKS_FENCE_GATE.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_PRESSURE_PLATE = registerDecorativeBlockItem("refined_wooden_planks_pressure_plate", () -> BlockInit.REFINED_WOODEN_PLANKS_PRESSURE_PLATE.get());
	public static final RegistryObject<Item> REFINED_WOODEN_PLANKS_BUTTON =  registerDecorativeBlockItem("refined_wooden_planks_button", () -> BlockInit.REFINED_WOODEN_PLANKS_BUTTON.get());
	
	//Pavement
	public static final RegistryObject<Item> PAVEMENT =  registerDecorativeBlockItem("pavement", () -> BlockInit.PAVEMENT.get());
	public static final RegistryObject<Item> PAVEMENT_SLOPE =  registerDecorativeBlockItem("pavement_slope", () -> BlockInit.PAVEMENT_SLOPE.get());
	public static final RegistryObject<Item> RAISED_PAVEMENT =  registerDecorativeBlockItem("raised_pavement", () -> BlockInit.RAISED_PAVEMENT.get());
	
	//Roads
	public static final RegistryObject<Item> GRAVEL_ROAD = registerDecorativeBlockItem("gravel_road", () -> BlockInit.GRAVEL_ROAD.get());
	public static final RegistryObject<Item> RAISED_GRAVEL_ROAD = registerDecorativeBlockItem("raised_gravel_road", () -> BlockInit.RAISED_GRAVEL_ROAD.get());
		
	public static final RegistryObject<Item> DIRT_ROAD = registerDecorativeBlockItem("dirt_road", () -> BlockInit.DIRT_ROAD.get());
	public static final RegistryObject<Item> RAISED_DIRT_ROAD = registerDecorativeBlockItem("raised_dirt_road", () -> BlockInit.RAISED_DIRT_ROAD.get());
			
	public static final RegistryObject<Item> PAVED_ROAD = registerDecorativeBlockItem("paved_road", () -> BlockInit.PAVED_ROAD.get());
	public static final RegistryObject<Item> RAISED_PAVED_ROAD = registerDecorativeBlockItem("raised_paved_road", () -> BlockInit.RAISED_PAVED_ROAD.get());
		
	//Tile
	public static final RegistryObject<Item> TILE =  registerDecorativeBlockItem("tile", () -> BlockInit.TILE.get());
	public static final RegistryObject<Item> TILE_STAIRS =  registerDecorativeBlockItem("tile_stairs", () -> BlockInit.TILE_STAIRS.get());
	public static final RegistryObject<Item> TILE_SLAB =  registerDecorativeBlockItem("tile_slab", () -> BlockInit.TILE_SLAB.get());

	//Metal Fence
	public static final RegistryObject<Item> METAL_FENCE = registerDecorativeBlockItem("metal_fence", () -> BlockInit.METAL_FENCE.get());

	//Clear Glass
	public static final RegistryObject<Item> CLEAR_GLASS = registerDecorativeBlockItem("clear_glass", () -> BlockInit.CLEAR_GLASS.get());
	public static final RegistryObject<Item> CLEAR_GLASS_PANE = registerDecorativeBlockItem("clear_glass_pane", () -> BlockInit.CLEAR_GLASS_PANE.get());

	//Tinted Glass
	public static final RegistryObject<Item> TINTED_GLASS = registerDecorativeBlockItem("tinted_glass", () -> BlockInit.TINTED_GLASS.get());
	public static final RegistryObject<Item> TINTED_GLASS_PANE = registerDecorativeBlockItem("tinted_glass_pane", () -> BlockInit.TINTED_GLASS_PANE.get());
	
	//Coloured Glass
	public static final RegistryObject<Item> WHITE_GLASS = registerDecorativeBlockItem("white_glass", () -> BlockInit.WHITE_GLASS.get());
	public static final RegistryObject<Item> WHITE_GLASS_PANE = registerDecorativeBlockItem("white_glass_pane", () -> BlockInit.WHITE_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> LIGHT_GREY_GLASS = registerDecorativeBlockItem("light_grey_glass", () -> BlockInit.LIGHT_GREY_GLASS.get());
	public static final RegistryObject<Item> LIGHT_GREY_GLASS_PANE = registerDecorativeBlockItem("light_grey_glass_pane", () -> BlockInit.LIGHT_GREY_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> GREY_GLASS = registerDecorativeBlockItem("grey_glass", () -> BlockInit.GREY_GLASS.get());
	public static final RegistryObject<Item> GREY_GLASS_PANE = registerDecorativeBlockItem("grey_glass_pane", () -> BlockInit.GREY_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> BLACK_GLASS = registerDecorativeBlockItem("black_glass", () -> BlockInit.BLACK_GLASS.get());
	public static final RegistryObject<Item> BLACK_GLASS_PANE = registerDecorativeBlockItem("black_glass_pane", () -> BlockInit.BLACK_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> RED_GLASS = registerDecorativeBlockItem("red_glass", () -> BlockInit.RED_GLASS.get());
	public static final RegistryObject<Item> RED_GLASS_PANE = registerDecorativeBlockItem("red_glass_pane", () -> BlockInit.RED_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> ORANGE_GLASS = registerDecorativeBlockItem("orange_glass", () -> BlockInit.ORANGE_GLASS.get());
	public static final RegistryObject<Item> ORANGE_GLASS_PANE = registerDecorativeBlockItem("orange_glass_pane", () -> BlockInit.ORANGE_GLASS_PANE.get());	
	
	public static final RegistryObject<Item> YELLOW_GLASS = registerDecorativeBlockItem("yellow_glass", () -> BlockInit.YELLOW_GLASS.get());
	public static final RegistryObject<Item> YELLOW_GLASS_PANE = registerDecorativeBlockItem("yellow_glass_pane", () -> BlockInit.YELLOW_GLASS_PANE.get());	
	
	public static final RegistryObject<Item> LIME_GLASS = registerDecorativeBlockItem("lime_glass", () -> BlockInit.LIME_GLASS.get());
	public static final RegistryObject<Item> LIME_GLASS_PANE = registerDecorativeBlockItem("lime_glass_pane", () -> BlockInit.LIME_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> GREEN_GLASS = registerDecorativeBlockItem("green_glass", () -> BlockInit.GREEN_GLASS.get());
	public static final RegistryObject<Item> GREEN_GLASS_PANE = registerDecorativeBlockItem("green_glass_pane", () -> BlockInit.GREEN_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> CYAN_GLASS = registerDecorativeBlockItem("cyan_glass", () -> BlockInit.CYAN_GLASS.get());
	public static final RegistryObject<Item> CYAN_GLASS_PANE = registerDecorativeBlockItem("cyan_glass_pane", () -> BlockInit.CYAN_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> LIGHT_BLUE_GLASS = registerDecorativeBlockItem("light_blue_glass", () -> BlockInit.LIGHT_BLUE_GLASS.get());
	public static final RegistryObject<Item> LIGHT_BLUE_GLASS_PANE = registerDecorativeBlockItem("light_blue_glass_pane", () -> BlockInit.LIGHT_BLUE_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> BLUE_GLASS = registerDecorativeBlockItem("blue_glass", () -> BlockInit.BLUE_GLASS.get());
	public static final RegistryObject<Item> BLUE_GLASS_PANE = registerDecorativeBlockItem("blue_glass_pane", () -> BlockInit.BLUE_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> PURPLE_GLASS = registerDecorativeBlockItem("purple_glass", () -> BlockInit.PURPLE_GLASS.get());
	public static final RegistryObject<Item> PURPLE_GLASS_PANE = registerDecorativeBlockItem("purple_glass_pane", () -> BlockInit.PURPLE_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> MAGENTA_GLASS = registerDecorativeBlockItem("magenta_glass", () -> BlockInit.MAGENTA_GLASS.get());
	public static final RegistryObject<Item> MAGENTA_GLASS_PANE = registerDecorativeBlockItem("magenta_glass_pane", () -> BlockInit.MAGENTA_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> PINK_GLASS = registerDecorativeBlockItem("pink_glass", () -> BlockInit.PINK_GLASS.get());
	public static final RegistryObject<Item> PINK_GLASS_PANE = registerDecorativeBlockItem("pink_glass_pane", () -> BlockInit.PINK_GLASS_PANE.get());	
		
	public static final RegistryObject<Item> BROWN_GLASS = registerDecorativeBlockItem("brown_glass", () -> BlockInit.BROWN_GLASS.get());
	public static final RegistryObject<Item> BROWN_GLASS_PANE = registerDecorativeBlockItem("brown_glass_pane", () -> BlockInit.BROWN_GLASS_PANE.get());	

	public static final RegistryObject<Item> SHADED_GLASS = registerDecorativeBlockItem("shaded_glass", () -> BlockInit.SHADED_GLASS.get());
	public static final RegistryObject<Item> SHADED_GLASS_PANE = registerDecorativeBlockItem("shaded_glass_pane", () -> BlockInit.SHADED_GLASS_PANE.get());	
	
	//Coloured Blocks
	public static final RegistryObject<Item> RED_DECORATION_BLOCK = registerDecorativeBlockItem("red_decoration_block", () -> BlockInit.RED_DECORATION_BLOCK.get());
	public static final RegistryObject<Item> ORANGE_DECORATION_BLOCK = registerDecorativeBlockItem("orange_decoration_block", () -> BlockInit.ORANGE_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> YELLOW_DECORATION_BLOCK = registerDecorativeBlockItem("yellow_decoration_block", () -> BlockInit.YELLOW_DECORATION_BLOCK.get());
	public static final RegistryObject<Item> LIME_DECORATION_BLOCK = registerDecorativeBlockItem("lime_decoration_block", () -> BlockInit.LIME_DECORATION_BLOCK.get());
	public static final RegistryObject<Item> GREEN_DECORATION_BLOCK = registerDecorativeBlockItem("green_decoration_block", () -> BlockInit.GREEN_DECORATION_BLOCK.get());
	public static final RegistryObject<Item> CYAN_DECORATION_BLOCK = registerDecorativeBlockItem("cyan_decoration_block", () -> BlockInit.CYAN_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> BLUE_DECORATION_BLOCK = registerDecorativeBlockItem("blue_decoration_block", () -> BlockInit.BLUE_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> LIGHT_BLUE_DECORATION_BLOCK = registerDecorativeBlockItem("light_blue_decoration_block", () -> BlockInit.LIGHT_BLUE_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> PURPLE_DECORATION_BLOCK = registerDecorativeBlockItem("purple_decoration_block", () -> BlockInit.PURPLE_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> MAGENTA_DECORATION_BLOCK = registerDecorativeBlockItem("magenta_decoration_block", () -> BlockInit.MAGENTA_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> PINK_DECORATION_BLOCK = registerDecorativeBlockItem("pink_decoration_block", () -> BlockInit.PINK_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> BROWN_DECORATION_BLOCK = registerDecorativeBlockItem("brown_decoration_block", () -> BlockInit.BROWN_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> GREY_DECORATION_BLOCK = registerDecorativeBlockItem("grey_decoration_block", () -> BlockInit.GREY_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> LIGHT_GREY_DECORATION_BLOCK = registerDecorativeBlockItem("light_grey_decoration_block", () -> BlockInit.LIGHT_GREY_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> WHITE_DECORATION_BLOCK = registerDecorativeBlockItem("white_decoration_block", () -> BlockInit.WHITE_DECORATION_BLOCK.get());	
	public static final RegistryObject<Item> BLACK_DECORATION_BLOCK = registerDecorativeBlockItem("black_decoration_block", () -> BlockInit.BLACK_DECORATION_BLOCK.get());
	
	//Thatch
	public static final RegistryObject<Item> THATCH_BLOCK =  registerDecorativeBlockItem("thatch_block", () -> BlockInit.THATCH_BLOCK.get());
	
	//Doors
	public static final RegistryObject<Item> OUTDOOR_TOILET_DOOR = registerDecorativeBlockItem("outdoor_toilet_door", () -> BlockInit.OUTDOOR_TOILET_DOOR.get());
	public static final RegistryObject<Item> GLASS_SHOP_DOOR = registerDecorativeBlockItem("glass_shop_door", () -> BlockInit.GLASS_SHOP_DOOR.get());
	public static final RegistryObject<Item> VISITOR_CENTRE_DOOR = registerDecorativeBlockItem("visitor_centre_door", () -> BlockInit.VISITOR_CENTRE_DOOR.get());
	public static final RegistryObject<Item> INNOVATION_CENTRE_DOOR = registerDecorativeBlockItem("innovation_centre_door", () -> BlockInit.INNOVATION_CENTRE_DOOR.get());
	public static final RegistryObject<Item> SECURITY_DOOR = registerDecorativeBlockItem("security_door", () -> BlockInit.SECURITY_DOOR.get());
	public static final RegistryObject<Item> BACK_DOOR = registerDecorativeBlockItem("back_door", () -> BlockInit.BACK_DOOR.get());
	
	//Registry
	public static Properties properties()
	{
		return new Item.Properties();
	}
	
	private static RegistryObject<Item> itemRegister(String id, Item item)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> item);
	}
	
	private static RegistryObject<Item> plainItemRegister(String id, Item.Properties properties)
	{
		return itemRegister(id, new Item(properties));
	}
	
	private static RegistryObject<Item> brushItemRegister(String id, ModItemTeir teir)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> new BrushItem(teir, 1.5F, -3.0F, properties().tab(ModItemGroups.TOOLS_TAB)));
	}
	
	private static RegistryObject<Item> registerDNAItem(String type) 
	{
		return plainItemRegister(type + "_dna", properties().tab(ModItemGroups.CREATURES_TAB).stacksTo(8));
	}
	
	private static RegistryObject<Item> registerDNADiscItem(String type)
	{
		return itemRegister(type + "_dna_disc", new DiscItem(type + "_dna_disc", properties().tab(ModItemGroups.CREATURES_TAB).stacksTo(1)));
	}
	
	private static RegistryObject<Item> registerFishSpawnItem(String id)
	{
		return plainItemRegister(id + "_spawn", properties().tab(ModItemGroups.CREATURES_TAB));
	}
	
	private static RegistryObject<Item> registerSpawnItemBucket(String id, NonNullSupplier<EntityType<?>> entity)
	{
		return itemRegister(id + "_spawn_bucket", new ModFishBucketItem(entity, Fluids.WATER));
	}
	
	private static RegistryObject<Item> registerSpawnBucketItem(String id, NonNullSupplier<EntityType<?>> entity)
	{
		return itemRegister(id + "_spawn_bucket", new ModSpawnBucketItem(entity));
	}
	
	private static RegistryObject<Item> registerRawMeat(String type, Food food) 
	{
		return plainItemRegister("raw_" + type + "_meat", properties().food(food).tab(ModItemGroups.FOOD_TAB));
	}
	
	private static RegistryObject<Item> registerRawFishMeat(String type, Food food) 
	{
		return plainItemRegister(type, properties().food(food).tab(ModItemGroups.FOOD_TAB));
	}
	
	private static RegistryObject<Item> registerCookedMeat(String type, Food food) 
	{
		return plainItemRegister("cooked_" + type + "_meat", properties().food(food).tab(ModItemGroups.FOOD_TAB));
	}
	
	private static RegistryObject<Item> registerCookedFishMeat(String type, Food food) 
	{
		return plainItemRegister("cooked_" + type, properties().food(food).tab(ModItemGroups.FOOD_TAB));
	}
	
	private static RegistryObject<Item> registerFishSpawnItemEgg(String id, NonNullSupplier<EntityType<?>> entity, int primaryColour, int secondaryColour)
	{
		return itemRegister(id + "_spawn_egg", new ModSpawnEggItem(entity, primaryColour, secondaryColour));
	}
	
	private static RegistryObject<Item> registerEntityBucket(String id, NonNullSupplier<EntityType<?>> entity)
	{
		return itemRegister(id + "_bucket", new ModFishBucketItem(entity, Fluids.WATER));
	}
	
	//Bones
	/*private static RegistryObject<Item> registerArmBone(String id)
	{
		return plainItemRegister(id + "_arm_bone", properties());
	}
	
	private static RegistryObject<Item> registerLegBone(String id)
	{
		return plainItemRegister(id + "_leg_bone", properties());
	}
	
	private static RegistryObject<Item> registerFootBone(String id)
	{
		return plainItemRegister(id + "_foot_bone", properties());
	}
	
	private static RegistryObject<Item> registerRibBone(String id)
	{
		return plainItemRegister(id + "_rib_bone", properties());
	}
	
	private static RegistryObject<Item> registerVertebraeBone(String id)
	{
		return plainItemRegister(id + "_vertebrae_bone", properties());
	}
	
	private static RegistryObject<Item> registerSkull(String id)
	{
		return plainItemRegister(id + "_skull", properties());
	}
	
	private static RegistryObject<Item> registerSpecialBone(String id)
	{
		return plainItemRegister(id + "_special_bone", properties());
	}*/
	
	//Block Item Registers
	//Block Item Register
	private static RegistryObject<Item> registerBlockItem(String id, NonNullSupplier<Block> block, ItemGroup group)
	{
		return itemRegister(id, new ModBlockItem(block, new Item.Properties().tab(group)));
	}
	
	private static RegistryObject<Item> registerFossilBlockItem(String id, NonNullSupplier<Block> block)
	{
		return registerBlockItem(id, block, ModItemGroups.FOSSILS_TAB);
	}
	
	private static RegistryObject<Item> registerDecorativeBlockItem(String id, NonNullSupplier<Block> block)
	{
		return registerBlockItem(id, block, ModItemGroups.DECORATIVES_TAB);
	}
	
	private static RegistryObject<Item> registerNatureBlockItem(String id, NonNullSupplier<Block> block)
	{
		return registerBlockItem(id, block, ModItemGroups.NATURE_TAB);
	}
	
	private static RegistryObject<Item> registerMachinesBlockItem(String id, NonNullSupplier<Block> block)
	{
		return registerBlockItem(id, block, ModItemGroups.MACHINES_TAB);
	}
	
	private static RegistryObject<ModBoatItem> registerBoatItem(String id, ModBoatType type)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> new ModBoatItem(type, properties()));
	}
	
	private static RegistryObject<Item> registerBuringSlabItem(String id, NonNullSupplier<Block> block)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> new ModSlabBurnableItem(block, properties().tab(ModItemGroups.DECORATIVES_TAB)));
	}
	
	private static RegistryObject<Item> registerBuringBlockItem(String id, NonNullSupplier<Block> block)
	{
		return ModRegistry.ITEM_REGISTRY.register(id, () -> new ModWoodBurnableItem(block, properties().tab(ModItemGroups.DECORATIVES_TAB)));
	}
	
	public static void initItems() { ModUtil.LOGGER.debug("Registering: Mod Items"); }
}
