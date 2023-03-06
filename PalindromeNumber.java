package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class PalindromeNumber {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		
		int rev =0;
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int orgnum = num;
		
		while (num!=0) {
			rev = rev*10 + num%10;
			num= num /10;			
			
		}
		
		System.out.println("reverse number is " + rev);
		
		if(rev==orgnum) {
			
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}		
	
	}

}
