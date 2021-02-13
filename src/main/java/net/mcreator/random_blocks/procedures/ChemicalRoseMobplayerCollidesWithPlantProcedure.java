package net.mcreator.random_blocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class ChemicalRoseMobplayerCollidesWithPlantProcedure extends RandomBlocksModElements.ModElement {
	public ChemicalRoseMobplayerCollidesWithPlantProcedure(RandomBlocksModElements instance) {
		super(instance, 157);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ChemicalRoseMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
