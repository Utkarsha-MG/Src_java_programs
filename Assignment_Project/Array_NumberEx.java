package Assignment_Project;

import java.util.Arrays;

public class Array_NumberEx {
	
	static int value;
	

	public static void main(String[] args) {
    int nos[]=new int[4];
    nos[0]=20;
    nos[1]=30;
    nos[2]=40;
    nos[3]=50;
    int givenno=50;
    System.out.println(Arrays.toString(nos));
    for(int i=0;i<nos.length;i++)
    {
    	if(givenno==nos[i])
    	{
    		value++;
    		System.out.println("number is present in the given array" +i);
    	}
    	else {
    		System.out.println("number is not present in the given array" +i);
    	}
    	
    		
    	}
    System.out.println(value);
    }
	}


