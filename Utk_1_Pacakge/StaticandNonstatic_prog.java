 package Utk_1_Pacakge;

public class StaticandNonstatic_prog {
	
	 static void add()
	{
		System.out.println("addition");
	}
	 static void sub()
	{
	
	System.out.println("substraction");
}

 static void div()
	{
		System.out.println("division");
	}
 static void mul()
	{
		System.out.println("multiplication");
	}
	
	
	 void sum()
	 {
		 int a = 100;
		 int b = 200;
		 System.out.println(a+b);
		 
	 }
	 void minus()
	 {
		 int a= 300;
		 int b= 100;
		 
		 System.out.println(a-b);
	 }
	 
	 
	void divide()
	{
		int a= 100;
		int b= 50;
		
		System.out.println(a/b);
		
	}
	
		public static void main(String[] args) {
			
			add();
			sub();
			div();
			mul();
		
		StaticandNonstatic_prog m1 = new StaticandNonstatic_prog();
	    m1.sum();
		m1.minus();
		m1.divide();
			
	}
		

	}

