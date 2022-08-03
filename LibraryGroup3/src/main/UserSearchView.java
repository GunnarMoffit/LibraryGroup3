import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class UserSearchView extends JFrame {
    private JFrame Frame;
    private JPanel Panel;
    private JButton searchUserButton;
    private JTextField TextField;

    //"User Search Window"
    //  TextField
    //  Search Button

    UserSearchView(Library library){
        JFrame frame = new JFrame("User Search Window");
        this.Frame = frame;
        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.Panel = panel;
        Panel.setLayout(new GridLayout(2, 1));

        JTextField textField = new JTextField();
        this.TextField = textField;

        JButton Button = new JButton("Search");
        this.searchUserButton = Button;
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User tempUser;
                int tempID;
                boolean flag = false;
                for(int i = 0; i < library.users.size(); i++) {
                    tempUser = library.getUserList().get(i);
                    tempID = tempUser.getID();
                    int textInt = getUserID();     //parse int breaks it
                    if (textInt == tempID && e.getSource() == searchUserButton) {
                        //library.getUserInfo(textInt);
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

    public int getUserID(){
        return Integer.parseInt(TextField.getText());
    }

}
