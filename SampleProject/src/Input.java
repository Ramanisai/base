
public class Input {
	int id;
	String name;
	String location;
	public void printInput()   //METHOD
	{
		System.out.println("Student id is:" +id);
		System.out.println("Student name is:" +name);
		System.out.println("Student location is:" +location);
		System.out.println("");
	}
	public Input () {   //CONSTRUCTOR
	location ="SDI VIZAG";
	
	}
	public static void main (String args[]) {
	Input i=new Input();  //OBJECT1
	i.id=301;
	i.name="Ramani";
	
	Input i1 = new Input();	//OBJECT2
	i1.id=201;
	i1.name="Sai";
	
	Input i2=new Input(); //OBJECT3
	i2.id=789;
	i2.name="Lakshmi";
	
	i.printInput();			//Calling Method
	i1.printInput();
	i2.printInput();
	}	
	
}
	
	



