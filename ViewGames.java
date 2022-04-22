import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class ViewGames {
	private static Object[] columnNames;
	private static Object[][]data;
	JPanel centerPanel;
	static JTable table;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void viewGames(JFrame jf) {
		ArrayList<VideoGame> games = new ArrayList<>();
		Main.parseVideoGames(games);
		columnNames = new Object[games.size()];
		data = new Object[4][games.size()];
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
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		TableColumn column1 = table.getColumnModel().getColumn(0);
		//TableColumn column2 = table.getColumnModel().getColumn(1);
		//TableColumn column3 = table.getColumnModel().getColumn(2);
		//TableColumn column4 = table.getColumnModel().getColumn(3);
	    //TableColumn column5 = table.getColumnModel().getColumn(4);
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment( JLabel.CENTER );
		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
		table.setFillsViewportHeight(true);	
		TableColumn column = null;
		for (int i = 0; i < games.size(); i++) {
		    column = table.getColumnModel().getColumn(i);
		    column.setMinWidth(400); 
		}
		column1.setCellRenderer(center);
		//column5.setCellRenderer(center);
		table.setRowHeight(80);
		jf.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
	}
	
	public static void swap(int index1, int index2) {
		table.moveColumn(index1, index2);
	}
}
