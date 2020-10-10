package net.mcreator.random_blocks.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;

import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class EngineUpdateTickProcedure extends RandomBlocksModElements.ModElement {
	public EngineUpdateTickProcedure(RandomBlocksModElements instance) {
		super(instance, 201);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EngineUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EngineUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EngineUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EngineUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) (x + 1), (int) y, (int) z))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) (x + 1), (int) y, (int) z))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) y, (int) z));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		} else if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) (x - 1), (int) y, (int) z))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) (x - 1), (int) y, (int) z))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		} else if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) x, (int) (y + 1), (int) z))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) (y + 1), (int) z))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y + 1), (int) z));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		} else if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) x, (int) (y - 1), (int) z))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) (y - 1), (int) z))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		} else if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) x, (int) y, (int) (z + 1)))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) (z + 1)))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		} else if (((new Object() {
			public boolean canExtractEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(new BlockPos((int) x, (int) y, (int) (z - 1)))) && ((new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) (z - 1)))) > 99))) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
				int _amount = (int) 100;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				world.getWorld().addEntity(new ExperienceOrbEntity(world.getWorld(), x, y, z, (int) 1));
			}
		}
	}
}
