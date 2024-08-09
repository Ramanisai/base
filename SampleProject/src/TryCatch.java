import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		int a;
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a: ");
			a = sc.nextInt();
			System.out.println("You have entered a as " +a);
	} catch (Exception e) {
		System.out.println("Please enter only numbers (Non- Decimal), Try again");
		e.printStackTrace();
	}finally {
		System.out.println("It will always execute.....");
	}
		
	}

}