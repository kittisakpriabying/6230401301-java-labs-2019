/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 3, 2019
*
**/
package priabying.kittisak.lab6;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingUtilities;

public class PersonFormV5 extends PersonFormV4 {

    private static final long serialVersionUID = 1L;

    public PersonFormV5() {
        super();
    }

    public PersonFormV5(String nameFrame) {
        super(nameFrame);
    }

    protected void setFonts() {

        // Set font ("Serif" , PLANE , 14 ).
        this.nameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.heigheLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.weightLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.birthLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.typeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.sportsLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.hobbiesLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.noteLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        // Set font ("Serif" , BOLD , 14 ).
        this.nameTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.heighTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.weighTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.birthTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.noteTextArea.setFont(new Font("Serif", Font.BOLD, 14));

    }

    protected void setColors() {
        // Set color to okButton and cancelButton.
        this.okButton.setForeground(Color.blue);
        this.cancelButton.setForeground(Color.red);
    }

    protected void setValues() {
        // Super.
        super.addComponents();

        // Set Text to TextField.
        this.nameTextField.setText("Manee");
        this.heighTextField.setText("160");
        this.weighTextField.setText("55");
        this.birthTextField.setText("02-02-2000");

        // Show select student.
        this.studentButton.setSelected(true);
        // Show select Swimming.
        this.sportsComboBox.setSelectedIndex(1);
        // Show select Reading and Photograpy.
        this.hobbiesList.setSelectedIndices(new int[] { 0, 3 });

    }

    @Override
    protected void initComponents() {
        super.initComponents();
        setFonts();
        setColors();
        setValues();
    }


    public static void createAndShowGUI() {
        PersonFormV5 personFormV5 = new PersonFormV5("Person Form V5");
        personFormV5.initComponents();
        personFormV5.addMenus();
        personFormV5.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}