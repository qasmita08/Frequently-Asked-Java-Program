package frequentlyaskedjavaprogram;

import java.util.Scanner;


public class PalindromeString {
	
	static Scanner sc;
	
	public static void main(String args[]) {
		
		
		String rev= "";
		
		sc= new Scanner(System.in);
		
		System.out.println("Enter the String");
		String input = sc.next();
		
		String orgString = input;
		
		int length = input.length();
		
		for(int i =length-1; i>=0;i--) {
			
			rev = rev + input.charAt(i);
		}
		
		if (rev.equals(orgString)) {
			
			System.out.println("String is Palindrome");
		}
		else {
				
				System.out.println("String is not Palindrome");
		}

	
	}

}
