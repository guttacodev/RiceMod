package net.guttaco_dev.guttaco_rice.integration;

import net.guttaco_dev.guttaco_rice.item.logic.ShulkerBentoBoxItem;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import squeek.appleskin.api.event.FoodValuesEvent;
import squeek.appleskin.api.food.FoodValues;

public class AppleSkinEventHandler {
    @SubscribeEvent
    public void onFoodValuesEvent(FoodValuesEvent event) {
        if (event.itemStack.getItem() instanceof ShulkerBentoBoxItem foodItem) {

            int nutrition = foodItem.getNutrition(event.itemStack, event.player);
            float saturationModifier = event.itemStack.getFoodProperties(event.player).getSaturationModifier();
            event.modifiedFoodValues = new FoodValues(nutrition, saturationModifier);
        }
    }
}
