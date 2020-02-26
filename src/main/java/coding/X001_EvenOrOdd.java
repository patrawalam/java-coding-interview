package coding;

import java.util.Scanner;

public class X001_EvenOrOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Logic:
		 * Modulo operation
		 * if output is 0, its even, else odd
		 * 
		 */
		
		int num;
		
		System.out.println("Enter a number :: ");
		Scanner scn = new Scanner(System.in);
		
		num = scn.nextInt();	
		
		if(num % 2 == 0) {
			System.out.println("Number "+ num + " is even");
		}
		else
		{
			System.out.println("Number "+ num + " is odd");
		}

	}

}
