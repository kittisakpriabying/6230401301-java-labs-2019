package priabying.kittisak.lab6;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.*;

public class PersonFormV1 extends MySimpleWindow {

    private static final long serialVersionUID = 1L;
    protected JLabel nameLabel, heigheLabel, weightLabel, birthLabel, typeLabel;
    protected JTextField nameTextField, heighTextField, weighTextField, birthTextField;
    protected JRadioButton studentButton, teacheButton;
    protected ButtonGroup group;
    protected JPanel v1Panel, typeGroup;
    protected JPanel centerLayout;

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
        // 
        super.addComponents();
        
        this.nameLabel = new JLabel("Name:");
        this.nameTextField = new JTextField(15);

        this.heigheLabel = new JLabel("Height (cm.):");
        this.heighTextField = new JTextField(15);
        this.heigheLabel.setLocation(1, 2);

        this.weightLabel = new JLabel("Weight (kg.):");
        this.weighTextField = new JTextField(15);

        this.birthLabel = new JLabel("Date of birth (eg.,31-01-1990):");
        this.birthTextField = new JTextField(15);

        this.typeLabel = new JLabel("Type:");
        this.group = new ButtonGroup();
        this.studentButton = new JRadioButton("Student", false);
        this.teacheButton = new JRadioButton("Teacher", false);
        this.group.add(this.studentButton);
        this.group.add(this.teacheButton);

        this.typeGroup = new JPanel();
        typeGroup.add(this.studentButton);
        typeGroup.add(this.teacheButton);

        GridBagConstraints gc = new GridBagConstraints();
        this.v1Panel = new JPanel(new GridBagLayout());

        gc.insets = new Insets(3, 3, 3, 3);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 0;
        v1Panel.add(this.nameLabel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 0;
        v1Panel.add(this.nameTextField, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 1;
        v1Panel.add(this.heigheLabel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 1;
        v1Panel.add(this.heighTextField, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 2;
        v1Panel.add(this.weightLabel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 2;
        v1Panel.add(this.weighTextField, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 3;
        v1Panel.add(this.birthLabel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 3;
        v1Panel.add(this.birthTextField, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 4;
        v1Panel.add(this.typeLabel, gc);

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 4;
        v1Panel.add(this.typeGroup, gc);

        this.centerLayout = new JPanel();

        centerLayout.setLayout(new BoxLayout(centerLayout, BoxLayout.PAGE_AXIS));
        this.centerLayout.add(this.v1Panel);
        this.add(this.centerLayout);
        this.add(BorderLayout.CENTER, this.centerLayout);

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