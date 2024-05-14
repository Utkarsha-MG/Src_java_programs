package Utk_1_Pacakge;


public class This_keywordEx {
	String name = "Baby";
	int age = 19;
	double weight = 20.23;

	void add(String name, int age, double weight) {
		System.out.println("hey baby" + name + age + weight);
		{
			
        this.age=age;
        this.name=name;
        this.weight=weight;
		}
	}
        
	public static void main(String[] args) {
		Globalvaraible3 g1 = new Globalvaraible3();
		System.out.println(g1.name);
		System.out.println(g1.age);
		g1.add("Rabhya",  25, 56.65);

	}
}
	

