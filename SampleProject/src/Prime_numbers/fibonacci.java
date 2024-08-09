package Prime_numbers;

public class fibonacci {   
		  public static void main(String args[]){    
			int a[]= {3,5,8,6,4};
			int sum = 0;
			/*for(int i=0; i<=a.length-1; i++)
			{
				sum= sum+a[i];
			}*/
			for(int value :a) {
				sum= sum +value;
			}
			System.out.println( " Sum of numbers in the array is " +sum);
}
}