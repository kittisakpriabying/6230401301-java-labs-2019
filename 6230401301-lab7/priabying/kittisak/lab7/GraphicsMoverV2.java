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
import java.awt.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {

    private static final long serialVersionUID = 1L;
    protected JPanel topLayout;
    protected JLabel team1Label;
    protected JLabel team2Label;
    protected JTextField team1TextField;
    protected JTextField team2TextField;
    private static final int textLength = 1;

    // Constuctor one parameter.
    public GraphicsMoverV2(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create panel.
        this.topLayout = new JPanel();
        // SetLayout and create BoxLayout.
        this.topLayout.setLayout(new BoxLayout(this.topLayout, BoxLayout.Y_AXIS));

        // Create label.
        this.team1Label = new JLabel("Khonkaen");
        this.team2Label = new JLabel("Udon Thani");

        // Create textfield.
        this.team1TextField = new JTextField(textLength);
        this.team2TextField = new JTextField(textLength);

    }

    @Override
    protected void addComponents() {
        super.addComponents();
        // Add label and textfield to topLayout(Panel);
        this.topLayout.add(this.team1Label);
        this.topLayout.add(this.team1TextField);
        this.topLayout.add(this.team2Label);
        this.topLayout.add(this.team2TextField);
        
        // Set layout by FlowLayout is keep right.
        this.topLayout.setLayout(new FlowLayout(FlowLayout.RIGHT));
        // Add topLayout to mainPanel and set BorderLayout to PAGE_START.
        this.mainPanel.add(this.topLayout, BorderLayout.PAGE_START);

    }

    protected void setColors() {
        // Set color label by setForegraound.
        this.team1Label.setForeground(Color.BLUE);
        this.team2Label.setForeground(Color.RED);
    }

    protected void setFonts() {
        // Set font ("Serif", Font.BOLD, 20).
        this.team1TextField.setFont(new Font("Serif", Font.BOLD, 20));
        this.team2TextField.setFont(new Font("Serif", Font.BOLD, 20));
    }

    protected void setValues() {
        // Set text to team1TextField and team2TextField.
        this.team1TextField.setText("3");
        this.team2TextField.setText("1");

    }

    public static void createAndShowGUI() {
        GraphicsMoverV2 gmv2 = new GraphicsMoverV2("Graphics Mover Version 2");
        gmv2.initComponents();
        gmv2.addComponents();
        gmv2.setFrameFeatures();
        gmv2.setColors();
        gmv2.setValues();
        gmv2.setFonts();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}