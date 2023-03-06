package frequentlyaskedjavaprogram;


public class SumofElementsInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 6 };
		int sum = 0;

		/*
		 * for(int i= 0; i<arr.length-1;i++) {
		 * 
		 * sum = sum + arr[i]; }
		 */

		// Enhanced for Loop
		for (int value : arr) {
			sum = sum + value;
		}

		System.out.println("Sum of Elements In Array is " + sum);
	}

}
