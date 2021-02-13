package net.mcreator.random_blocks.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class SurvivalOnKeyPressedProcedure extends RandomBlocksModElements.ModElement {
	public SurvivalOnKeyPressedProcedure(RandomBlocksModElements instance) {
		super(instance, 134);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SurvivalOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.hasPermissionLevel((int) 4))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
		}
	}
}
