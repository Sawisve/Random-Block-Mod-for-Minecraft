package net.mcreator.random_blocks.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.random_blocks.block.LampBlock;
import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class LampOnBlockRightClickedProcedure extends RandomBlocksModElements.ModElement {
	public LampOnBlockRightClickedProcedure(RandomBlocksModElements instance) {
		super(instance, 111);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LampOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LampOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LampOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LampOnBlockRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), LampBlock.block.getDefaultState(), 3);
	}
}
