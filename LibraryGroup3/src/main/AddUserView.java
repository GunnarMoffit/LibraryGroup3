import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddUserView extends JFrame {
    private JFrame userFrame = new JFrame("New User");
    private JPanel userPanel = new JPanel();
    private JLabel nameLabel = new JLabel("Name: ");
    private JTextField nameField = new JTextField(10);
    private JLabel addressLabel = new JLabel("Address: ");
    private JTextField addressField = new JTextField(10);
    private JLabel ageLabel = new JLabel("Age: ");
    private JTextField ageField = new JTextField(10);
    private JLabel phoneNumberLabel = new JLabel("Phone #: ");
    private JTextField phoneNumberField = new JTextField(10);
    private JButton addButton = new JButton("Add User");

    //  "New User"
    //  Name:
    //  Address:
    //  Age:
    //  Phone #:
    //  AddUser Button

    AddUserView() {
        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userPanel.setLayout(new GridLayout(5, 1));

        //Text Field
        String name = nameField.getText();
        String address = addressField.getText();
        String age = ageField.getText();
        String phoneNumber = phoneNumberField.getText();

        //Add User Button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addButton) {
                    userFrame.dispose();
                }
            }
        });

        userPanel.add(nameLabel);
        userPanel.add(nameField);
        userPanel.add(addressLabel);
        userPanel.add(addressField);
        userPanel.add(ageLabel);
        userPanel.add(ageField);
        userPanel.add(phoneNumberLabel);
        userPanel.add(phoneNumberField);
        userPanel.add(addButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}