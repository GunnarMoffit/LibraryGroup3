package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UserOverView {





    private JFrame userFrame = new JFrame("'s Library Card");
    private JPanel userPanel = new JPanel();
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel ageLabel = new JLabel("Age:");
    private JLabel addressLabel = new JLabel("Address: ");
    private JLabel phoneLabel = new JLabel("Phone Number: ");
    private JLabel libraryIdLabel = new JLabel("Library Card Number: ");
    private JLabel itemsCheckedOut = new JLabel("Items Checked Out", SwingConstants.CENTER);
    private JLabel finesLabel = new JLabel("Total Fines: ");
    
    private JList<Item> checkedoutItemsList = new JList<>();
    private JButton LoginButton = new JButton("User Login");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;


    UserOverView(Library library, User user) {
        this.library = library;
        
        JLabel name = new JLabel(user.getName());
        JLabel age = new JLabel(Integer.toString(user.getAge()));
        JLabel address = new JLabel(user.getAddress());
        JLabel phone = new JLabel(user.getPhoneNumber());
        JLabel libraryId = new JLabel(Integer.toString(user.getID()));
        String currentFines = Double.toString(user.getFines());
        JLabel fines = new JLabel(currentFines);

        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userPanel.setLayout(new GridLayout(12,2));


        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == LoginButton) {
                    userFrame.dispose();
                    UserLoginView userLoginView = new UserLoginView(library, user);
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
        userPanel.add(name);
        userPanel.add(ageLabel);
        userPanel.add(age);
        userPanel.add(addressLabel);
        userPanel.add(address);
        userPanel.add(phoneLabel);
        userPanel.add(phone);
        userPanel.add(libraryIdLabel);
        userPanel.add(libraryId);
        userPanel.add(finesLabel);
        userPanel.add(fines);
        userPanel.add(itemsCheckedOut);
        userPanel.add(checkedoutItemsList);
        userPanel.add(LoginButton);
        userPanel.add(mainMenuButton);
        userFrame.add(userPanel);
        userFrame.setLocationRelativeTo(null);
        userFrame.setVisible(true);
    }
    
}