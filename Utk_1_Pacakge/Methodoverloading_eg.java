 package Utk_1_Pacakge;

public class Methodoverloading_eg {
	void add() {
		int a=100;
		System.out.println(a+6);
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	static void add(double a,int b)
	{
		System.out.println(a+6);
	}
	 void add(int a, int b, int c, int d)
	 {
		 System.out.println(a+b+c+d);
		 
	 }
	 void add(double a, double b)
	 {
		 System.out.println(a+6);
	 }
	 
		public static void main(String[] args) {
        add(0.09,8);
        Methodoverloading_eg m1= new Methodoverloading_eg();
        m1.add();
        m1.add(90000);
        m1.add(11,11,11,0);
        m1.add(1.23,0.09);
        
    	 
     }
	}


