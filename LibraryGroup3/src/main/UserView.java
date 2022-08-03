import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame {
    private JFrame userFrame;
    private JPanel userPanel;
    private JButton searchButton;
    private JTextField textField;

    UserView(Library library) {
        JFrame frame = new JFrame("'s Library Card");
        this.userFrame = frame;
        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.userPanel = panel;
        userPanel.setLayout(new GridLayout(4, 1));

        JButton Button = new JButton("Search");
        this.searchButton = Button;
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Button) {
                    frame.dispose();


                    JFrame frame1 = new JFrame("User Lookup");
//                this.userFrame = frame;
                    frame1.setSize(450, 550);
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    JPanel panel = new JPanel();
                    //this.userPanel = userPanel;
                    panel.setLayout(new GridLayout(4, 1));

                    String text = textField.getText();
                    JTextField textField = new JTextField();

                    panel.add(textField);
                    frame1.add(panel);
                    frame1.setVisible(true);
                }
            }
        });


        userPanel.add(searchButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}
