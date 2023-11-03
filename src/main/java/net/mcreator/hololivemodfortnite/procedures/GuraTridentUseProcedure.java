package net.mcreator.hololivemodfortnite.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.hololivemodfortnite.network.HololivemodfortniteModVariables;
import net.mcreator.hololivemodfortnite.init.HololivemodfortniteModItems;
import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

public class GuraTridentUseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HololivemodfortniteModItems.GURA_TRIDENT.get()) {
			{
				double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDamageValue() + 0;
				entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.damage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			HololivemodfortniteMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(HololivemodfortniteModItems.GURA_TRIDENT.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.setDamageValue((int) (entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HololivemodfortniteModVariables.PlayerVariables())).damage);
			});
		}
	}
}
