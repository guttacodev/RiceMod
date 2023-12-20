//package net.guttaco_dev.guttaco_rice.world.feature;
//
//import net.guttaco_dev.guttaco_rice.block.ModBlocks;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Holder;
//import net.minecraft.data.worldgen.features.FeatureUtils;
//import net.minecraft.data.worldgen.placement.PlacementUtils;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
//import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
//import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
//import net.minecraft.world.level.material.Fluid;
//import net.minecraft.world.level.material.Fluids;
//
//public class ModConfiguredFeatures {
//    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WILD_RICE_SPAWN =
//        FeatureUtils.register("wild_rice_spawn", Feature.RANDOM_PATCH,
//            new RandomPatchConfiguration(
//                20,
//                4,
//                0,
//                PlacementUtils.filtered(
//                    Feature.SIMPLE_BLOCK,
//                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WILD_RICE.get())),
//                    BlockPredicate.allOf(
//                           new BlockPredicate[]{BlockPredicate.matchesBlocks(new Block[]{Blocks.AIR}),
//                        BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), new Block[]{Blocks.GRASS_BLOCK}),
//                        BlockPredicate.anyOf( new BlockPredicate[]{
//                                BlockPredicate.matchesFluids(new BlockPos(1, -1, 0), Fluids.WATER, Fluids.FLOWING_WATER),
//                                BlockPredicate.matchesFluids(new BlockPos(-1, -1, 0), new Fluid[]{Fluids.WATER, Fluids.FLOWING_WATER}),
//                                BlockPredicate.matchesFluids(new BlockPos(0, -1, 1), new Fluid[]{Fluids.WATER, Fluids.FLOWING_WATER}),
//                                BlockPredicate.matchesFluids(new BlockPos(0, -1, -1), new Fluid[]{Fluids.WATER, Fluids.FLOWING_WATER})
//                        })}
//                    )
//                )
//            )
//        );
//}