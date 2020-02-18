package priabying.kittisak.lab8;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;

public class PersonFormV7 extends PersonFormV6 implements ActionListener {
    private static final long serialVersionUID = 1L;

    public PersonFormV7(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        
        String student = "Type : student has been selected";
        String teacher = "Type : teacher has been selected";

        Object srcObj = event.getSource();
        if (srcObj == studentButton) {
            JOptionPane.showMessageDialog(this, student, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

        } else if (srcObj == teacheButton) {
            JOptionPane.showMessageDialog(this, teacher, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        studentButton.addActionListener(this);
        teacheButton.addActionListener(this);

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
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
}