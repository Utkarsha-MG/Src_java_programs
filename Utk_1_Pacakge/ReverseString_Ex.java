package Utk_1_Pacakge;

public class ReverseString_Ex {

	public static void main(String[] args) {

					System.out.println("The given string is :-");
			String sentence ="My Life My Rules";    //"india is very beautiful country";
			                  //aidni si yrev lufituaeb yrtnuoc 
			System.out.println(sentence);
		    String s[] =sentence.split(" ");	
			System.out.println(s.length);
		    for(int i=0;i<=s.length-1;i++)
		    {
		    	String each_word =" "+s[i];
		         char c[]=each_word.toCharArray();
		    	
		         for(int j=c.length-1;j>=0;j--)
		         {
		        	 System.out.print(c[j]);
		         }
		              
		    }
			}
}
		
	


