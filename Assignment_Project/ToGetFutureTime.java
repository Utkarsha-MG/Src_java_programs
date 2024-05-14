package Assignment_Project;

import java.util.Date;

public class ToGetFutureTime {
	

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());//epoch time
		Date d2=new Date (d1.getTime()+(60*60*1000*24*1));
		System.out.println(d2);
		Date d3=new Date (d1.getTime()-(60*60*1000*24*1));
		System.out.println(d3);

	}

}
