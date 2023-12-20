package net.guttaco_dev.guttaco_rice.datagen;

import net.guttaco_dev.guttaco_rice.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //Wooden Rice Bowls
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE.get())
                .requires(ModItems.COOKED_RICE.get(), 2).requires(Items.BOWL)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_BEEF.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL).requires(Items.COOKED_BEEF)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_beef");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_BEEF.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_BEEF)
                .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_beef_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_CHICKEN.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL).requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_chicken");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_CHICKEN.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_chicken_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_PORKCHOP.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL).requires(Items.COOKED_PORKCHOP)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_porkchop", has(Items.COOKED_PORKCHOP))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_porkchop");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_PORKCHOP.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_PORKCHOP)
                .unlockedBy("has_cooked_porkchop", has(Items.COOKED_PORKCHOP))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_porkchop_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_MUTTON.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL).requires(Items.COOKED_MUTTON)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_mutton", has(Items.COOKED_MUTTON))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_mutton");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_MUTTON.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_MUTTON)
                .unlockedBy("has_cooked_mutton", has(Items.COOKED_MUTTON))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_mutton_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_COD.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL).requires(Items.COOKED_COD)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_cod", has(Items.COOKED_COD))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_cod");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_COD.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_COD)
                .unlockedBy("has_cooked_cod", has(Items.COOKED_COD))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_cod_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_SALMON.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(Items.BOWL)
                .requires(Items.COOKED_SALMON)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_salmon", has(Items.COOKED_SALMON))
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(pWriter, "bowl_of_rice_salmon");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BOWL_OF_RICE_SALMON.get())
                .requires(ModItems.BOWL_OF_RICE.get())
                .requires(Items.COOKED_SALMON)
                .unlockedBy("has_cooked_salmon", has(Items.COOKED_SALMON))
                .unlockedBy("bowl_of_rice", has(ModItems.BOWL_OF_RICE.get()))
                .save(pWriter, "bowl_of_rice_salmon_from_bowl");


        //Dried Kelp Bowls
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(ModItems.COOKED_RICE.get(), 2).requires(ModItems.DRIED_KELP_BOWL.get())
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_BEEF.get())
                .requires(ModItems.COOKED_RICE.get(), 2).requires(ModItems.DRIED_KELP_BOWL.get())
                .requires(Items.COOKED_BEEF)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_beef");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_BEEF.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(Items.COOKED_BEEF)
                .unlockedBy("has_cooked_beef", has(Items.COOKED_BEEF))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_beef_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_CHICKEN.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(ModItems.DRIED_KELP_BOWL.get()).requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_chicken");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_CHICKEN.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_cooked_chicken", has(Items.COOKED_CHICKEN))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_chicken_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_PORKCHOP.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(ModItems.DRIED_KELP_BOWL.get())
                .requires(Items.COOKED_PORKCHOP)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_porkchop", has(Items.COOKED_PORKCHOP))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_porkchop");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_PORKCHOP.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(Items.COOKED_PORKCHOP).unlockedBy("has_cooked_porkchop", has(Items.COOKED_PORKCHOP))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_porkchop_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_MUTTON.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(ModItems.DRIED_KELP_BOWL.get())
                .requires(Items.COOKED_MUTTON).unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_mutton", has(Items.COOKED_MUTTON))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_mutton");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_MUTTON.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get()).requires(Items.COOKED_MUTTON)
                .unlockedBy("has_cooked_mutton", has(Items.COOKED_MUTTON))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_mutton_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_COD.get())
                .requires(ModItems.COOKED_RICE.get(), 2).requires(ModItems.DRIED_KELP_BOWL.get())
                .requires(Items.COOKED_COD)
                .unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_cod", has(Items.COOKED_COD))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_cod");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_COD.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(Items.COOKED_COD)
                .unlockedBy("has_cooked_cod", has(Items.COOKED_COD))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_cod_from_bowl");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_SALMON.get())
                .requires(ModItems.COOKED_RICE.get(), 2)
                .requires(ModItems.DRIED_KELP_BOWL.get())
                .requires(Items.COOKED_SALMON).unlockedBy("has_cooked_rice", has(ModItems.COOKED_RICE.get()))
                .unlockedBy("has_cooked_salmon", has(Items.COOKED_SALMON))
                .unlockedBy("has_dried_kelp_bowl", has(ModItems.DRIED_KELP_BOWL.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_salmon");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DRIED_KELP_BOWL_OF_RICE_SALMON.get())
                .requires(ModItems.DRIED_KELP_BOWL_OF_RICE.get())
                .requires(Items.COOKED_SALMON)
                .unlockedBy("has_cooked_salmon", has(Items.COOKED_SALMON))
                .unlockedBy("has_dried_kelp_bowl_of_rice", has(ModItems.DRIED_KELP_BOWL_OF_RICE.get()))
                .save(pWriter, "dried_kelp_bowl_of_rice_salmon_from_bowl");

        //Others
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KELP_BOWL.get())
                .define('a', Items.KELP)
                .pattern("a a")
                .pattern(" a ")
                .unlockedBy("has_kelp", has(Items.KELP))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.BOWL, 16)
                .define('a', ItemTags.LOGS)
                .pattern("a a")
                .pattern(" a ")
                .unlockedBy("has_logs", has(ItemTags.LOGS))
                .save(pWriter);
    }
}