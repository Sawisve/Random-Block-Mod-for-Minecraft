package net.mcreator.random_blocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.item.FonriumaArmorItem;
import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class PlasProcedure extends RandomBlocksModElements.ModElement {
	public PlasProcedure(RandomBlocksModElements instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Plas!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FonriumaArmorItem.body, (int) (1)))
				: false))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.isFlying = (false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}
