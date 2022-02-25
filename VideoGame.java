public class VideoGame {
	//=========================== Properties
	private String name, store;
	private String[] platforms;
	private double price;
	
	//=========================== Constructors
	public VideoGame() {
	
	}
	
	public VideoGame(String name, String[] platforms, String store, double price) {
		this.name = name;
		this.store = store;
		this.platforms = platforms;
		this.price = price;
	}
	
	//=========================== Methods
}
