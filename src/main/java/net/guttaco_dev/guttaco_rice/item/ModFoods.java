package net.guttaco_dev.guttaco_rice.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RICE = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0F).build();
    public static final FoodProperties COOKED_RICE = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.1F).build();
    public static final FoodProperties BOWL_OF_RICE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.7F).build();
    public static final FoodProperties DRIED_KELP_BOWL = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.8F).build();
}
