package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class UserLoginView extends JFrame {
    private JFrame Frame = new JFrame("User Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchUserButton = new JButton("Login");
    private JTextField TextField = new JTextField(10);
    protected Library library;

    //"User Search Window"
    //  TextField
    //  Search Button

    UserLoginView(Library library, User user){
    	User x = user;
        this.library = library;
        int correctID = user.getID();
        int input = getTextField();
        Frame.setSize(400, 100);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(2, 1));

        //  Search Button
        searchUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == searchUserButton) {
                	if (input == correctID) {
                		Frame.dispose();
                		UserView userView = new UserView(library, x);
                	}
                	else {
                        Frame.dispose();
                        System.out.println("Incorrect ID");
                        LibraryView libraryview = new LibraryView(library);
                	}
                }
            }
        });

        

        Panel.add(TextField);
        Panel.add(searchUserButton);
        Frame.add(Panel);
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);
    }
    
	public int getTextField(){
		
		return Integer.parseInt(TextField.getText());
		
	}
}