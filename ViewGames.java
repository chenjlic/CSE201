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
	static Object[] columnNames;
	static Object[][]data;
	static JScrollPane scrollPane;
	JPanel centerPanel;
	static JTable table;
	static DefaultTableModel model;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void viewGames(JFrame jf) {
		ArrayList<VideoGame> games = new ArrayList<>();
		Main.parseVideoGames(games);
		columnNames = new Object[games.size() + 1];
		data = new Object[4][games.size() + 1];
		columnNames[0] = "Title";
		data[0][0] = "Description";
		data[1][0] = "Platform";
		data[2][0] = "Developer";
		data[3][0] = "Price";
		for (int i = 0, k = 1; i < games.size() ; i++, k++) {
			columnNames[k] = games.get(i).getName();
		}
		for (int i = 0, k = 1; i < games.size() ; i++, k++) {
			data[0][k] = games.get(i).getDescription();
			data[1][k] = games.get(i).getPlatformString();
			data[2][k]= games.get(i).getDeveloper();
			data[3][k] = games.get(i).getPrice();
		}
		model = new DefaultTableModel(data, columnNames);
		table = new JTable(model);
		scrollPane = new JScrollPane(table);
	
		
		table.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
		table.setFillsViewportHeight(true);	
		TableColumn column = null;
		for (int i = 0; i < games.size() + 1; i++) {
		    column = table.getColumnModel().getColumn(i);
		    column.setMinWidth(400); 
		}
		
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment( JLabel.CENTER );
		TableColumn column1 = table.getColumnModel().getColumn(0);
		column1.setCellRenderer(center);
		table.setRowHeight(80);
		
		
		
		jf.getContentPane().add(scrollPane, BorderLayout.CENTER);
		ViewGames.table.getTableHeader().repaint();
		ViewGames.model.fireTableDataChanged();
	}
	
	public static void swap(int index1, int index2) {
		table.moveColumn(index1, index2);
	}
}
