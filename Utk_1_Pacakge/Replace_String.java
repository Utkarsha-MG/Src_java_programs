package Utk_1_Pacakge;


public class Replace_String {

	public static void main(String[] args) {
String name= "school1234";

	String output=	name.replaceAll("[a-z]", "");

System.out.println(output);


String ip="School123";
String output1=	ip.replaceAll("[A-Z]", "");

System.out.println(output1);




String ip1="School123";
String output2=	ip1.replaceAll("[0-9]", "");

System.out.println(output2);



	}

}
