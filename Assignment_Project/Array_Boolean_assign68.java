package Assignment_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Boolean_assign68 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner (System.in);

		boolean [] number = new boolean[3];
		
		System.out.println("enter the values True or False");
		
		for (int i=0; i< number.length;i++)
		{
			System.out.println("enter the value"  + i +":");
			
			number [i] = s1.nextBoolean();
		}
		
		System.out.println(Arrays.toString(number));

	}
	

}
