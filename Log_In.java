import java.util.*;
import java.io.*;

//This class make accept usesr's name and password and check if they are exist in the map.

public class Log_In {
	
//=========================== Properties	
	private boolean login=false;
	private Map<String, String> UserAccount;
	
//=========================== Constructors
	public Log_In() {
		File file = new File("User Account.txt");
		UserAccount = new TreeMap<>();
		try {
			InputStreamReader inp = new InputStreamReader(new FileInputStream(file),"GBK");
			BufferedReader read = new BufferedReader(inp);
			String a;
			String account;
			String password;
			int index = 0;
			while((a=read.readLine())!=null) {
				for(int i = 0; i < a.length();i++) {
					if(a.substring(i, i+1).equals(" ")) {
						index = i;
					}
				}
				account = a.substring(0,index);
				password = a.substring(index);
				UserAccount.put(account, password);
			}
			read.close();
		}catch(Exception e){
		}
	}
	
//=========================== Methods
	
	public void Login(String account, String password) {
		if(UserAccount.containsKey(account)&&UserAccount.get(account).equals(password)) {
			login = true;
			System.out.println("Log in success!");
		}
		else {
			System.out.println("Your account or password is invalid, pleased try again.");
		}
	}
	
	public boolean login() {
		return login;
	}
	
	public Map<String, String> map(){
		return UserAccount;
	}
	
}
