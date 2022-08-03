import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class UserSearchView extends JFrame {
    private JFrame Frame = new JFrame("User Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchUserButton = new JButton("Search");
    private JLabel textLabel = new JLabel("Enter User:");
    private JButton menuButton = new JButton("Main Menu");
    private JTextField TextField = new JTextField();
    protected Library library;

    //"User Search Window"
    //  TextLabel
    //  TextField
    //  Menu Button
    //  Search Button

    UserSearchView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(2, 2));

        //Main Menu Button
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == menuButton) {
                    Frame.dispose();
                    LibraryView libraryview = new LibraryView(library);
                }
            }
        });

        //  Search Button
        searchUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == searchUserButton) {
                    Frame.dispose();
                    UserView user = new UserView(library);
                }
            }
        });

//        searchUserButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                boolean flag = false;
//                for(int i = 0; i < library.users.size(); i++) {
//                    User tempUser;
//                    int tempID;
//                    tempUser = library.getUserList().get(i);
//                    tempID = tempUser.getID();
//                    int textInt = Integer.parseInt(TextField.getText());
//                    if (textInt == tempID && e.getSource() == searchUserButton) {
//                        Frame.dispose();
//                        UserView user = new UserView(library);
//                        flag = true;
//                    }
//                    if(!flag) {
//                        JOptionPane.showMessageDialog(null, "Enter Valid Item Title");
//                    }
//                }
//            }
//        });


        Panel.add(textLabel);
        Panel.add(TextField);
        Panel.add(menuButton);
        Panel.add(searchUserButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }
}
