/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 2, 2019
*
**/
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
    protected JPanel buttonPanel;
    protected JPanel centerLayout;
    protected JButton okButton;
    protected JButton cancelButton;

    // constructor no paramter.
    public MySimpleWindow() {
        super();
    }

    public MySimpleWindow(String namePanel) {
        super(namePanel);

    }

    // constructor one paramter. (String)
    protected void addComponents() {

        // Create panel
        this.mainPanel = new JPanel(new BorderLayout());
        this.buttonPanel = new JPanel();
        
        // SetLayout to Center.
        this.centerLayout = new JPanel();
        this.centerLayout.setLayout(new BoxLayout(this.centerLayout, BoxLayout.Y_AXIS));
        // SetLayout to End.
        this.endLayout = new JPanel();
        this.endLayout.setLayout(new BoxLayout(this.endLayout, BoxLayout.Y_AXIS));
        // Create button "ok" and "cancel".
        this.okButton = new JButton("ok");
        this.cancelButton = new JButton("cancel");

        // Add button to buttonPanel.
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        // Add mainPanel to endPanel.
        this.endLayout.add(this.buttonPanel);

        // Add startLayout to mainPanel.
        this.mainPanel.add(this.centerLayout, BorderLayout.CENTER); // CENTER
        this.mainPanel.add(this.endLayout, BorderLayout.PAGE_END); // END

        // Add mainPanel to Frame.
        this.add(this.mainPanel);
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