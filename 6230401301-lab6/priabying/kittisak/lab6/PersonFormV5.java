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

        this.nameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.heigheLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.weightLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.birthLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.typeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.sportsLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.hobbiesLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.noteLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        this.nameTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.heighTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.weighTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.birthTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.noteTextArea.setFont(new Font("Serif", Font.BOLD, 14));

    }

    protected void setColors() {
        this.okButton.setForeground(Color.blue);
        this.cancelButton.setForeground(Color.red);
    }

    protected void setValues() {
        

        this.nameTextField.setText("Manee");
        this.heighTextField.setText("160");
        this.weighTextField.setText("55");
        this.birthTextField.setText("02-02-2000");

        this.studentButton.setSelected(true);
        this.sportsComboBox.setSelectedIndex(1);
        this.hobbiesList.setSelectedIndices(new int[] { 0, 3 });

    }

    @Override
    protected void initComponents() {
        super.initComponents();
        setFonts();
        setColors();
        setValues();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
    }

    protected void addComponts() {
        super.initComponents();
        setFonts();
        setColors();
        setValues();
    }

    public static void createAndShowGUI() {
        PersonFormV5 personFormV5 = new PersonFormV5("Person Form V5");
        personFormV5.initComponents();
        personFormV5.addComponents();
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