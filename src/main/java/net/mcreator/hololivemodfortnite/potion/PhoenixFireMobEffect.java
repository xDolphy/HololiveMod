
package net.mcreator.hololivemodfortnite.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.hololivemodfortnite.procedures.PhoenixFireEffectStartedappliedProcedure;
import net.mcreator.hololivemodfortnite.procedures.PhoenixFireEffectExpiresProcedure;

public class PhoenixFireMobEffect extends MobEffect {
	public PhoenixFireMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39373);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hololivemodfortnite.phoenix_fire";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		PhoenixFireEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PhoenixFireEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
