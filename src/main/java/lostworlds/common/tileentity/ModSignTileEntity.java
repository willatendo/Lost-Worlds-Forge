package lostworlds.common.tileentity;

import lostworlds.core.init.TileEntityInit;
import net.minecraft.tileentity.SignTileEntity;
import net.minecraft.tileentity.TileEntityType;

public class ModSignTileEntity extends SignTileEntity
{
	@Override
	public TileEntityType<?> getType() 
	{
		return TileEntityInit.SIGN_TILE_ENTITY.get();
	}
}