package priabying.kittisak.lab8;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;

/**
 * PersonFormV9
 */
public class PersonFormV9 extends PersonFormV8 {

    public PersonFormV9(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        String hobbies = "Selected Hobbies :  " + hobbiesList.getSelectedValue();

        Object srcObj = event.getSource();
        if (srcObj == hobbiesList) {
            JOptionPane.showMessageDialog(this, hobbies, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        hobbiesList.addActionListener(this);
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
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

}