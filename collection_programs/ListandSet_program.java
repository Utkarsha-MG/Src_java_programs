package collection_programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListandSet_program {

	public static void main(String[] args) {

		System.out.println("Lets understand everything about List");
		List a1 = new ArrayList();
		
		a1.add("pen");
		a1.add("Pencil");
		a1.add("Box");
		a1.add("Bottle");
		System.out.println(a1); // List follows indexing 
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		Iterator i2 = a1.iterator();
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		// list follow order of insertion
		
		
		
		System.out.println("Lets understand everything about Set");
		Set a2 = new HashSet();
		
		a2.add("pen");
		a2.add("Pencil");
		a2.add("Box");
		a2.add("Bottle");
		System.out.println(a2);
		
		a2.add(null);
		a2.add(null);
		a2.add(null);
		a2.add(null);
		a2.add(null);
		System.out.println(a2);
		
		Iterator i3 = a2.iterator();
		while (i3.hasNext())
		{
			System.out.println(i3.next());
		}
		// Set donn't follow indexing rather they follow hashcode value
		
		// set does not follow order of insertion --order of getting inserted.
		
		
		
		
		
	}

}
