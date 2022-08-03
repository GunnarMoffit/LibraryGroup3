
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryView extends JFrame {
    private JFrame homeFrame;
    private JPanel homePanel;
    private JButton UserInfoButton;
    private JButton ItemInfoButton;
    private JButton AddUserButton;
    private JButton AddItemButton;

    //"Library System Window"
    //  Lookup User Info Button
    //  Lookup Item Info Button
    //  Add User Button
    //  Add Item Button

    LibraryView(Library library) {
        JFrame frame = new JFrame("Library System Window");
        this.homeFrame = frame;
        homeFrame.setSize(450, 550);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.homePanel = panel;
        homePanel.setLayout(new GridLayout(4, 1));

        JButton userInfoButton = new JButton("Lookup User Info");
        this.UserInfoButton = userInfoButton;
        UserInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == UserInfoButton) {
                    homeFrame.dispose();
                    UserSearchView user = new UserSearchView(library);
                }
            }
        });

        JButton itemInfoButton = new JButton("Lookup Item Info");
        this.ItemInfoButton = itemInfoButton;
        ItemInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ItemInfoButton) {
                    homeFrame.dispose();
                    ItemSearchView item = new ItemSearchView(library);
                }
            }
        });

        JButton addUserButton = new JButton("Add User");
        this.AddUserButton = addUserButton;
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == AddUserButton) {
                    homeFrame.dispose();
                    AddUserView user = new AddUserView();
                }
            }
        });

        JButton addItemButton = new JButton("Add Item");
        this.AddItemButton = addItemButton;
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == AddItemButton) {
                    homeFrame.dispose();
                    AddItemView item = new AddItemView();
                }
            }
        });

        homePanel.add(UserInfoButton);
        homePanel.add(ItemInfoButton);
        homePanel.add(AddUserButton);
        homePanel.add(AddItemButton);
        homeFrame.add(homePanel);
        homeFrame.setVisible(true);
    }
}