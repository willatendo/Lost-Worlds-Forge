package lostworlds.common.recipe;

import com.google.gson.JsonObject;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class FossilCleanerRecipeSerialiser extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<FossilCleanerRecipe> 
{
	@Override
	public FossilCleanerRecipe fromJson(ResourceLocation recipeId, JsonObject json) 
	{
		ItemStack output = CraftingHelper.getItemStack(JSONUtils.convertToJsonObject(json, "output"), true);
		Ingredient input = Ingredient.fromJson(JSONUtils.convertToJsonObject(json, "input"));
		return new FossilCleanerRecipe(recipeId, input, output);
	}
	
	@Override
	public FossilCleanerRecipe fromNetwork(ResourceLocation recipeId, PacketBuffer buffer) 
	{
		ItemStack output = buffer.readItem();
		Ingredient input = Ingredient.fromNetwork(buffer);
		
		return new FossilCleanerRecipe(recipeId, input, output);
	}
	
	@Override
	public void toNetwork(PacketBuffer buffer, FossilCleanerRecipe recipe) 
	{
		Ingredient input = recipe.getIngredients().get(0);
		input.toNetwork(buffer);
		buffer.writeItemStack(recipe.getResultItem(), false);
	}
}