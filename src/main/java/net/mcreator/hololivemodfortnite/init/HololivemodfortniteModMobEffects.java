
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.hololivemodfortnite.potion.PhoenixFireMobEffect;
import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

public class HololivemodfortniteModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HololivemodfortniteMod.MODID);
	public static final RegistryObject<MobEffect> PHOENIX_FIRE = REGISTRY.register("phoenix_fire", () -> new PhoenixFireMobEffect());
}
