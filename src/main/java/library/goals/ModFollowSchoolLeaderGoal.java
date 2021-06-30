package library.goals;

import java.util.List;
import java.util.function.Predicate;

import library.entites.bases.AbstractPrehistoricGroupFishEntity;
import net.minecraft.entity.ai.goal.Goal;

public class ModFollowSchoolLeaderGoal extends Goal 
{
	private final AbstractPrehistoricGroupFishEntity mob;
	private int timeToRecalcPath;
	private int nextStartTick;
	
	public ModFollowSchoolLeaderGoal(AbstractPrehistoricGroupFishEntity entity) 
	{
		this.mob = entity;
		this.nextStartTick = this.nextStartTick(entity);
	}
	
	protected int nextStartTick(AbstractPrehistoricGroupFishEntity mob2) 
	{
		return 200 + mob2.getRandom().nextInt(200) % 20;
	}
	
	@Override
	public boolean canUse() 
	{
		if(this.mob.hasFollowers()) 
		{
			return false;
		} 
		else if(this.mob.isFollower()) 
		{
			return true;
		} else if(this.nextStartTick > 0) 
		{
			--this.nextStartTick;
			return false;
		} 
		else 
		{
			this.nextStartTick = this.nextStartTick(this.mob);
			Predicate<AbstractPrehistoricGroupFishEntity> predicate = (p_212824_0_) -> 
			{
				return p_212824_0_.canBeFollowed() || !p_212824_0_.isFollower();
			};
			List<AbstractPrehistoricGroupFishEntity> list = this.mob.level.getEntitiesOfClass(this.mob.getClass(), this.mob.getBoundingBox().inflate(8.0D, 8.0D, 8.0D), predicate);
			AbstractPrehistoricGroupFishEntity abstractgroupfishentity = list.stream().filter(AbstractPrehistoricGroupFishEntity::canBeFollowed).findAny().orElse(this.mob);
			abstractgroupfishentity.addFollowers(list.stream().filter((p_212823_0_) -> 
			{
				return !p_212823_0_.isFollower();
			}));
			return this.mob.isFollower();
		}
	}
	
	@Override
	public boolean canContinueToUse() 
	{
		return this.mob.isFollower() && this.mob.inRangeOfLeader();
	}
	
	@Override
	public void start() 
	{
		this.timeToRecalcPath = 0;
	}
	
	@Override
	public void stop() 
	{
		this.mob.stopFollowing();
	}
	
	@Override
	public void tick() 
	{
		if(--this.timeToRecalcPath <= 0) 
		{
			this.timeToRecalcPath = 10;
			this.mob.pathToLeader();
		}
	}
}