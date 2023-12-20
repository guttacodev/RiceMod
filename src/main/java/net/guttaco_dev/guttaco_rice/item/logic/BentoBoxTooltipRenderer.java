//package net.guttaco_dev.guttaco_rice.item.logic;
//
//import net.minecraft.world.item.ItemStack;
//import com.mojang.blaze3d.systems.RenderSystem;
//import com.mojang.blaze3d.vertex.PoseStack;
//import net.minecraft.client.gui.Font;
//import net.minecraft.client.gui.GuiComponent;
//import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
//import net.minecraft.client.renderer.entity.ItemRenderer;
//class BentoBoxTooltipRenderer implements ClientTooltipComponent {
//    private BentoBoxOverlayHandler.BentoBoxTooltip bentoBoxTooltip;
//
//    BentoBoxTooltipRenderer(BentoBoxOverlayHandler.BentoBoxTooltip bentoBoxTooltip) {
//        this.bentoBoxTooltip = bentoBoxTooltip;
//    }
//
//    public int m_142103_() {
//        return 12;
//    }
//
//    public int m_142069_(Font pFont) {
//        int width = 12;
//        width += pFont.m_92895_(this.bentoBoxTooltip.getMaxNutritionString());
//        width = (int)((double)width + 2.0 + (double)pFont.m_92895_(this.bentoBoxTooltip.getMaxNutritionString()) * 0.75);
//        return width;
//    }
//
//    public void m_183452_(Font pFont, int pMouseX, int pMouseY, PoseStack pPoseStack, ItemRenderer pItemRenderer, int pBlitOffset) {
//        ItemStack itemStack = this.bentoBoxTooltip.itemStack;
//        RenderSystem.m_157456_(0, GuiComponent.f_93098_);
//        GuiComponent.m_93143_(pPoseStack, pMouseX, pMouseY, pBlitOffset, 52.0F, 27.0F, 9, 9, 256, 256);
//        int offsetX = pMouseX + 12;
//        int offsetY = pMouseY + 1;
//        pPoseStack.m_85837_((double)offsetX, (double)offsetY, (double)pBlitOffset);
//        pFont.m_92750_(pPoseStack, this.bentoBoxTooltip.getNutritionString(), 0.0F, 0.0F, -43521);
//        pPoseStack.m_85849_();
//        pPoseStack.m_85836_();
//        offsetX += 2 + pFont.m_92895_(this.bentoBoxTooltip.getNutritionString());
//        pPoseStack.m_85837_((double)offsetX, (double)offsetY, (double)pBlitOffset);
//        pPoseStack.m_85841_(0.75F, 0.75F, 0.75F);
//        pFont.m_92750_(pPoseStack, this.bentoBoxTooltip.getMaxNutritionString(), 0.0F, 0.0F, -5592406);
//        pPoseStack.m_85849_();
//    }
//
//    @Override
//    public int getHeight() {
//        return 0;
//    }
//
//    @Override
//    public int getWidth(Font pFont) {
//        return 0;
//    }
//}