/**
*
* Author: kittisak Priabying.
* ID: 623040130-1
* Sec: 1
* Date: Feb 15, 2020
*
**/
package priabying.kittisak.lab7;

import javax.swing.*;

public class GraphicsMoverV3 extends GraphicsMoverV2 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JMenuBar menuBar;
    protected JMenu fileMenu;
    protected JMenuItem openItem;
    protected JMenuItem saveItem;
    protected JMenuItem quitItem;
    protected ImageIcon openImageIcon;

    // Constuctor one parameter.
    public GraphicsMoverV3(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void initComponents() {
        super.initComponents();
        // Create menuBar.
        this.menuBar = new JMenuBar();

        // Create menu.
        this.fileMenu = new JMenu("File");

        // Create Item.
        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.quitItem = new JMenuItem("Quit");

    }

    protected void updateMenuIcon() {
        // Create ImgeIcon.
        this.openImageIcon = new ImageIcon(getClass().getResource("images/open.png"));
        // Set Icon to openItem.
        this.openItem.setIcon(this.openImageIcon);
    }

    protected void addMenus() {
        // Add Item to menu.
        this.fileMenu.add(this.openItem);
        this.fileMenu.add(this.saveItem);
        this.fileMenu.add(this.quitItem);

        // Add menu to menuBar.
        this.menuBar.add(this.fileMenu);

        // Set JMenuBar to see on Frame.
        this.setJMenuBar(this.menuBar);
        updateMenuIcon();

    }

    public static void createAndShowGUI() {
        GraphicsMoverV3 gmv2 = new GraphicsMoverV3("Graphics Mover Version 3");
        gmv2.initComponents();
        gmv2.addComponents();
        gmv2.setFrameFeatures();
        gmv2.setColors();
        gmv2.setValues();
        gmv2.setFonts();
        gmv2.addMenus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}