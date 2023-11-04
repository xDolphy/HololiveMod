package net.mcreator.hololivemodfortnite.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.hololivemodfortnite.network.HololivemodfortniteModVariables;

public class PhoenixFireEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(HololivemodfortniteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.phoenixfireactive = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
