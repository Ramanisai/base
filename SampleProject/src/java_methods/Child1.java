package java_methods;

public class Child1 extends child {
	public void c2()
	{
		System.out.println("child 2 owns a house");
	}
	public static void main(String[] args) {
		
		Child1 c11= new Child1(); 
		c11.Parent();
		c11.c1();
		c11.c2();
		
		child c22 = new child();
		c22.Parent();
		c22.c1();
		
		Debug d= new Debug();
		d.Parent();
		
	}

}
