/**
 * 
 * This class extends GraphicsMoverV3 class.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

import javax.swing.*;

import priabying.kittisak.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {
    private static final long serialVersionUID = 1L;
    protected CanvasDrawerV2 canvasDrawerV2;
    public GraphicsMoverV4(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create canvasDrawwrV2.
        this.canvasDrawerV2 = new CanvasDrawerV2();
    }

    @Override
    public void addComponents() {
        super.addComponents();
        // Set text to button.
        moveUpButton.setText("Move Left Up");
        moveDownButton.setText("Move Left Down");
        moveLeftButton.setText("Move Right Up");
        moveRightButton.setText("Move Right Down");

        // Remove canvasDrawerV1.
        centerLayout.remove(canvasDrawerV1);
        // Add canvasDrawerV2 to centerLayout.
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