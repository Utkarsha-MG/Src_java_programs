  package Assignment_Project;

interface Instagram
{
	void Story();
	void Reel();
	
}
  interface Youtube
  {
	  void shorts();
	  void vlog();
  
  }
public class Interface3_Multipleinheritance implements Instagram, Youtube {
                 
         static void add()
         {
	
 		System.out.println("Hello insta");
        
         }
         void sum()
         {
        	 System.out.println("Hello Family");
         }
         
        public static void main(String []args)
        {
       	 System.out.println("Hello main method");
       	 
       	Interface3_Multipleinheritance i3= new Interface3_Multipleinheritance();
       	i3.Story();
       	i3.Reel();
       	i3.shorts();
       	i3.vlog();
       	i3.sum();
       	add();
       	
        }
  
        
	public void shorts() {
     	 System.out.println("Act  :overridden multiple inhertance abstarct method");
		
	}

	public void vlog() {
      	 System.out.println("Hello guys  :overridden multiple inhertance abstarct method");
		
	}

	public void Story() {
     	 System.out.println("Hi story:overridden multiple inhertance abstarct method");
		
	}

	public void Reel() {
     	 System.out.println("Dance reel :overridden multiple inhertance abstarct method");
		
	}
      

}
