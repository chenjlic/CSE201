import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;


public class UI {
	
	public UI() {
		ArrayList<VideoGame> games = new ArrayList<>();
		Main.parseVideoGames(games);
		JFrame jf = new JFrame("Video Game Catalog");
		jf.setLayout(new BorderLayout());
		jf.setSize(1400,600);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewGames.viewGames(jf, games);
		CreateAccount.createAccountButton(jf);
		
	}

}
