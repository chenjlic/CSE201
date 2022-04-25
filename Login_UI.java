import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
public class Login_UI {
	
    public static void main(String[] args) {    
    	
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        JPanel panel = new JPanel();    
        frame.add(panel);
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
        JButton forgotPass = new JButton("Forgot Password");
        forgotPass.setBounds(10,120,160,25);
        
        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(10, 80, 80, 25);
        Timer timer = new Timer();
        
        class jbuttonclicked implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				//if login button clicked
				
				if (e.getSource().equals(loginButton)) {
				if(Log_In.Login(AccountText.getText(), passwordText.getText())) {
					JFrame f1 = new JFrame("Success!");
					f1.setSize(500, 100);
					f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        f1.setLocationRelativeTo(null);
			        f1.setResizable(false);
			        JPanel p1 = new JPanel();
			        f1.add(p1);
			        JLabel l1 = new JLabel("Login Success!");
			        p1.add(l1);
			        f1.setVisible(true);
			        Log_In.login = true;
			        timer.schedule(new TimerTask() {
			        	@Override
			        	public void run() {
			        		f1.setVisible(false);
			        		frame.setVisible(false);
			        	}
			        }, 2000);
			        Log_In.logged(AccountText.getText());
			        AddToFavorite.currentAccount(AccountText.getText());
				}
				else {
					JFrame f2 = new JFrame("Failed!");
					f2.setSize(500, 100);
					f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			        f2.setLocationRelativeTo(null);
			        f2.setResizable(false);
			        JPanel p2 = new JPanel();
			        f2.add(p2);
			        JLabel l2 = new JLabel("Your account or password is invalid!");
			        p2.add(l2);
			        f2.setVisible(true);
			        timer.schedule(new TimerTask() {
			        	@Override
			        	public void run() {
			        		f2.setVisible(false);
			        	}
			        }, 1000);
				}
				}
				
				//if forgot pass clicked
				if (e.getSource().equals(forgotPass)) {
					forgotPassBox();
					
					
				}
				
			
			}
        	
        }
        loginButton.addActionListener(new jbuttonclicked ());
        forgotPass.addActionListener(new jbuttonclicked ());

        panel.add(loginButton);
        panel.add(forgotPass);
        frame.setVisible(true);
        
    }
    
    public static void forgotPassBox() {
    	JFrame forgotPassEnterUser = new JFrame("Enter your username");
    	forgotPassEnterUser.setSize(500, 100);
		forgotPassEnterUser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        forgotPassEnterUser.setLocationRelativeTo(null);
        forgotPassEnterUser.setResizable(false);
    	JPanel panel = new JPanel();
    	forgotPassEnterUser.add(panel);
        JLabel AccountLabel = new JLabel("Account:");
        AccountLabel.setBounds(10,20,80,25);
        panel.add(AccountLabel);
        JTextField AccountText = new JTextField(20);
        AccountText.setBounds(100,20,165,25);
        panel.add(AccountText);
        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(10, 80, 80, 25);
        panel.add(enterButton);
        forgotPassEnterUser.setVisible(true);
        
        class jbuttonclicked implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				//if enter clicked
				if (e.getSource().equals(enterButton)) {
					Log_In.securityQuestion(AccountText.getText());
				}
			}
			}
        enterButton.addActionListener(new jbuttonclicked());
        forgotPassEnterUser.setVisible(true);

        
    	
    }
    

    
}
