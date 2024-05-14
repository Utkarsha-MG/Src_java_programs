 package Assignment_Project;
class Flipkart_1
{
	static void login ()
	{
		System.out.println("It is login method");
		
	}
	  void login_account()
	  {
		  System.out.println("it is login_account method");
	  }
}

abstract class Amazon_1 extends Flipkart_1
{
	abstract void add();//abstract method
	abstract void sub();//abstract method
	static void mul()//concrete method
	{
		System.out.println("it is mul method 1");
	}
	
	 void div() {
		 System.out.println("it is div method");
		 
	 }
}
         class Abstract_classassign extends Amazon_1 {
        	 
        	 static void sum() {
        		 System.out.println("it is sum ");
        	 }
        	 
        	 void mod()
        	 {
        		 System.out.println("it is mod");
        		 
        	 }
	
	

	public static void main(String[] args) {
		Abstract_classassign a1= new Abstract_classassign();
		login();
		a1.login_account();
		a1.mod();
	}

	void add() {
		System.out.println("addition");
		
	}

	void sub() {
		System.out.println("substraction");
		
	}

}
