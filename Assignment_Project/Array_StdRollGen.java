package Assignment_Project;

import java.util.Arrays;

public class Array_StdRollGen {

	public static void main(String[] args) {
		String names[] = new String[4];
		// declareation and initialiation of an array
		names[0] = "Rabhya";
		names[1] = "Avni";
		names[2] = "Dhawal";
		names[3] = "Darshit";

		int rollno[] = new int[4];
		rollno[0] = 19;
		rollno[1] = 22;
		rollno[2] = 29;
		rollno[3] = 16;

		char gender[] = new char[4];
		gender[0] = 'F';
		gender[1] = 'F';
		gender[2] = 'm';
		gender[3] = 'm';

		System.out.println("names" + "     " + "rollno" + "     " + "gender");

		for (int i = 0; i < 4; i++) {
			System.out.println(names[i]+"    "+rollno[i]+"    "+ gender[i]);
			
		}
			System.out.println(Arrays.toString(names)+"      "+(Arrays.toString(rollno)+"       " +(Arrays.toString(gender))));
			

		}
	}


