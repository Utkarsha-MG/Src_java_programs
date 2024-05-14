package Assignment_Project;

import java.util.Scanner;

public class Arraydatatype3_assign64 {

	public static void main(String[] args) {
  Scanner s1 = new Scanner(System.in);
  
  int [] age = new int[3];
  System.out.println("Enter the values of an array");
  System.out.println("   ");
  for (int i =0; i<age.length;i++)
  {
	  System.out.println("Enter the value"   +i);
	  age[i] = s1.nextInt();
  }
  
	}

}
