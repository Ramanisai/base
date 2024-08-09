package java_methods;

public class child {
	
	public static void main(String args[]) {
		Debug db=new Debug();
		
		db.setUsername("Ramani");
		db.setPassword("sai@123");
		
		String uname= db.getUsername();
		String pwd= db.getPassword();
		System.out.println("Username is " +uname);
		System.out.println("Password is " +pwd);

		}
}
