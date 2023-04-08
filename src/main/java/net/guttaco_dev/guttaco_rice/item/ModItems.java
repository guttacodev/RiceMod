package net.guttaco_dev.guttaco_rice.item;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.guttaco_dev.guttaco_rice.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiceMod.MOD_ID);

    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RICE_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB)));

    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB).food(ModFoods.RICE)));

    public static final RegistryObject<Item> COOKED_RICE = ITEMS.register("cooked_rice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB).food(ModFoods.COOKED_RICE)));

    public static final RegistryObject<Item> BOWL_OF_RICE = ITEMS.register("bowl_of_rice",
            () -> new StackedBowlItem(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB).food(ModFoods.BOWL_OF_RICE).stacksTo(16)));

    public static final RegistryObject<Item> KELP_BOWL = ITEMS.register("kelp_bowl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL = ITEMS.register("dried_kelp_bowl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB).food(ModFoods.DRIED_KELP_BOWL)));

    public static final RegistryObject<Item> DRIED_KELP_BOWL_OF_RICE = ITEMS.register("dried_kelp_bowl_of_rice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RICEMOD_TAB).food(ModFoods.DRIED_KELP_BOWL_OF_RICE)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
