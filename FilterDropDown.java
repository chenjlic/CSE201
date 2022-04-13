
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilterDropDown {
	
	public static void createFilterButton(JFrame jf, JPanel panel) {
		JButton filterButton = new JButton("Filter");
		filterButton.setSize(20,20);
		panel.add(filterButton);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		filterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filterMenu();
			}
			});
	}
	
	public static void filterMenu() {
		String[] options = {"Developer", "Platform", "Price Range"};
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
	                case "Developer" : Filter.byDevPlat(filterOptionChosen);
	                	break;
	                	
	                case "Platform" : Filter.byDevPlat(filterOptionChosen);
	                	break;
	                
	                case "Price Range" : Filter.byPriceRange();
	                	break;
	                	
	             //   case "Title contains": Filter.titleDescIncludes(filterOptionChosen);
	               // break;
	                
	             //   case "Description contains": Filter.titleDescIncludes(filterOptionChosen);
	               // break;
	                }
	                
	            }
	        });
		}
}
	
	

   
    