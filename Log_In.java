import java.util.*;
import java.io.*;

//This class make accept usesr's name and password and check if they are exist in the map.

public class Log_In {
	
//=========================== Properties	
	public static boolean login=false;
	public static Map<String, String> UserAccount;
	
//=========================== Constructors
	public static void LogIn() {
		File file = new File("C:\\Users\\81295\\OneDrive\\Desktop\\a\\src\\User Account.txt.txt");
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
				password = a.substring(index+1);
				
				UserAccount.put(account, password);
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
	
	public Map<String, String> map(){
		return UserAccount;
	}
	
	
	
}

