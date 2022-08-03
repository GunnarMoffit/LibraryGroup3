import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryView extends JFrame {
    private JFrame homeFrame;
    private JPanel homePanel;
    private JButton UserInfoButton;
    private JButton ItemInfoButton;
    private JButton addUserButton;
    private JButton addItemButton;

    LibraryView(Library library) {
        JFrame frame = new JFrame("Library System Window");
        this.homeFrame = frame;
        homeFrame.setSize(450, 550);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.homePanel = panel;
        homePanel.setLayout(new GridLayout(4, 1));

        JButton UserInfoButton = new JButton("Lookup User Info");
        this.UserInfoButton = UserInfoButton;
        UserInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == UserInfoButton) {
                    frame.dispose();
                    UserSearchView user = new UserSearchView(library);
                }
            }
        });

        JButton ItemInfoButton = new JButton("Lookup Item Info");
        this.ItemInfoButton = ItemInfoButton;
        ItemInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == ItemInfoButton) {
                    frame.dispose();
                    ItemSearchView item = new ItemSearchView(library);
                }
            }
        });

        JButton addUserButton = new JButton("Add User");
        this.addUserButton = addUserButton;
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addUserButton) {
                    frame.dispose();
                    AddUserView item = new AddUserView();
                }
            }
        });

        JButton addItemButton = new JButton("Add Item");
        this.addItemButton = addItemButton;
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addItemButton) {
                    frame.dispose();
                    AddItemView item = new AddItemView();
                }
            }
        });

        homePanel.add(UserInfoButton);
        homePanel.add(ItemInfoButton);
        homePanel.add(addUserButton);
        homePanel.add(addItemButton);
        homeFrame.add(homePanel);
        homeFrame.setVisible(true);
    }
}