package net.guttaco_dev.guttaco_rice.world.feature;

import net.guttaco_dev.guttaco_rice.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.material.Fluids;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WILD_RICE_SPAWN =
        FeatureUtils.register("wild_rice_spawn", Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(
                        20,
                        4,
                        0,
                        PlacementUtils.filtered(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WILD_RICE.get())),
                                BlockPredicate.allOf(
                                        BlockPredicate.matchesBlock(Blocks.AIR, BlockPos.ZERO),
                                        BlockPredicate.matchesBlock(Blocks.GRASS_BLOCK, new BlockPos(0, -1, 0)),
                                        BlockPredicate.anyOf(
                                                BlockPredicate.matchesFluids(List.of(Fluids.WATER, Fluids.FLOWING_WATER),new BlockPos(1, -1, 0)),
                                                BlockPredicate.matchesFluids(List.of(Fluids.WATER, Fluids.FLOWING_WATER), new BlockPos(-1, -1, 0)),
                                                BlockPredicate.matchesFluids(List.of(Fluids.WATER, Fluids.FLOWING_WATER), new BlockPos(0, -1, 1)),
                                                BlockPredicate.matchesFluids(List.of(Fluids.WATER, Fluids.FLOWING_WATER), new BlockPos(0, -1, -1))
                                        )
                                )
                        )
                )
        );
}