package lostworlds.client.screen.machines;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import lostworlds.common.container.AnalyserContainer;
import lostworlds.common.tileentity.AnalyserTileEntity;
import lostworlds.core.util.ModUtil;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AnalyserScreen<T extends AnalyserContainer> extends ContainerScreen<T>
{
	private static final ResourceLocation TEXTURE = ModUtil.rL("textures/gui/machines/analyser.png");
	private final AnalyserContainer container;
	@SuppressWarnings("unused")
	private final AnalyserTileEntity tile;
	
	public AnalyserScreen(T container, PlayerInventory playerInv, ITextComponent text) 
	{
		super(container, playerInv, text);
		this.container = container;
		this.tile = container.tile;
	}
	
	@Override
	public void render(MatrixStack stack, int i1, int i2, float f)
	{
		this.renderBackground(stack);
		super.render(stack, i1, i2, f);
		this.renderTooltip(stack, i1, i2);
	}
	
	@Override
	protected void renderBg(MatrixStack stack, float partialTicks, int x, int y)
	{
		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.minecraft.getTextureManager().bind(TEXTURE);
		int leftPos = this.leftPos;
		int topPos = this.topPos;
		this.blit(stack, leftPos, topPos, 0, 0, this.imageWidth, this.imageHeight);

		int progress = this.container.getProgress();
		this.blit(stack, this.leftPos + 76, this.topPos + 35, 176, 0, progress + 1, 16);
	}
}
