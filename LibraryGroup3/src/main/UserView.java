import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame {
    private JFrame userFrame;
    private JPanel userPanel;
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel ageLabel = new JLabel("Age: ");
    private JLabel addressLabel = new JLabel("Address: ");
    private JLabel phoneLabel = new JLabel("Phone Number: ");
    private JLabel libraryIdLabel = new JLabel("Library Card Number: ");
    private JLabel finesLabel = new JLabel("Total Fines: ");
    private JList<Item> checkedoutItemsList = new JList<>();
    private JButton checkOutButton;
    private JButton payFineButton;
    private JButton returnItemButton;
    private JButton renewItemButton;
    protected Library library;

    //"User's Library Card"
    //  Name:
    //  Age:
    //  Address:
    //  Phone Number:
    //  Library Card Number:
    //  Total Fines:
    //  CheckedOutItems List
    //  Checkout New Item Button
    //  Pay Fine Button
    //  Return Item Button
    //  Renew Item Button

    UserView(Library library) {
        this.library = library;

        JFrame frame = new JFrame("'s Library Card");
        this.userFrame = frame;
        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.userPanel = panel;
        userPanel.setLayout(new GridLayout(11, 1));

        //Buttons
        JButton checkoutButton = new JButton("Checkout Items");
        this.checkOutButton = checkoutButton;
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == checkOutButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton fineButton = new JButton("Pay Fines");
        this.payFineButton = fineButton;
        payFineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == payFineButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton returnButton = new JButton("Return Items");
        this.returnItemButton = returnButton;
        returnItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnItemButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton renewButton = new JButton("Renew Items");
        this.renewItemButton = renewButton;
        renewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == renewItemButton) {
                    userFrame.dispose();
                }
            }
        });

        userPanel.add(nameLabel);
        userPanel.add(ageLabel);
        userPanel.add(addressLabel);
        userPanel.add(phoneLabel);
        userPanel.add(libraryIdLabel);
        userPanel.add(finesLabel);
        userPanel.add(ageLabel);
        userPanel.add(checkedoutItemsList);
        userPanel.add(checkOutButton);
        userPanel.add(payFineButton);
        userPanel.add(returnItemButton);
        userPanel.add(renewItemButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}
