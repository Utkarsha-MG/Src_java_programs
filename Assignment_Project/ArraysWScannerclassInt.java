package Assignment_Project;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWScannerclassInt {

	public static void main(String[] args) {
     Scanner s1=new Scanner(System.in);
     System.out.println("Enter the size of an Array");
     int Rollno[]=new int[s1.nextInt()];
     for(int i=0;i<Rollno.length;i++)
     {
    	 System.out.println("Enter the value Rollno");
    	 Rollno [i]=s1.nextInt(); 
     }
     System.out.println("Values of an Array"  +Arrays.toString(Rollno));
     System.out.println("Enter the size of an array Two");
     int Rollno1[]=new int[s1.nextInt()];
     for(int i=0;i<Rollno1.length;i++)
     {
    	 
    	 System.out.println("Enter the value Rollno1");
    	 Rollno1[i]=s1.nextInt();
    	 
     }
     System.out.println("Values of an Array"   +Arrays.toString(Rollno1));
     if(Arrays.equals(Rollno, Rollno1)==true)
     {
    	 System.out.println("Rollno matched");
     }
     else
     {
    	 System.out.println("Rollno not matched");
     }
	}
	
}
