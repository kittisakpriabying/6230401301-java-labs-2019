/**
*
* Event handler for button .
* This Class implement ActionListener and extends PersonFormV5.
*
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 20, 2020
*
**/
package priabying.kittisak.lab8;

import priabying.kittisak.lab6.*;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV6 extends PersonFormV5 implements ActionListener {

    private static final long serialVersionUID = 1L;

    // Constuctor string parameter.
    public PersonFormV6(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String text = "";
        String name = "Name : " + nameTextField.getText(); // return text of textfield.
        String height = "\nHight (cm.) : " + heighTextField.getText();
        String weight = "\nWeight (cm.) : " + weighTextField.getText();
        String dateOfBirth = "\nDate of Birth : " + birthTextField.getText();
        String type = "\nType : ";
        if (studentButton.isSelected()) {
            type += "Student"; // Choose student button.

        } else if (teacheButton.isSelected()) {
            type += "Teacher"; // Choose teacher button.
        }

        String sport = "\nSport : " + sportsComboBox.getSelectedItem(); // Return sport selected .

        String h = "";
        for (String string : hobbiesList.getSelectedValuesList()) { // Rrturn hobbies selected .
            h += string + " ";
        }
        String hobbies = "\nHobbies : " + h;
        String note = "\nNote : " + noteTextArea.getText(); // Return text of TextArea.

        text += name + height + weight + dateOfBirth + type + sport + hobbies + note;

        Object srcObj = event.getSource();
        // If click cacel button all text are removed.
        if (srcObj == cancelButton) {
            this.nameTextField.setText("");
            this.heighTextField.setText("");
            this.weighTextField.setText("");
            this.birthTextField.setText("");
            this.noteTextArea.setText("");

        } else if (srcObj == okButton) { // If click ok button show image and text.

            JOptionPane.showMessageDialog(this, text, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }

    }

    protected void addListeners() {
        // Add ActionListener to button.
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