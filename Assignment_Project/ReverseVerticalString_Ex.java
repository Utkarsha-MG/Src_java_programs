package Assignment_Project;

public class ReverseVerticalString_Ex {

	public static void main(String[] args) {

		String input = "Priya";
		
		for(int i=input.length()-1;i>=0;i--)
			
		{
			char c1 = input.charAt(i);
			
			System.out.println(c1);
		}
		
	}

}
