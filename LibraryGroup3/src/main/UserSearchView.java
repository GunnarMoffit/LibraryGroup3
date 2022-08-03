import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class UserSearchView extends JFrame {
    private JFrame Frame = new JFrame("User Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchUserButton = new JButton("Search");
    private JTextField TextField = new JTextField();
    protected Library library;

    //"User Search Window"
    //  TextField
    //  Search Button

    UserSearchView(Library library){
        this.library = library;

        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(2, 1));

        searchUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean flag = false;
                for(int i = 0; i < library.users.size(); i++) {
                    User tempUser;
                    int tempID;
                    tempUser = library.getUserList().get(i);
                    tempID = tempUser.getID();
                    int textInt = Integer.parseInt(TextField.getText());
                    if (textInt == tempID && e.getSource() == searchUserButton) {
                        Frame.dispose();
                        UserView user = new UserView(library);
                        flag = true;
                    }
                    if(!flag) {
                        JOptionPane.showMessageDialog(null, "Enter Valid Item Title");
                    }
                }
            }
        });

        Panel.add(TextField);
        Panel.add(searchUserButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }
}