package Assignment_Project;

public class NorWithOrAssign {

	public static void main(String[] args) {

		int a = 40;
		int b = 50;
		if(!(a>b|| b==a))
		{
			System.out.println("OR with not operator ");
		}
		if(!(a>b && b==a))
		{
			System.out.println("AND with not operator");
		}
		if(a>b|| !(b==a))
		{
			System.out.println("OR with not operator 1");
		}
		if(!(a>b && !(b==a)))
		{
			System.out.println("AND with not operator 2");
		
	}
	
	
	}

}
