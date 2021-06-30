package library.blocks.plants;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IForgeShearable;

public class LargePermianDesertPlant extends ModBushBlock implements IForgeShearable
{
	protected static final VoxelShape VOXEL_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);

	public LargePermianDesertPlant(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader blockReader, BlockPos pos, ISelectionContext context) 
	{
		return VOXEL_SHAPE;
	}
	
	@Override
	public AbstractBlock.OffsetType getOffsetType() 
	{
		return AbstractBlock.OffsetType.XYZ;
	}
}