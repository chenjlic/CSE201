import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccount {

	public static void createAccountButton(JFrame jf) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton button = new JButton("Create Account");
		button.setSize(30,100);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createAccountUI(jf);
			}
			
		});
		jf.add(panel, BorderLayout.NORTH);
		panel.add(button,BorderLayout.LINE_END);
	}
	public static void createAccountUI(JFrame jf) {
		 JFrame frame = new JFrame("Create Account");
	        frame.setSize(400, 200);
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        JPanel panel = new JPanel();    
	        frame.add(panel);
	        frame.setVisible(true);
	        panel.setLayout(null);
	        JLabel AccountLabel = new JLabel("Account:");
	        AccountLabel.setBounds(10,20,80,25);
	        panel.add(AccountLabel);
	        JTextField AccountText = new JTextField(20);
	        AccountText.setBounds(100,20,165,25);
	        panel.add(AccountText);
	        JLabel passwordLabel = new JLabel("Password:");
	        passwordLabel.setBounds(10,50,80,25);
	        panel.add(passwordLabel);
	        JPasswordField passwordText = new JPasswordField(20);
	        passwordText.setBounds(100,50,165,25);
	        panel.add(passwordText);
	        JButton loginButton = new JButton("Login");
	        loginButton.setBounds(10, 80, 80, 25);
	        panel.add(loginButton);
	}
}
