package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class NumberOfDigitsInANumber {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		
		int count = 0;
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num !=0) {
			
			num = num /10;
			count = count +1;			
		}
		
		System.out.println("Number Of Digits In A Number is "+ count);
		
		
		
	}

}
