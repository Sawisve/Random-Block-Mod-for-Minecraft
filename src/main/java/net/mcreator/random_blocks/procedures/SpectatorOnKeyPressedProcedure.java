package net.mcreator.random_blocks.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class SpectatorOnKeyPressedProcedure extends RandomBlocksModElements.ModElement {
	public SpectatorOnKeyPressedProcedure(RandomBlocksModElements instance) {
		super(instance, 138);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpectatorOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.hasPermissionLevel((int) 4))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SPECTATOR);
		}
	}
}
