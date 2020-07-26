
package net.mcreator.random_blocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.random_blocks.RandomBlocksModElements;

@RandomBlocksModElements.ModElement.Tag
public class FonriumSwordItem extends RandomBlocksModElements.ModElement {
	@ObjectHolder("random_blocks:fonrium_sword")
	public static final Item block = null;
	public FonriumSwordItem(RandomBlocksModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 90000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 38f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(FonriumDustItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("fonrium_sword"));
	}
}
