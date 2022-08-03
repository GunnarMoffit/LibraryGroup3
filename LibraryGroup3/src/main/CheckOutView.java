import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOutView extends JFrame {
    private JFrame Frame = new JFrame("Checkout Item Window");
    private JPanel Panel = new JPanel();
    private JTextField TextField = new JTextField();
    private JButton searchButton = new JButton("Search");
    private JButton checkoutButton = new JButton("Checkout");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;

    //"Checkout Item Window"
    //  SearchItem TextField
    //  SearchButton Button
    //  CheckoutButton Button
    //  MainMenu Button

    CheckOutView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(4, 1));

        //TODO:Search Button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == searchButton) {
                    Frame.dispose();
                }
            }
        });

        //TODO:Checkout Button
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == checkoutButton) {
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

        Panel.add(TextField);
        Panel.add(searchButton);
        Panel.add(checkoutButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }

}