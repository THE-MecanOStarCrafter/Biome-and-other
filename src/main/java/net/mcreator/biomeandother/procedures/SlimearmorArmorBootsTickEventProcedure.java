package net.mcreator.biomeandother.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.biomeandother.BiomeAndOtherModElements;
import net.mcreator.biomeandother.BiomeAndOtherMod;

import java.util.Map;

@BiomeAndOtherModElements.ModElement.Tag
public class SlimearmorArmorBootsTickEventProcedure extends BiomeAndOtherModElements.ModElement {
	public SlimearmorArmorBootsTickEventProcedure(BiomeAndOtherModElements instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency x for procedure SlimearmorArmorBootsTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency y for procedure SlimearmorArmorBootsTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency z for procedure SlimearmorArmorBootsTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency world for procedure SlimearmorArmorBootsTickEvent!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = Blocks.SLIME_BLOCK.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
