package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class ReverseString {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		
		//String rev= "";
		
		sc = new Scanner(System.in);
		 
		System.out.println("Enter the String");
		String input  = sc.next();
		
		//Using for Loop and Concatenation
		
		//int length = input.length();
		
		/*for(int i=length-1;i>=0;i--) {
			
			rev = rev + input.charAt(i);
			
		}*/
		
		
		// Using charArrray
		
		/*char[] arr = input.toCharArray();
		
		for(int i = length-1; i>=0;i--) {
			
			rev = rev + arr[i];
		}*/
		
		//Using StringBuilder Class
		
		StringBuilder sb = new StringBuilder(input);
		System.out.println("Reverse String is " + sb.reverse());
		
		

	}

}
