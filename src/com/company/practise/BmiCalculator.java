package com.company.practise;

public class BmiCalculator {
	
	
	
	public static void main(String[]args) {
		
		final String name = "Mike Mikerson";
		final int age = 21;
		final double height = 1.83;  
		final double weight = 83.88;
		final boolean male = true;

		if(male == true) {
			System.out.printf("Gender: %b\n" , male);
		}

		double bmi = (weight/(height * height));
	
		System.out.println("Name:  " + name);
		System.out.println("- - - - - - - - - - ");
		System.out.println("Gender: " + male);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height + "m");
		System.out.println("Weight: " + weight + "kg");
		System.out.printf("BMI: %.1f\n%s ", bmi ,"Weight catergory:");
		
		if(bmi < 18.5) {
			System.out.println("underweight");
		}
			else if(bmi >25) {
				System.out.println("overweight");
			}
				else {
					System.out.println("normal");
				}
		}
		
	}
	

