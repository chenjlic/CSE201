import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



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

}
