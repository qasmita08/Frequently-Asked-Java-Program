import java.util.Scanner;


public class ReverseNumber {
	private static Scanner sc;

	public static void main(String[] args) {
				
		 sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 int num = sc.nextInt();
		 
		 // Using Algo
		 
		//int reverse =0;
		
		/*while(num!=0) {
			
			reverse= reverse * 10 + num%10;
			num = num / 10;
			
		}*/
		
		//Using StringBulider Class
		
		StringBuilder rev = new StringBuilder(String.valueOf(num));
		StringBuilder sb= rev.reverse();
		
		 System.out.println("Reversed Number is " + sb);
		 
	}

}
