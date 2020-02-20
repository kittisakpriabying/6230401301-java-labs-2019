/**
*
* Event handler for menu , submenu .
* This Class implement  extends PersonFormV9.
*
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 20, 2020
*
**/
package priabying.kittisak.lab8;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class PersonFormV10 extends PersonFormV9 {

    private static final long serialVersionUID = 1L;

    // Constructor string parameter.
    public PersonFormV10(String nameFrame) {
        super(nameFrame);
    }

    // Create method set font color.
    protected void setFontColor(Color color) {
        this.nameTextField.setForeground(color);
        this.weighTextField.setForeground(color);
        this.heighTextField.setForeground(color);
        this.birthTextField.setForeground(color);
        this.noteTextArea.setForeground(color);

    }

    // Create method set font size.
    protected void setFontSize(int size) {
        this.nameTextField.setFont(new Font("Serif", Font.PLAIN, size));
        this.heighTextField.setFont(new Font("Serif", Font.PLAIN, size));
        this.weighTextField.setFont(new Font("Serif", Font.PLAIN, size));
        this.birthTextField.setFont(new Font("Serif", Font.PLAIN, size));
        this.noteTextArea.setFont(new Font("Serif", Font.PLAIN, size));

    }

    // Create method addKey() can click keybord.
    protected void addKeys() {
        // Set the accelerator.
        // Can click Ctrl+...
        this.redSubMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK)); // Ctrl + R
        this.greenSubMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK)); // Ctrl + G
        this.blueSubMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK)); // Ctrl + B
        this.size16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK)); // Ctrl + 1
        this.size20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK)); // Ctrl + 0
        this.size24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK)); // Ctrl + 4

        // Set the Mnemonic .
        this.redSubMenu.setMnemonic(KeyEvent.VK_R);
        this.greenSubMenu.setMnemonic(KeyEvent.VK_G);
        this.blueSubMenu.setMnemonic(KeyEvent.VK_B);
        this.configMenu.setMnemonic(KeyEvent.VK_C);
        this.colorMenu.setMnemonic(KeyEvent.VK_L);
        this.sizeMenu.setMnemonic(KeyEvent.VK_Z);
        this.size16.setMnemonic(KeyEvent.VK_1);
        this.size20.setMnemonic(KeyEvent.VK_0);
        this.size24.setMnemonic(KeyEvent.VK_4);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object srcObject = event.getSource();
        if (srcObject == redSubMenu) {
            setFontColor(Color.RED);
        } else if (srcObject == greenSubMenu) {
            setFontColor(Color.GREEN);

        } else if (srcObject == blueSubMenu) {
            setFontColor(Color.BLUE);

        } else if (srcObject == size16) {
            setFontSize(16);

        } else if (srcObject == size20) {
            setFontSize(20);

        } else if (srcObject == size24) {
            setFontSize(24);
        }

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        // Add ActionListener to submenu.
        redSubMenu.addActionListener(this);
        greenSubMenu.addActionListener(this);
        blueSubMenu.addActionListener(this);
        size16.addActionListener(this);
        size20.addActionListener(this);
        size24.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV10 msw = new PersonFormV10("Person Form V10");
        msw.initComponents();
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }
}