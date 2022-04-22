import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SearchBar {
	
		static JTextField searchBar;
		
		SearchBar(JPanel panel) {
		searchBar = new JTextField(50);
		panel.add(searchBar);
		
	}
	public static String getText() {
		return searchBar.getText();
	}
}
