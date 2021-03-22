package lostworlds.core.util.enums;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTeir implements IItemTier
{
	BRUSH(0, 34, 1.5F, 1.4F, 0, () -> 
	{
		return Ingredient.fromItems(Items.STRING);
	}),
	BONE(0, 125, 2.5F, 1.0F, 20, () -> 
	{
		return Ingredient.fromItems(Items.BONE);
	}),
	ANCIENT(2, 550, 5.0F, 10.0F, 5, () ->
	{
		return Ingredient.fromItems(Items.IRON_INGOT);
	}),	
	SCARAB(4, 15000, 30.0F, 80.0F, 40, () -> 
	{
		return Ingredient.fromItems(Items.ACACIA_BOAT);
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTeir(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) 
	{
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}
	
	public int getMaxUses() 
	{
		return this.maxUses;
	}
	
	public float getEfficiency() 
	{
		return this.efficiency;
	}
	
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}
	
	public int getHarvestLevel() 
	{
		return this.harvestLevel;
	}
	
	public int getEnchantability() 
	{
		return this.enchantability;
	}
	
	public Ingredient getRepairMaterial() 
	{
		return this.repairMaterial.getValue();
	}
}