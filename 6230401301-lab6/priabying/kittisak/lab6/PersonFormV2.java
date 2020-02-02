package priabying.kittisak.lab6;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.*;

public class PersonFormV2 extends PersonFormV1 {

    private static final long serialVersionUID = 1L;
    protected JLabel sportsLabel;
    protected JLabel noteLabel;
    protected JPanel notePanel;
    protected JTextArea noteTextArea;
    protected JComboBox<String> sportsComboBox;
    protected JScrollPane noteScrollPane;

    // constructor no paramter.
    public PersonFormV2() {
        super();
    }

    // constructor one paramter. (String)
    public PersonFormV2(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        // Create Label.
        this.sportsLabel = new JLabel("Sports:"); // Sports.
        this.noteLabel = new JLabel("Note:"); // Note.

        // Create ComboBox.
        this.sportsComboBox = new JComboBox<String>();
        // Add Item to ComboBox.
        sportsComboBox.addItem("Running");
        sportsComboBox.addItem("Swimming");
        sportsComboBox.addItem("Tennis");

        // Create Panel and GridBagLaout.
        this.notePanel = new JPanel(new GridBagLayout());

        // Create TextArea 3 rows and 35 columns.
        this.noteTextArea = new JTextArea(
                "21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc.", 2, 35);

        // Create ScrollPane.
        this.noteScrollPane = new JScrollPane(this.noteTextArea);

        this.noteTextArea.setLineWrap(true);
        this.noteTextArea.setWrapStyleWord(true);

        // Create GridBagConstraints.
        GridBagConstraints gc = new GridBagConstraints();

        // Set Layout notePanel.
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(3, 3, 3, 3);
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridy = 0;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        this.notePanel.add(this.noteLabel, gc);
        gc.gridy = 1;
        gc.gridx = 0;
        this.notePanel.add(this.noteScrollPane, gc);

        // Continuing from PersonFormV1.
        gc.gridy = 5;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        this.v1Panel.add(this.sportsLabel, gc);

        gc.gridy = 5;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.EAST;
        this.v1Panel.add(this.sportsComboBox, gc);

        // Add notePanel to endLayout from MySimpleWindow class.
        this.centerLayout.add(this.notePanel);

    }

    public static void createAndShowGUI() {
        PersonFormV2 personForm2 = new PersonFormV2("Person Form V2");
        personForm2.addComponents();
        personForm2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}