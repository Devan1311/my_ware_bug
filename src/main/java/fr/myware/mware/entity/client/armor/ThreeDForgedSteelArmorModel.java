package fr.myware.mware.entity.client.armor;

import fr.myware.mware.MyWare;
import fr.myware.mware.item.custom.ThreeDForgedSteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ThreeDForgedSteelArmorModel extends AnimatedGeoModel<ThreeDForgedSteelArmorItem> {
    @Override
    public ResourceLocation getModelLocation(ThreeDForgedSteelArmorItem object) {
        return new ResourceLocation(MyWare.MOD_ID, "geo/threedforgedsteelarmor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ThreeDForgedSteelArmorItem object) {
        return new ResourceLocation(MyWare.MOD_ID, "textures/models/armor/three_d_forged_steel_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ThreeDForgedSteelArmorItem animatable) {
        return new ResourceLocation(MyWare.MOD_ID, "animations/armor_animation.json");
    }
}