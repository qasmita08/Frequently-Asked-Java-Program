package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class PrintNumberUsingRecursion {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		printNos(num);
		
	}
	
	
	static void printNos(int n) {
		
		if(n>0) {
			
			printNos(n-1);
			System.out.print(n);
			
		}
		return;
	}

}
