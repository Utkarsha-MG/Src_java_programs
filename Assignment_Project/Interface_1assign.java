 package Assignment_Project;

   interface Keyword
   {
	   void Search(); //abstract method
		void Translate();//abstract method
   }
 
public class  Interface_1assign implements Keyword {
	
	static void add()                       //concrete method
	{
		System.out.println("It is addition concrete method1");
		
	}
       void sub()                            //concrete method
       { 
   		System.out.println("It is substraction non static concrete method1");

       }
       
       public static void main(String []args)
       {
   		System.out.println("It is main method");
   		
   		Interface_1assign I1= new Interface_1assign();
   		I1.Search();
   		I1.Translate();
   		add();
   		I1.sub();
   		

       }
    
	public void Search() {
   		System.out.println("It is overrridden abstract method1 from interface parent class ");
		
	}
	public void Translate() {
   		System.out.println("It is overrridden abstract method2 from interface parent class");
		
	}
	
	
	
}
    

