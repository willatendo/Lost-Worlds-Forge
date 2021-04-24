package lostworlds.client.entity.model;

import lostworlds.common.entities.PsittacosaurusEntity;
import lostworlds.core.util.ModID;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

@OnlyIn(Dist.CLIENT)
public class PsittacosaurusModel extends AnimatedGeoModel<PsittacosaurusEntity> 
{
	@Override
	public ResourceLocation getModelLocation(PsittacosaurusEntity object) 
	{
		return new ResourceLocation(ModID.ID, "geo/psittacosaurus.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(PsittacosaurusEntity object) 
	{
		return new ResourceLocation(ModID.ID, "textures/model/entity/psittacosaurus.png");
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(PsittacosaurusEntity animatable) 
	{
		return new ResourceLocation(ModID.ID, "animations/psittacosaurus.animations.json");
	}

	@Override
	public void setLivingAnimations(PsittacosaurusEntity entity, Integer uniqueID, @SuppressWarnings("rawtypes") AnimationEvent customPredicate) 
	{
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		IBone head = this.getAnimationProcessor().getBone("neck");

		@SuppressWarnings("unchecked")
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
		head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
	}	
}