package priabying.kittisak.lab10;
/**
 * Check exception input.
 * Check number exception .
 * check range.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 9, 2020
 */
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV13 extends PersonFormV12 {
    private static final long serialVersionUID = 1L;
    protected double MIN_HEIGHT = 100.00f, MAX_HEIGHT = 250.00f;
    protected double MIN_WEIGHT = 40.00f, MAX_WEIGHT = 150.00f;
    protected double MIN_DAY = 1.00f, MAX_DAY = 31.00f, MIN_MONTH = 1.00f, MAX_MONTH = 12.00f, MIN_YEAR = 1900.00f,
            MAX_YEAR = 2010.00f;
    private String message = "";
    private String day, month, year;

    public PersonFormV13(String nameFrame) {
        super(nameFrame);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        if (src == okButton) {
            if (checkInputValid()) {
                message = "";
                return;
            }
        }
        super.actionPerformed(event);
    }

    protected boolean checkInputValid() {
        // If user don't enter name.
        if (nameTxtField.getText().equals("")) {
            message += "Please enter name.\n";
        }
        // Check exception.
        checkDecimalException(heightTxtField.getText(), " height", MAX_HEIGHT, MIN_HEIGHT);
        checkDecimalException(weightTxtField.getText(), " weight", MAX_WEIGHT, MIN_WEIGHT);
        checkDateException(dobTxtField.getText());
        checkDecimalException(day, " day", MAX_DAY, MIN_DAY);
        checkDecimalException(month, " month", MAX_MONTH, MIN_MONTH);
        checkDecimalException(year, " year", MAX_YEAR, MIN_YEAR);

        if (message == "") {
            return false;
        }
        JOptionPane.showMessageDialog(this, message); // Show to output.
        return true;
    }

    protected void checkDecimalException(String volid, String string, double max, double min) {
        try {
            double volidDouble = Double.parseDouble(volid);
            if (volidDouble > max || volidDouble < min || volid.equals("")) {
                message += "Valid values for" + string + "are [" + min + "," + max + "]\n";
            }
        } catch (NumberFormatException e) {
            message += "Please enter only numeric input for" + string + ".\n";
        }
    }

    protected void checkDateException(String dateString) {
        try {
            if (dateString.equals("")) {
                message += "Please enter date.\n";
            } else {
                String[] date = dateString.split("-");// remove "-".
                day = date[0];
                month = date[1];
                year = date[2];
            }
        } catch (NumberFormatException e) {
            message += "Please enter date.\n";
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