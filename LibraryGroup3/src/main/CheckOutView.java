import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOutView extends JFrame {
    private JFrame Frame = new JFrame("Checkout Item Window");
    private JPanel Panel = new JPanel();
    private JLabel label = new JLabel("Item List");
    private JButton requestButton = new JButton("Request");
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
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> itemList = new JList<>(model);

        for (Item item : library.items) {
            model.addElement(item.getName());
        }

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(5, 1));

        //TODO:Checkout Button
        requestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == requestButton) {
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

        Panel.add(label);
        Panel.add(itemList);
        Panel.add(requestButton);
        Panel.add(checkoutButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }

}