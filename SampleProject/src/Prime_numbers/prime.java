package Prime_numbers;

public class prime {

	public static void main(String[] args) {
		int i,n=3;
		int count=0;
		if (n>1) 
		{
			for(i=1; i<=n; i++)
			{
				if(n%i==0)
					count++;
				
			} 
			if (count==2)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
			
			else
				System.out.println(n+ " given number is not a prime");
			
		}
}


