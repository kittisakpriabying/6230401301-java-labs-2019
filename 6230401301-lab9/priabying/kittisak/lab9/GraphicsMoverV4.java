
package priabying.kittisak.lab9;

import javax.swing.*;

import priabying.kittisak.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected CanvasDrawerV2 canvasDrawerV2;

    public GraphicsMoverV4(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        this.canvasDrawerV2 = new CanvasDrawerV2();
    }

    @Override
    public void addComponents() {
        super.addComponents();
        moveUpButton.setText("Move Left Up");
        moveDownButton.setText("Move Left Down");
        moveLeftButton.setText("Move Right Up");
        moveRightButton.setText("Move Right Down");

        centerLayout.remove(canvasDrawerV1);
        centerLayout.add(canvasDrawerV2);

    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 gmv4 = new GraphicsMoverV4("Graphics Mover Version 4");
        gmv4.initComponents();
        gmv4.addComponents();
        gmv4.setFrameFeatures();
        gmv4.setColors();
        gmv4.setValues();
        gmv4.setFonts();
        gmv4.addMenus();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}