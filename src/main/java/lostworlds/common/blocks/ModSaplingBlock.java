package lostworlds.common.blocks;

import lostworlds.core.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ModSaplingBlock extends SaplingBlock
{
	public ModSaplingBlock(Tree tree, Properties properties) 
	{
		super(tree, properties);
	}
	
	@Override
	protected boolean mayPlaceOn(BlockState state, IBlockReader blockReader, BlockPos pos) 
	{
		Block block = state.getBlock();
		
		return block.is(Blocks.DIRT) || block.is(BlockInit.MOSSY_DIRT.get()) || block.is(BlockInit.PERMIAN_SAND.get());
	}
}
