package net.guttaco_dev.guttaco_rice.item.logic;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class StackedBowlItem extends Item {
    public StackedBowlItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        ItemStack itemstack = super.finishUsingItem(pStack, pLevel, pLivingEntity);

        if (pStack.isEmpty()) {
            return new ItemStack(Items.BOWL);
        }

        if (pLivingEntity instanceof Player player) {
            if (!player.getAbilities().instabuild) {
                if (!player.getInventory().add(new ItemStack(Items.BOWL))) {
                    player.drop(new ItemStack(Items.BOWL), false);
                }
            }
        }

        return itemstack;
    }
}