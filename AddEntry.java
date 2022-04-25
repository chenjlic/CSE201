import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



public class AddEntry {
	public static void createButton(JFrame jf, JPanel panel) {
		
		JButton button = new JButton("Add an entry");
		button.setSize(30, 100);
		button.addActionListener(new ActionListener() {

		
			public void actionPerformed(ActionEvent e) {
				 
				    	JFrame userInput = new JFrame("Enter details");
				    	userInput.setSize(500, 300);
						userInput.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				        userInput.setLocationRelativeTo(null);
				        userInput.setResizable(false);
				    	JPanel panel = new JPanel();
						panel.setLayout(null);

				    	userInput.add(panel);
				    	
				        JLabel nameLabel = new JLabel("Name:");
				        nameLabel.setBounds(10,20,80,25);
				        panel.add(nameLabel);
				        JTextField nameText = new JTextField(20);
				        nameText.setBounds(100,20,389,25);
				        panel.add(nameText);
				        
				        JLabel descLabel = new JLabel("Description:");
				        descLabel.setBounds(10,50,80,25);
				        panel.add(descLabel);
				        JTextField descText = new JTextField(20);
				        descText.setBounds(100,50,389,25);
				        panel.add(descText);
				        
				        JLabel platsLabel = new JLabel("Platforms:");
				        platsLabel.setBounds(10,80,80,25);
				        panel.add(platsLabel);
				        JTextField platsText = new JTextField(20);
				        platsText.setBounds(100,80,389,25);
				        panel.add(platsText);
				        
				        JLabel devLabel = new JLabel("Developer:");
				        devLabel.setBounds(10,110,80,25);
				        panel.add(devLabel);
				        JTextField devText = new JTextField(20);
				        devText.setBounds(100,110,389,25);
				        panel.add(devText);
				        
				        JLabel priceLabel = new JLabel("Price:");
				        priceLabel.setBounds(10,140,80,25);
				        panel.add(priceLabel);
				        JTextField priceText = new JTextField(20);
				        priceText.setBounds(100,140,389,25);
				        panel.add(priceText);
				        
				        JButton enterButton = new JButton("Enter");
				        enterButton.setBounds(10,170,80,25);
				        panel.add(enterButton);
				        userInput.setVisible(true);
				        
				        class jbuttonclicked implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent e) {
								//if enter clicked
								if (e.getSource().equals(enterButton)) {
									try {
										addToTextFile(nameText.getText(), descText.getText(), platsText.getText(), devText.getText(), priceText.getText());
										refresh(jf);
										userInput.dispose();
									} catch (IOException e1) {
										e1.printStackTrace();
									}
								}
							}
							}
				        enterButton.addActionListener(new jbuttonclicked());
				        

				  }
				    	
				    
			

		});
		
		panel.add(button);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
	}
		
		
		public static void addToTextFile(String name, String description, String platforms, String developer, String price) throws IOException {
			FileWriter fw = null; 
			BufferedWriter bw = null; 
			PrintWriter pw = null; 
			try { 
				fw = new FileWriter("VideoGameList.txt", true);
				bw = new BufferedWriter(fw); 
				pw = new PrintWriter(bw); 
				pw.println(name + "\t" + description + "\t" + platforms + "\t" + developer + "\t" + price + "\t");
				pw.flush();
				} 
			finally { 
				try { 
					pw.close();
					bw.close();
					fw.close(); 
					} catch (IOException io) {
						
					}
			}

				
			
		}
		
		public static void refresh(JFrame jf) {
			FilterDropDown.unfilter(jf);
			
		}
			
		}

