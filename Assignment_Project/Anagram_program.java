package Assignment_Project;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
          String input1 = "bear";
          String input2=  "bare";
          if (input1.length()==input2.length())
          {
        	  System.out.println("This is an anagram");
          }
          else
          {
        	  System.out.println("This is not an anagram");

          }
          char[]c1=input1.toCharArray();
          char[]c2=input2.toCharArray();
          System.out.println("before sorting");
          System.out.println(Arrays.toString(c1));
          System.out.println(Arrays.toString(c2));
          Arrays.sort(c1);
          Arrays.sort(c2);
          System.out.println("After sorting");
          System.out.println(Arrays.toString(c1));
          System.out.println(Arrays.toString(c2));
          if(Arrays.equals(c1, c2)==true)
          {
        	  System.out.println("this is an anagram");
          }
          else
          {
        	  System.out.println("this is not an anagram");
          }
          
        	  
        	  
        
          }
          
	
	
	}


