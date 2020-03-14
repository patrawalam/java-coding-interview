package coding;

import java.util.Scanner;

public class X005_2_Palindrome_UsingProgramming {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/* Logic
		 * If a number reads the same in reverse order, it is said to be a Palindrome
		 * eg: 121, 15951, 14830703841
		 * 
		 * For Palindrome, we will be using two variables (a) temp which will store the number passed, (b) rev variable for calculation
		 * 
		 * while loop (number passed>0)
		 * rev = rev * 10;
		 * rev = rev + num%10
		 * num = num/10
		 * 
		 */

		Scanner scn =  new Scanner(System.in);
		
		System.out.println("Enter String :: ");
		String num1 = scn.next();
		String rev = "";
		
		for (int i = num1.length() - 1;i>=0;i--) {
			rev = rev + num1.charAt(i);
		}
		
		System.out.println("Reverse of String using Loops is :: "+rev);
	
		
		System.out.println("Enter String :: ");
		String num2 = scn.next();

		StringBuffer str2 = new StringBuffer(num2);
		str2 = str2.reverse();
		
		System.out.println("Reverse of String using StringBuffer is :: "+str2);
	}
}

