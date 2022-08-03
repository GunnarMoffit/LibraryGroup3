import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame {
    private JFrame userFrame;
    private JPanel userPanel;
    private JButton checkOutButton;
    private JButton payFineButton;
    private JButton returnItemButton;
    private JButton renewItemButton;
    private JTextField textField;

    //"User's Library Card"
    //  Name:
    //  Age:
    //  Address:
    //  Phone Number:
    //  Library Card Number:
    //  Total Fines:
    //  CheckedOutItems List
    //  Checkout New Item Button
    //  Pay Fine Button
    //  Return Item Button
    //  Renew Item Button


    UserView(Library library) {
        JFrame frame = new JFrame("'s Library Card");
        this.userFrame = frame;
        userFrame.setSize(450, 550);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.userPanel = panel;
        userPanel.setLayout(new GridLayout(4, 1));

        JButton checkoutButton = new JButton("Checkout Items");
        this.checkOutButton = checkoutButton;
        checkOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == checkOutButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton fineButton = new JButton("Pay Fines");
        this.payFineButton = fineButton;
        payFineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == payFineButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton returnButton = new JButton("Return Items");
        this.returnItemButton = returnButton;
        returnItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == returnItemButton) {
                    userFrame.dispose();
                }
            }
        });

        JButton renewButton = new JButton("Renew Items");
        this.renewItemButton = renewButton;
        renewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == renewItemButton) {
                    userFrame.dispose();
                }
            }
        });

        userPanel.add(checkOutButton);
        userPanel.add(payFineButton);
        userPanel.add(returnItemButton);
        userPanel.add(renewItemButton);
        userFrame.add(userPanel);
        userFrame.setVisible(true);
    }
}
