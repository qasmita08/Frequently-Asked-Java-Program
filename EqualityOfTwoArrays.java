package frequentlyaskedjavaprogram;

import java.util.Scanner;

public class EqualityOfTwoArrays {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
	    int a[]=new int[n];
		
	    System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        // Approach 1 - Brute Force
        
        for(int i=0; i<a.length;i++) {
        	for(int j= i+1; j<a.length;j++) {
        		
        		if (a[i]==a[j]) {
        			System.out.println("Ducplicate element found" + a[i]);
        			
        		}
        		else {
        			System.out.println("Ducplicate element not found");
        		}
        	}
        }
        
		

	}

}
