
public class TryCatch1 {

	public static void main(String[] args) {
		try {
			int[] room_numbers = {101, 102, 103, 301, 401};
			System.out.println("Room numbers is : " + room_numbers[1]);
			System.out.println("Room numbers is : " + room_numbers[5]);
		} catch(Exception e)
		{
			System.out.println("Something went wrong, fix the below exception...");
			e.printStackTrace();
		}

	}

}
