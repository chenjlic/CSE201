import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FilterDropDown {
	public static ArrayList<VideoGame>filteredGames;
	
	public static void createFilterButton(JFrame jf, JPanel panel) {
	JButton filterButton = new JButton("Filter");
	filterButton.setSize(20,20);
	panel.add(filterButton);
	jf.getContentPane().add(panel, BorderLayout.NORTH);
	filterButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			filterMenu(jf);
			
		//	ViewGames.viewGames(jf);
		}
		});
}

public static void filterMenu(JFrame jf) {
	String[] options = {"Developer", "Platform", "Price Range", "Unfilter"};
	  JFrame jFrame = new JFrame("Filter by:");

        JComboBox<String> jComboBox = new JComboBox<>(options);
        jComboBox.setBounds(80, 50, 140, 20);

        JButton jButton = new JButton("Done");
        jButton.setBounds(100, 100, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(90, 100, 400, 100);

        jFrame.add(jButton);
        jFrame.add(jComboBox);
        jFrame.add(jLabel);
        
        jFrame.setLayout(null);
        jFrame.setSize(350, 250);
        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                String filterOptionChosen = jComboBox.getItemAt(jComboBox.getSelectedIndex());
             
                switch(filterOptionChosen) {
                case "Developer" : byDeveloper(jf);
                	break;
                	
                case "Platform" : byPlatform(jf);
                	break;
                
                case "Price Range" : byPriceRange(jf);
                	break;
                	
                case "Unfilter" : unfilter(jf);
                }
                
            }
        });
	}

public static JFrame filteredFrame() {
	 JFrame filteredJf = new JFrame();
	filteredJf.setLayout(new BorderLayout());
	filteredJf.setSize(1400,600);
	filteredJf.setResizable(false);
	filteredJf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel northPanel = new JPanel();
	Log_In.CreateLogInButton(filteredJf, northPanel);
	SearchBar bar = new SearchBar(northPanel);
	SearchButton.createSearchButton(filteredJf, northPanel);
	CreateAccount.createAccountButton(filteredJf, northPanel);
	FilterDropDown.createFilterButton(filteredJf, northPanel);
	Sort.createSortMenu(filteredJf,northPanel);
	filteredJf.setVisible(true);
	return filteredJf;
	
}

public static void byDeveloper(JFrame jf) {
	JFrame questionBox = new JFrame("Enter developer name to filter by:");
	
	questionBox.setSize(500, 100);
	questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    questionBox.setLocationRelativeTo(null);
    questionBox.setResizable(false);
	 JPanel panel = new JPanel(); 
	 questionBox.add(panel);  
	 JLabel include = new JLabel("Developer to Include:"); 
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
            	ArrayList<VideoGame> games = new ArrayList<>();
				
				  Main.parseVideoGames(games);
				  filteredGames = Filter.filterByDev(includeText.getText(), games);
				
				  JFrame newFrame = filteredFrame();
				  ViewGames.viewGames(newFrame, filteredGames);
				 jf.dispose();
				 Filter.filtered = true;
}
	 });
}
public static void byPlatform(JFrame jf) {
	JFrame questionBox = new JFrame("Enter platform name to filter by:");
	
	questionBox.setSize(500, 100);
	questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    questionBox.setLocationRelativeTo(null);
    questionBox.setResizable(false);
	 JPanel panel = new JPanel(); 
	 questionBox.add(panel);  
	 JLabel include = new JLabel("Platform to Include:"); 
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
            	ArrayList<VideoGame> games = new ArrayList<>();
				
				  Main.parseVideoGames(games);
				  filteredGames = Filter.filterByPlatform(includeText.getText(), games);
				
				  JFrame newFrame = filteredFrame();
				  ViewGames.viewGames(newFrame, filteredGames);
				 jf.dispose();
				 Filter.filtered = true;
}
	 });
}

	public static void byPriceRange(JFrame jf) {
	JFrame questionBox = new JFrame("Enter price range:");
		
		questionBox.setSize(500, 150);
		questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    questionBox.setLocationRelativeTo(null);
	    questionBox.setResizable(false);
		 JPanel panel = new JPanel(); 
		 questionBox.getContentPane().add(panel, BorderLayout.NORTH);  
			
			 JLabel lowLabel = new JLabel("Price Low:"); lowLabel.setBounds(10,20,80,25);
			 
		 JPanel panel2 = new JPanel();
		 questionBox.getContentPane().add(panel2, BorderLayout.CENTER);
		 JLabel highLabel = new JLabel("Price High:");
		 highLabel.setBounds(10, 20, 80, 25);
			
			 panel.add(lowLabel);
			 panel2.add(highLabel);
		 
			
			 JTextField lowText = new JTextField(20); lowText.setBounds(100,20,165,25);
			 panel.add(lowText);
			
		 JTextField highText = new JTextField(20);
			lowText.setBounds(100,20,165,25);
		 panel2.add(highText);
		 JPanel panel3 = new JPanel();
		 
		 JButton enterButton = new JButton("Enter"); enterButton.setBounds(10, 80, 80, 25);
		 panel3.add(enterButton);
		 questionBox.getContentPane().add(panel3, BorderLayout.SOUTH);
		 questionBox.setVisible(true);
		 
		 enterButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
					
					  ArrayList<VideoGame> games = new ArrayList<>();
					
					  Main.parseVideoGames(games);
					  filteredGames = Filter.filterByPrice(Integer.parseInt(lowText.getText()),
					  Integer.parseInt(highText.getText()), games); 
					
					  JFrame newFrame = filteredFrame();
					  ViewGames.viewGames(newFrame, filteredGames);
					 jf.dispose();
					 Filter.filtered = true;
	            	
}
});
	}
	public static void unfilter(JFrame jf) {
		ArrayList<VideoGame> games = new ArrayList<>();
		Main.parseVideoGames(games);
		JFrame newFrame = filteredFrame();
		ViewGames.viewGames(newFrame, games);
		
		jf.dispose();
		Filter.filtered = false;
	}
}



