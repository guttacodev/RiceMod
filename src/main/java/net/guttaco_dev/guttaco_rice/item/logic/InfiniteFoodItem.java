package net.guttaco_dev.guttaco_rice.item.logic;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class InfiniteFoodItem extends Item {
    public InfiniteFoodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        pLivingEntity.eat(pLevel, pStack.copy());
        return pStack;
    }
}


