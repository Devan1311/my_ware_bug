package fr.myware.mware.util;

import fr.myware.mware.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static net.minecraft.client.renderer.item.ItemProperties.register;
import static net.minecraft.client.renderer.item.ItemProperties.registerGeneric;

public class ModItemProperties {

    public static void addCustomItemProperties() {
        makeShield(ModItems.IRON_SHIELD.get());
    }

    private static void makeShield(Item item) {
        ItemProperties.register(item, new ResourceLocation("blocking"), (p_174590_, p_174591_, p_174592_, p_174593_) -> {
            return p_174592_ != null && p_174592_.isUsingItem() && p_174592_.getUseItem() == p_174590_ ? 1.0F : 0.0F;
        });
    }
}