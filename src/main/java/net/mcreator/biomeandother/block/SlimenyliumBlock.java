
package net.mcreator.biomeandother.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.biomeandother.BiomeAndOtherModElements;

import java.util.List;
import java.util.Collections;

@BiomeAndOtherModElements.ModElement.Tag
public class SlimenyliumBlock extends BiomeAndOtherModElements.ModElement {
	@ObjectHolder("biome_and_other:slimenylium")
	public static final Block block = null;
	public SlimenyliumBlock(BiomeAndOtherModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.NYLIUM).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("slimenylium");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
