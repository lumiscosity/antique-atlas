package folk.sisby.antique_atlas.gui.core;

import net.minecraft.client.gui.DrawContext;

public class VScrollbarComponent extends AbstractScrollbarComponent {

    public VScrollbarComponent(ViewportComponent viewport) {
        super(viewport);
    }

    @Override
    protected void drawAnchor(DrawContext context) {
        // Draw top cap:
        context.drawTexture(texture, getGuiX(), getGuiY() + anchorPos, textureWidth, capLength, 0, 0, textureWidth, capLength, textureWidth, textureHeight);

        // Draw body:
        context.drawTexture(texture, getGuiX(), getGuiY() + anchorPos + capLength, textureWidth, anchorSize, 0, capLength, textureWidth, textureBodyLength, textureWidth, textureHeight);

        // Draw bottom cap:
        context.drawTexture(texture, getGuiX(), getGuiY() + anchorPos + capLength + anchorSize, 0, textureHeight - capLength, textureWidth, capLength, textureWidth, textureHeight);
    }

    @Override
    protected int getTextureLength() {
        return textureHeight;
    }

    @Override
    protected int getScrollbarLength() {
        return getHeight();
    }

    @Override
    protected int getViewportSize() {
        return viewport.getHeight();
    }

    @Override
    protected int getContentSize() {
        return viewport.contentHeight;
    }

    @Override
    protected int getMousePos(int mouseX, int mouseY) {
        return mouseY - getGuiY();
    }

    @Override
    protected void updateContentPos() {
        viewport.content.setRelativeCoords(viewport.content.getRelativeX(), -scrollPos);
    }

    @Override
    protected void setScrollbarWidth(int textureWidth, int textureHeight) {
        setSize(textureWidth, getHeight());
    }

}
