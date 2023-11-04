
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hololivemodfortnite.item.KiaraSwordItem;
import net.mcreator.hololivemodfortnite.item.KiaraShieldItem;
import net.mcreator.hololivemodfortnite.item.KiaraShieldActiveItem;
import net.mcreator.hololivemodfortnite.item.ItemxpotatoItem;
import net.mcreator.hololivemodfortnite.item.GuraTridentItem;
import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

public class HololivemodfortniteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HololivemodfortniteMod.MODID);
	public static final RegistryObject<Item> GURA_TRIDENT = REGISTRY.register("gura_trident", () -> new GuraTridentItem());
	public static final RegistryObject<Item> ITEMXPOTATO = REGISTRY.register("itemxpotato", () -> new ItemxpotatoItem());
	public static final RegistryObject<Item> KIARA_SWORD = REGISTRY.register("kiara_sword", () -> new KiaraSwordItem());
	public static final RegistryObject<Item> KIARA_SHIELD = REGISTRY.register("kiara_shield", () -> new KiaraShieldItem());
	public static final RegistryObject<Item> KIARA_SHIELD_ACTIVE = REGISTRY.register("kiara_shield_active", () -> new KiaraShieldActiveItem());
}
