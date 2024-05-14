package Assignment_Project;

public class Assignment_47finalWlocalglobal {
	
	 static final int age = 33;//global variable
	 static final String name ="Avani"; // global variable
	 void add()
	{
		final int a= 10; // local variable
		final int b = 20; // local variable
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		Assignment_47finalWlocalglobal f1 = new Assignment_47finalWlocalglobal();
		 
		 f1.add();

		System.out.println(age);

	}

}
