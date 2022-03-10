import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ViewGames {
	
	public static void viewGames(JFrame jf, ArrayList<VideoGame> games) {
		
		jf.setLocationRelativeTo(null);
        JPanel panel = new JPanel();  
        panel.setLayout(null);
        JLabel l1 = new JLabel("Name");
        l1.setBounds(20,10,70,25);
        panel.add(l1);
        JLabel l2 = new JLabel("Platform");
        l2.setBounds(20, 80, 70, 25);
        panel.add(l2);
        JLabel l3 = new JLabel("Price: $");
        l3.setBounds(20, 150, 70, 25);
        panel.add(l3);
        JLabel l4 = new JLabel("Developer");
        l4.setBounds(20, 220, 70, 25);
        panel.add(l4);
        JLabel l5 = new JLabel("Description");
        l5.setBounds(20, 290, 70, 25);
        panel.add(l5);
        JLabel l6 = new JLabel(games.get(0).getName());
        l6.setBounds(110, 10, 200, 25);
        panel.add(l6);
        JLabel l7 = new JLabel("Windows");
        l7.setBounds(110, 80, 200, 25);
        panel.add(l7);
        JLabel l8 = new JLabel("0");
        l8.setBounds(110, 150, 200, 25);
        panel.add(l8);
        JLabel l9 = new JLabel("RiotGames Website");
        l9.setBounds(110, 220, 200, 25);
        panel.add(l9);
        JLabel l10 = new JLabel("Tactical Shooting game involving two teams with 5 players in each team.");
        l10.setBounds(110, 290, 200, 25);
        panel.add(l10);
        JLabel l11 = new JLabel("League of Legends");
        l11.setBounds(330,10,200,25);
        panel.add(l11);
        JLabel l12 = new JLabel("Windows/Mac");
        l12.setBounds(330, 80, 200, 25);
        panel.add(l12);
        JLabel l13 = new JLabel("0");
        l13.setBounds(330, 150, 200, 25);
        panel.add(l13);
        JLabel l14 = new JLabel("RiotGames Website");
        l14.setBounds(330, 220, 200, 25);
        panel.add(l14);
        JLabel l15 = new JLabel("Multiplayer online battle arena video game.");
        l15.setBounds(330, 290,200, 25);
        panel.add(l15);
        JLabel l16 = new JLabel("Hunt:Showdown");
        l16.setBounds(550,10,200,25);
        panel.add(l16);
        JLabel l17 = new JLabel("Windows/PS4/XboxOne");
        l17.setBounds(550, 80, 200, 25);
        panel.add(l17);
        JLabel l18 = new JLabel("40");
        l18.setBounds(550, 150, 200, 25);
        panel.add(l18);
        JLabel l19 = new JLabel("Crytek");
        l19.setBounds(550, 220, 200, 25);
        panel.add(l19);
        JLabel l20 = new JLabel("First-person shooter video game.");
        l20.setBounds(550, 290,200, 25);
        panel.add(l20);
        JLabel l21 = new JLabel("Counter-Strike: Global Offensive");
        l21.setBounds(770,10,250,25);
        panel.add(l21);
        JLabel l22 = new JLabel("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
        l22.setBounds(770, 80, 250, 25);
        panel.add(l22);
        JLabel l23 = new JLabel("0");
        l23.setBounds(770, 150, 250, 25);
        panel.add(l23);
        JLabel l24 = new JLabel("Valve");
        l24.setBounds(770, 220, 250, 25);
        panel.add(l24);
        JLabel l25 = new JLabel("First-person shooter video game.");
        l25.setBounds(770, 290,250, 25);
        panel.add(l25);
        JLabel l26 = new JLabel("Minecraft");
        l26.setBounds(1050,10,350,25);
        panel.add(l26);
        JLabel l27 = new JLabel("Java/Windows/PS4/Android/Switch/Mac/WiiU,AppleTV,iOS");
        l27.setBounds(1050, 80, 350, 25);
        panel.add(l27);
        JLabel l28 = new JLabel("30");
        l28.setBounds(1050, 150, 350, 25);
        panel.add(l28);
        JLabel l29 = new JLabel("Mojang");
        l29.setBounds(1050, 220, 350, 25);
        panel.add(l29);
        JLabel l30 = new JLabel("Sandbox video game.");
        l30.setBounds(1050, 290,350, 25);
        panel.add(l30);
        jf.add(panel, BorderLayout.CENTER);
	}
	
	

}
