/**
*
* Event handler for List .
* This Class implement ListSelectionListener and extends PersonFormV8.
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {

    private static final long serialVersionUID = 1L;

    // Constructor string parameter.
    public PersonFormV9(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        String hobbieString = "";
        for (String string : hobbiesList.getSelectedValuesList()) { // Return list selected.
            hobbieString += string + " "; 
        }
        String hobbies = "Selected Hobbies : " + hobbieString;
        Object srcObject = event.getSource();
        if (srcObject == hobbiesList) {
            JOptionPane.showMessageDialog(this, hobbies, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

        }

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        // Add ListSelectionListener to hobbiesList.
        hobbiesList.addListSelectionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV9 msw = new PersonFormV9("Person Form V9");
        msw.initComponents();
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

}