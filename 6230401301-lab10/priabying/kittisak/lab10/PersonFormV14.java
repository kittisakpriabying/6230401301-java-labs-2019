/**
 * 
 * Writre and reader.
 * 
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 22, 2020
 */
package priabying.kittisak.lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV14 extends PersonFormV13 {
    private static final long serialVersionUID = 1L;
    protected File file;
    protected Scanner read;
    protected FileWriter write;

    public PersonFormV14(String nameFrame) {
        super(nameFrame);
    }

    @Override
    protected void saveHandle() {
        super.saveHandle();

        // Write program.
        this.file = saveFile.getSelectedFile();
        try {
            this.write = new FileWriter(file);
            for (String person : personList) {
                write.write(person.toString() + "");
            }
            write.close();
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }

    @Override
    protected void openHandle() {
        super.openHandle();
        // read program.
        this.file = openFile.getSelectedFile();
        try {
             this.read = new Scanner(file);
            String data = "";
            while (read.hasNextLine()) {
                data += read.nextLine() + "\n";
            }
            read.close();
            JOptionPane.showMessageDialog(this, data, "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV14 msw = new PersonFormV14("Person Form V14");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }

}