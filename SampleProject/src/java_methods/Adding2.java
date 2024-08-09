package java_methods;

public class Adding2 {
	public static void main(String args[]) {
		int n, i, count=0;
		n=3;
		for(i=2; i<n; i++) {
			if(i%n==0) {
				count++;
				
			}
		}
		if (count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
			
		}
	}
		
}