package java_methods;
import java.util.*;
public class Collections {

	public static void main(String[] args) {
		//ArrayList<String> list= new ArrayList<String>();
		LinkedList<String> list= new LinkedList<String>();
		list.add("Ramani");
		list.add("Sai");
		list.add("Lakshmi");
		list.add("Ramani");
		list.add("sravya");
		System.out.println("Size of array: "+ list.size());
		
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
