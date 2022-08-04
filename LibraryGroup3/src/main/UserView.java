package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame {
    private JFrame userFrame = new JFrame("'s Library Card");
    private JPanel userPanel = new JPanel();
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel ageLabel = new JLabel("Age: ");
    private JLabel addressLabel = new JLabel("Address: ");
    private JLabel phoneLabel = new JLabel("Phone Number: ");
    private JLabel libraryIdLabel = new JLabel("Library Card Number: ");
    private JLabel finesLabel = new JLabel("Total Fines: ");
    private JList<Item> checkedoutItemsList = new JList<>();
    private JButton checkOutButton = new JButton("Checkout Items");
    private JButton payFineButton = new JButton("Pay Fines");
    private JButton returnItemButton = new JButton("Return Items");
    private JButton renewItemButton = new JButton("Renew Items");
    private JButton mainMenuButton = new JButton("Main Menu");
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
    //  Main Menu Button

    UserView(Library library, User user) {
        this.library = library;

        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userPanel.setLayout(new GridLayout(12, 2));

        //CheckedOutItems List

        //Buttons
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == checkOutButton) {
                    userFrame.dispose();
                    CheckOutView checkoutview = new CheckOutView(library);
                }
            }
        });

        payFineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == payFineButton) {
                    userFrame.dispose();
                    PayFineView payfineview = new PayFineView(library);
                }
            }
        });

        returnItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnItemButton) {
                    userFrame.dispose();
                    ReturnItemView returnitemview = new ReturnItemView(library);
                }
            }
        });

        renewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == renewItemButton) {
                    userFrame.dispose();
                    RenewItemView renewitemview = new RenewItemView(library);
                }
            }
        });

        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == mainMenuButton) {
                    userFrame.dispose();
                    LibraryView libraryview = new LibraryView(library);
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
        userPanel.add(mainMenuButton);
        userFrame.add(userPanel);
        userFrame.setLocationRelativeTo(null);
        userFrame.setVisible(true);
    }
}
