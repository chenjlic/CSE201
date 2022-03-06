import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
public class Login_UI {
    
    public static void main(String[] args) {    
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        JPanel panel = new JPanel();    
        frame.add(panel);
        ui(panel);
        frame.setVisible(true);
    }

    private static void ui(JPanel panel) {
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
