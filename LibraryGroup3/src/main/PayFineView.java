package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayFineView extends JFrame {
    private JFrame Frame = new JFrame("Pay Fine Window");
    private JPanel Panel = new JPanel();
    private JLabel label = new JLabel("Total Fines: ");
    private JTextField TextField = new JTextField();
    private JButton payFineButton = new JButton("Pay Fine");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;

    //"Pay Fine Window"
    //  Total Fines:
    //  fineAmount TextField
    //  PayFine Button
    //  MainMenu Button

    PayFineView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(4, 1));

        //TODO:PayFine Button
        payFineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == payFineButton) {
                    Frame.dispose();
                }
            }
        });

        //MainMenu Button
        mainMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == mainMenuButton) {
                    Frame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }
            }
        });

        Panel.add(label);
        Panel.add(TextField);
        Panel.add(payFineButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }

}