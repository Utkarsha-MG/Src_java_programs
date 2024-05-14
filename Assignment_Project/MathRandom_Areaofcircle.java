package Assignment_Project;

public class MathRandom_Areaofcircle {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			double r = Math.random();
			double c = Math.random();
			double p = Math.PI;
			System.out.println("Radious of circle is:" + c / 2 * p);
			System.out.println("area of circle is:" + p * r * r);
		}
	}

}
