package collection_programs;

import java.util.ArrayList;

public class Functionsof_Iterator_collection {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("Ram");  // add object boolean (array list method)
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);
		System.out.println(a1);
	
		ArrayList a2=new ArrayList();
		
		a2.add("Ram");  // add object boolean (array list method)
		a2.add("Umesh");
		a2.add(12);
		a2.add("67");
		a2.add(true);
		a2.add(98);
		System.out.println(a2);

		
			a1.remove(2);
			System.out.println(a1);
			a1.removeAll(a2);
	        System.out.println(a1);
	        a1.add(a2);
	        System.out.println(a1);
	        a2.removeAll(a1);
	        System.out.println(a2);
	        a2.clear();
	        System.out.println(a2);
	        
	        System.out.println(a1.isEmpty());
	        boolean answer1 = a2.isEmpty();
	        System.out.println(answer1);
	         
	        
	   //      a2.addAll(a1);// object
	        
		//	a2.add(1, "Manish"); // int index , object
		//	a2.addAll(1, a1); // int index , collection
		//	System.out.println(a2);
	        
	}
	}


