package java;

import java.util.Scanner;

public class X003_1_SwappingTwoVariablesUsingThirdVariable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Logic
		 * int temp = 0;
		 * 
		 * temp = num1
		 * num1 = num2
		 * num2 = num1
		 * 
		 */
		
		int temp = 0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number :: ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter Second Number :: ");
		int num2 = scn.nextInt();
		
		
		System.out.println("Numbers before swapping :: "+num1+" --- "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping :: "+num1+" --- "+num2);

	}

}
