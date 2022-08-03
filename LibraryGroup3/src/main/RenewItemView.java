import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenewItemView extends JFrame {
    private JFrame Frame = new JFrame("Renew Item Window");
    private JPanel Panel = new JPanel();
    private JTextField TextField = new JTextField();
    private JList<Item> checkoutItemList = new JList<>();
    private JButton renewItemButton = new JButton("Renew Item");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;

    //"RenewItemView"
    //  ItemName TextField
    //  User specific Items Checkout List
    //  Renew Item Button
    //  MainMenu Button

    RenewItemView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(4, 1));

        String text = TextField.getText();

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
        Panel.add(checkoutItemList);
        Panel.add(renewItemButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }

}