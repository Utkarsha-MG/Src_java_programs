package collection_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort_Method {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		
		a1.add(15);
		a1.add(76);
		a1.add(900);
		a1.add(-120);
		a1.add(65);
		a1.add(23);
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("utkarsha");
		a2.add("usha");
		a2.add("sandhya");
		a2.add("jassy");
		Collections.sort(a2);
		System.out.println(a2);
		
		
	}

}
