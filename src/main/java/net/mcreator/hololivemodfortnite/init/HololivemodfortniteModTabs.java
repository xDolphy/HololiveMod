
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hololivemodfortnite.HololivemodfortniteMod;

public class HololivemodfortniteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HololivemodfortniteMod.MODID);
	public static final RegistryObject<CreativeModeTab> REFERENCES_CREATIVE_TAB = REGISTRY.register("references_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hololivemodfortnite.references_creative_tab")).icon(() -> new ItemStack(Blocks.WATER)).displayItems((parameters, tabData) -> {
				tabData.accept(HololivemodfortniteModItems.GURA_TRIDENT.get());
			})

					.build());
}
