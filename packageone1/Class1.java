package packageone1;

// What happens within the class
public class Class1 {
	
	public void add()
	{
		System.out.println("one");
	}
	 private void sub()
	{
		System.out.println("two");
	}
	protected void mul()
	{
		System.out.println("three");
	}
	void div()
	{
		System.out.println("four");
	}

	public static void main(String[] args) {

		Class1 a1=new Class1();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		add1();
		sub1();
		mul1();
		div1();
	}


public static void add1()
{
	System.out.println("1");
}
 private static void sub1()
{
	System.out.println("2");
}
protected static void mul1()
{
	System.out.println("3");
}
static void div1()
{
	System.out.println("4");
}
}