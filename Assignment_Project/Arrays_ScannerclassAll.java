package Assignment_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ScannerclassAll {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		String name[] = new String[s1.nextInt()];
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter the name of an Array" + i);
			name[i] = s1.next();

		}
		System.out.println("Values of an arrays" + Arrays.toString(name));
		System.out.println("Enter the size of an array Two");
		String name1[] = new String[s1.nextInt()];
		for (int i = 0; i < name1.length; i++) {

			System.out.println("Enter the name of an Array Two" + i);
			name1[i] = s1.next();

		}
		System.out.println("Enter the values of an Array Two" + Arrays.toString(name1));

		if (Arrays.equals(name, name1) == true) {
			System.out.println("Arrays Matched");
		} else {
			System.out.println("Arays not Matched");
		}
	}  
}
