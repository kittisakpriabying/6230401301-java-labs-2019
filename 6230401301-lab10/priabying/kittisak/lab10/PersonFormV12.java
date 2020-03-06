package priabying.kittisak.lab10;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 * PersonFormV12
 */
public class PersonFormV12 extends PersonFormV11 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JMenu dataMenu;
    protected JMenuItem displayItem, sortItem, searchItem, removeItem;
    protected ArrayList<Person> personList;

    public PersonFormV12(String nameFrame) {
        super(nameFrame);
    }

    protected void handleOkButton() {
        String info = getInfoFromForm();
        Person person = addPerson();
        personList.add(person);
        JOptionPane.showMessageDialog(this, info + "\n\nAdding this person into the list:" + person,
                "Person Information", JOptionPane.INFORMATION_MESSAGE);

    }

    protected Person addPerson() {
        double weight = Double.parseDouble(weightTxtField.getText());
        double height = Double.parseDouble(heightTxtField.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // convert String to LocalDate
        LocalDate dob = LocalDate.parse(dobTxtField.getText(), formatter);
        Person person = new Person(nameTxtField.getText(), weight, height, dob);
        return person ;
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        this.dataMenu = new JMenu("Data");
        this.displayItem = new JMenuItem("Display");
        this.sortItem = new JMenuItem("Sort");
        this.searchItem = new JMenuItem("Search");
        this.removeItem = new JMenuItem("Remove");

        dataMenu.add(displayItem);
        dataMenu.add(sortItem);
        dataMenu.add(searchItem);
        dataMenu.add(removeItem);
        menuBar.add(dataMenu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        if (src == displayItem) {
            handleDisplayMI();

        }
    }

    protected void handleDisplayMI() {
        
        JOptionPane.showMessageDialog(this, personList, "Message", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(getClass().getResource("images/java.png")));
    }

    @Override
    protected void addListeners() {
        // TODO Auto-generated method stub
        super.addListeners();
        displayItem.addActionListener(this);
    }
    @Override
    protected void addComponents() {
        // TODO Auto-generated method stub
        super.addComponents();
        this.personList = new ArrayList<Person>();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV12 msw = new PersonFormV12("Person Form V12");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }

}
