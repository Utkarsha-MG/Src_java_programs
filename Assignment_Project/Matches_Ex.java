package Assignment_Project;

import java.util.Arrays;

public class Matches_Ex {

	public static void main(String[] args) {
String name= "Rabhya";
System.out.println(name.matches("R(.*)"));
System.out.println(name.matches("(.*)s"));
System.out.println(name.matches("......"));
System.out.println(name.indexOf('h'));
System.out.println(name.repeat(10));
String name1= "My life my rules";
String[] name2= name1.split(" ");
System.out.println(Arrays.toString(name1.split("   ")));

	}

}
