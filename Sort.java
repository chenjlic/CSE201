import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class Sort {

	public static JTable newTable;
	public static ArrayList<VideoGame> sortedGamesPriceDe = new ArrayList<>();
	public static ArrayList<VideoGame> sortedGamesPriceAs = new ArrayList<>();
	public static ArrayList<VideoGame> sortedGamesAlpha = new ArrayList<>();
	public static Object[][] sortedData;
	public static JScrollPane sortedPane;
	
	public static void createSortMenu(JFrame jf, JPanel panel) {
		String[] options = {"Unsorted", "Alphabetically", "Price Descending", "Price Ascending"};
		
		JComboBox<String> jComboBox = new JComboBox<>(options);
		
		JButton jButton = new JButton("Sort");
		JLabel jLabel = new JLabel("Sort By:");
		
		panel.add(jLabel);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		panel.add(jComboBox);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		panel.add(jButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				String selected = (String) jComboBox.getSelectedItem();
				if(selected == "Price Descending") {
					sortPriceDescend();
				} 
				else if (selected == "Price Ascending") {
					sortPriceAscend();
				}
				else if (selected == "Alphabetically") {
					sortAlphabet();
				} else {
					ViewGames.scrollPane.setVisible(true);
					sortedPane.setVisible(false);
				}
			}
		});
	}
	
	public static void sortPriceAscend() {
		Main.parseVideoGames(sortedGamesPriceAs);
		sortedGamesPriceAs.sort((o1, o2)
                -> o1.compareTo(o2));
		sortTable(sortedGamesPriceAs,UI.jf);
		sortedPane.setVisible(true);
	}
	
	public static void sortPriceDescend() {
		sortedGamesPriceDe = new ArrayList<>();
		Main.parseVideoGames(sortedGamesPriceDe);
		sortedGamesPriceDe.sort((o1, o2)
                -> o2.compareTo(o1));
		sortTable(sortedGamesPriceDe,UI.jf);
		sortedPane.setVisible(true);
	}
	
	public static void sortAlphabet() {
		Main.parseVideoGames(sortedGamesAlpha);
		sortedGamesAlpha.sort((o1, o2)
                -> o1.getName().compareTo(
                    o2.getName()));
		sortTable(sortedGamesAlpha,UI.jf);
		sortedPane.setVisible(true);
	}
	
	public static void sortTable(ArrayList<VideoGame> games, JFrame jf) {
		Object[] columnNames = new Object[games.size()];
		Object[][]data = new Object[4][games.size()];
		columnNames[0] = "Title";
		data[0][0] = "Description";
		data[1][0] = "Platform";
		data[2][0] = "Developer";
		data[3][0] = "Price";
		
		for (int i = 1; i < games.size() ; i++) {
			columnNames[i] = games.get(i).getName();
			
		}
		for (int i = 1; i < games.size() ; i++) {
			
			data[0][i] = games.get(i).getDescription();
			data[1][i] = games.get(i).getPlatformString();
			data[2][i]= games.get(i).getDeveloper();
			data[3][i] = games.get(i).getPrice();
		}
	
		JTable table = new JTable(data, columnNames);
	
		table.setFillsViewportHeight(true);	
		sortedPane = new JScrollPane(table);
		TableColumn column1 = table.getColumnModel().getColumn(0);
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment( JLabel.CENTER );

		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
		TableColumn column = null;
		for (int i = 0; i < games.size(); i++) {
		    column = table.getColumnModel().getColumn(i);
		    column.setMinWidth(400); 
		}
		column1.setCellRenderer(center);
		table.setRowHeight(80);
		ViewGames.scrollPane.setVisible(false);
		jf.getContentPane().add(sortedPane, BorderLayout.CENTER);
		
	}
}
