package net.mcreator.hololivemodfortnite.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hololivemodfortnite.network.HololivemodfortniteModVariables;

public class PhoenixFireHealingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.isInLava() || entity.isOnFire()) && (entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HololivemodfortniteModVariables.PlayerVariables())).phoenixfireactive == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 5, 1, false, false));
		}
	}
}
