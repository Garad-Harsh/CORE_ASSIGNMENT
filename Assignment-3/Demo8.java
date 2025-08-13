import java.util.Scanner;
public class Demo8 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first integer: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second integer: ");
	        int b = sc.nextInt();
	        

	       
	        if (a % 2 != 0 && b % 2 != 0) {
	            int diff = Math.abs(a - b);
	            System.out.println("Absolute difference: " + diff);
	        } else {
	            System.out.println("Invalid");
	        }
	    }
}
