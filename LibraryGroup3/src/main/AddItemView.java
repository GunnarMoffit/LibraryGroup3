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
    private JButton addButton = new JButton("Add Item");
    protected Library library;

    // "New Item"
    //  Name:
    //  Value:
    //  Able to loan
    //  AddItem Button

    AddItemView(Library library) {
        this.library = library;

        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userPanel.setLayout(new GridLayout(4, 1));

        //Text Field
        String name = nameField.getText();
        String address = valueField.getText();
        String age = loanabilityField.getText();

        //Add Item Button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addButton) {
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
        userPanel.add(addButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}
