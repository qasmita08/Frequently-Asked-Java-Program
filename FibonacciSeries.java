package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class FibonacciSeries {

	static Scanner sc;

	public static void main(String[] args) {

		int num1 = 0, num2 = 1, sum = 0;

		sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();

		System.out.print(num1 + "," + num2);

		for (int i = 2; i <= num; i++) {

			sum = num1 + num2;
			System.out.print( "," + sum);
			num1 = num2;
			num2 = sum;
		}
	}

}
