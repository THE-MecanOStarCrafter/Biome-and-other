package net.mcreator.biomeandother.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.biomeandother.particle.SlimefunguspoisonParticle;
import net.mcreator.biomeandother.BiomeAndOtherModElements;
import net.mcreator.biomeandother.BiomeAndOtherMod;

import java.util.Map;

@BiomeAndOtherModElements.ModElement.Tag
public class SlimefungusClientDisplayRandomTickProcedure extends BiomeAndOtherModElements.ModElement {
	public SlimefungusClientDisplayRandomTickProcedure(BiomeAndOtherModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency x for procedure SlimefungusClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency y for procedure SlimefungusClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency z for procedure SlimefungusClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency world for procedure SlimefungusClientDisplayRandomTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(SlimefunguspoisonParticle.particle, x, y, z, 0, 5, 0);
	}
}
