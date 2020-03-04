/**
*
* Event handler for Radiobutton .
* This Class implement ItemListener and extends PersonFormV6.
*
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 20, 2020
*
**/
package priabying.kittisak.lab8;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;

public class PersonFormV7 extends PersonFormV6 implements ItemListener {
    private static final long serialVersionUID = 1L;

    // Constuctor string parameter.
    public PersonFormV7(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

        String student = "Type : student has been selected";
        String teacher = "Type : teacher has been selected";

        Object srcObj = event.getSource();
        if (srcObj == studentButton) { 
            if (event.getStateChange() == ItemEvent.SELECTED) { // Student button is selected.
                JOptionPane.showMessageDialog(this, student, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            }

        } else if (srcObj == teacheButton) {
            if (event.getStateChange() == ItemEvent.SELECTED) { // Teacher button is selected.
                JOptionPane.showMessageDialog(this, teacher, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
            }
        }

    }

    @Override
    protected void addListeners() {
        super.addListeners();

        //Add ItemListener to radiobutton.
        studentButton.addItemListener(this);
        teacheButton.addItemListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV7 msw = new PersonFormV7("Person Form V7");
        msw.initComponents();
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

}