import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class ItemSearchView extends JFrame {
    private JFrame Frame = new JFrame("Item Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchButton = new JButton("Search");
    private JLabel textLabel = new JLabel("Enter Item:");
    private JButton menuButton = new JButton("Main Menu");
    private JTextField TextField = new JTextField();
    protected Library library;

    //"Item Search Window"
    //  TextLabel
    //  TextField
    //  Menu Button
    //  Search Button

    ItemSearchView(Library library){
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
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == searchButton) {
                    Frame.dispose();
                    ItemView item = new ItemView(library);
                }
            }
        });

//        searchButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Item tempItem;
//                String tempName;
//                boolean flag = false;
//                for(int i = 0; i < library.items.size(); i++) {
//                    tempItem = library.getItemList().get(i);
//                    tempName = tempItem.getName();
//                    String text = TextField.getText();
//                    if (text.equals(tempName) && e.getSource() == searchButton) {
//                        Frame.dispose();
//                        ItemView item = new ItemView(library);
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
        Panel.add(searchButton);
        Frame.add(Panel);
        Frame.setVisible(true);
    }
}