package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class FactorialOfNumber {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		int factorial = 1;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			factorial =factorial * i;
		}
		System.out.println("Factorial Of Number is " +factorial);

	}

}
