package coding;

import java.util.Scanner;

public class X005_Palindrome {

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
		
		System.out.println("Enter number :: ");
		int num = scn.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num>0) {
			rev = rev * 10;
			rev = rev + num%10;
			num = num/10;
		}
		
		if(rev == temp)
			System.out.println("Number "+temp+" is a Palindrome");
		else
			System.out.println("Number "+temp+" is NOT a Palindrome. If a number reads the same in reverse order, it is said to be a Palindrome");
	}

}
