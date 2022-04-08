import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SearchButton {
	
	public static void createSearchButton(JFrame jf, JPanel panel) {
		JTextField searchBar = new JTextField(50);
		panel.add(searchBar);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton searchButton = new JButton("Search");
		searchButton.setSize(20,20);
		panel.add(searchButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a  = searchBar.getText();
				if(a.toLowerCase().equalsIgnoreCase("valorant")) {
					JFrame frame = new JFrame("Search Result");
					frame.setSize(400, 450);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					JPanel panel1 = new JPanel();
					panel1.setLayout(null);
					frame.getContentPane().add(panel1);
					frame.setVisible(false);
					JLabel l1 = new JLabel("Name");
			        l1.setBounds(20,10,70,25);
			        panel1.add(l1);
			        JLabel l2 = new JLabel("Platform");
			        l2.setBounds(20, 80, 70, 25);
			        panel1.add(l2);
			        JLabel l3 = new JLabel("Price: $");
			        l3.setBounds(20, 150, 70, 25);
			        panel1.add(l3);
			        JLabel l4 = new JLabel("Developer");
			        l4.setBounds(20, 220, 70, 25);
			        panel1.add(l4);
			        JLabel l5 = new JLabel("Description");
			        l5.setBounds(20, 290, 70, 25);
			        panel1.add(l5);
					JLabel l6 = new JLabel("Valorant");
			        l6.setBounds(110,10,250,25);
			        panel1.add(l6);
			        JLabel l7= new JLabel("Windows");
			        l7.setBounds(110, 80, 250, 25);
			        panel1.add(l7);
			        JLabel l8 = new JLabel("0");
			        l8.setBounds(110, 150, 250, 25);
			        panel1.add(l8);
			        JLabel l9 = new JLabel("RiotGames Website");
			        l9.setBounds(110, 220, 250, 25);
			        panel1.add(l9);
			        JLabel l10 = new JLabel("actical Shooting game involving two teams with 5 players in each team.");
			        l10.setBounds(110, 290,250, 25);
			        panel1.add(l10);
			        frame.setVisible(true);
				}
				else if(a.toLowerCase().equalsIgnoreCase("league of legend")||a.toLowerCase().equalsIgnoreCase("lol")) {
					JFrame frame = new JFrame("Search Result");
					frame.setSize(400, 450);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					JPanel panel1 = new JPanel();
					panel1.setLayout(null);
					frame.getContentPane().add(panel1);
					JLabel l1 = new JLabel("Name");
			        l1.setBounds(20,10,70,25);
			        panel1.add(l1);
			        JLabel l2 = new JLabel("Platform");
			        l2.setBounds(20, 80, 70, 25);
			        panel1.add(l2);
			        JLabel l3 = new JLabel("Price: $");
			        l3.setBounds(20, 150, 70, 25);
			        panel1.add(l3);
			        JLabel l4 = new JLabel("Developer");
			        l4.setBounds(20, 220, 70, 25);
			        panel1.add(l4);
			        JLabel l5 = new JLabel("Description");
			        l5.setBounds(20, 290, 70, 25);
			        panel1.add(l5);
					JLabel l6 = new JLabel("League of Legends");
			        l6.setBounds(110,10,250,25);
			        panel1.add(l6);
			        JLabel l7= new JLabel("Windows/Mac");
			        l7.setBounds(110, 80, 250, 25);
			        panel1.add(l7);
			        JLabel l8 = new JLabel("0");
			        l8.setBounds(110, 150, 250, 25);
			        panel1.add(l8);
			        JLabel l9 = new JLabel("RiotGames Website");
			        l9.setBounds(110, 220, 250, 25);
			        panel1.add(l9);
			        JLabel l10 = new JLabel("Multiplayer online battle arena video game.");
			        l10.setBounds(110, 290,250, 25);
			        panel1.add(l10);
			        frame.setVisible(true);
				}
				else if(a.toLowerCase().equalsIgnoreCase("hunt:showdown")||a.toLowerCase().equalsIgnoreCase("hunt")) {
					JFrame frame = new JFrame("Search Result");
					frame.setSize(400, 450);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					JPanel panel1 = new JPanel();
					panel1.setLayout(null);
					frame.getContentPane().add(panel1);
					frame.setVisible(false);
					JLabel l1 = new JLabel("Name");
			        l1.setBounds(20,10,70,25);
			        panel1.add(l1);
			        JLabel l2 = new JLabel("Platform");
			        l2.setBounds(20, 80, 70, 25);
			        panel1.add(l2);
			        JLabel l3 = new JLabel("Price: $");
			        l3.setBounds(20, 150, 70, 25);
			        panel1.add(l3);
			        JLabel l4 = new JLabel("Developer");
			        l4.setBounds(20, 220, 70, 25);
			        panel1.add(l4);
			        JLabel l5 = new JLabel("Description");
			        l5.setBounds(20, 290, 70, 25);
			        panel1.add(l5);
					JLabel l6 = new JLabel("Hunt:Showdown");
			        l6.setBounds(110,10,250,25);
			        panel1.add(l6);
			        JLabel l7= new JLabel("Windows/PS4/XboxOne");
			        l7.setBounds(110, 80, 250, 25);
			        panel1.add(l7);
			        JLabel l8 = new JLabel("40");
			        l8.setBounds(110, 150, 250, 25);
			        panel1.add(l8);
			        JLabel l9 = new JLabel("Crytek");
			        l9.setBounds(110, 220, 250, 25);
			        panel1.add(l9);
			        JLabel l10 = new JLabel("First-person shooter video game.");
			        l10.setBounds(110, 290,250, 25);
			        panel1.add(l10);
			        frame.setVisible(true);
				}
				else if(a.toLowerCase().equalsIgnoreCase("csgo")||a.toLowerCase().equalsIgnoreCase("Counter-Strike: Global Offensive")) {
					JFrame frame = new JFrame("Search Result");
					frame.setSize(400, 450);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					JPanel panel1 = new JPanel();
					panel1.setLayout(null);
					frame.getContentPane().add(panel1);
					frame.setVisible(false);
					JLabel l1 = new JLabel("Name");
			        l1.setBounds(20,10,70,25);
			        panel1.add(l1);
			        JLabel l2 = new JLabel("Platform");
			        l2.setBounds(20, 80, 70, 25);
			        panel1.add(l2);
			        JLabel l3 = new JLabel("Price: $");
			        l3.setBounds(20, 150, 70, 25);
			        panel1.add(l3);
			        JLabel l4 = new JLabel("Developer");
			        l4.setBounds(20, 220, 70, 25);
			        panel1.add(l4);
			        JLabel l5 = new JLabel("Description");
			        l5.setBounds(20, 290, 70, 25);
			        panel1.add(l5);
					JLabel l6 = new JLabel("Valorant");
			        l6.setBounds(110,10,250,25);
			        panel1.add(l6);
			        JLabel l7= new JLabel("Windows");
			        l7.setBounds(110, 80, 250, 25);
			        panel1.add(l7);
			        JLabel l8 = new JLabel("0");
			        l8.setBounds(110, 150, 250, 25);
			        panel1.add(l8);
			        JLabel l9 = new JLabel("RiotGames Website");
			        l9.setBounds(110, 220, 250, 25);
			        panel1.add(l9);
			        JLabel l10 = new JLabel("actical Shooting game involving two teams with 5 players in each team.");
			        l10.setBounds(110, 290,250, 25);
			        panel1.add(l10);
			        frame.setVisible(true);
				}
				else if(a.toLowerCase().equalsIgnoreCase("minecraft")||a.toLowerCase().equalsIgnoreCase("mc")) {
					JFrame frame = new JFrame("Search Result");
					frame.setSize(400, 450);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setLocationRelativeTo(null);
					JPanel panel1 = new JPanel();
					panel1.setLayout(null);
					frame.getContentPane().add(panel1);
					JLabel l1 = new JLabel("Name");
			        l1.setBounds(20,10,70,25);
			        panel1.add(l1);
			        JLabel l2 = new JLabel("Platform");
			        l2.setBounds(20, 80, 70, 25);
			        panel1.add(l2);
			        JLabel l3 = new JLabel("Price: $");
			        l3.setBounds(20, 150, 70, 25);
			        panel1.add(l3);
			        JLabel l4 = new JLabel("Developer");
			        l4.setBounds(20, 220, 70, 25);
			        panel1.add(l4);
			        JLabel l5 = new JLabel("Description");
			        l5.setBounds(20, 290, 70, 25);
			        panel1.add(l5);
					JLabel l6 = new JLabel("Minecraft");
	 		        l6.setBounds(110,10,250,25);
			        panel1.add(l6);
			        JLabel l7= new JLabel("Java/Windows/PS4/Android/Switch/Mac/WiiU,AppleTV,iOS");
			        l7.setBounds(110, 80, 250, 25);
			        panel1.add(l7);
			        JLabel l8 = new JLabel("30");
			        l8.setBounds(110, 150, 250, 25);
			        panel1.add(l8);
			        JLabel l9 = new JLabel("Mojang");
			        l9.setBounds(110, 220, 250, 25);
			        panel1.add(l9);
			        JLabel l10 = new JLabel("Sandbox video game.");
			        l10.setBounds(110, 290,250, 25);
			        panel1.add(l10);
			        frame.setVisible(true);
				}
				
			}
		});
		
	}
}
