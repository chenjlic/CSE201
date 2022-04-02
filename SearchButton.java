import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchButton {
	
	public static void createSearchButton(JFrame jf, JPanel panel) {
		JButton searchButton = new JButton("Search");
		searchButton.setSize(20,20);
		panel.add(searchButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
	}
}
