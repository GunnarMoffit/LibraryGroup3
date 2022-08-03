import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class ItemSearchView extends JFrame {
    private JFrame Frame;
    private JPanel Panel;
    private JButton searchButton;
    private JTextField TextField;

    //"Item Search Window"
    //  TextField
    //  Search Button

    ItemSearchView(Library library){
        JFrame frame = new JFrame("Item Search Window");
        this.Frame = frame;
        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.Panel = panel;
        Panel.setLayout(new GridLayout(2, 1));

        JTextField textField = new JTextField();
        this.TextField = textField;
        String text = TextField.getText();

        JButton button = new JButton("Search");
        this.searchButton = button;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Item tempItem;
                String tempName;
                boolean flag = false;
                for(int i = 0; i < library.items.size(); i++) {
                    tempItem = library.getItemList().get(i);
                    tempName = tempItem.getName();
                    if (text.equals(tempName) && e.getSource() == searchButton) {
                        Frame.dispose();
                        ItemView item = new ItemView(library);
                        flag = true;
                    }
                    if(!flag) {
                        JOptionPane.showMessageDialog(null, "Enter Valid Item Title");
                    }
                }
            }
        });

        Panel.add(TextField);
        Panel.add(searchButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }
}