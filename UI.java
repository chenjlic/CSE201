import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;


public class UI {
	static JFrame jf = new JFrame("Video Game Catalog");
	static ArrayList<VideoGame> games = new ArrayList<>();
	static ArrayList<VideoGame> favorites = new ArrayList<>();
	public UI() {
		
		Main.parseVideoGames(games);
		jf.setLayout(new BorderLayout());
		jf.setSize(1600,500);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewGames.viewGames(jf, games);
		JPanel northPanel = new JPanel();
		CreateAccount.createAccountButton(jf, northPanel);
		Log_In.CreateLogInButton(jf, northPanel);
		SearchBar bar = new SearchBar(northPanel);
		SearchButton.createSearchButton(jf, northPanel);
		
		Sort.createSortMenu(jf,northPanel);
		FilterDropDown.createFilterButton(jf, northPanel);
		AddToFavorite.FavoriteButton(jf, northPanel);
		
		jf.setVisible(true);
		//JPanel southPanel = new JPanel();
		
		
	}
	public static void fullCatalog() {
		ViewGames.viewGames(jf, games);
		
	}
	public static void favCatalog() {
		
		ViewFavorites.viewFavorites(jf, favorites);
	}

}
