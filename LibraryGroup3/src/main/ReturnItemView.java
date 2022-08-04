import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnItemView extends JFrame {
    private JFrame Frame = new JFrame("Return Item Window");
    private JPanel Panel = new JPanel();
    private JLabel label = new JLabel("Item List");
    private JButton returnItemButton = new JButton("Return Item");
    private JButton mainMenuButton = new JButton("Main Menu");
    protected Library library;
    protected User user;

    //"Return Item Window"
    //  ItemName TextField
    //  User specific Items Checkout List
    //  Return Item Button
    //  MainMenu Button

    ReturnItemView(Library library, User user){
        this.library = library;
        this.user = user;

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> usersItemList = new JList<>(model);

        for (String string : user.getItemsCheckedOut()) {
            model.addElement(string);
        }

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(4, 1));

//        String text = TextField.getText();

        //  TODO:ReturnItem Button
        returnItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnItemButton) {
                    String txt = usersItemList.getSelectedValue();
                    for(Item item : library.items) {
                        if(txt.equals(item.getName())) {
                            JOptionPane.showMessageDialog(null, user.checkInItem(item));
                            Frame.dispose();
                            UserView userview = new UserView(library, user);
                        }
                    }
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

        Panel.add(label);
        Panel.add(usersItemList);
        Panel.add(returnItemButton);
        Panel.add(mainMenuButton);
        Frame.add(Panel);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }

}