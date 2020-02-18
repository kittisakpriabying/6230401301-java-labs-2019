package priabying.kittisak.lab8;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * PersonFormV8
 */
public class PersonFormV8 extends PersonFormV7 {

    public PersonFormV8(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        String sport = "Your sport is now changed to " + sportsComboBox.getSelectedItem();

        Object srcObj = event.getSource();
        if (srcObj == sportsComboBox) {
            JOptionPane.showMessageDialog(this, sport , "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

        } 
    }

    @Override
    protected void addListeners(){
        super.addListeners();
        sportsComboBox.addActionListener(this);
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
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
}