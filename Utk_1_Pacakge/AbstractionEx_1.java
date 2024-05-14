 package Utk_1_Pacakge;
class Parent_class1
{
	Parent_class1()
	{
		System.out.println("Grand parent");
		}
}

class Child_class extends Parent_class1
{
	Child_class()
	{
		System.out.println("Parent");
	}
}

public class AbstractionEx_1 extends Child_class {
	AbstractionEx_1(){
		System.out.println("child");
	}

	public static void main(String[] args) {

		new AbstractionEx_1();
	}

}
