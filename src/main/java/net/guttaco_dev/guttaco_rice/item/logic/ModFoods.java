package net.guttaco_dev.guttaco_rice.item.logic;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RICE = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0F).build();
    public static final FoodProperties COOKED_RICE = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.4F).build();
    public static final FoodProperties SHULKER_BENTO_BOX = (new FoodProperties.Builder()).nutrition(0).saturationMod(0.7F).build();

    public static final FoodProperties BOWL_OF_RICE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_PORKCHOP = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_BEEF = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_COD = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_SALMON = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_CHICKEN = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).build();
    public static final FoodProperties BOWL_OF_RICE_MUTTON = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).build();

    public static final FoodProperties DRIED_KELP_BOWL = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.5F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_PORKCHOP = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_BEEF = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_COD = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_SALMON = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_CHICKEN = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).build();
    public static final FoodProperties DRIED_KELP_BOWL_OF_RICE_MUTTON = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).build();
}
