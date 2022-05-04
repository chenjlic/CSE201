import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.RowFilter;
import javax.swing.RowFilter.Entry;

public class Filter {

	/*
	 * public class FilterByDeveloper extends RowFilter {
	 * 
	 * String dev; public FilterByDeveloper(String dev) { dev = dev; }
	 * 
	 * @Override public boolean include(Entry entry) {
	 * 
	 * if (dev.equals(entry.getStringValue(2))) return true; return false; }
	 * 
	 * }
	 */
	public static boolean filtered = false;
	
	public static ArrayList<VideoGame> filterByPrice (int low, int high, ArrayList<VideoGame> games) {

		
	games.removeIf(s -> !(s.getPrice() <= high && s.getPrice() >= low));
	
	return games;
		
	}
	
	public static ArrayList<VideoGame> filterByDev (String dev, ArrayList<VideoGame> games) {
		games.removeIf(s -> !(s.getDeveloper().contains(dev)));
		return games;
	}
	
	
	public static ArrayList<VideoGame> filterByPlatform(String platform, ArrayList<VideoGame> games) {
		games.removeIf(s -> !(Arrays.toString(s.getPlatforms()).contains(platform)));
		return games;
		
	}
	

	/*
	 * public static ArrayList<VideoGame> filterByGenre (String genre,
	 * ArrayList<VideoGame> games) { games.removeIf(s ->
	 * !(s.getGenre().contains(genre)));
	 * 
	 * return games;
	 * 
	 * }
	 */
	

}
