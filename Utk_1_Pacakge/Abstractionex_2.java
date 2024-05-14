 package Utk_1_Pacakge;

   class College
{
	College(String college_name){
		
		System.out.println("College");
	}
}
   
  class School extends College
  {
	  School(int a, String b, double c)
	  {
	  super("Nuva College");
	 
		  System.out.println("School");
	  }
  }
  
  
public class Abstractionex_2  {

	public static void main(String[] args) {
  School s1 =new School (100, "naju", 56.69);

		
	}

}
