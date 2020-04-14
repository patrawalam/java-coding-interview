package java;

import java.util.Scanner;

public class X007_FibonacciNumberOfFirstNNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * A series is said to be fibonacci if the number is the sum of two preceding numbers 
		 * 
		 * You will need three variables, (a) a = 0, (b) b = 1 and c
		 * c = a+b
		 * a=b
		 * b=c
		 * 
		 * Start printing from (a ...)
		 */
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter an Integer :: ");
		int num = scn.nextInt();
		
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print("Fibonacci Series of first "+num+" numbers :: ");
		for (int i = 0; i<num;i++) {
			System.out.print(a + " ");
			c = a+b;
			a=b;
			b=c;
		}
		

	}

}
