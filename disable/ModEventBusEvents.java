package fr.myware.mware.envent;

import fr.myware.mware.MyWare;
import fr.myware.mware.entity.client.armor.ThreeDForgedSteelArmorRenderer;
import fr.myware.mware.item.custom.ThreeDForgedSteelArmorItem;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


@Mod.EventBusSubscriber(modid = MyWare.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {



    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ThreeDForgedSteelArmorItem.class, new ThreeDForgedSteelArmorRenderer());
    }
}