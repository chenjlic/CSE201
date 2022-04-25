import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class AddToFavorite {
	public static Map<String,String[]> userFavorites = new TreeMap<>();
	public static String loggedInAccount;
	
	public static void FavoriteButton(JFrame jf, JPanel panel) {
		Main.parseFavoriteGames(UI.favorites);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton fv = new JButton("Add to favorite");
		fv.setSize(60,20);
		panel.add(fv);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		fv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					ArrayList<String> favGames = new ArrayList<>();
					userFavorites = getAccountFavorites();
					if(userFavorites.get(loggedInAccount) != null) {
					for(int i = 0; i < userFavorites.get(loggedInAccount).length;i++) {
						favGames.add(userFavorites.get(loggedInAccount)[i]);
					}
					}
				
				for (int i = 1 ; i < ViewGames.columnNames.length; i++) {
					if(Boolean.valueOf(ViewGames.table.getValueAt(4, i).toString()) == true) {
						if(!favGames.contains(ViewGames.table.getColumnName(i))) {
						favGames.add(ViewGames.table.getColumnName(i));
						}
					}
				}
				String[] favGames2 = new String[favGames.size()];
				for(int i = 0; i < favGames.size(); i++) {
					favGames2[i] = (String) favGames.get(i);
				}
				userFavorites.put(loggedInAccount, favGames2);
				setAccountFavorites();
			}
		});
		
	
	}
	public static void currentAccount(String account) {
		loggedInAccount = account;
	}
	public static Map<String, String[]> getAccountFavorites() {
		File file = new File("AccountFavorites.txt");
		Scanner input = null;
		String inputLine;
		String user;
		String[] line;
		String[] games;
	
		Map<String, String[]> accounts = new HashMap<>();
		try {
			input = new Scanner(file);
			while(input.hasNext()) {
				inputLine = input.nextLine();
				line = inputLine.split("\t");
				user = line[0];
				games = new String[line.length-1];
				for (int i = 1; i < line.length; i++) {
					games[i-1] = line[i];
				}
				accounts.put(user,games);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return accounts;
	}
	public static void setAccountFavorites() {
		File file = new File("AccountFavorites.txt");
		PrintWriter pw = null;
		try {
			
			pw = new PrintWriter(new FileOutputStream(file), true);
			for(Map.Entry<String,String[]> e: userFavorites.entrySet()) {
				pw.write(e.getKey() + "\t");
				for(int i = 0; i < e.getValue().length;i++) {
					pw.write(e.getValue()[i] + "\t");
				}
				pw.write("\n");
			}
				
		} catch (FileNotFoundException e){
			e.printStackTrace();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			pw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}