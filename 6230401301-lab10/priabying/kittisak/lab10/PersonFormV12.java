package priabying.kittisak.lab10;
/**
 * Create List for collect information that user enter.
 * Sort list.
 * Shearch name to show infomation.
 * Remove information by enter name.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 9, 2020
 */
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class PersonFormV12 extends PersonFormV11 {

    private static final long serialVersionUID = 1L;
    protected JMenu dataMenu;
    protected JMenuItem displayItem, sortItem, searchItem, removeItem;
    protected List<String> personList;
    protected Map<String, String> personMap;

    public PersonFormV12(String nameFrame) {
        super(nameFrame);
    }

    protected void handleOkButton() {
        String info = getInfoFromForm();
        // Create person.
        String person = addPerson();
        // Add person to List.
        personList.add(person);
        // Put name to key, preson to value.
        personMap.put(nameTxtField.getText(), person);

        JOptionPane.showMessageDialog(this, info + "\n\nAdding this person into the list:" + person,
                "Person Information", JOptionPane.INFORMATION_MESSAGE);

    }

    protected String addPerson() {
        // String parse to double.
        double weight = Double.parseDouble(weightTxtField.getText());
        double height = Double.parseDouble(heightTxtField.getText());
        // Pattern "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dobTxtField.getText(), formatter);
        Person person = new Person(nameTxtField.getText(), weight, height, dob);
        return person.toString();
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // Create submenu.
        this.dataMenu = new JMenu("Data");
        this.displayItem = new JMenuItem("Display");
        this.sortItem = new JMenuItem("Sort");
        this.searchItem = new JMenuItem("Search");
        this.removeItem = new JMenuItem("Remove");
        // Add submenu to dataMenu.
        dataMenu.add(displayItem);
        dataMenu.add(sortItem);
        dataMenu.add(searchItem);
        dataMenu.add(removeItem);
        // Add dataMenu to
        menuBar.add(dataMenu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        if (src == displayItem) {
            handleDisplayMI();
        } else if (src == sortItem) {
            handleSortMI();
        } else if (src == searchItem) {
            handleSearchMI();
        } else if (src == removeItem) {
            handleRemoveMI();
        }
    }
    protected void handleRemoveMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to remove:");
        if (personMap.containsKey(name)) {
            String person = personMap.get(name);
            JOptionPane.showMessageDialog(this, personMap.get(name) + " is removed.", "Message",
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("images/java.png")));
            personList.remove(person);
            personMap.remove(name);

        } else {
            JOptionPane.showMessageDialog(this, name + " is not found", "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }

    }


    protected void handleSearchMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to search:");
        if (personMap.containsKey(name)) {
            JOptionPane.showMessageDialog(this, personMap.get(name), "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found", "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }
    }

    protected void handleSortMI() {
        Collections.sort(personList);
        JOptionPane.showMessageDialog(this, personList, "Message", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("images/java.png")));

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
        sortItem.addActionListener(this);
        searchItem.addActionListener(this);
        removeItem.addActionListener(this);
    }

    @Override
    protected void addComponents() {
        // TODO Auto-generated method stub
        super.addComponents();
        this.personList = new ArrayList<String>();
        this.personMap = new HashMap<String, String>();
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
