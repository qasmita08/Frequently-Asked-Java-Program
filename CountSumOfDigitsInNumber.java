package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class CountSumOfDigitsInNumber {
	
	static Scanner sc ;
	
	public static void main(String[] args) {
		
		int sum =0;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num>0) {
			
			int rem = num %10;
			
			sum = sum +rem;
			
			num = num /10;
			
		}
		
		System.out.println("Sum Of Digits In Number is "+ sum);
		

	}

}
