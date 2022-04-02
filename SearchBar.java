import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchBar {
	
	public static void createSearchBar(JFrame jf, JPanel panel) {
		JTextField searchBar = new JTextField(50);
		
		panel.add(searchBar);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
	}
}
