package Assignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius");
		float i = scan.nextFloat();
	
		System.out.println(i + " Celsius = " + (i+273.15) + " Kelvin");
			
		System.out.println(i + " Celsius = " + (i+32) + " Fehrenheit");

	}

}
