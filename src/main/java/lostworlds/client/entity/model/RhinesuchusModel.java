package lostworlds.client.entity.model;

import lostworlds.common.entities.RhinesuchusEntity;
import lostworlds.core.util.reference.ModReference;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RhinesuchusModel extends AnimatedGeoModel<RhinesuchusEntity>
{
	@Override
	public ResourceLocation getModelLocation(RhinesuchusEntity object) 
	{
		return new ResourceLocation(ModReference.ID, "geo/rhinesuchus.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(RhinesuchusEntity object) 
	{
		return new ResourceLocation(ModReference.ID, "textures/model/entity/rhinesuchus.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(RhinesuchusEntity animatable) 
	{
		return new ResourceLocation(ModReference.ID, "animations/rhinesuchus.animations.json");
	}
	
	@Override
	public void setLivingAnimations(RhinesuchusEntity entity, Integer uniqueID, @SuppressWarnings("rawtypes") AnimationEvent customPredicate) 
	{
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("head");

		@SuppressWarnings("unchecked")
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
		head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
	}
}
