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
				ViewGames.viewGames(jf);
				String a  = SearchBar.getText();
				ArrayList<VideoGame> games = new ArrayList<>(); 
				Main.parseVideoGames(games);
				int b = 1;
				for (int i = 1; i < games.size() ; i++) {
					if(a.toLowerCase().equals(games.get(i).getName().toLowerCase())){
						ViewGames.swap(i, b);
						b++;
						System.out.println("1");
					}
				}
			}
		});
		
	}
}
