package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnItemView extends JFrame {
    private JFrame Frame = new JFrame("Return Item Window");
    private JPanel Panel = new JPanel();
    private JTextField TextField = new JTextField();
    private JList<Item> checkoutItemList = new JList<>();
    private JButton returnItemButton = new JButton("Return Item");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;

    //"Return Item Window"
    //  ItemName TextField
    //  User specific Items Checkout List
    //  Return Item Button
    //  MainMenu Button

    ReturnItemView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(4, 1));

        String text = TextField.getText();

        //  ReturnItem Button
        returnItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnItemButton) {
                    Frame.dispose();
                }
            }
        });

        //  MainMenu Button
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == mainMenuButton) {
                    Frame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }
            }
        });

        Panel.add(TextField);
        Panel.add(checkoutItemList);
        Panel.add(returnItemButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }

}