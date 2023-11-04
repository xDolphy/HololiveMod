
package net.mcreator.hololivemodfortnite.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HydratedMobEffect extends MobEffect {
	public HydratedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5773589);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hololivemodfortnite.hydrated";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
