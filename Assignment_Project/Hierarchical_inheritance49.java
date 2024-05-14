package Assignment_Project;

class Parent
{
	static void add()
	{
		System.out.println("Parent addition method");
	}
}

class child1 extends Parent
{
	static void mod()
	{
		System.out.println("child1 mod method");
	}
}
class child2 extends child1
{
	static void mul()
	{
		System.out.println("child2 mul method");
	}
}
public class Hierarchical_inheritance49 extends child2 {


	public static void main(String[] args) {
		Parent.add();
		child1.mod();
		child2.mul();

	}

}
