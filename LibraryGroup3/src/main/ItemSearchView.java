package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class ItemSearchView extends JFrame{
    private JFrame Frame = new JFrame("Item Search Window");
    private JPanel Panel = new JPanel();
    private JButton searchButton = new JButton("Search");
    private JTextField TextField = new JTextField();
    private JLabel typeLabel = new JLabel("Enter Item Name");
    private JLabel chooseLabel = new JLabel("Or choose Item Type");
    private JButton typeButton = new JButton("See list");
    private String[] typeStrings = { "Books" , "Ref-Books", "Magazines", "AudVid" };
    private JComboBox itemType = new JComboBox(typeStrings);
    protected Library library;

    //"Item Search Window"
    //  TextField
    //  Search Button

    ItemSearchView(Library library){
        
    	this.library = library;
        Frame.setSize(400, 100);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.setLayout(new GridLayout(2,3));
        Panel.add(typeLabel);
        Panel.add(TextField);
        Panel.add(searchButton);
        Panel.add(chooseLabel);
        Panel.add(itemType);
        Panel.add(typeButton);
        Frame.add(Panel);
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String txt = TextField.getText().toString();
            	for (Item item : library.items) {
            		if (txt.equals(item.getName())) {
            			Frame.dispose();
                        ItemView itemView = new ItemView(library, item);
            		}		
            	}
            }   
        });
        
        typeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String selected = (String) itemType.getSelectedItem();
            	System.out.println(selected);
            }
            
        });
        Frame.setLocationRelativeTo(null);
        Frame.setVisible(true);        
    }        
}