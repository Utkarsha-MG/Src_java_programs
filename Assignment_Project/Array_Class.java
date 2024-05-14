package Assignment_Project;

import java.util.Scanner;

public class Array_Class {


		public static void main(String[] args) {
		  		Scanner s1=new Scanner(System.in);
		  		String name[]=new String[s1.nextInt()];
		  		
		  		 for(int i=0;i<name.length;i++)
		  		{
		  			name[i] = s1.next();
		  			 System.out.println(name[i]);
		  		}
		}

	
	}


