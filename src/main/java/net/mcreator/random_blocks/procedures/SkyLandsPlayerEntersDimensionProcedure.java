package net.mcreator.random_blocks.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class SkyLandsPlayerEntersDimensionProcedure extends RandomBlocksModElements.ModElement {
	public SkyLandsPlayerEntersDimensionProcedure(RandomBlocksModElements instance) {
		super(instance, 173);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SkyLandsPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SkyLandsPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SkyLandsPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SkyLandsPlayerEntersDimension!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z)))) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.STONE.getDefaultState(), 3);
		}
	}
}
