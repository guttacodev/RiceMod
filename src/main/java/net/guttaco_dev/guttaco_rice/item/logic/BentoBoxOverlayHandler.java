package net.guttaco_dev.guttaco_rice.item.logic;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Matrix4f;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class BentoBoxOverlayHandler {
    public static void init() {
        MinecraftForgeClient.registerTooltipComponentFactory(BentoBoxTooltip.class, BentoBoxTooltipRenderer::new);
    }

    static class BentoBoxTooltipRenderer implements ClientTooltipComponent
    {
        private BentoBoxTooltip bentoBoxTooltip;
        BentoBoxTooltipRenderer(BentoBoxTooltip bentoBoxTooltip)
        {
            this.bentoBoxTooltip = bentoBoxTooltip;
        }

        @Override
        public int getHeight() {
            return 12;
        }

        @Override
        public int getWidth(Font pFont) {
            int width = 12;
            width += pFont.width(bentoBoxTooltip.getMaxNutritionString());
            width += 2 + pFont.width(bentoBoxTooltip.getMaxNutritionString()) * 0.75;
            return width;
        }

        @Override
        public void renderImage(Font pFont, int pMouseX, int pMouseY, PoseStack pPoseStack, ItemRenderer pItemRenderer, int pBlitOffset) {
            ItemStack itemStack = bentoBoxTooltip.itemStack;
            int offsetX = pMouseX;
            int offsetY = pMouseY;

            RenderSystem.setShaderTexture(0, GuiComponent.GUI_ICONS_LOCATION);
            GuiComponent.blit(pPoseStack, offsetX, offsetY, pBlitOffset, 52, 27, 9, 9, 256, 256);

            offsetX += 12;
            offsetY += 1;
            pPoseStack.translate(offsetX, offsetY, pBlitOffset);
            pFont.drawShadow(pPoseStack, bentoBoxTooltip.getNutritionString(), 0, 0, 0xFFFF55FF);
            pPoseStack.popPose();

            pPoseStack.pushPose();
            offsetX += 2 + pFont.width(bentoBoxTooltip.getNutritionString());
            pPoseStack.translate(offsetX, offsetY, pBlitOffset);
            pPoseStack.scale(0.75f, 0.75f, 0.75f);
            pFont.drawShadow(pPoseStack, bentoBoxTooltip.getMaxNutritionString(), 0, 0, 0xFFAAAAAA);
            pPoseStack.popPose();
        }
    }

    static class BentoBoxTooltip implements TooltipComponent
    {
        private ItemStack itemStack;

        BentoBoxTooltip(ItemStack itemStack) {
            this.itemStack = itemStack;
        }

        String getNutritionString() {
            ShulkerBentoBoxItem item = (ShulkerBentoBoxItem) itemStack.getItem();
            return item.getNutritionString(itemStack);
        }

        String getMaxNutritionString() {
            ShulkerBentoBoxItem item = (ShulkerBentoBoxItem) itemStack.getItem();
            return "/" + item.getMaxNutritionString();
        }
    }

}
