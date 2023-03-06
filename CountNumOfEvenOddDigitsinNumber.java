package frequentlyaskedjavaprogram; 

import java.util.Scanner;

public class CountNumOfEvenOddDigitsinNumber {

	static Scanner sc;

	public static void main(String[] args) {

		int evenCount = 0;
		int oddCount = 0;

		sc = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = sc.nextInt();

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				evenCount++;
			}

			else {
				oddCount++;
			}
			
			num = num/10;

		}
		System.out.println("Even count is " + evenCount);
		
		System.out.println("Odd Count is " + oddCount);

	}

}
