package lostworlds.common.items.timebooks;

import lostworlds.world.dimension.permian.PermianDimension;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class PermianTimeBook extends Item
{	
	public PermianTimeBook(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) 
	{
		if(!entity.isPassenger() && !entity.isVehicle() && entity.canChangeDimensions()) 
		{
			if(entity.level instanceof ServerWorld) 
			{
				ServerWorld serverworld = (ServerWorld)entity.level;
                MinecraftServer minecraftserver = serverworld.getServer();
                RegistryKey<World> registrykey = entity.level.dimension() == PermianDimension.PERMIAN_WORLD ? World.OVERWORLD : PermianDimension.PERMIAN_WORLD;
                ServerWorld serverworld1 = minecraftserver.getLevel(registrykey);
            	if(serverworld1 != null && !entity.isPassenger()) 
                {
                    entity.changeDimension(serverworld1, new ModTeleporter(serverworld1));
                }
			}
		}
		return super.use(world, entity, hand);
	}
}