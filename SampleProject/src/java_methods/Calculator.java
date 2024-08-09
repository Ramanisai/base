package java_methods;

public class Calculator{
	int result;
	
		public void add (int a, int b) {
		//adding	
		result = a+b; 
		System.out.println("The sum of two numbers is:" +result);
		
		
		}
		//sub 
        public void sub(int a, int b) {
        	result = a-b;
        	System.out.println("the difference of two numbers is" +result);
         }
        
        public void mul(int a, int b) {
        	result = a*b;
        	System.out.println("the difference of two numbers is" +result);
         }
        
        
        
       // string length
        public void length(String name) {
    	
    		int a= name.length();
    		System.out.println("length of the string is: "+a );
    		
    		
    	}
        //string length
        public void length() {
        	String name= "Sravya and Sangeetha";
    		int a= name.length();
    		System.out.println("length of the string is: "+a );
    		
    		
    	}
		
		 
		

	}

