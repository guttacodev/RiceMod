package net.guttaco_dev.guttaco_rice.datagen;

import net.guttaco_dev.guttaco_rice.RiceMod;
import net.guttaco_dev.guttaco_rice.item.ModItems;
import net.guttaco_dev.guttaco_rice.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {

        super(output, RiceMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("rice_from_grass", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.RICE_SEEDS.get()));
        }
}

