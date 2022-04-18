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
	
	//=========================== Methods
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
	public String getPlatformString() {
		String platformsFormatted = "";
		for(int i = 0; i < platforms.length; i++) {
			if(i == platforms.length-1) {
				platformsFormatted += platforms[i];
			}
			else {
				platformsFormatted += platforms[i] + "/";
			}
		}
		return platformsFormatted;
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String[] platforms) {
		this.platforms = platforms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
