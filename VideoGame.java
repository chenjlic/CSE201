public class VideoGame {
	//=========================== Properties
	private String name, developer, description;
	private String[] platforms;
	private double price;
	
	//=========================== Constructors
	public VideoGame() {
		
	}
	
	public VideoGame(String name, String description ,String[] platforms, String developer, double price) {
		this.name = name;
		this.description = description;
		this.developer = developer;
		this.platforms = platforms;
		this.price = price;
	}
	public String toString() {
		String platformsFormatted = "";
		for(int i = 0; i < platforms.length; i++) {
			if(i == platforms.length-1) {
				platformsFormatted += platforms[i];
			}
			else {
				platformsFormatted += platforms[i] + "/";
			}
		}
		return "Name: " + name + " Description: " + description + " Platforms: " + platformsFormatted + " Developer: " + 
				developer + " Price: " + price;
	}
	//=========================== Methods
}
