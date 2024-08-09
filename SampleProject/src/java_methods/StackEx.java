package java_methods;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<String> Stack=new Stack<String>();
		Stack.push("Ramani");
		Stack.push("Sai");
		Stack.push("Lakshmi");
		Stack.push("sravya");
		Stack.push("Sangeetha");
		Stack.push("Ramya");
		
		
		Stack.pop();
		Stack.pop();
		Iterator itr= Stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		

	}

}
}
