package api.core.init;

import library.Init;
import library.ModRegistry;
import library.entites.AllosaurusEntity;
import library.entites.CarnotaurusEntity;
import library.entites.ChilesaurusEntity;
import library.entites.CryolophosaurusEntity;
import library.entites.DiictodonEntity;
import library.entites.DimetrodonEntity;
import library.entites.EdaphosaurusEntity;
import library.entites.FukuivenatorEntity;
import library.entites.GiganotosaurusEntity;
import library.entites.GorgonopsEntity;
import library.entites.GreatAukEntity;
import library.entites.KentrosaurusEntity;
import library.entites.LiaoningosaurusEntity;
import library.entites.ModBoatEntity;
import library.entites.NautilusEntity;
import library.entites.OstromiaEntity;
import library.entites.OuranosaurusEntity;
import library.entites.PalaeoniscumEntity;
import library.entites.ProcompsognathusEntity;
import library.entites.ProtosuchusEntity;
import library.entites.PsittacosaurusEntity;
import library.entites.RhinesuchusEntity;
import library.entites.SuchomimusEntity;
import library.entites.TetraceratopsEntity;
import library.entites.TyrannosaurusEntity;
import library.entites.UtahraptorEntity;
import library.entites.ZephyrosaurusEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.RegistryObject;

@Init
public class EntityInit extends ModRegistry
{
	public static final RegistryObject<EntityType<ProcompsognathusEntity>> PROCOMPSOGNATHUS_ENTITY = registerEntity("procompsognathus", ProcompsognathusEntity::new, EntityClassification.CREATURE, ProcompsognathusEntity.class, 0.3F, 0.7F);
	public static final RegistryObject<EntityType<PalaeoniscumEntity>> PALAEONISCUM_ENTITY = registerEntity("palaeoniscum", PalaeoniscumEntity::new, EntityClassification.WATER_AMBIENT, PalaeoniscumEntity.class, 0.25F, 0.25F);
	public static final RegistryObject<EntityType<NautilusEntity>> NAUTILUS_ENTITY = registerEntity("nautilus", NautilusEntity::new, EntityClassification.WATER_AMBIENT, NautilusEntity.class, 0.5F, 1.0F);
	public static final RegistryObject<EntityType<RhinesuchusEntity>> RHINESUCHUS_ENTITY = registerEntity("rhinesuchus", RhinesuchusEntity::new, EntityClassification.CREATURE, RhinesuchusEntity.class, 0.34F, 0.34F);
	public static final RegistryObject<EntityType<DimetrodonEntity>> DIMETRODON_ENTITY = registerEntity("dimetrodon", DimetrodonEntity::new, EntityClassification.CREATURE, DimetrodonEntity.class, 0.75F, 2.0F);
	public static final RegistryObject<EntityType<EdaphosaurusEntity>> EDAPHOSAURUS_ENTITY = registerEntity("edaphosaurus", EdaphosaurusEntity::new, EntityClassification.CREATURE, EdaphosaurusEntity.class, 0.5F, 1.25F);
	public static final RegistryObject<EntityType<GorgonopsEntity>> GORGONOPS_ENTITY = registerEntity("gorgonops", GorgonopsEntity::new, EntityClassification.CREATURE, GorgonopsEntity.class, 0.4F, 0.5F);
	public static final RegistryObject<EntityType<CarnotaurusEntity>> CARNOTAURUS_ENTITY = registerEntity("carnotaurus", CarnotaurusEntity::new, EntityClassification.CREATURE, CarnotaurusEntity.class, 0.75F, 1.25F);
	public static final RegistryObject<EntityType<TyrannosaurusEntity>> TYRANNOSAURUS_ENTITY = registerEntity("tyrannosaurus", TyrannosaurusEntity::new, EntityClassification.CREATURE, TyrannosaurusEntity.class, 1.0F, 1.75F);
	public static final RegistryObject<EntityType<AllosaurusEntity>> ALLOSAURUS_ENTITY = registerEntity("allosaurus", AllosaurusEntity::new, EntityClassification.CREATURE, AllosaurusEntity.class, 1.25F, 1.75F);
	public static final RegistryObject<EntityType<GiganotosaurusEntity>> GIGANOTOSAURUS_ENTITY = registerEntity("giganotosaurus", GiganotosaurusEntity::new, EntityClassification.CREATURE, GiganotosaurusEntity.class, 1.6F, 1.75F);
	public static final RegistryObject<EntityType<SuchomimusEntity>> SUCHOMIMUS_ENTITY = registerEntity("suchomimus", SuchomimusEntity::new, EntityClassification.CREATURE, SuchomimusEntity.class, 2.0F, 1.75F);
	public static final RegistryObject<EntityType<TetraceratopsEntity>> TETRACERATOPS_ENTITY = registerEntity("tetraceratops", TetraceratopsEntity::new, EntityClassification.CREATURE, TetraceratopsEntity.class, 0.25F, 0.25F);
	public static final RegistryObject<EntityType<GreatAukEntity>> GREAT_AUK_ENTITY = registerEntity("great_auk", GreatAukEntity::new, EntityClassification.CREATURE, GreatAukEntity.class, 0.4F, 0.7F);
	public static final RegistryObject<EntityType<OuranosaurusEntity>> OURANOSAURUS_ENTITY = registerEntity("ouranosaurus", OuranosaurusEntity::new, EntityClassification.CREATURE, OuranosaurusEntity.class, 0.7F, 0.9F);
	public static final RegistryObject<EntityType<FukuivenatorEntity>> FUKUIVENATOR_ENTITY = registerEntity("fukuivenator", FukuivenatorEntity::new, EntityClassification.CREATURE, FukuivenatorEntity.class, 0.5F, 0.6F);
	public static final RegistryObject<EntityType<PsittacosaurusEntity>> PSITTACOSAURUS_ENTITY = registerEntity("pisttacosaurus", PsittacosaurusEntity::new, EntityClassification.CREATURE, PsittacosaurusEntity.class, 0.5F, 0.5F);
	public static final RegistryObject<EntityType<CryolophosaurusEntity>> CRYOLOPHOSAURUS_ENTITY = registerEntity("cryolophosaurus", CryolophosaurusEntity::new, EntityClassification.CREATURE, CryolophosaurusEntity.class, 0.75F, 1.9F);
	public static final RegistryObject<EntityType<OstromiaEntity>> OSTROMIA_ENTITY = registerEntity("ostromia", OstromiaEntity::new, EntityClassification.CREATURE, OstromiaEntity.class, 0.3F, 0.3F);
	public static final RegistryObject<EntityType<ProtosuchusEntity>> PROTOSUCHUS_ENTITY = registerEntity("protosuchus", ProtosuchusEntity::new, EntityClassification.CREATURE, ProtosuchusEntity.class, 0.5F, 0.5F);
	public static final RegistryObject<EntityType<DiictodonEntity>> DIICTODON_ENTITY = registerEntity("diictodon", DiictodonEntity::new, EntityClassification.CREATURE, DiictodonEntity.class, 0.25F, 0.25F);
	public static final RegistryObject<EntityType<KentrosaurusEntity>> KENTROSAURUS_ENTITY = registerEntity("kentrosaurus", KentrosaurusEntity::new, EntityClassification.CREATURE, KentrosaurusEntity.class, 0.5F, 0.5F);
	public static final RegistryObject<EntityType<ChilesaurusEntity>> CHILESAURUS_ENTITY = registerEntity("chilesaurus", ChilesaurusEntity::new, EntityClassification.CREATURE, ChilesaurusEntity.class, 0.25F, 0.25F);
	public static final RegistryObject<EntityType<LiaoningosaurusEntity>> LIAONINGOSAURUS_ENTITY = registerEntity("liaoningosaurus", LiaoningosaurusEntity::new, EntityClassification.CREATURE, LiaoningosaurusEntity.class, 0.5F, 0.5F);
	public static final RegistryObject<EntityType<UtahraptorEntity>> UTAHRAPTOR_ENTITY = registerEntity("utahraptor", UtahraptorEntity::new, EntityClassification.CREATURE, UtahraptorEntity.class, 0.75F, 2.0F);
	public static final RegistryObject<EntityType<ZephyrosaurusEntity>> ZEPHYROSAURUS_ENTITY = registerEntity("zephyrosaurus", ZephyrosaurusEntity::new, EntityClassification.CREATURE, ZephyrosaurusEntity.class, 0.5F, 1.5F);
	
	//Boat
    public static final RegistryObject<EntityType<ModBoatEntity>> BOAT = registerEntity("boat", ModBoatEntity::new, EntityClassification.MISC, ModBoatEntity.class, 1.375F, 0.5625F);

	//Registry
	public static <T extends Entity> RegistryObject<EntityType<T>> registerEntity(String name, EntityType.IFactory<T> entity, EntityClassification entitytype, Class<T> entityClass, float width, float height) 
	{
		return ModRegistry.ENTITY_REGISTRY.register(name, () -> EntityType.Builder.of(entity, entitytype).sized(width, height).build(name));
	}
	
	public static void initializeAttributes() 
	{
		GlobalEntityTypeAttributes.put(ALLOSAURUS_ENTITY.get(), AllosaurusEntity.makeAttributes().build());
	}
}