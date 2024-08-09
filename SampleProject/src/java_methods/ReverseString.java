package java_methods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter name: " );
		String name= input.nextLine();
		char a[] = name.toCharArray();
		String rname = "";
		int len= name.length();
		
		for (int i= len-1; i>=0; i--)
		{
		rname= rname+a[i];
		}
		System.out.println("Reverse name is: "+rname );
		
	}
	
		
	}


