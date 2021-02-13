package net.mcreator.random_blocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.random_blocks.item.FonriumaArmorItem;
import net.mcreator.random_blocks.RandomBlocksModElements;

import java.util.Map;

@RandomBlocksModElements.ModElement.Tag
public class FonriumBodyTickEventProcedure extends RandomBlocksModElements.ModElement {
	public FonriumBodyTickEventProcedure(RandomBlocksModElements instance) {
		super(instance, 208);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure FonriumBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(FonriumaArmorItem.body, (int) (1)))
				: false)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 400, (int) 5, (false), (false)));
		}
	}
}
