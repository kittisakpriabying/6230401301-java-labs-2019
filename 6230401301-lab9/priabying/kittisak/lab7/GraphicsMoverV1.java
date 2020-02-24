/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 15, 2020
*
**/
package priabying.kittisak.lab7;

import javax.swing.*;
import priabying.kittisak.lab6.*;

public class GraphicsMoverV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;

    protected JButton moveUpButton;
    protected JButton moveDownButton;
    protected JButton moveLeftButton;
    protected JButton moveRightButton;
    protected JButton resetButton;
    protected CanvasDrawerV1 canvasDrawerV1;

    // Constuctor one parameter.
    public GraphicsMoverV1(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create CanvasDrawerV1.
        this.canvasDrawerV1 = new CanvasDrawerV1();

        // Create button.
        this.moveUpButton = new JButton("Move up");
        this.moveDownButton = new JButton("Move down");
        this.moveLeftButton = new JButton("Move left");
        this.moveRightButton = new JButton("Move right");
        this.resetButton = new JButton("Reset");

    }

    @Override
    protected void addComponents() {

        super.addComponents();
        // Remove okButton and cancelButton in buttonPanel.
        this.buttonPanel.remove(this.okButton);
        this.buttonPanel.remove(this.cancelButton);

        // Add new button to buttonPanel.
        this.buttonPanel.add(this.moveUpButton);
        this.buttonPanel.add(this.moveDownButton);
        this.buttonPanel.add(this.moveLeftButton);
        this.buttonPanel.add(this.moveRightButton);
        this.buttonPanel.add(this.resetButton);

        // Add canvasDrawerV1 to centerLayout(in MySimpleWindow class).
        this.centerLayout.add(this.canvasDrawerV1);

    }

    public static void createAndShowGUI() {
        GraphicsMoverV1 gmv1 = new GraphicsMoverV1("Graphics Mover Version 1");
        gmv1.initComponents();
        gmv1.addComponents();
        gmv1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}