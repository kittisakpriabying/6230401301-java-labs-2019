package priabying.kittisak.lab6;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.*;

public class PersonFormV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;
    protected JLabel nameLabel, heigheLabel, weightLabel, birthLabel, typeLabel;
    protected JTextField nameTextField, heighTextField, weighTextField, birthTextField;
    protected JRadioButton studentButton, teacheButton;
    protected ButtonGroup group;
    protected JPanel v1Panel, typeGroup;

    // constructor no paramter.
    public PersonFormV1() {
        super();

    }

    // constructor one paramter. (String)
    public PersonFormV1(String nameFrame) {
        super(nameFrame);

    }

    @Override
    protected void addComponents() {

        super.addComponents();
        // Create Label.
        this.nameLabel = new JLabel("Name:"); // Name
        this.heigheLabel = new JLabel("Height (cm.):"); // Height
        this.weightLabel = new JLabel("Weight (kg.):"); // Eeight
        this.birthLabel = new JLabel("Date of birth (eg.,31-01-1990):"); // Birth Day
        this.typeLabel = new JLabel("Type:"); // Type

        // Create TextField.
        this.heighTextField = new JTextField(15); // Height
        this.nameTextField = new JTextField(15); // Name
        this.weighTextField = new JTextField(15); // Weight
        this.birthTextField = new JTextField(15); // Birth day

        // Create RadioButton
        this.studentButton = new JRadioButton("Student", false);
        this.teacheButton = new JRadioButton("Teacher", false);

        // Set group type.
        this.group = new ButtonGroup();
        // Add studentButton and teacherButton to group.
        this.group.add(this.studentButton);
        this.group.add(this.teacheButton);

        // Create Panel for typeGroup.
        this.typeGroup = new JPanel();
        // Add studentButton and teacherButton to panel typeGroup.
        typeGroup.add(this.studentButton);
        typeGroup.add(this.teacheButton);

        // Set Layout
        GridBagConstraints gc = new GridBagConstraints();
        this.v1Panel = new JPanel(new GridBagLayout());

        gc.insets = new Insets(3, 3, 3, 3);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;

        // Name (0,0).
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.WEST;
        v1Panel.add(this.nameLabel, gc); //Add nameLabel to v1Panel.

        // nameTextField (1,0).
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.EAST;
        v1Panel.add(this.nameTextField, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.WEST;
        v1Panel.add(this.heigheLabel, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.EAST;
        v1Panel.add(this.heighTextField, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.WEST;
        v1Panel.add(this.weightLabel, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.EAST;
        v1Panel.add(this.weighTextField, gc);

        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.WEST;
        v1Panel.add(this.birthLabel, gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.EAST;
        v1Panel.add(this.birthTextField, gc);

        gc.gridx = 0;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.WEST;
        v1Panel.add(this.typeLabel, gc);

        gc.gridx = 1;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.EAST;
        v1Panel.add(this.typeGroup, gc);

        // Add v1Panel to centerLaout from MySimpleWindow class.
        this.centerLayout.add(this.v1Panel);

    }

    public static void createAndShowGUI() {
        PersonFormV1 personFormV1 = new PersonFormV1("Person form V1");
        personFormV1.addComponents();
        personFormV1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}