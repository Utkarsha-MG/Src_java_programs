package Assignment_Project;

public class VerticalStringandReversestring {

	public static void main(String[] args) {

	String name= "Rabhyaa";
	String name1= "Sandhya";
	
	for(int i=0; i<=name.length();i++) // vertical string
	{
		System.out.print(name.charAt(i)+" "+name1.charAt(i)+" ");
		//System.err.print(name1.charAt(i));
	}
	/*System.out.println("------");
	for(int i=name.length()-1;i>=0;i--) // this is for reverse string.

	{
		System.out.println(name.charAt(i));

	}*/
	
	}
}