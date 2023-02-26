import java.util.Scanner;

public class SwapTwoNumbers {
	
	private static Scanner sc;

	public static void main(String args[]) {
		
		
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Enter first Value");
		int a = sc.nextInt();

		
		System.out.println("Enter Second Value");
		int b = sc.nextInt();
		
		//Swap two number using third Variable
		
		/* int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After the Swap Using third variable " + a + " and " +b);
		
		System.out.println("*****************************************************");*/
		
		//Swap two number without using third Variable
		
		/*a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After the Swap without using third variable " + a + " and " +b);*/
		
        System.out.println("*****************************************************");
		
		//Swap two number without using third Variable using * and / 
        //Only applicable when both numbers are non-zero
		
		a= a*b;
		b= a/b;
		a= a/b;
		
		System.out.println("After the Swap without using third variable " + a + " and " +b);		
		
		
	}

}
