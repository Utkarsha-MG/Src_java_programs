package Assignment_Project;

import java.util.Arrays;
import java.util.Scanner;

public class CopyofArray_Ex {

	public static void main(String[] args) {
		String[] name = new String[4];
		name[0] = "Utkarsha";
		name[1] = "Jaswanthi";
		name[2] = "Rabhya";
		name[3] = "Sandhya";
		Scanner s1= new Scanner(System.in);
		
		
       // String [] namecopy= new String[s1.nextInt()];
		
		
		String [] namecopy=  new String[name.length];
		{
			for( int i=0;i<name.length;i++)
			{
				namecopy[i]=name[i]; //java always works in right to left direction
				
			}
		
        System.out.println(Arrays.toString(name));
    
        System.out.println(Arrays.toString(namecopy));
	}

}
}
