package javaprograms;

import java.util.Scanner;

public class X006_2_FactorialOfANumberUsingRecurssion {

	public static int fact (int x) {
		if (x==1) {
			return 1;
		}
		else {
			return x*fact(x-1);
		}
		
	}
	public static void main(String[] args) {
		
		System.out.print("Enter a number :: ");
		Scanner scn = new Scanner(System.in);
		int value = scn.nextInt();
		
		System.out.println("The factorial of "+value+" using recurrsion is :: "+fact(value));

	}

}
