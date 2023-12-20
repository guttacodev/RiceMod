package net.guttaco_dev.guttaco_rice.item;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.guttaco_dev.guttaco_rice.block.ModBlocks;
import net.guttaco_dev.guttaco_rice.item.logic.ModFoods;
import net.guttaco_dev.guttaco_rice.item.logic.ShulkerBentoBoxItem;
import net.guttaco_dev.guttaco_rice.item.logic.StackedBowlItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiceMod.MOD_ID);

    // Items
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(ModFoods.RICE)));

    public static final RegistryObject<Item> COOKED_RICE = ITEMS.register("cooked_rice",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_RICE)));

    public static final RegistryObject<Item> SHULKER_BENTO_BOX = ITEMS.register("shulker_bento_box",
            () -> new ShulkerBentoBoxItem(new Item.Properties().food(ModFoods.SHULKER_BENTO_BOX).stacksTo(1)));

    // Bowls
    public static final RegistryObject<Item> BOWL_OF_RICE = ITEMS.register("bowl_of_rice",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_PORKCHOP = ITEMS.register("bowl_of_rice_porkchop",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_PORKCHOP).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_BEEF = ITEMS.register("bowl_of_rice_beef",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_BEEF).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_COD = ITEMS.register("bowl_of_rice_cod",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_COD).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_SALMON = ITEMS.register("bowl_of_rice_salmon",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_SALMON).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_CHICKEN = ITEMS.register("bowl_of_rice_chicken",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_CHICKEN).stacksTo(16)));

    public static final RegistryObject<Item> BOWL_OF_RICE_MUTTON = ITEMS.register("bowl_of_rice_mutton",
            () -> new StackedBowlItem(new Item.Properties().food(ModFoods.BOWL_OF_RICE_MUTTON).stacksTo(16)));

    // Kelp Bowls
    public static final RegistryObject<Item> KELP_BOWL = ITEMS.register("kelp_bowl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_KELP_BOWL = ITEMS.register("dried_kelp_bowl",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE = ITEMS.register("dried_kelp_bowl_of_rice",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_PORKCHOP = ITEMS.register("dried_kelp_bowl_of_rice_porkchop",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_PORKCHOP)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_BEEF = ITEMS.register("dried_kelp_bowl_of_rice_beef",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_BEEF)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_COD = ITEMS.register("dried_kelp_bowl_of_rice_cod",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_COD)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_SALMON = ITEMS.register("dried_kelp_bowl_of_rice_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_SALMON)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_CHICKEN = ITEMS.register("dried_kelp_bowl_of_rice_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_CHICKEN)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE_MUTTON = ITEMS.register("dried_kelp_bowl_of_rice_mutton",
            () -> new Item(new Item.Properties().food(ModFoods.DRIED_KELP_BOWL_OF_RICE_MUTTON)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
