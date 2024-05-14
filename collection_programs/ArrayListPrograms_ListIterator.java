package collection_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPrograms_ListIterator {

	public static void main(String[] args) {
		System.out.println("Lets understand everything about List");
		List a1 = new ArrayList();
		
		a1.add("pen");
		a1.add("Pencil");
		a1.add("Box");
		a1.add("Bottle");
		System.out.println(a1); 
		
		ListIterator i2 = a1.listIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("===========================");
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
	}

}
}
