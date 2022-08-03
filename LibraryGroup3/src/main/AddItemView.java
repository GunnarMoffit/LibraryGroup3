package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddItemView extends JFrame {
    private JFrame userFrame;
    private JPanel userPanel;
    private JButton addButton;
    private JTextField TextField;

    // "New Item"
    //  Name:
    //  Value:
    //  Able to loan
    //  AddItem Button

    AddItemView() {
        JFrame frame = new JFrame("New Item");
        this.userFrame = frame;
        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.userPanel = panel;
        userPanel.setLayout(new GridLayout(4, 1));

        JTextField textField = new JTextField();
        this.TextField = textField;
        String text = TextField.getText();

        JButton Button = new JButton("Add Item");
        this.addButton = Button;
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addButton) {
                    userFrame.dispose();
                }
            }
        });

        userPanel.add(addButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}
