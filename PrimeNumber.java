package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class PrimeNumber {

	static Scanner sc;

	public static void main(String[] args) {

		int count = 0;

		sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num > 1) {
			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
				if (count == 2) {
					System.out.println("Number is Prime Number");
				}
			}

		} else {

			System.out.println("Number is not Prime Number");
		}

	}

}
