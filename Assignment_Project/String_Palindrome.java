package Assignment_Project;

public class String_Palindrome {

	public static void main(String[] args) {
    String input= "madam";
    String output="";
    for(int i=input.length()-1;i>=0;i--)
    {
 
		char op= input.charAt(i);
		output=output+op;
    	
    }
    	System.out.println(output);
    	//System.out.println(input);
    	if(input.equals(output))
    	{
    		System.out.println("String is palindrome");
    	}
    	else
    	{
    		System.out.println("String is not palindrome");

    	}
	}

}
