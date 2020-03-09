package priabying.kittisak.lab10;

import java.awt.Component;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Keymap;

/**
 * PersonFormV13
 */
public class PersonFormV13 extends PersonFormV12 {
    protected double MIN_HEIGHT = 100.00f, MAX_HEIGHT = 250.00f;
    protected double MIN_WEIGHT = 40.00f, MAX_WEIGHT = 150.00f;
    protected double MIN_DAY = 1.00f, MAX_DAY = 31.00f, MIN_MONTH = 1.00f, MAX_MONTH = 12.00f, MIN_YEAR = 1900.00f,
            MAX_YEAR = 2010.00f;

    public PersonFormV13(String nameFrame) {
        super(nameFrame);
    }

    protected boolean checkDecimalException(String valid, String string, double max, double min) {
        try {
            double validDouble = Double.parseDouble(valid);
            if (validDouble >= max || validDouble <= min) {
                JOptionPane.showMessageDialog(this, "Valid values for" + string + "are [" + min + "," + max + "]\n",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter only numeric input for" + string + "\n", "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return false;

    }

    protected void checkDateException(String date) {
        try {

        } catch (NumberFormatException e) {

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
        PersonFormV13 msw = new PersonFormV13("Person Form V13");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }

}