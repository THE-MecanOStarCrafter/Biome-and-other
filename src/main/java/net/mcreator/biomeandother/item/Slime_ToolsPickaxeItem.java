
package net.mcreator.biomeandother.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.biomeandother.BiomeAndOtherModElements;

@BiomeAndOtherModElements.ModElement.Tag
public class Slime_ToolsPickaxeItem extends BiomeAndOtherModElements.ModElement {
	@ObjectHolder("biome_and_other:slime_tools_pickaxe")
	public static final Item block = null;
	public Slime_ToolsPickaxeItem(BiomeAndOtherModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SlimeingotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("slime_tools_pickaxe"));
	}
}
