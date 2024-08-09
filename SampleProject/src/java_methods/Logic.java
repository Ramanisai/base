package java_methods;

public class Logic {

	public static void main(String[] args) {
		Login lg = new Login();
		lg.setUsername("Ramani");
		lg.setPassword("Ramani@123");
		
		String uname =lg.getUsername();
		String pwd = lg.getPassword();
		System.out.println("Username is: "+uname);
		System.out.println("Password is "+pwd);
		
		}

}
