package net.mcreator.random_blocks.procedures;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class OnKeykPressedProcedure extends RandomBlocksModElements.ModElement {
	public OnKeykPressedProcedure(RandomBlocksModElements instance) {
		super(instance, 118);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OnKeykPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OnKeykPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("This function is not enable."), (true));
		}
	}
}
