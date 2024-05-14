package Assignment_Project;

import java.util.Arrays;

public class Countof_Alpha {
	
	static int b;
	static int f;
     static int g;
     static int x;
     
	public static void main(String[] args) {
		String name= "123Utkarsha  567@#$%";
	    char [] a1= name.toCharArray();
	    System.out.println(Arrays.toString(a1));
	    for(int i=0;i<a1.length;i++)
	    {
	    	
      boolean s= Character.isAlphabetic(a1[i]);
      if(s==true)
      {
    	  b++;
    //   System.out.print(" " +a1[i]);
	    }
     // System.out.println();
      boolean d= Character.isDigit(a1[i]);
	  if(d==true)
	  {
		  f++;
	  //     System.out.print(" "+a1[i]);

	  }
     // System.out.println();

	  boolean e=Character.isSpaceChar(a1[i]);
	  if(e==true)
	  {
		  g++;
	     //  System.out.print(" "+a1[i]);

	  }
	}
	    System.out.println("This is Count of alphabets:- "+b);
	    System.out.println("This is Count of numeric values:- "+f);
	    System.out.println("This is Count of space:- "+g);
	    System.out.println(a1.length);
	    int total=b+f+g;
	    System.out.println(a1.length-total);


}
}
