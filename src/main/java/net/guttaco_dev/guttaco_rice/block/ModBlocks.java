package net.guttaco_dev.guttaco_rice.block;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.guttaco_dev.guttaco_rice.block.custom.RicePlantBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RiceMod.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static final RegistryObject<Block> RICE_PLANT = registerBlockWithoutBlockItem("rice_plant",
            () -> new RicePlantBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS).noOcclusion()));

    public static final RegistryObject<Block> WILD_RICE = registerBlockWithoutBlockItem("wild_rice",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.GRASS).noOcclusion()));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
