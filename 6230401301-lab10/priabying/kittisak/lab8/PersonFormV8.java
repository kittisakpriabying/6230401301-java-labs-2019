/**
*
* Event handler for combobox .
* This Class extends PersonFormV7.
*
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 20, 2020
*
**/

package priabying.kittisak.lab8;

import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV8 extends PersonFormV7 {

    private static final long serialVersionUID = 1L;

    // Constructor string parameter.
    public PersonFormV8(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        super.itemStateChanged(event);
        String sport = "Your sport is now changed to " + sportsComboBox.getSelectedItem(); // return sport selected.
        Object srcObject = event.getSource();
        if (srcObject == sportsComboBox) {
            if (event.getStateChange() == ItemEvent.SELECTED) { // Sports combobox is selected.
                JOptionPane.showMessageDialog(this, sport, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            }
        }

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        // Add ItemListener to sport combobox.
        sportsComboBox.addItemListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV8 msw = new PersonFormV8("Person Form V8");
        msw.initComponents();
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
}