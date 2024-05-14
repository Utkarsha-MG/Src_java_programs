 package Utk_1_Pacakge;

public class Nonstaticmethodeg {
		
		 void add()
		 {
			 int a = 100;
			 int b = 200;
			 System.out.println(a+b);
			 
		 }
		 void sub()
		 {
			 int a= 200;
			 int b= 100;
			 
			 System.out.println(a-b);
		 }
		 
			public static void main(String[] args) {
   
				Nonstaticmethodeg n1 = new Nonstaticmethodeg();
				n1.add();
				n1.sub();
			}

	
}
