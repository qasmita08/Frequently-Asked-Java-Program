package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class FindLargestOfThreeNumbers {

	static Scanner sc;

	public static void main(String args[]) {

		sc = new Scanner(System.in);

		System.out.println("Enter First Number");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {

			System.out.println("Largest Number is " + num1);

		}

		if (num2 > num1 && num2 > num3) {

			System.out.println("Largest Number is " + num2);

		}

		if (num3 > num1 && num3 > num2) {

			System.out.println("Largest Number is " + num3);
		}

	}

}
