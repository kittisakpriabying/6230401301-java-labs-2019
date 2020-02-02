package priabying.kittisak.lab6;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {

    private static final long serialVersionUID = -7714389855370776112L;
    protected JPanel mainPanel;
    protected JPanel endLayout;
    protected JPanel endPanel;
    protected JButton okButton;
    protected JButton cancelButton;

    // constructor
    public MySimpleWindow() {
        super();
    }

    public MySimpleWindow(String namePanel) {
        super(namePanel);

    }

    protected void addComponents() {

        // Create button "ok" and "cancel".
        this.okButton = new JButton("ok");
        this.cancelButton = new JButton("cancel");

        // Create panel
        this.mainPanel = new JPanel();
        this.endPanel = new JPanel();
        this.endLayout = new JPanel();

        // Add button to mainPanel.
        mainPanel.add(okButton);
        mainPanel.add(cancelButton);

        // Add mainPanel to endPanel.
        this.endPanel.add(this.mainPanel);

        // SetLayout endLayout by BoxLayout().
        endLayout.setLayout(new BoxLayout(endLayout, BoxLayout.Y_AXIS));

        // Add endPanel to endLayout.
        this.endLayout.add(this.endPanel);

        // Set endLayout to PAGE_END.
        this.add(BorderLayout.PAGE_END, this.endLayout);
    }

    protected void setFrameFeatures() {

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}