import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddItemView extends JFrame {
    private JFrame userFrame = new JFrame("New Item");
    private JPanel userPanel = new JPanel();
    private JLabel nameLabel = new JLabel("Name: ");
    private JTextField nameField = new JTextField(10);
    private JLabel valueLabel = new JLabel("Value: ");
    private JTextField valueField = new JTextField(10);
    private JLabel loanabilityLabel = new JLabel("Able to loan: ");
    private JTextField loanabilityField = new JTextField(10);
    private JButton menuButton = new JButton("Main Menu");
    private JButton addButton = new JButton("Add Item");
    protected Library library;
    protected Item item;

    // "New Item"
    //  Name:
    //  Value:
    //  Able to loan:
    //  Menu Button
    //  AddItem Button

    AddItemView(Library library) {
        this.library = library;
        this.item = item;

        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userPanel.setLayout(new GridLayout(4, 2));

        //Text Field
        String name = nameField.getText();
        String value = valueField.getText();
        //String loanability = loanabilityField.getText();

        //Main Menu Button
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == menuButton) {
                    userFrame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }
            }
        });

        //Add Item Button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addButton) {
                    Item tempItem = new Item(name,Float.parseFloat(value));
                    library.addItem(item);
                    userFrame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }
            }
        });

        userPanel.add(nameLabel);
        userPanel.add(nameField);
        userPanel.add(valueLabel);
        userPanel.add(valueField);
        userPanel.add(loanabilityLabel);
        userPanel.add(loanabilityField);
        userPanel.add(menuButton);
        userPanel.add(addButton);
        userFrame.add(userPanel);
        userFrame.setLocationRelativeTo(null);
        userFrame.setVisible(true);
    }
}

