package coding;

import java.util.Scanner;

public class X003_2_SwappingTwoVariablesWithoutUsingThird {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Logic
		 * num1 = num1 + num2
		 * num2 = num1 - num2
		 * num1 = num1 - num2
		 */
		
		int num1, num2;
		Scanner scn =  new Scanner(System.in);
		
		System.out.println("Enter first number :: ");
		num1 = scn.nextInt();
		
		System.out.println("Enter second number :: ");
		num2 = scn.nextInt();
		
		System.out.println("Numbers before swapping :: "+ num1 + " --- "+ num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after swapping :: "+ num1 + " --- "+ num2);
		
	}

}
