import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemView extends JFrame {
    private JFrame itemFrame;
    private JPanel itemPanel;
    private JButton okButton;
    private JTextField textField;

    //"Item Description"
    //  Name:
    //  Value:
    //  Able to loan:
    //  Availability:
    //  Requested:
    //  Date Due:
    //  OK button to return to LibraryView()

    ItemView(Library library) {
        JFrame frame = new JFrame("Item Description");
        this.itemFrame = frame;
        itemFrame.setSize(450, 550);
        itemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.itemPanel = panel;
        itemPanel.setLayout(new GridLayout(4, 1));

        JButton Button = new JButton("Ok");
        this.okButton = Button;
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == okButton) {
                    itemFrame.dispose();
                }
            }
        });

        itemPanel.add(okButton);
        itemFrame.add(itemPanel);
        itemFrame.setVisible(true);
    }
}
