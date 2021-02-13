package net.mcreator.random_blocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.item.GoldenSpearItem;
import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class GSpearUsedProcedure extends RandomBlocksModElements.ModElement {
	public GSpearUsedProcedure(RandomBlocksModElements instance) {
		super(instance, 174);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure GSpearUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(GoldenSpearItem.block, (int) (1)).getItem())) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
			}
		}
	}
}
