import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemView extends JFrame {
    private JFrame itemFrame = new JFrame("Item Description");
    private JPanel itemPanel;
    private JLabel nameLabel = new JLabel("Name: ");
    private JLabel valueLabel = new JLabel("Value: ");
    private JLabel loanabilityLabel = new JLabel("Able to loan: ");
    private JLabel availabilityLabel = new JLabel("Availability: ");
    private JLabel requestedLabel = new JLabel("Requested: ");
    private JLabel dueDateLabel = new JLabel("Date Due: ");
    private JButton okButton = new JButton("Ok");

    //"Item Description"
    //  Name:
    //  Value:
    //  Able to loan:
    //  Availability:
    //  Requested:
    //  Date Due:
    //  OK button to return to LibraryView()

    ItemView(Library library) {

        itemFrame.setSize(450, 550);
        itemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.itemPanel = panel;
        itemPanel.setLayout(new GridLayout(7, 1));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == okButton) {
                    itemFrame.dispose();
                }
            }
        });

        itemPanel.add(nameLabel);
        itemPanel.add(valueLabel);
        itemPanel.add(loanabilityLabel);
        itemPanel.add(availabilityLabel);
        itemPanel.add(requestedLabel);
        itemPanel.add(dueDateLabel);
        itemPanel.add(okButton);
        itemFrame.add(itemPanel);
        itemFrame.setVisible(true);
    }
}