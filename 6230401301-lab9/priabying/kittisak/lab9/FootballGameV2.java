/**
 * 
 * This class extends FootballGameV1 class and implement ActionListener, KeyListener.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;


import javax.swing.*;
import java.awt.event.*;

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener {
    protected CanvasDrawerV4 middlePanel;
    private static final long serialVersionUID = 1L;

    public FootballGameV2(String nameFrame) {
        super(nameFrame);
        setFocusable(true);
        requestFocus();
    }
    @Override
    protected void initComponents() {
        super.initComponents();
        // Create middlePanel.
        this.middlePanel = new CanvasDrawerV4();
    }

    @Override
    public void addComponents() {
        super.addComponents();
        //remove canvasDrawerV3.
        centerLayout.remove(canvasDrawerV3);
        //Add middlePanel to centerLayout.
        centerLayout.add(middlePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == moveUpButton) {
            middlePanel.keeperLeft.moveUp();
        } else if (obj == moveDownButton) {
            middlePanel.keeperLeft.moveDown();
        } else if (obj == moveLeftButton) {
            middlePanel.keeperRight.moveUp();
        } else if (obj == moveRightButton) {
            middlePanel.keeperRight.moveDown();
        }

    }

    protected void addListeners() {
        // Add ActionListener to button.
        moveUpButton.addActionListener(this);
        moveDownButton.addActionListener(this);
        moveLeftButton.addActionListener(this);
        moveRightButton.addActionListener(this);

        this.addKeyListener(this);

    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            middlePanel.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_DOWN) {
            middlePanel.keeperLeft.moveDown();
        } else if (key == KeyEvent.VK_LEFT) {
            middlePanel.keeperRight.moveUp();
        } else if (key == KeyEvent.VK_RIGHT) {
            middlePanel.keeperRight.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public static void createAndShowGUI() {
        FootballGameV2 fg2 = new FootballGameV2("FootballGameV2");
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