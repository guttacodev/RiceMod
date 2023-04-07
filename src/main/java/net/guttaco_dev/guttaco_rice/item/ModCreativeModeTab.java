package net.guttaco_dev.guttaco_rice.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RICEMOD_TAB = new CreativeModeTab("guttaco_ricetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RICE.get());
        }
    };
}
