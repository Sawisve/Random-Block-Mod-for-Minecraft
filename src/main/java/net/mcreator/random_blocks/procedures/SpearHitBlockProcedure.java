package net.mcreator.random_blocks.procedures;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.random_blocks.item.WoodenSpearItem;
import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class SpearHitBlockProcedure extends RandomBlocksModElements.ModElement {
	public SpearHitBlockProcedure(RandomBlocksModElements instance) {
		super(instance, 156);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SpearHitBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SpearHitBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SpearHitBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpearHitBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			ItemEntity entityToSpawn = new ItemEntity(world, x, y, z, new ItemStack(WoodenSpearItem.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.addEntity(entityToSpawn);
		}
	}
}
