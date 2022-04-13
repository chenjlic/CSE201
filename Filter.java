import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Filter {
public static void byDevPlat(String filterOptionChosen) {
	
		

		JFrame questionBox = new JFrame("Enter " + filterOptionChosen + " name to filter by:");
		
    	questionBox.setSize(500, 100);
		questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questionBox.setLocationRelativeTo(null);
        questionBox.setResizable(false);
		 JPanel panel = new JPanel(); 
		 questionBox.add(panel);  
		 JLabel include = new JLabel(filterOptionChosen + " to Include:"); 
		 include.setBounds(10,20,80,25);
		 panel.add(include); 
		 JTextField includeText = new JTextField(20);
		 includeText.setBounds(100,20,165,25); 
		 panel.add(includeText); 
		 JButton enterButton = new JButton("Enter"); enterButton.setBounds(10, 80, 80, 25);
		 panel.add(enterButton);
		 questionBox.setVisible(true);
		 
		 enterButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	              String entry = includeText.getText();
	              switch(entry) {
	              
	              case "Windows" :
	          		ViewGames.l6.setText("Counter-Strike Global Offensive");
	        		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
	        		ViewGames.l8.setText("0");
	        		ViewGames.l9.setText("Valve");
	        		ViewGames.l10.setText("First-person shooter video game.");
	        		ViewGames.l11.setText("League of Legends");
	        		ViewGames.l12.setText("Windows/Mac");
	        		ViewGames.l13.setText("0");
	        		ViewGames.l14.setText("RiotGames Website");
	        		ViewGames.l15.setText("Multiplayer online battle arena video game.");
	        		ViewGames.l16.setText("Valorant");
	        		ViewGames.l17.setText("Windows");
	        		ViewGames.l18.setText("0");
	        		ViewGames.l19.setText("RiotGames Website");
	        		ViewGames.l20.setText("Tactical Shooting game involving two teams with 5 players in each team.");
	        		ViewGames.l21.setText("Minecraft");
	        		ViewGames.l22.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
	        		ViewGames.l23.setText("30");
	        		ViewGames.l24.setText("Mojang");
	        		ViewGames.l25.setText("Sandbox video game.");
	        		ViewGames.l26.setText("Hunt:Showdown");
	        		ViewGames.l27.setText("Windows/PS4/XboxOne");
	        		ViewGames.l28.setText("40");
	        		ViewGames.l29.setText("Crytek");
	        		ViewGames.l30.setText("First-person shooter video game.");
	            	  break;
	              case "Mac" :
	            	  
	            	ViewGames.l6.setText("League of Legends");
	          		ViewGames.l7.setText("Windows/Mac");
	          		ViewGames.l8.setText("0");
	          		ViewGames.l9.setText("RiotGames Website");
	          		ViewGames.l10.setText("Multiplayer online battle arena video game.");
	          		
	          		ViewGames.l11.setText("Counter-Strike Global Offensive");
	        		ViewGames.l12.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
	        		ViewGames.l13.setText("0");
	        		ViewGames.l14.setText("Valve");
	        		ViewGames.l15.setText("First-person shooter video game.");
	        		
	        		ViewGames.l16.setText("Minecraft");
	        		ViewGames.l17.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
	        		ViewGames.l18.setText("30");
	        		ViewGames.l19.setText("Mojang");
	        		ViewGames.l20.setText("Sandbox video game.");
	        		
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		break;
	              case "PS4":
	            	  ViewGames.l6.setText("Hunt:Showdown");
	          		ViewGames.l7.setText("Windows/PS4/XboxOne");
	          		ViewGames.l8.setText("40");
	          		ViewGames.l9.setText("Crytek");
	          		ViewGames.l10.setText("First-person shooter video game.");
	          		ViewGames.l11.setText("Minecraft");
	          		ViewGames.l12.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
	          		ViewGames.l13.setText("30");
	          		ViewGames.l14.setText("Mojang");
	          		ViewGames.l15.setText("Sandbox video game.");
	          		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	          		break;
	              case "XboxOne":
	            	  ViewGames.l6.setText("Hunt:Showdown");
	          		ViewGames.l7.setText("Windows/PS4/XboxOne");
	          		ViewGames.l8.setText("40");
	          		ViewGames.l9.setText("Crytek");
	          		ViewGames.l10.setText("First-person shooter video game.");
	          		
	          		ViewGames.l11.setText("Counter-Strike Global Offensive");
	        		ViewGames.l12.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
	        		ViewGames.l13.setText("0");
	        		ViewGames.l14.setText("Valve");
	        		ViewGames.l15.setText("First-person shooter video game.");
	            	  
	        		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		break;
	              case "Xbox360":
	            	  ViewGames.l6.setText("Counter-Strike Global Offensive");
		        		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
		        		ViewGames.l8.setText("0");
		        		ViewGames.l9.setText("Valve");
		        		ViewGames.l10.setText("First-person shooter video game.");
		        		
		        		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              case  "PS3":
	            	  ViewGames.l6.setText("Counter-Strike Global Offensive");
		        		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
		        		ViewGames.l8.setText("0");
		        		ViewGames.l9.setText("Valve");
		        		ViewGames.l10.setText("First-person shooter video game.");
		        		
		        		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
		        		
	              case "Java" :
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              case  "Android" :
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              case "Switch" :
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              case "WiiU":
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              
	            case  "AppleTV"  :
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	            case "iOS" :
	            	  ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	            case "RiotGames" :
	            	ViewGames.l6.setText("League of Legends");
	          		ViewGames.l7.setText("Windows/Mac");
	          		ViewGames.l8.setText("0");
	          		ViewGames.l9.setText("RiotGames Website");
	          		ViewGames.l10.setText("Multiplayer online battle arena video game.");
	          		ViewGames.l11.setText("Valorant");
	        		ViewGames.l12.setText("Windows");
	        		ViewGames.l13.setText("0");
	        		ViewGames.l14.setText("RiotGames Website");
	        		ViewGames.l15.setText("Tactical Shooting game involving two teams with 5 players in each team.");
	        		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		break;
	        		
	            case "Crytek": 
	            	ViewGames.l6.setText("Hunt:Showdown");
	          		ViewGames.l7.setText("Windows/PS4/XboxOne");
	          		ViewGames.l8.setText("40");
	          		ViewGames.l9.setText("Crytek");
	          		ViewGames.l10.setText("First-person shooter video game.");
	          		ViewGames.l11.setText("");
	        		ViewGames.l12.setText("");
	        		ViewGames.l13.setText("");
	        		ViewGames.l14.setText("");
	        		ViewGames.l15.setText("");
	        		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		break;
	            case "Valve":
	            	ViewGames.l6.setText("Counter-Strike Global Offensive");
	        		ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
	        		ViewGames.l8.setText("0");
	        		ViewGames.l9.setText("Valve");
	        		ViewGames.l10.setText("First-person shooter video game.");
	        		
	        		ViewGames.l11.setText("");
	        		ViewGames.l12.setText("");
	        		ViewGames.l13.setText("");
	        		ViewGames.l14.setText("");
	        		ViewGames.l15.setText("");
	        		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		break;
	            case "Mojang" :
	            	 ViewGames.l6.setText("Minecraft");
		          		ViewGames.l7.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
		          		ViewGames.l8.setText("30");
		          		ViewGames.l9.setText("Mojang");
		          		ViewGames.l10.setText("Sandbox video game.");
		            	  
		          		ViewGames.l11.setText("");
		        		ViewGames.l12.setText("");
		        		ViewGames.l13.setText("");
		        		ViewGames.l14.setText("");
		        		ViewGames.l15.setText("");
		        		ViewGames.l16.setText("");
		        		ViewGames.l17.setText("");
		        		ViewGames.l18.setText("");
		        		ViewGames.l19.setText("");
		        		ViewGames.l20.setText("");
		        		ViewGames.l21.setText("");
		        		ViewGames.l22.setText("");
		        		ViewGames.l23.setText("");
		        		ViewGames.l24.setText("");
		        		ViewGames.l25.setText("");
		        		ViewGames.l26.setText("");
		        		ViewGames.l27.setText("");
		        		ViewGames.l28.setText("");
		        		ViewGames.l29.setText("");
		        		ViewGames.l30.setText("");
		        		break;
	              }
	            	
	            }});
		
		
	
	}
public static void byPriceRange() {
	JFrame questionBox = new JFrame("Enter price range:");
	
	questionBox.setSize(500, 150);
	questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    questionBox.setLocationRelativeTo(null);
    questionBox.setResizable(false);
	 JPanel panel = new JPanel(); 
	 questionBox.getContentPane().add(panel, BorderLayout.NORTH);  
		/*
		 * JLabel lowLabel = new JLabel("Price Low:"); lowLabel.setBounds(10,20,80,25);
		 */
	 JPanel panel2 = new JPanel();
	 questionBox.getContentPane().add(panel2, BorderLayout.CENTER);
	 JLabel highLabel = new JLabel("Price High:");
	 highLabel.setBounds(10, 20, 80, 25);
		/*
		 * panel.add(lowLabel);
		 */	 panel2.add(highLabel);
	 
		/*
		 * JTextField lowText = new JTextField(20); lowText.setBounds(100,20,165,25);
		 * panel.add(lowText);
		 */ 
	 JTextField highText = new JTextField(20);
		/* lowText.setBounds(100,20,165,25); */
	 panel2.add(highText);
	 JPanel panel3 = new JPanel();
	 
	 JButton enterButton = new JButton("Enter"); enterButton.setBounds(10, 80, 80, 25);
	 panel3.add(enterButton);
	 questionBox.getContentPane().add(panel3, BorderLayout.SOUTH);
	 questionBox.setVisible(true);
	 
	 enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
				/* int priceRangeLow = Integer.parseInt(lowText.getText()); */
            	int priceRangeHigh = Integer.parseInt(highText.getText());
            	if (priceRangeHigh < 30) {
            		ViewGames.l6.setText("League of Legends");
	          		ViewGames.l7.setText("Windows/Mac");
	          		ViewGames.l8.setText("0");
	          		ViewGames.l9.setText("RiotGames Website");
	          		ViewGames.l10.setText("Multiplayer online battle arena video game.");
	          		ViewGames.l11.setText("Valorant");
	        		ViewGames.l12.setText("Windows");
	        		ViewGames.l13.setText("0");
	        		ViewGames.l14.setText("RiotGames Website");
	        		ViewGames.l15.setText("Tactical Shooting game involving two teams with 5 players in each team.");
	        		ViewGames.l16.setText("");
	        		ViewGames.l17.setText("");
	        		ViewGames.l18.setText("");
	        		ViewGames.l19.setText("");
	        		ViewGames.l20.setText("");
	        		ViewGames.l21.setText("");
	        		ViewGames.l22.setText("");
	        		ViewGames.l23.setText("");
	        		ViewGames.l24.setText("");
	        		ViewGames.l25.setText("");
	        		ViewGames.l26.setText("");
	        		ViewGames.l27.setText("");
	        		ViewGames.l28.setText("");
	        		ViewGames.l29.setText("");
	        		ViewGames.l30.setText("");
	        		
            	} else if (priceRangeHigh < 40 ) {
            		
	            		ViewGames.l6.setText("League of Legends");
		          		ViewGames.l7.setText("Windows/Mac");
		          		ViewGames.l8.setText("0");
		          		ViewGames.l9.setText("RiotGames Website");
		          		ViewGames.l10.setText("Multiplayer online battle arena video game.");
		          		ViewGames.l11.setText("Valorant");
		        		ViewGames.l12.setText("Windows");
		        		ViewGames.l13.setText("0");
		        		ViewGames.l14.setText("RiotGames Website");
		        		ViewGames.l15.setText("Tactical Shooting game involving two teams with 5 players in each team.");
		        		
		        		ViewGames.l16.setText("Minecraft");
				        ViewGames.l17.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
				        ViewGames.l18.setText("30");
				        ViewGames.l19.setText("Mojang");
				        ViewGames.l20.setText("Sandbox video game.");
			        	ViewGames.l21.setText("");
			        	ViewGames.l22.setText("");
			       		ViewGames.l23.setText("");
			       		ViewGames.l24.setText("");
			       		ViewGames.l25.setText("");
			       		ViewGames.l26.setText("");
			       		ViewGames.l27.setText("");
			       		ViewGames.l28.setText("");
			       		ViewGames.l29.setText("");
			       		ViewGames.l30.setText("");
			  
	        		} else if (priceRangeHigh >= 40) {
	        			ViewGames.l6.setText("Counter-Strike Global Offensive");
	        			ViewGames.l7.setText("Windows/Mac/XboxOne/Linux/Xbox360/PS3");
	        			ViewGames.l8.setText("0");
	        			ViewGames.l9.setText("Valve");
	        			ViewGames.l10.setText("First-person shooter video game.");
	        			ViewGames.l11.setText("League of Legends");
	        			ViewGames.l12.setText("Windows/Mac");
	        			ViewGames.l13.setText("0");
	        			ViewGames.l14.setText("RiotGames Website");
	        			ViewGames.l15.setText("Multiplayer online battle arena video game.");
	        			ViewGames.l16.setText("Valorant");
	        			ViewGames.l17.setText("Windows");
	        			ViewGames.l18.setText("0");
	        			ViewGames.l19.setText("RiotGames Website");
	        			ViewGames.l20.setText("Tactical Shooting game involving two teams with 5 players in each team.");
	        			ViewGames.l21.setText("Minecraft");
	        			ViewGames.l22.setText("Java/Windows/PS4/Android/Switch/Mac/WiiU/AppleTV/iOS");
	        			ViewGames.l23.setText("30");
	        			ViewGames.l24.setText("Mojang");
	        			ViewGames.l25.setText("Sandbox video game.");
	        			ViewGames.l26.setText("Hunt:Showdown");
	        			ViewGames.l27.setText("Windows/PS4/XboxOne");
	        			ViewGames.l28.setText("40");
	        			ViewGames.l29.setText("Crytek");
	        			ViewGames.l30.setText("First-person shooter video game.");
	        		}
		        		
            	
            }});
}

/*
 * public static void titleDescIncludes(String titleOrDesc) {
 * 
 * 
 * }
 */


	}

