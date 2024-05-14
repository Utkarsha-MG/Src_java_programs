package Utk_1_Pacakge;

class Utkarsha_1
{
	Utkarsha_1(int a)
	{
		System.out.println(1);
	}
}


class Utkarsha
{
	Utkarsha(int a)
	{
		super();
		System.out.println(1);
	}
}
class Usha extends Utkarsha
{
	Usha(int a,float b)
	{
		super(15);
		System.out.println(2);//yet to print
	}
}
class Jassy extends Usha
{
	Jassy(int c, String b,double m)
	{
		super(12,2.36f);
		System.out.println(3); //yet to print
	}
}
//class Sreedevi  
//{
	//Sreedevi()
	//{
	//	System.out.println(4);
	//}
//}
	public class Supercalling_P
	{
		Supercalling_P()
		{
			System.out.println(3);
		}	
public static void main(String[] args)
{
	Jassy j1=new Jassy(10,"Sandhya",1.23);
}
}
