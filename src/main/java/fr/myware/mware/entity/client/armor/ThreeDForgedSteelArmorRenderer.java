package fr.myware.mware.entity.client.armor;

import software.bernie.example.client.model.armor.GeckoArmorModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ThreeDForgedSteelArmorRenderer extends GeoArmorRenderer {
    public ThreeDForgedSteelArmorRenderer() {
        super(new ThreeDForgedSteelArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
