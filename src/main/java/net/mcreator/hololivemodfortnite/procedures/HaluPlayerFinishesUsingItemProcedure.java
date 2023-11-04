package net.mcreator.hololivemodfortnite.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hololivemodfortnite.init.HololivemodfortniteModMobEffects;

public class HaluPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(HololivemodfortniteModMobEffects.HYDRATED.get(), 1200, 0, false, false));
	}
}
