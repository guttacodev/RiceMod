package net.guttaco_dev.guttaco_rice.item.logic;

import net.guttaco_dev.guttaco_rice.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class ShulkerBentoBoxItem extends Item {
    public static final int MAX_NUTRITION = 2048;

    public ShulkerBentoBoxItem(Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        CompoundTag tag = pStack.getOrCreateTag();

        if (pLivingEntity instanceof Player player) {
            int nutrition = getNutrition(pStack, player);
            if (nutrition > 0) {
                FoodData foodData = player.getFoodData();
                int remainingNutrition = tag.getInt("guttaco_rice.nutrition");
                foodData.eat(nutrition, pStack.getFoodProperties(pLivingEntity).getSaturationModifier());
                tag.putInt("guttaco_rice.nutrition", remainingNutrition - nutrition);
            }
        }

        return pStack;
    }

    public int getNutrition(ItemStack pStack, Player pPlayer) {
        CompoundTag tag = pStack.getOrCreateTag();
        int remainingNutrition = tag.getInt("guttaco_rice.nutrition");
        FoodData foodData = pPlayer.getFoodData();
        int hunger = 20 - foodData.getFoodLevel();
        return Math.min(hunger, remainingNutrition);
    }

    @Override
    public boolean overrideOtherStackedOnMe(ItemStack pStack, ItemStack pOther, Slot pSlot, ClickAction pAction, Player pPlayer, SlotAccess pAccess) {
        if (pOther.getItem() == ModItems.COOKED_RICE.get()) {
            CompoundTag tag = pStack.getOrCreateTag();
            int remainingNutrition = tag.getInt("guttaco_rice.nutrition");
            int maxAddableRice = (MAX_NUTRITION - remainingNutrition) / 2;
            int riceAmountToAdd = Math.min(maxAddableRice, pAction == ClickAction.PRIMARY ? pOther.getCount() : 1);
            int riceNutrition = pOther.getFoodProperties(pPlayer).getNutrition();
            tag.putInt("guttaco_rice.nutrition", remainingNutrition + riceAmountToAdd * riceNutrition);
            pOther.shrink(riceAmountToAdd);
            return true;
        }
        return false;
    }

    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack pStack) {
        return Optional.of(new BentoBoxOverlayHandler.BentoBoxTooltip(pStack));
    }

    public String getNutritionString(ItemStack pStack) {
        CompoundTag tag = pStack.getOrCreateTag();
        int remainingNutrition = tag.getInt("guttaco_rice.nutrition");
        return (remainingNutrition / 2) + (remainingNutrition % 2 == 1 ? ".5" : "");
    }

    public String getMaxNutritionString() {
        return Integer.toString(MAX_NUTRITION / 2);
    }
}
