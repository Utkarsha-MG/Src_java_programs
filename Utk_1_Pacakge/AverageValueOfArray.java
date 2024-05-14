package Utk_1_Pacakge;

public class AverageValueOfArray {

	static double average = 0;
	static int sum = 0;
	static double reminder=0;

	public static void main(String[] args) {
		int number[] = new int[4];
		number[0] = 19;
		number[1] = 28;
		number[2] = 32;
		number[3] = 18;

		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
			average = sum / number.length;
			average = sum % number.length;

		}

		System.out.println("sum is-->  " + sum);
		System.out.println("average is-->  " + average);
	    System.out.println("Reminder is-->    "+ reminder);

	}

}
