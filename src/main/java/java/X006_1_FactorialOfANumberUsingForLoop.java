package java;

import java.util.Scanner;

public class X006_1_FactorialOfANumberUsingForLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * Logic 7! = 7*6*5*4*3*2*1
		 * 
		 * Conditions 
		 * Factorial of negative number is a complex number, no need to calculate 
		 * Factorial of 0 is 1 
		 * Factorial of 1 is 1
		 * 
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter number :: ");
		int num = scn.nextInt();
		int fact = 1;
		
		if(num<0)
			System.out.println("Unable to calculate Factorial of negative number as it is complex");
		else if (num == 0)
			System.out.println("Factorial of 0 is 1");
		else if (num == 1)
			System.out.println("Factorial of 1 is 1");
		else 
		{
			for (int i = num;i>=1;i--)
				fact = fact * i;
			System.out.println("Factorial of "+num+" is :: "+fact);
		}
	}

}
