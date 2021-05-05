package net.mcreator.biomeandother.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biomeandother.BiomeAndOtherModElements;
import net.mcreator.biomeandother.BiomeAndOtherMod;

import java.util.Map;

@BiomeAndOtherModElements.ModElement.Tag
public class SlimefungusMobplayerCollidesWithPlantProcedure extends BiomeAndOtherModElements.ModElement {
	public SlimefungusMobplayerCollidesWithPlantProcedure(BiomeAndOtherModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiomeAndOtherMod.LOGGER.warn("Failed to load dependency entity for procedure SlimefungusMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 2, (int) 1, (false), (false)));
	}
}
