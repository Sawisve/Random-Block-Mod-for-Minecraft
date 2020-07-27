package net.mcreator.random_blocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class DeathPotionOnPotionActiveTickProcedure extends RandomBlocksModElements.ModElement {
	public DeathPotionOnPotionActiveTickProcedure(RandomBlocksModElements instance) {
		super(instance, 117);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DeathPotionOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 1e+25);
	}
}
