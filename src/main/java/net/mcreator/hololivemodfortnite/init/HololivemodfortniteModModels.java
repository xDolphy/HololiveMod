
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hololivemodfortnite.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hololivemodfortnite.client.model.ModelGuraTrident_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HololivemodfortniteModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelGuraTrident_Converted.LAYER_LOCATION, ModelGuraTrident_Converted::createBodyLayer);
	}
}
