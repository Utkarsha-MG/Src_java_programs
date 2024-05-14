 package Utk_1_Pacakge;

public class Localvaraible {
	
	static void add()
	{
		int a=10;// local varaible
		int b=20;//local varaible

		System.out.println(a+b);
		
		}
  void mul()

  {
	  int x= 5;
	  int y= 25;
	  
	  System.out.println(x*y);
  }
  public static void main(String[] args) {
	  add();
	  Localvaraible d1=new Localvaraible();
	     d1.mul();
	  int d11 =10;
	  System.out.println(d11+4);
  }
}


