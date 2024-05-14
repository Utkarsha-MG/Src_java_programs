package Assignment_Project;

public class AverageAssignment {
	static double average=0.0;
	static int sum=0;
	static double sum1=0.0;
	static double reminder=0;
	static double finalsum=0.0;
	

	public static void main(String[] args) {
		int number[]= new int[4];
		number[0] = 60;
		number[1] = 40;
		number[2] = 70;
		number[3] = 50;
		
		double number1[]= new double[4];
	    number1[0] = 1.7;
		number1[1] = 2.8;
		number1[2] = 3.0;
		number1[3] = 4.0;
  
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
			
		}
		
		for(int j=0;j<number1.length;j++)
		{
			sum1=sum1+number1[j];
			
		}
		
		finalsum = (double)sum + sum1;
		
		average=finalsum/(number.length+number1.length);
		
		
		reminder = finalsum%(number.length+number1.length);
	
		System.out.println("sum is-->>   "+finalsum);
		System.out.println("average is-->>   "+average);
		System.out.println("reminder is-->>   "+reminder);


	}

}
