//import java.awt.BorderLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class Sort {
//
//	public static void createSortMenu(JFrame jf, JPanel panel) {
//		String[] options = {" ", "Alphabetically", "Price Descending", "Price Ascending"};
//		
//		JComboBox<String> jComboBox = new JComboBox<>(options);
//		
//		JButton jButton = new JButton("Sort");
//		JLabel jLabel = new JLabel("Sort By:");
//		
//		panel.add(jLabel);
//		jf.getContentPane().add(panel, BorderLayout.NORTH);
//		panel.add(jComboBox);
//		jf.getContentPane().add(panel, BorderLayout.NORTH);
//		panel.add(jButton);
//		jf.getContentPane().add(panel, BorderLayout.NORTH);
//		
//		jButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent E) {
//				String selected = (String) jComboBox.getSelectedItem();
//				if(selected == "Price Descending") {
//					sortPriceDescend();
//				} 
//				else if (selected == "Price Ascending") {
//					sortPriceAscend();
//				}
//				else if (selected == "Alphabetically") {
//					sortAlphabet();
//				}
//			}
//		});
//	}
//	
//	public static void sortPriceDescend() {
//		ViewGames.l6.setText("Hunt:Showdown");
//		ViewGames.l7.setText("Windows/PS4/XboxOne");
//		ViewGames.l8.setText("40");
//		ViewGames.l9.setText("Crytek");
//		ViewGames.l10.setText("First-person shooter video game.");
//		ViewGames.l11.setText("Minecraft");
//		ViewGames.l12.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
//		ViewGames.l13.setText("30");
//		ViewGames.l14.setText("Mojang");
//		ViewGames.l15.setText("Sandbox video game.");
//		ViewGames.l16.setText("Counter-Strike Global Offensive");
//		ViewGames.l17.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
//		ViewGames.l18.setText("0");
//		ViewGames.l19.setText("Valve");
//		ViewGames.l20.setText("First-person shooter video game.");
//		ViewGames.l21.setText("League of Legends");
//		ViewGames.l22.setText("Windows/Mac");
//		ViewGames.l23.setText("0");
//		ViewGames.l24.setText("RiotGames Website");
//		ViewGames.l25.setText("Multiplayer online battle arena video game.");
//		ViewGames.l26.setText("Valorant");
//		ViewGames.l27.setText("Windows");
//		ViewGames.l28.setText("0");
//		ViewGames.l29.setText("RiotGames Website");
//		ViewGames.l30.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//	}
//	
//	public static void sortPriceAscend() {
//		ViewGames.l6.setText("Counter-Strike Global Offensive");
//		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
//		ViewGames.l8.setText("0");
//		ViewGames.l9.setText("Valve");
//		ViewGames.l10.setText("First-person shooter video game.");
//		ViewGames.l11.setText("League of Legends");
//		ViewGames.l12.setText("Windows/Mac");
//		ViewGames.l13.setText("0");
//		ViewGames.l14.setText("RiotGames Website");
//		ViewGames.l15.setText("Multiplayer online battle arena video game.");
//		ViewGames.l16.setText("Valorant");
//		ViewGames.l17.setText("Windows");
//		ViewGames.l18.setText("0");
//		ViewGames.l19.setText("RiotGames Website");
//		ViewGames.l20.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//		ViewGames.l21.setText("Minecraft");
//		ViewGames.l22.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
//		ViewGames.l23.setText("30");
//		ViewGames.l24.setText("Mojang");
//		ViewGames.l25.setText("Sandbox video game.");
//		ViewGames.l26.setText("Hunt:Showdown");
//		ViewGames.l27.setText("Windows/PS4/XboxOne");
//		ViewGames.l28.setText("40");
//		ViewGames.l29.setText("Crytek");
//		ViewGames.l30.setText("First-person shooter video game.");
//		
//	}
//	
//	public static void sortAlphabet() {
//		ViewGames.l6.setText("Counter-Strike Global Offensive");
//		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
//		ViewGames.l8.setText("0");
//		ViewGames.l9.setText("Valve");
//		ViewGames.l10.setText("First-person shooter video game.");
//		ViewGames.l11.setText("Hunt:Showdown");
//		ViewGames.l12.setText("Windows/PS4/XboxOne");
//		ViewGames.l13.setText("40");
//		ViewGames.l14.setText("Crytek");
//		ViewGames.l15.setText("First-person shooter video game.");
//		ViewGames.l16.setText("League of Legends");
//		ViewGames.l17.setText("Windows/Mac");
//		ViewGames.l18.setText("0");
//		ViewGames.l19.setText("RiotGames Website");
//		ViewGames.l20.setText("Multiplayer online battle arena video game.");
//		ViewGames.l21.setText("Minecraft");
//		ViewGames.l22.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
//		ViewGames.l23.setText("30");
//		ViewGames.l24.setText("Mojang");
//		ViewGames.l25.setText("Sandbox video game.");
//		ViewGames.l26.setText("Valorant");
//		ViewGames.l27.setText("Windows");
//		ViewGames.l28.setText("0");
//		ViewGames.l29.setText("RiotGames Website");
//		ViewGames.l30.setText("Tactical Shooting game involving two teams with 5 players in each team.");
//	}
//}
