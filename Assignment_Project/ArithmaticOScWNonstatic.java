 package Assignment_Project;
import java.util.*;

public class ArithmaticOScWNonstatic {
	
	
		static int s2;
		static int s3;
		static void add()
		{
			System.out.println("this is the sum:" +(s2+s3));
			
		}
		
		static void sub()
		{
			System.out.println(s2-s3);
			
		}
		 void div()
		{
			System.out.println(s2/s3);
		}
		
		static void mul()
		{
			System.out.println(s2*s3);
		}
		static void mod()
		{
			System.out.println(s2%s3);
		}

	public static void main(String[] args) {
      Scanner s1 = new Scanner(System.in);
      System.out.println("enter the s2 value");
      int d1= s1.nextInt();
      
      System.out.println("enter the s3 value");;
      ArithmaticOScWNonstatic c1 =new ArithmaticOScWNonstatic();
      s2=s1.nextInt();
      s3=s1.nextInt();
     // ScannerEx f1= new ScannerEx();
      
      add();
      sub();
      c1.div();
      mul();
      mod();
      
      s1.close();
      
	}		
	}


	



	
		
	

		
	