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

public class CreateAccount {
	private static JTextField recoveryQuestionField;
	private static JTextField recoveryAnswerField;

	
	public static void createAccountButton(JFrame jf, JPanel panel) {
		
		
		JButton button = new JButton("Create Account");
		button.setSize(30, 100);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createAccountUI(jf);
			}

		});
		panel.add(button);
		jf.getContentPane().add(panel, BorderLayout.NORTH);
		
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void createAccountUI(JFrame jf) {
		JFrame frame = new JFrame("Create Account");
		frame.setSize(511, 349);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		JLabel AccountLabel = new JLabel("Account:");
		AccountLabel.setBounds(10, 20, 80, 25);
		panel.add(AccountLabel);
		JTextField AccountText = new JTextField(20);
		AccountText.setBounds(100, 20, 389, 25);
		panel.add(AccountText);
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 389, 25);
		panel.add(passwordText);
		JButton signUpButton = new JButton("Sign Up");
		
		signUpButton.setBounds(10, 197, 80, 25);
		panel.add(signUpButton);
		
		JLabel recoveryQuestion = new JLabel("Enter Recovery Question:");
		recoveryQuestion.setBounds(10, 86, 166, 14);
		panel.add(recoveryQuestion);
		
		recoveryQuestionField = new JTextField();
		recoveryQuestionField.setBounds(10, 111, 479, 20);
		panel.add(recoveryQuestionField);
		recoveryQuestionField.setColumns(10);
		
		JLabel recoveryAnswer = new JLabel("Enter Recovery Question Answer: ");
		recoveryAnswer.setBounds(10, 142, 199, 14);
		panel.add(recoveryAnswer);
		
		recoveryAnswerField = new JTextField();
		recoveryAnswerField.setBounds(10, 167, 475, 20);
		panel.add(recoveryAnswerField);
		recoveryAnswerField.setColumns(10);
		
		JLabel errorMessage = new JLabel("");
		errorMessage.setBounds(10, 233, 475, 25);
		panel.add(errorMessage);
		
		JLabel errorMessage2 = new JLabel("");
		errorMessage2.setBounds(10, 274, 479, 25);
		panel.add(errorMessage2);
		
		
		signUpButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userLogin = AccountText.getText();
				String passLogin = String.valueOf(passwordText.getPassword());
				String recoveryQuestionInput = recoveryQuestionField.getText();
				String recoveryAnswerInput	=  recoveryAnswerField.getText();
				Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
				Matcher match = pattern.matcher(passLogin);
				Pattern pattern2 = Pattern.compile("\\d");
				Matcher match2 = pattern2.matcher(passLogin);
				boolean digit = false;
				boolean specialCharacters = false;
				if (match.find()) {
					specialCharacters = true;
				}
				if (match2.find()) {
					digit = true;
				}

				if ((!userLogin.equals("")) && (passLogin.length() >= 5)  && (specialCharacters)  && (digit) && (!recoveryQuestionInput.equals(""))
						&& (!recoveryAnswerInput.equals(""))){
					
					Main.storeUserInfo(userLogin, passLogin, recoveryQuestionInput, recoveryAnswerInput);
					errorMessage.setText("Successfully signed up!");
					errorMessage2.setText("");
					jf.repaint();
					signUpButton.setEnabled(false);
					
				} else {
					errorMessage.setText(
							"Password must have a number, special character, and have a length greater than 5");
					errorMessage.setForeground(Color.RED);
					errorMessage2.setText("Recovery Question and Recovery Answer cannot be blank");
					errorMessage2.setForeground(Color.RED);
					jf.repaint();
				}

			}

		});
		

	}
}
