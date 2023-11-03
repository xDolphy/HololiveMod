
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hololivemodfortnite.item.GuraTridentItem;
import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

public class HololivemodfortniteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HololivemodfortniteMod.MODID);
	public static final RegistryObject<Item> GURA_TRIDENT = REGISTRY.register("gura_trident", () -> new GuraTridentItem());
}
