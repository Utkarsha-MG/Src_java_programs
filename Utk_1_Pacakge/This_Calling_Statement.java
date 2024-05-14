package Utk_1_Pacakge;

public class This_Calling_Statement 
{   
	This_Calling_Statement(int a,int b)
	{
		System.out.println("This is a first constructor :- "+a+" "+b);
	}
	
	This_Calling_Statement(int a,int b,int c)
	{
		this(2, 9, 22, 99);
		System.out.println("THis is a second construtor :- "+a+" "+b+" "+c);
	}

	This_Calling_Statement(int a,int b,int c,int d)
	{
		this(33, 100);
		System.out.println("THis is a third constructor :- "+a+" "+b+" "+c+" "+d);
	}
	
	public static void main(String args[])
	{
		new This_Calling_Statement(3,9,5);
		//new This_Calling_Statement(1,9,6,7);
		//new This_Calling_Statement(1,2);
	}
	
}