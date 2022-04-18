import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

//This class make accept usesr's name and password and check if they are exist in the map.

public class Log_In {
	
//=========================== Properties	
	public static boolean login=false;
	public static Map<String, String> UserAccount;
	public static Map<String, String[]> UserSecurity;
	public static JLabel log = new JLabel("");
	public static JButton outbutton = new JButton("Log Out");
	public static JButton inbutton = new JButton("Log In");
//=========================== Constructors
	
	public static void CreateLogInButton(JFrame jf, JPanel panel) {
		
		
		inbutton.setSize(30, 100);
		inbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login_UI.main(null);;
			}

		});
		panel.add(inbutton);
		panel.add(log);
		outbutton.setSize(30,100);
		outbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				logout();
			}
		});
		inbutton.setVisible(true);
		outbutton.setVisible(false);
		panel.add(outbutton);
		
	}
	public static void LogIn() {
		File file = new File("UserAccounts.txt");
		UserAccount = new TreeMap<>();
		UserSecurity = new TreeMap<>();
		try {
			InputStreamReader inp = new InputStreamReader(new FileInputStream(file),"GBK");
			BufferedReader read = new BufferedReader(inp);
			String a;
			String account;
			String password;
			String secQ;
			String secA;
			while((a=read.readLine())!=null) {
                account = a.split("\t")[0];
                password = a.split("\t")[1];
                secQ = a.split("\t")[2];
                secA = a.split("\t")[3];


                String[] quesAndAns = new String[2];
                quesAndAns[0] = secQ;
                quesAndAns[1] = secA;
                UserAccount.put(account,password);
                UserSecurity.put(account, quesAndAns);
            }
		
			read.close();
		}catch(Exception e){
			System.out.println("Can not find the file");
		}
	}
	
//=========================== Methods
	
	public static boolean Login(String account, String password) {
		LogIn();
		if(UserAccount.containsKey(account)&&UserAccount.get(account).equals(password)) {
			login = true;
		}
		return login;
	}
	
	public boolean login() {
		return login;
	}
	
	public static void logged(String account) {
		logged(account, UI.jf);
	}
	public static void logged(String account, JFrame jf) {
		if(login == true) {
			log.setText("Logged in as: " + account);
			inbutton.setVisible(false);
			outbutton.setVisible(true);
		}
	}
	
	public static void logout() {
		login = false;
		log.setText("");
		inbutton.setVisible(true);
		outbutton.setVisible(false);
	}
	
	public Map<String, String> map(){
		return UserAccount;
	}

	//ask user, find security question based on user, print security question, have user input, 
	//check if input matches pass
	
	public static void securityQuestion(String account) {
		LogIn();
		if (UserSecurity.containsKey(account)) {
			showSecurityQuestion(account);
			
			
		} else {
			System.out.println("User does not exist");
		}
	}
	public static void showSecurityQuestion(String account) {
		JFrame questionBox = new JFrame(UserSecurity.get(account)[0]);
		
    	questionBox.setSize(500, 100);
		questionBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        questionBox.setLocationRelativeTo(null);
        questionBox.setResizable(false);
		
		 JPanel panel = new JPanel(); 
		 questionBox.add(panel);  
		 JLabel answerPrompt = new JLabel("Answer:"); 
		 answerPrompt.setBounds(10,20,80,25);
		 panel.add(answerPrompt); 
		 JTextField answerText = new JTextField(20);
		 answerText.setBounds(100,20,165,25); 
		 panel.add(answerText); 
		 JButton enterButton = new JButton("Enter"); enterButton.setBounds(10, 80, 80, 25);
		 panel.add(enterButton);
		 class jbuttonclicked implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					//if enter clicked
					if (e.getSource().equals(enterButton)) {
						if (validateSecurityAnswer(account, answerText.getText())) {
							System.out.println("Correct answer");
							changePass(account);
							
						} else {
							System.out.println("Incorrect answer");
						}
					}
				}
				}
	        enterButton.addActionListener(new jbuttonclicked());
		 
        questionBox.setVisible(true);
	}
	
	public static boolean validateSecurityAnswer(String account, String answer) {
		if (answer.equals(UserSecurity.get(account)[1])) {
			return true;
		} return false;
	}
	
	public static void changePass(String user) {

		JFrame passBox = new JFrame("Change password");
		
    	CreateAccount.createAccountUI(passBox);
    	passBox.setVisible(true);
	}
	}
	//


