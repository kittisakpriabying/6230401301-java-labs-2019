/**
 * 
 * This class extends FootballGameV2 class.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FootballGameV3 extends FootballGameV2 {
    private static final long serialVersionUID = 1L;

    // Constuctor one parameter.
    public FootballGameV3(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Call super actionperformed.
        super.actionPerformed(e);
        // Create Object.
        Object obj = e.getSource();
        if (obj == resetButton) {
            team1TextField.setText("0");
            team2TextField.setText("0");
            middlePanel.resetBall();
        }

    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create middlePanel.
        middlePanel = new CanvasDrawerV5();

    }

    @Override
    public void addComponents() {
        super.addComponents();
        // Add middlePanel to centerLayout.
        centerLayout.add(middlePanel);

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        // Add ActionListener to reset button.
        resetButton.addActionListener(this);
    }

    public static void createAndShowGUI() {
        FootballGameV3 fg2 = new FootballGameV3("FootballGameV2");
        fg2.initComponents();
        fg2.addComponents();
        fg2.setColors();
        fg2.setValues();
        fg2.setFonts();
        fg2.addMenus();
        fg2.addListeners();
        fg2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}