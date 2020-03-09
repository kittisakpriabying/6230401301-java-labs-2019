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
        this.setForeground(Color.BLACK);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        this.customItem = new JMenuItem("Custom");
        this.openFile = new JFileChooser();
        this.saveFile = new JFileChooser();

    }

    @Override
    protected void addMenus() {
        super.addMenus();
        colorMenu.add(this.customItem);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object obj = event.getActionCommand();
        if (obj == customItem.getActionCommand()) {
            Color selectedColor = JColorChooser.showDialog(this, "Color Chooser", nameTxtField.getForeground());
            if (selectedColor != null) {
                changeColor(selectedColor);
            }
        } else if (obj == openMI.getActionCommand()) {
            int returnVal = openFile.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String text = "Opening file " + openFile.getSelectedFile().getName();
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                String text = "Open command cancelled by user.";
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
            }

        } else if (obj == saveMI.getActionCommand()) {
            int returnVal = saveFile.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                String text = "Saving file " + saveFile.getSelectedFile().getName();
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            } else if (returnVal == JFileChooser.CANCEL_OPTION) {
                String text = "Saving command cancelled by user. ";
                JOptionPane.showMessageDialog(this, text, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));

            }

        } else if (obj == exitMI.getActionCommand()) {
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