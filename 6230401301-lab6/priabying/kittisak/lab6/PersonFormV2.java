package priabying.kittisak.lab6;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.*;

public class PersonFormV2 extends PersonFormV1 {
    protected JLabel sportsLabel;
    protected JLabel notLabel;
    protected JPanel notePanel;
    protected JTextArea notTextArea;
    protected JComboBox<String> sportsComboBox;
    protected JPanel v2Panel;
    protected JPanel endLayout;

    public PersonFormV2() {
        super();
    }

    public PersonFormV2(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        this.sportsLabel = new JLabel("Sports:");
        this.notLabel = new JLabel("Note:");
        this.sportsComboBox = new JComboBox<String>();
        sportsComboBox.addItem("Running");
        sportsComboBox.addItem("Swimming");
        sportsComboBox.addItem("Tennis");

        this.notTextArea = new JTextArea("",3, 35);
        GridBagConstraints gc = new GridBagConstraints();
        this.v2Panel = new JPanel(new GridBagLayout());

        gc.insets = new Insets(3, 3, 3, 3);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.gridx = 0;
        gc.gridy = 0;
        v2Panel.add(this.sportsLabel, gc);

        
        gc.gridx = 1;
        gc.gridy = 0;
        v2Panel.add(this.sportsComboBox, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        v2Panel.add(this.notLabel, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        v2Panel.add(this.notTextArea, gc);

        this.centerLayout.add(this.v2Panel);
        
      
        

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