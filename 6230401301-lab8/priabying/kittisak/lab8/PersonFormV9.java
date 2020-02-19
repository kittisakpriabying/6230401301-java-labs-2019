package priabying.kittisak.lab8;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * PersonFormV9
 */
public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PersonFormV9(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        String hobbieString = "";
        for (String string : hobbiesList.getSelectedValuesList()) {
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