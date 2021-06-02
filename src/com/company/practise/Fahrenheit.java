package com.company.practise;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[]args) {

		Scanner userInput = new Scanner(System.in);
			System.out.print("Please insert temperature(F):");
		
		double fahrenheit = userInput.nextDouble();
		fahrenheit = ((fahrenheit - 32)/1.8F);
			System.out.printf("Temperature in celsius: %.1f\n" , fahrenheit);	
		/*
		
		Scanner newUserInput = new Scanner(System.in);
			System.out.println("Enter distance(mi)");
			
			double miles = newUserInput.nextDouble();
			miles = (miles/5)*8;
			
			System.out.printf("Distance in Kms: %.1f\n", miles);
			
			if(miles < 2) {
				System.out.println("You lazy Fuck! Walk.");
			} 
			
			
			else if(miles >= 2 && miles <= 6) {
				System.out.println("Just ride your damn Bike.");
			}	
			
			
			else  {
				System.out.println("Walk? Bike? you must be outta your mind, take the fucking Bus.");
			}
			
		
	*/
	}
}

