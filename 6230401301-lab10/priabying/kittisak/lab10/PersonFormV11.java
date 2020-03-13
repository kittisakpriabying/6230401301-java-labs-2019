/**
 * 
 * This class extends PersonFormV10 class.
 * Create color choosee.
 * Open file.
 * Save file.
 * Exit program.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 9, 2020
 */
package priabying.kittisak.lab10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import priabying.kittisak.lab8.PersonFormV10;

public class PersonFormV11 extends PersonFormV10 {

    private static final long serialVersionUID = 1L;
    protected JMenuItem customItem;
    protected JFileChooser openFile;
    protected JFileChooser saveFile;

    public PersonFormV11(String nameFrame) {
        super(nameFrame);
        // Set color to font.
        this.setForeground(Color.BLACK);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create submenu.
        this.customItem = new JMenuItem("Custom");
        // Create FileChooser.
        this.openFile = new JFileChooser();
        this.saveFile = new JFileChooser();

    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // Add custom to color menu.
        colorMenu.add(this.customItem);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object obj = event.getActionCommand();
        // If custom is selected.
        if (obj == customItem.getActionCommand()) {
            Color selectedColor = JColorChooser.showDialog(this, "Color Chooser", nameTxtField.getForeground());
            if (selectedColor != null) {
                changeColor(selectedColor);
            }
            // If openMI is selected.
        } else if (obj == openMI.getActionCommand()) {
            // Show Open file.
            int returnVal = openFile.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String text = "Opening file " + openFile.getSelectedFile().getName();
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
                // Show openFile is cancel.
            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                String text = "Open command cancelled by user.";
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
            }
            // If saveMI selected.
        } else if (obj == saveMI.getActionCommand()) {
            int returnVal = saveFile.showSaveDialog(this);
            // Show save file .
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String text = "Saving file " + saveFile.getSelectedFile().getName();
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
                // Show save file is cancel.
            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                String text = "Saving command cancelled by user. ";
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            }

        } else if (obj == exitMI.getActionCommand()) {
            // Exit program.
            System.exit(0);

        }
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        customItem.addActionListener(this);
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV11 msw = new PersonFormV11("Person Form V11");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }

}