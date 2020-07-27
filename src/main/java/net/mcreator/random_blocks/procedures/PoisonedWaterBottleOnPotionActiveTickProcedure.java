package net.mcreator.random_blocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class PoisonedWaterBottleOnPotionActiveTickProcedure extends RandomBlocksModElements.ModElement {
	public PoisonedWaterBottleOnPotionActiveTickProcedure(RandomBlocksModElements instance) {
		super(instance, 150);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PoisonedWaterBottleOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
