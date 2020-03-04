/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 2, 2019
*
**/
package priabying.kittisak.lab6;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import java.awt.*;

public class PersonFormV3 extends PersonFormV2 {

    private static final long serialVersionUID = 1L;
    protected JLabel hobbiesLabel;
    protected JList<String> hobbiesList;
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenu configMenu;
    protected JMenuItem newItem;
    protected JMenuItem openItem;
    protected JMenuItem saveItem;
    protected JMenuItem exitItem;
    protected JMenuItem colorItem;
    protected JMenuItem sizeItem;

    // constructor no paramter.
    public PersonFormV3() {
        super();
    }

    // constructor one paramter. (String)
    public PersonFormV3(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();

        // Create Label .
        this.hobbiesLabel = new JLabel("Hobbies:");

        // Create List .
        String[] myList = { "Reading", "Traveling", "Cooking", "Photography" };
        this.hobbiesList = new JList<String>(myList);

        // Create menubar.
        this.menuBar = new JMenuBar();

        // Create fileMenu and configMenu.
        this.fileMenu = new JMenu("File");
        this.configMenu = new JMenu("Config");

        // Create Item in menu.
        this.newItem = new JMenuItem("New");
        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.exitItem = new JMenuItem("Exit");
        this.colorItem = new JMenuItem("Color");
        this.sizeItem = new JMenuItem("Size");

    }

    protected void addMenus() {

        // Add Item to fileMunu.
        this.fileMenu.add(this.newItem);
        this.fileMenu.add(this.openItem);
        this.fileMenu.add(this.saveItem);
        this.fileMenu.add(this.exitItem);

        // Add Item to configMenu.
        this.configMenu.add(this.colorItem);
        this.configMenu.add(this.sizeItem);

        // Add Manu to MenuBar.
        this.menuBar.add(this.fileMenu);
        this.menuBar.add(this.configMenu);

        // Set MenuBar to Frame.
        this.setJMenuBar(this.menuBar);
    }

    @Override
    protected void addComponents() {

        super.addComponents();

        // Continuing from PersonFormV1.
        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(3, 3, 3, 3);
        gc.fill = GridBagConstraints.HORIZONTAL;

        // (0,7)
        gc.gridy = 6;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.WEST;
        this.v1Panel.add(this.hobbiesLabel, gc);

        // (1,7)
        gc.gridy = 6;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.WEST;
        this.v1Panel.add(this.hobbiesList, gc);

    }

    public static void createAndShowGUI() {
        PersonFormV3 personFormV3 = new PersonFormV3("Person form V3");
        personFormV3.initComponents();
        personFormV3.addComponents();
        personFormV3.addMenus();
        personFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}