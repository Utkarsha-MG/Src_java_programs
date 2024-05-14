 package Utk_1_Pacakge;
 
class StudentClass
{
	StudentClass(int a)
	{
		System.out.println("Student Constructor");
	}
}

public class InvokingConstructor {

	InvokingConstructor()
	{
		
	System.out.println("Invoking Constructor");
	}
	
	public static void main(String[] args) {
		
		new StudentClass(88);
	}
	
	}


