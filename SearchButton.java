import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SearchButton {
	
	public static void createSearchButton(JFrame jf, JPanel panel) {
				
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton searchButton = new JButton("Search");
		searchButton.setSize(20,20);
		panel.add(searchButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = SearchBar.getText();
				ArrayList<VideoGame> games = new ArrayList<>();
				Main.parseVideoGames(games);
				int b = 1;
				 for(int i = games.size()-1;i > 1; i --) {
					 if(a.compareToIgnoreCase(games.get(i).getName())==0) {
						 b=i;
					 }
				 }
				ViewGames.swap(b, 1);
			}
		});
		
	}
}
