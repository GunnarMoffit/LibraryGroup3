import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class ItemSearchView extends JFrame {
    private JFrame Frame = new JFrame("Item Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchButton = new JButton("Search");
    private JTextField TextField = new JTextField();

    //"Item Search Window"
    //  TextField
    //  Search Button

    ItemSearchView(Library library){
        Frame.setSize(400, 200);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel.setLayout(new GridLayout(2, 1));

        String text = TextField.getText();

        searchButton.addActionListener(new ActionListener() {
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