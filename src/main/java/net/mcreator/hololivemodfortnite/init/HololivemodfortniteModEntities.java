
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hololivemodfortnite.entity.ItemxpotatoEntity;
import net.mcreator.hololivemodfortnite.entity.GuraTridentEntity;
import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HololivemodfortniteModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HololivemodfortniteMod.MODID);
	public static final RegistryObject<EntityType<GuraTridentEntity>> GURA_TRIDENT = register("projectile_gura_trident",
			EntityType.Builder.<GuraTridentEntity>of(GuraTridentEntity::new, MobCategory.MISC).setCustomClientFactory(GuraTridentEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ItemxpotatoEntity>> ITEMXPOTATO = register("projectile_itemxpotato",
			EntityType.Builder.<ItemxpotatoEntity>of(ItemxpotatoEntity::new, MobCategory.MISC).setCustomClientFactory(ItemxpotatoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
