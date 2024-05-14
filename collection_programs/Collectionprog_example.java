package collection_programs;

import java.util.ArrayList;

public class Collectionprog_example {

	public static void main(String[] args) {
		
		ArrayList a1 =new ArrayList ();  //class
		a1.add("Ram");
		a1.add("object");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);
		System.out.println(a1);
		
		ArrayList a2 =new ArrayList ();  //class
		
		a2.add(a1); //object
		System.out.println(a2);
		
		a2.add(1, "Rabhya");   //int index , object	
		System.out.println(a2);
		
		a2.addAll(1, a1);
		System.out.println(a2);
		
		a2.addAll(a1); //collection
		System.out.println(a2);
		
		ArrayList a3 =new ArrayList();
		
		a3.add(a1);
		a3.add(a2);
		System.out.println(a3);
        a3.add(2, "Utkarsha");
        System.out.println(a3);
        
        //a3.add(0,a1);
        //system.out.println(a3);
        
 
	}

}
