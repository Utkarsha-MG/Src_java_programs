 package Assignment_Project;

interface FacebookLogin //grandparent
{
	void loginacc(); //abstract method
	void logoutacc(); //abstract method
	
}

   interface  Gmaillogin extends FacebookLogin //parent class
{
	   
	   void Likepost();  //abstract method

	   void Deletepost();  //abstract method

}

public class Interface_2assign implements Gmaillogin
{   
	static void face()
   {
		System.out.println("It is facebook concrete method1");
		
   }
	void Gamil()
	{
		System.out.println("It is Gamil concrete method1");
	}

	       public static void main(String []args)
		{
			
	   		System.out.println("It is main method");
	   		
	   		Interface_2assign i2=new Interface_2assign ();
	   		i2.loginacc();
	   		i2.logoutacc();
	   		i2.Likepost();
	   		i2.Deletepost();
	   		i2.Gamil();
	   		face();
	   	
	    	   
		}


public void loginacc() {
		System.out.println("It is overrridden login abstract method");
	
}

public void logoutacc() {
		System.out.println("It is overrridden login abstract method");
	
}

public void Likepost() {
		System.out.println("It is overrridden second abstract method");
	
}

public void Deletepost() {
		System.out.println("It is overrridden 2 abstract method");
	
}


}
