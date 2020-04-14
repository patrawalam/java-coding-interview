package java;

import java.util.Scanner;

public class X002_LargestOfThreeNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Logic:
		 * If first number is greater than second and third number, first is greatest
		 * else
		 * If second number is greater than third number, second is greatest
		 * else
		 * third is greatest
		 * 
		 */

		Scanner scn = null;

		System.out.println("Enter first number :: ");
		scn = new Scanner(System.in);
		int num1 = scn.nextInt();

		System.out.println("Enter second number :: ");
		int num2 = scn.nextInt();

		System.out.println("Enter third number :: ");
		int num3 = scn.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("Number " + num1 + " is largest");
		} else if (num2 > num3) {
			System.out.println("Number " + num2 + " is largest");
		} else {
			System.out.println("Number " + num3 + " is largest");
		}

	}

}
