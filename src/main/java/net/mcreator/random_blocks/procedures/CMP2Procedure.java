package net.mcreator.random_blocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class CMP2Procedure extends RandomBlocksModElements.ModElement {
	public CMP2Procedure(RandomBlocksModElements instance) {
		super(instance, 153);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CMP2!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CMP2!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CMP2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CMP2!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double FireHeight = 0;
		if (((new Object() {
			public double getValue(BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuel")) > 0)) {
			FireHeight = (double) (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "fuelRemaining")) / 100) * 0.0625);
			if (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, (x + 0.5), (y + 0.2), (z - 0.1), (int) 1, (Math.random() * 0.01),
							(FireHeight), (Math.random() * 0.01), (Math.random() * 0.01));
				}
			} else if (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, (x + 0.5), (y + 0.2), (z + 1.1), (int) 1, (Math.random() * 0.01),
							(FireHeight), (Math.random() * 0.01), (Math.random() * 0.01));
				}
			} else if (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, (x - 0.1), (y + 0.2), (z + 0.5), (int) 1, (Math.random() * 0.01),
							(FireHeight), (Math.random() * 0.01), (Math.random() * 0.01));
				}
			} else if (((new Object() {
				public Direction getDirection(BlockPos pos) {
					try {
						BlockState _bs = world.getBlockState(pos);
						DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						return _bs.get(property);
					} catch (Exception e) {
						return Direction.NORTH;
					}
				}
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, (x + 1.1), (y + 0.2), (z + 0.5), (int) 1, (Math.random() * 0.01),
							(FireHeight), (Math.random() * 0.01), (Math.random() * 0.01));
				}
			}
			world.playSound((PlayerEntity) null, x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.furnace.fire_crackle")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
	}
}
