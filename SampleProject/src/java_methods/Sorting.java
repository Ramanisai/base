package java_methods;

public class Sorting {
	public static void main(String args[]) {
		int marks[]= {34,26,54,67,89};
		int temp;
		System.out.println("The original marks list is:");
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]+" ");
		}
		for (int i=0; i<marks.length; i++)
			for(int j=0; j<marks.length-1; j++) {
				if(marks[j]<marks[j+1]) {
					temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]= temp;
				}
		}
	System.out.println("\n\nThe marks list is in Descending order:");
	for(int i=0; i<marks.length; i++) {
		System.out.println(marks[i]+"-(Rank-"+(i+1)+")");
		}
	}
}