package net.guttaco_dev.guttaco_rice.util;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;



public class ModTags {
    public static class Blocks {
        public static final  TagKey<Block> RICE_PLANT = forgeTag("crops/rice");
        public static final TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RiceMod.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items {
        public static final TagKey<Item> RICE_SEEDS = forgeTag("seeds/rice");
        public static final TagKey<Item> RICE = forgeTag("crops/rice"); //add option to use tags instead of item for recipe

        public static final TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RiceMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
