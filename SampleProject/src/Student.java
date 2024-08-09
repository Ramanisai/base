import java.util.Scanner;
public class Student {
	int id;
	String name;
	String location;
	public void printStudent() {  //METHOD
		System.out.println("Student id is:" +id);
		System.out.println("Student name is:" +name);
		System.out.println("Student location is:" +location);
		System.out.println("");
	}
	public Student(int id, String name, String location) {  //PARAMETRIZED CONSTRUCTOR
		this.id=id;     
		this.name=name;
		this.location=location;
		}
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);		//SCANNER
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter location:");
		String location = sc.next();
		
		Student s1 =new Student(id, name, location);   //OBJECT
		s1.printStudent();
		
		
		}
}
