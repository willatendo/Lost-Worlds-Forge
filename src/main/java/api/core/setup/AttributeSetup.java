package api.core.setup;

import api.core.init.EntityInit;
import library.util.ModUtil;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = ModUtil.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AttributeSetup 
{
	@SubscribeEvent
	public static void registerEntityAttributes(FMLCommonSetupEvent event) 
	{
		event.enqueueWork(() -> 
		{
			GlobalEntityTypeAttributes.put(EntityInit.CARNOTAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 45.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 8.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.CHILESAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 12.0D).add(Attributes.MOVEMENT_SPEED, 0.3D).build());
			GlobalEntityTypeAttributes.put(EntityInit.CRYOLOPHOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 25.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 7.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.DIMETRODON_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 6.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.DIICTODON_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 5.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.EDAPHOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 17.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.FUKUIVENATOR_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 11.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 5.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.GIGANOTOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 100.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 14.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.GORGONOPS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 10.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.GREAT_AUK_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 7.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 5.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.KENTROSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.ATTACK_DAMAGE, 9.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.LIAONINGOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 30.0D).add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.ARMOR, 7.0D).add(Attributes.ARMOR_TOUGHNESS, 5.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.NAUTILUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ARMOR, 6.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.OSTROMIA_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 2.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.OURANOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.PALAEONISCUM_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 7.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.PROCOMPSOGNATHUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 2.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.PROTOSUCHUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 2.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.PSITTACOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 9.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.RHINESUCHUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.SUCHOMIMUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 60.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 12.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.TETRACERATOPS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 7.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).build());
			GlobalEntityTypeAttributes.put(EntityInit.TYRANNOSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 80.0D).add(Attributes.MOVEMENT_SPEED, 0.2D).add(Attributes.ATTACK_DAMAGE, 12.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.UTAHRAPTOR_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 30.0D).add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.ATTACK_DAMAGE, 6.0D).build());
			GlobalEntityTypeAttributes.put(EntityInit.ZEPHYROSAURUS_ENTITY.get(), MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 8.0D).add(Attributes.MOVEMENT_SPEED, 0.3D).build());
		});
	}
}