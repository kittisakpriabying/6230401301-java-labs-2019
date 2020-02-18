package priabying.kittisak.lab8;

import priabying.kittisak.lab6.*;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV6 extends PersonFormV5 implements ActionListener {

    private static final long serialVersionUID = 1L;

    public PersonFormV6(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String text = "";
        String name = "Name : " + nameTextField.getText();
        String height = "\nHight (cm.) : " + heighTextField.getText();
        String weight = "\nWeight (cm.) : " + weighTextField.getText();
        String dateOfBirth = "\nDate of Birth : " + birthTextField.getText();
        String type = "\nType : ";
        if (studentButton.isSelected()) {
            type += "Student";

        } else if (teacheButton.isSelected()) {
            type += "Teacher";
        }

        String sport = "\nSport : " + sportsComboBox.getSelectedItem();

        String h = "";
        for (String string : hobbiesList.getSelectedValuesList()) {
            h += string + " ";
        }

        String hobbies = "\nHobbies : " + h;

        String note = "\nNote : " + noteTextArea.getText();

        text += name + height + weight + dateOfBirth + type + sport + hobbies + note;

        Object srcObj = event.getSource();
        if (srcObj == cancelButton) {
            this.nameTextField.setText("");
            this.heighTextField.setText("");
            this.weighTextField.setText("");
            this.birthTextField.setText("");
            this.noteTextArea.setText("");

        } else if (srcObj == okButton) {

            JOptionPane.showMessageDialog(this, text, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }

    }

    protected void addListeners() {
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV6 msw = new PersonFormV6("Person Form V6");
        msw.initComponents();
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

}