package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class PrintFabonacciSerriesUsingRecursion {
	
	static Scanner sc;
	
	public static void main(String args[]) {
			
		//int a=0,b=1,c;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		
		for(int i=0; i<=num; i++) {
			
			System.out.print(fibRecursion(i) + " ");
		}	
	}
		
		public static int fibRecursion(int count) {
		    if (count == 0) {
		      return 0;
		    } // Oth fibonacci is 0

		    if (count == 1 || count == 2) {
		      return 1;
		    } // 1st and 2nd Fibonacci are 1 and 1 only

		    // calling function recursively for nth Fibonacci
		    return fibRecursion(count - 1) + fibRecursion(count - 2);
		  }
	}