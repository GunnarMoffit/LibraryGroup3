package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemView extends JFrame {
    private JFrame itemFrame = new JFrame("Item Description");
    private JPanel itemPanel = new JPanel();
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel valueLabel = new JLabel("Value: ");
    private JLabel loanabilityLabel = new JLabel("Able to loan: ");
    private JLabel availabilityLabel = new JLabel("Checked Out: ");
    private JLabel requestedLabel = new JLabel("Requested: ");
    private JButton menuButton = new JButton("Main Menu");
    protected Library library;

    



    ItemView(Library library, Item item) {
    	
    	boolean chkOut = !item.isloanable();
        this.library = library;
        JLabel name = new JLabel(item.getName());
        JLabel value = new JLabel(Float.toString(item.valueOfItem));
        JLabel loanability = new JLabel(String.valueOf(item.isloanable()));
        JLabel checkedOut = new JLabel(String.valueOf(chkOut));
        JLabel requested = new JLabel(String.valueOf(item.isRequested()));

        itemFrame.setSize(300, 200);
        itemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        itemPanel.setLayout(new GridLayout(6, 2));

        //  Menu Button
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == menuButton) {
                    itemFrame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }   
            }
        });

        itemPanel.add(nameLabel);
        itemPanel.add(name);
        itemPanel.add(valueLabel);
        itemPanel.add(value);
        itemPanel.add(loanabilityLabel);
        itemPanel.add(loanability);
        itemPanel.add(availabilityLabel);
        itemPanel.add(checkedOut);
        itemPanel.add(requestedLabel);
        itemPanel.add(requested);
        itemPanel.add(new JLabel());
        itemPanel.add(menuButton);
        itemFrame.add(itemPanel);
        itemFrame.setLocationRelativeTo(null);
        itemFrame.setVisible(true);
    }
}