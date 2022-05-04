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
	/** create search button
	 * @parameter jf:frame of UI; panel: the panel to put UI
	 * @return void
	 */
	static ArrayList<VideoGame> games = new ArrayList<>();
	public static void createSearchButton(JFrame jf, JPanel panel) {
				
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton searchButton = new JButton("Search");
		searchButton.setSize(20,20);
		panel.add(searchButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		/** add action listener to search button, so when user click the button, they can search the game they want;
		 */
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = SearchBar.getText();
				Main.parseVideoGames(games);
				VideoGame b = new VideoGame();
				int c= 0;
				 for(int i = 1;i <games.size(); i ++) {
					 if(a.compareToIgnoreCase(games.get(i).getName())==0) {
						 c=i;
					 }
				 }
				 System.out.println(1);
				 b= games.get(c);
				 games.set(c, games.get(1));
				 games.set(0, b);
				 Sort.sortTable(games, jf);
			}
		});
		
	}
}
