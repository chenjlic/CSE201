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


public class ViewFavorites {
	static Object[] favColumnNames;
	static Object[][]favData;
	static JScrollPane favScrollPane;
	JPanel favCenterPanel;
	static JTable favTable;
	static DefaultTableModel favModel;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void viewFavorites(JFrame jf, ArrayList<VideoGame> favorites) {
				
		favColumnNames = new Object[favorites.size()+1];
		favData = new Object[4][favorites.size()+1];
		favColumnNames[0] = "Favorites";
		favData[0][0] = "Description";
		favData[1][0] = "Platform";
		favData[2][0] = "Developer";
		favData[3][0] = "Price";
		for (int i = 0, k = 1; i < favorites.size() ; i++, k++) {
			favColumnNames[k] = favorites.get(i).getName();
		}
		for (int i = 0, k = 1; i < favorites.size() ; i++, k++) {
			favData[0][k] = favorites.get(i).getDescription();
			favData[1][k] = favorites.get(i).getPlatformString();
			favData[2][k]= favorites.get(i).getDeveloper();
			favData[3][k] = favorites.get(i).getPrice();
		}
		favModel = new DefaultTableModel(favData, favColumnNames);
		favTable = new JTable(favModel);
		favScrollPane = new JScrollPane(favTable);
	
		
		favTable.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
		favTable.setFillsViewportHeight(true);
		TableColumn column = null;
		for (int i = 0; i < favorites.size() + 1; i++) {
		    column = favTable.getColumnModel().getColumn(i);
		    column.setMinWidth(400); 
		}
		
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment( JLabel.CENTER );
		TableColumn column1 = favTable.getColumnModel().getColumn(0);
		column1.setCellRenderer(center);
		favTable.setRowHeight(80);
		
		
		
		jf.getContentPane().add(favScrollPane, BorderLayout.CENTER);
		jf.validate();
		ViewFavorites.favTable.getTableHeader().repaint();
		ViewFavorites.favModel.fireTableDataChanged();
	}
	
}

