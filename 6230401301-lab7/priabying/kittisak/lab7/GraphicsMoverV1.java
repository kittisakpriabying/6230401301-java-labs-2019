package priabying.kittisak.lab7;

import javax.swing.*;
import java.awt.*;
import priabying.kittisak.lab6.*;

public class GraphicsMoverV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;
  
    protected JButton moveUpButton;
    protected JButton moveDownButton;
    protected JButton moveLeftButton;
    protected JButton moveRightButton;
    protected JButton resetButton;
    protected CanvasDrawerV1 canvasDrawerV1;

    public GraphicsMoverV1(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        this.canvasDrawerV1 = new CanvasDrawerV1();
        this.mainPanel = new JPanel(new BorderLayout());

        this.moveUpButton = new JButton("Move up");
        this.moveDownButton = new JButton("Move down");
        this.moveLeftButton = new JButton("Move left");
        this.moveRightButton = new JButton("Move right");
        this.resetButton = new JButton("Reset");


    }

    @Override
    protected void addComponents() {
        
        super.addComponents();
        this.buttonPanel.remove(this.okButton);
        this.buttonPanel.remove(this.cancelButton);
        this.buttonPanel.add(this.moveUpButton);
        this.buttonPanel.add(this.moveDownButton);
        this.buttonPanel.add(this.moveLeftButton);
        this.buttonPanel.add(this.moveRightButton);
        this.buttonPanel.add(this.resetButton);

        this.centerLayout.add(this.canvasDrawerV1);

    }

    @Override
    protected void setFrameFeatures() {
        super.setFrameFeatures();

    }

    public static void createAndShowGUI() {
        GraphicsMoverV1 gmv1 = new GraphicsMoverV1("Graphics Mover Version1");
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