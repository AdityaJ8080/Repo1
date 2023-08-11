package Assignment;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int i = scan.nextInt();
		
		System.out.println("Enter 2nd Number");
		int j = scan.nextInt();
		
		
		System.out.println(" Sum = " + (i+j));
		System.out.println(" Difference = " + (i-j));
		System.out.println(" Product = " + (i*j));
		System.out.println(" Average = " + (i+j)/2);
		
		int Distance = Math.abs(i-j);
		System.out.println(" Distance = " + Distance);
		

		if (i==j)
		 {
			System.out.println(" Numbers are equal ");
		}
		else {
			
	
		if (i<j)
		{
			System.out.println(" Smaller Digit = " + i );	
	
		} else 
		{
			System.out.println(" Smaller Digit = " + j );	
	
		}
		
		if (i>j)
		{
			System.out.println(" Larger Digit = " + i );	
	
		} else 
		{
			System.out.println(" Larger Digit = " + j );	
	
		}
		}
				
	
	}

}
