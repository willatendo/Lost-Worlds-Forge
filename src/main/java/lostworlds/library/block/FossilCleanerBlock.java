package lostworlds.library.block;

import lostworlds.content.server.init.TileEntityInit;
import lostworlds.library.block.base.BaseMachineBlock;
import lostworlds.library.block.forge.ForgeBlockAndItem;
import lostworlds.library.tileentity.FossilCleanerTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

/*
 * Author: Willatendo
 * Date: July 1, 2021
 */

public class FossilCleanerBlock extends BaseMachineBlock
{
	public static final VoxelShape SHAPE = Block.box(1, 0, 3, 15, 9, 16);
	
	protected FossilCleanerBlock() 
	{
		super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(3.0f, 6.0F).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.METAL));
		
		runCalculation(SHAPE);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 
	{
		return SHAPES.get(this).get(state.getValue(HORIZONTAL_FACING));
	}

	@Override
	public TileEntity newBlockEntity(IBlockReader reader) 
	{
		return new FossilCleanerTileEntity();
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return TileEntityInit.FOSSIL_CLEANER_TILE_ENTITY.get().create();
	}
	
	public static Block create()
	{
		return ForgeBlockAndItem.create("fossil_cleaner", new FossilCleanerBlock());
	}
}