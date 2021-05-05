
package net.mcreator.biomeandother.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.biomeandother.BiomeAndOtherModElements;

@BiomeAndOtherModElements.ModElement.Tag
public class BaconItem extends BiomeAndOtherModElements.ModElement {
	@ObjectHolder("biome_and_other:bacon")
	public static final Item block = null;
	public BaconItem(BiomeAndOtherModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(6).saturation(0.3f).meat().build()));
			setRegistryName("bacon");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
