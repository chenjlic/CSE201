import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class AddToFavorite {
	public static void FavoriteButton(JFrame jf, JPanel panel) {
		
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		JButton fv = new JButton("Add to favorite");
		fv.setSize(60,20);
		panel.add(fv);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		fv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
