 package Assignment_Project;

import Utk_1_Pacakge.Globalvaraible3;

public class ASMMwithGlobalV {
	
	int a = 5;
	int b = 3;
	double c = 19.3;
	 String name = "Rabhya";
	
	void add()
	{
	System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
		
	}
	void mul() {
		System.out.println(a*b);
	}
	
	void mod() {
		System.out.println(b%c);
	}
	
	void asmm(String name, int add,int sub, int mul, int mod, double c) {
		System.out.println("hey" + name + add +sub +mul +mod + c);
	}
		
	public static void main(String[] args) {
		ASMMwithGlobalV g1 = new ASMMwithGlobalV();
		System.out.println(g1.name);
		g1.add();
		g1.sub();
		g1.mul();
		g1.mod();
		g1.asmm("Naju", 2+3, 3-1, 2*3, 16%3, 0.6 );

	}
       
	}


