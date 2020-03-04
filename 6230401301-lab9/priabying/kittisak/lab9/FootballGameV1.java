/**
 * 
 * This class extends GraphicsMoverV4  class .
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

import javax.swing.*;

public class FootballGameV1 extends GraphicsMoverV4 {
  
    private static final long serialVersionUID = 1L;
    protected CanvasDrawerV3 canvasDrawerV3;

    public FootballGameV1(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create canvasDrawerV3.
        this.canvasDrawerV3 = new CanvasDrawerV3();
    }

    @Override
    public void addComponents() {
        super.addComponents();
        // remove canvasDrawerV2.
        this.centerLayout.remove(this.canvasDrawerV2);
        // Add canvasDrawerV3 to centerLayout.
        this.centerLayout.add(this.canvasDrawerV3);
    }

    public static void createAndShowGUI() {
        FootballGameV1 fg1 = new FootballGameV1("FootballGameV1");
        fg1.initComponents();
        fg1.addComponents();
        fg1.setColors();
        fg1.setValues();
        fg1.setFonts();
        fg1.addMenus();
        fg1.setFrameFeatures();
        

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}