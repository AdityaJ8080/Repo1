package Assignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temp");
		int i = scan.nextInt();
		
		
		System.out.println(i + " Celsius = " + (i+273.15) + " Kelvin");
		
	
		System.out.println(i + " Celsius = " + (i+32) + " Fehrenheit");

	}

}
