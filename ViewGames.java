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
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class ViewGames {
	private static Object[] columnNames;
	private static Object[][]data;
	JPanel centerPanel;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void viewGames(JFrame jf) {
		columnNames = new Object[]{"Title", "Description", "Platform", "Developer", "Price"};
		ArrayList<VideoGame> games = new ArrayList<>(); 
		Main.parseVideoGames(games);
		data = new Object[games.size()][5];
		for (int i = 0; i < games.size() ; i++) {
			data[i][0] = games.get(i).getName();
			data[i][1] = games.get(i).getDescription();
			data[i][2] = games.get(i).getPlatformString();
			data[i][3] = games.get(i).getDeveloper();
			data[i][4] = games.get(i).getPrice();
		}
		
		JTable table = new JTable(data, columnNames);
		table.setFillsViewportHeight(true);	
		JScrollPane scrollPane = new JScrollPane(table);
		TableColumn column1 = table.getColumnModel().getColumn(0);
		TableColumn column2 = table.getColumnModel().getColumn(1);
		TableColumn column3 = table.getColumnModel().getColumn(2);
		TableColumn column4 = table.getColumnModel().getColumn(3);
		TableColumn column5 = table.getColumnModel().getColumn(4);
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment( JLabel.CENTER );
		column1.setPreferredWidth(40); 
		column1.setCellRenderer(center);
		column2.setPreferredWidth(400);
		column3.setPreferredWidth(400);
		column4.setPreferredWidth(20);
		column5.setPreferredWidth(20);
		column5.setCellRenderer(center);
		    
		jf.getContentPane().add(scrollPane, BorderLayout.CENTER);
	
		
		
	}
//	import java.awt.BorderLayout;
//	import java.util.ArrayList;
//
//	import javax.swing.JButton;
//	import javax.swing.JFrame;
//	import javax.swing.JLabel;
//	import javax.swing.JPanel;
//
//
//	public class ViewGames {
//		public static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
//		public static void viewGames(JFrame jf) {
//			
//			jf.setLocationRelativeTo(null);
//	        JPanel panel = new JPanel();  
//	        panel.setLayout(null);
//	        l1 = new JLabel("Name");
//	        l1.setBounds(20,10,70,25);
//	        panel.add(l1);
//	         l2 = new JLabel("Platform");
//	        l2.setBounds(20, 80, 70, 25);
//	        panel.add(l2);
//	         l3 = new JLabel("Price: $");
//	        l3.setBounds(20, 150, 70, 25);
//	        panel.add(l3);
//	         l4 = new JLabel("Developer");
//	        l4.setBounds(20, 220, 70, 25);
//	        panel.add(l4);
//	         l5 = new JLabel("Description");
//	        l5.setBounds(20, 290, 70, 25);
//	        panel.add(l5);
//	         l6 = new JLabel("Valorant");
//	        l6.setBounds(110, 10, 200, 25);
//	        panel.add(l6);
//	         l7 = new JLabel("Windows");
//	        l7.setBounds(110, 80, 200, 25);
//	        panel.add(l7);
//	         l8 = new JLabel("0");
//	        l8.setBounds(110, 150, 200, 25);
//	        panel.add(l8);
//	         l9 = new JLabel("RiotGames Website");
//	        l9.setBounds(110, 220, 200, 25);
//	        panel.add(l9);
//	         l10 = new JLabel("Tactical Shooting game involving two teams with 5 players in each team.");
//	        l10.setBounds(110, 290, 200, 25);
//	        panel.add(l10);
//	         l11 = new JLabel("League of Legends");
//	        l11.setBounds(330,10,200,25);
//	        panel.add(l11);
//	         l12 = new JLabel("Windows/Mac");
//	        l12.setBounds(330, 80, 200, 25);
//	        panel.add(l12);
//	         l13 = new JLabel("0");
//	        l13.setBounds(330, 150, 200, 25);
//	        panel.add(l13);
//	         l14 = new JLabel("RiotGames Website");
//	        l14.setBounds(330, 220, 200, 25);
//	        panel.add(l14);
//	         l15 = new JLabel("Multiplayer online battle arena video game.");
//	        l15.setBounds(330, 290,200, 25);
//	        panel.add(l15);
//	         l16 = new JLabel("Hunt:Showdown");
//	        l16.setBounds(550,10,200,25);
//	        panel.add(l16);
//	         l17 = new JLabel("Windows/PS4/XboxOne");
//	        l17.setBounds(550, 80, 200, 25);
//	        panel.add(l17);
//	         l18 = new JLabel("40");
//	        l18.setBounds(550, 150, 200, 25);
//	        panel.add(l18);
//	         l19 = new JLabel("Crytek");
//	        l19.setBounds(550, 220, 200, 25);
//	        panel.add(l19);
//	         l20 = new JLabel("First-person shooter video game.");
//	        l20.setBounds(550, 290,200, 25);
//	        panel.add(l20);
//	         l21 = new JLabel("Counter-Strike: Global Offensive");
//	        l21.setBounds(770,10,250,25);
//	        panel.add(l21);
//	         l22 = new JLabel("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
//	        l22.setBounds(770, 80, 250, 25);
//	        panel.add(l22);
//	         l23 = new JLabel("0");
//	        l23.setBounds(770, 150, 250, 25);
//	        panel.add(l23);
//	         l24 = new JLabel("Valve");
//	        l24.setBounds(770, 220, 250, 25);
//	        panel.add(l24);
//	         l25 = new JLabel("First-person shooter video game.");
//	        l25.setBounds(770, 290,250, 25);
//	        panel.add(l25);
//	         l26 = new JLabel("Minecraft");
//	        l26.setBounds(1050,10,350,25);
//	        panel.add(l26);
//	         l27 = new JLabel("Java/Windows/PS4/Android/Switch/Mac/WiiU,AppleTV,iOS");
//	        l27.setBounds(1050, 80, 350, 25);
//	        panel.add(l27);
//	         l28 = new JLabel("30");
//	        l28.setBounds(1050, 150, 350, 25);
//	        panel.add(l28);
//	         l29 = new JLabel("Mojang");
//	        l29.setBounds(1050, 220, 350, 25);
//	        panel.add(l29);
//	         l30 = new JLabel("Sandbox video game.");
//	        l30.setBounds(1050, 290,350, 25);
//	        panel.add(l30);
//	        jf.add(panel, BorderLayout.CENTER);
//		}
//		public static void lol() {
//			l6.setText("League of Legends");
//			l7.setText("Windows/Mac");
//			l8.setText("0");
//			l9.setText("RiotGames Website");
//			l10.setText("Multiplayer online battle arena video game.");
//			l11.setText("Valorant");
//			l12.setText("Windows");
//			l13.setText("0");
//			l14.setText("RiotGames Website");
//			l15.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//		}
//		public static void hunt() {
//			l6.setText("HuntShowdown");
//			l7.setText("Windows/PS4/XboxOne");
//			l8.setText("40");
//			l9.setText("Crytek");
//			l10.setText("First-person shooter video game.");
//			l16.setText("Valorant");
//			l17.setText("Windows");
//			l18.setText("0");
//			l19.setText("RiotGames Website");
//			l20.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//		}
//		public static void mc() {
//			l6.setText("Minecraft");
//			l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV,iOS");
//			l8.setText("30");
//			l9.setText("Mojong");
//			l10.setText("Sandbox video game.");
//			l26.setText("Valorant");
//			l27.setText("Windows");
//			l28.setText("0");
//			l29.setText("RiotGames Website");
//			l30.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//		}
//		public  static void csgo() {
//			l6.setText("Counter-Strike Global Offensive");
//			l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
//			l8.setText("0");
//			l9.setText("Valve");
//			l10.setText("First-person shooter video game.");
//			l21.setText("Valorant");
//			l22.setText("Windows");
//			l23.setText("0");
//			l24.setText("RiotGames Website");
//			l25.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//		}
//		
//
//	}

	
}