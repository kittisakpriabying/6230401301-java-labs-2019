package priabying.kittisak.lab6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {

    
    
    
    private static final long serialVersionUID = 1L;
    private static final String nameFrame = "";
    private static final String cancel = "Cancel";
    private static final String ok = "Ok";

    protected String frameTitle;

    protected JFrame mainFrame;
    protected JPanel mainPanel;
    protected JButton cancelButton;
    protected JButton okButton;

    public MySimpleWindow() {

        this.frameTitle = nameFrame;

        this.mainFrame = new JFrame();
    }

    public MySimpleWindow(String newframeTitle) {

        this.frameTitle = newframeTitle;

        this.mainFrame = new JFrame();
    }

    protected void addComponents() {

        this.mainPanel = new JPanel();

        this.cancelButton = new JButton(cancel);
        this.okButton = new JButton(ok);

        this.mainPanel.add(this.cancelButton);
        this.mainPanel.add(this.okButton);

        this.mainFrame.add(this.mainPanel);
    }

    protected void setFrameFeatures() {

        this.mainFrame.setTitle(this.frameTitle);

        this.mainFrame.pack();

        this.mainFrame.setVisible(true);

        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.mainFrame.setLocationRelativeTo(null);
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