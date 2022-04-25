import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {

	public static void main(String[] args) {
		UI ui = new UI();
		
	}
	/**
	 * Parses text from VideoGamesList.txt to create VideoGameObjects
	 * @param games type:ArrayList of VideoGames
	 */
	public static void parseVideoGames(ArrayList<VideoGame> games) {
		File file;
		Scanner input = null;
		String inputLine;
		String[] properties = new String[5]; 
		String name;
		String description;
		String[] platforms;
		String developer;
		Double price;
		
		
		try {
			file = new File("VideoGameList.txt");
			input = new Scanner(file);
			while(input.hasNext()) {
				inputLine = input.nextLine();
				properties = inputLine.split("\t");
				name = properties[0];
				description = properties[1];
				platforms = properties[2].split("/");
				developer = properties[3];
				price = Double.parseDouble(properties[4]);
				games.add(new VideoGame(name,description,platforms, developer, price));
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
	
	}
	
	public static void parseFavoriteGames(ArrayList<VideoGame> favorites) {
		ArrayList<String> gameTitles = new ArrayList<>();
		ArrayList<VideoGame> games = new ArrayList<>();
		parseVideoGames(games);
		File file;
		Scanner input = null;
		
		String inputLine;
		String[] properties;
	
		
		try {
			file = new File("AccountFavorites.txt");
		
			input = new Scanner(file);
			while(input.hasNext()) {
				inputLine = input.nextLine();
				properties = inputLine.split("\t");
				//Temp placeholder
				if(properties[0].equals("asdf")) {
					for(int i = 1; i < properties.length;i++) {
						gameTitles.add(properties[i]);
					}
				}
			}
			for (int i = 0; i < gameTitles.size(); i++) {
				if(gameTitles.get(i).equals(games.get(i).getName())) {
					favorites.add(games.get(i));
				}
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
	
	}
	
	public static void storeUserInfo(String username, String password, String recoveryQuestion, String recoveryAnswer) {
		File file = new File("UserAccounts.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(file), true);
			pw.append(username + "\t" + password + "\t" + recoveryQuestion + "\t" + recoveryAnswer);
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
	public static Map<String, String[]> getUserInfo() {
		File file = new File("UserAccounts.txt");
		Scanner input = null;
		String inputLine;
		String user;
		String password;
		String securityQ;
		String securityA;
		String properties[];
		Map<String, String[]> accounts = new HashMap<>();
		try {
			input = new Scanner(file);
			while(input.hasNext()) {
				inputLine = input.nextLine();
				properties = inputLine.split("\t");
				user = properties[0];
				password = properties[1];
				securityQ = properties[2];
				securityA = properties[3];
				accounts.put(user,properties);
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
	public static void rewriteAccounts(Map<String,String[]> accounts) {
		File file = new File("UserAccounts.txt");
		PrintWriter pw = null;
		try {
			
			pw = new PrintWriter(new FileOutputStream(file), true);
			for(Map.Entry<String,String[]> e: accounts.entrySet()) {
				pw.write(e.getValue()[0] + "\t"+ e.getValue()[1] + "\t" +  
			e.getValue()[2] + "\t" +  e.getValue()[3] + "\n");
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

