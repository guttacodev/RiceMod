package net.guttaco_dev.guttaco_rice.logic;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.guttaco_dev.guttaco_rice.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RiceMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RICE.get()))
                    .title(Component.translatable("creativetab.guttaco-rice_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RICE_SEEDS.get());
                        pOutput.accept(ModItems.RICE.get());
                        pOutput.accept(ModItems.COOKED_RICE.get());
                        pOutput.accept(ModItems.SHULKER_BENTO_BOX.get());

                        pOutput.accept(ModItems.BOWL_OF_RICE.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_BEEF.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_CHICKEN.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_COD.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_MUTTON.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_PORKCHOP.get());
                        pOutput.accept(ModItems.BOWL_OF_RICE_SALMON.get());

                        pOutput.accept(ModItems.KELP_BOWL.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_BEEF.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_CHICKEN.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_COD.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_MUTTON.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_SALMON.get());
                        pOutput.accept(ModItems.DRIED_KELP_BOWL_OF_RICE_PORKCHOP.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
