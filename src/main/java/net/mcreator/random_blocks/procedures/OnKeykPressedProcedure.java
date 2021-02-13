package net.mcreator.random_blocks.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class OnKeykPressedProcedure extends RandomBlocksModElements.ModElement {
	public OnKeykPressedProcedure(RandomBlocksModElements instance) {
		super(instance, 121);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure OnKeykPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("This function is not enable."), (true));
		}
	}
}
