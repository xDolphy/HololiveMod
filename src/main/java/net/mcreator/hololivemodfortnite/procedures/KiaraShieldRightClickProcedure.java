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

public class KiaraShieldRightClickProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double shielddamage = 0;
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			{
				double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDamageValue();
				entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shielddamage = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(HololivemodfortniteModItems.KIARA_SHIELD_ACTIVE.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
					.setDamageValue((int) (entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HololivemodfortniteModVariables.PlayerVariables())).shielddamage);
			HololivemodfortniteMod.queueServerWork(20, () -> {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HololivemodfortniteModItems.KIARA_SHIELD_ACTIVE.get()) {
					{
						double _setval = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDamageValue();
						entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.shielddamage = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(HololivemodfortniteModItems.KIARA_SHIELD.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
							.setDamageValue((int) (entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HololivemodfortniteModVariables.PlayerVariables())).shielddamage);
				}
			});
		}
	}
}
