import java.util.*;

public class UserData {
	//=========================== Properties
	private String UserName, Password;
    private VideoGame[] favorite;
	private int FavoriteSize;
	
	//=========================== Constructors
	
	public UserData(String UserName, String Password) {
		this.UserName = UserName;
		this.Password = Password;
		favorite = new VideoGame[20];
		FavoriteSize=0;
	}
	
	//=========================== Methods
	
	//A method that users who log in able to 'favorite' specific game
	public void AddFavorite(VideoGame videogame) {
		if(FavoriteSize==favorite.length) {
			VideoGame[] favor = Arrays.copyOf(favorite, FavoriteSize);
			favorite = favor;
		}
		favorite[FavoriteSize] = videogame;
	}
	//Turn users' name and password to string
	public String toStirng() {
		String a = "";
		a+=UserName;
		a+=" ";
		a+=Password;
		return a;
	}
	
}
	
