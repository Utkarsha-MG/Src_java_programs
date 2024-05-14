package Assignment_Project;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {

		Date d1 = new Date(); //present date
		System.out.println(d1);
		//System.out.println(d1.getTime());//epoch time
		String input= d1.toString();
		System.out.println(input);
		String month=input.substring(4, 7);
		System.out.println(month);
		String date=input.substring(8,10);
		System.out.println(date);
		String year= input.substring(24);
		System.out.println(year);
		System.out.println(input.length());
		System.out.println(date.concat("  ").concat(month).concat("  ").concat(year));	
		System.out.println(date+" - "+month+"  - "+year);	
		System.out.println(date+" / "+month+"  / "+year);	

		
	}

}
