/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 3, 2019
*
**/
package priabying.kittisak.lab6;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class PersonFormV4 extends PersonFormV3 {

    private static final long serialVersionUID = 1L;
    protected JMenu colorMenu;
    protected JMenu sizeMenu;
    protected ImageIcon newImageIcon;
    protected JMenuItem redSubMenu;
    protected JMenuItem greenSubMenu;
    protected JMenuItem blueSubMenu;
    protected JMenuItem size16;
    protected JMenuItem size20;
    protected JMenuItem size24;

    public PersonFormV4() {
        super();
    }

    public PersonFormV4(String nameFrame) {
        super(nameFrame);
    }

    private void addSubMenus() {

        // remove colorItem and sizeItem in configMenu.
        this.configMenu.remove(this.colorItem);
        this.configMenu.remove(this.sizeItem);

        // Create new colorMene and sizeMenu.
        this.colorMenu = new JMenu("Color");
        this.sizeMenu = new JMenu("Size");

        // create subMenu by JMenuItem.
        this.redSubMenu = new JMenuItem("Red");
        this.greenSubMenu = new JMenuItem("Green");
        this.blueSubMenu = new JMenuItem("Blue");
        this.size16 = new JMenuItem("16");
        this.size20 = new JMenuItem("20");
        this.size24 = new JMenuItem("24");

        // Add submenu in ColorMenu.
        this.colorMenu.add(this.redSubMenu);
        this.colorMenu.add(this.greenSubMenu);
        this.colorMenu.add(this.blueSubMenu);

        // Add submenu in sizeMenu.
        this.sizeMenu.add(this.size16);
        this.sizeMenu.add(this.size20);
        this.sizeMenu.add(this.size24);

        // Add colorMenu in configMenu.
        this.configMenu.add(this.colorMenu);

        // Add sizeMenu in configMenu.
        this.configMenu.add(this.sizeMenu);

    }

    private void updateMenuIcon() {

        // Add Image to newIcon.
        this.newImageIcon = new ImageIcon(getClass().getResource("images/new.png"));
        this.newItem.setIcon(this.newImageIcon);

    }

    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    public static void createAndShowGUI() {
        PersonFormV4 personFormV4 = new PersonFormV4("Person Form V4");
        personFormV4.addComponents();
        personFormV4.addMenus();
        personFormV4.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}