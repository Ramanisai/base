package returntype;

public class Sailakshmi {
	int result;
	
	public int add (int a, int b) {
	//adding	
	   result = a+b; 
	   System.out.println("The result of two numbers is:" +result);
	   return result;
	
	}
	//sub 
    public int sub(int a, int b) {
    	result = a-b;
    	System.out.println("The result of two numbers is" +result);
    	return result;
     }
    
    public int mul(int a, int b) {
    	result = a*b;
        System.out.println("The difference of two numbers is" +result);
        return result;
     }
    
}
