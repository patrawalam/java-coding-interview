package javaprograms;

public class X009_SecondLargestAndThirdLargestInAnArray {
	
	/*
	 * I do not take credit for this code. This was asked to me in one of the interviews
	 * 
	 */
	
	public static void main(String[] args) {
		
	

	int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largest = arr[0];
	int secondLargest = arr[0];
	int thirdLargest = arr[0];
	
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\t");
	}
	
	//Logic starts here
	for (int i = 0; i < arr.length; i++) {

		if (arr[i] > largest) {		 
			secondLargest = largest;
			largest = arr[i];

		} else if (arr[i] > secondLargest) {
			thirdLargest = secondLargest;
			secondLargest = arr[i];
		
	}
		else if (arr[i] > thirdLargest) {
			thirdLargest = arr[i];
		}
	}
	System.out.println("\nSecond largest number is: " + secondLargest);
	System.out.println("\nThird largest number is: " + thirdLargest);
}
}