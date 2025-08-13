import java.util.Scanner;
public class Demo19 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number 1: ");
	        int a = sc.nextInt();
	        System.out.print("Enter number 2: ");
	        int b = sc.nextInt();
	        System.out.print("Enter number 3: ");
	        int c = sc.nextInt();
	        

	        // Check if 'a' is even or odd
	        if (a % 2 == 0) {
	            // a is even → check b
	            if (b % 2 == 0) {
	                // a and b are even → check c
	                if (c % 2 == 0) {
	                    System.out.println("Even Chain");
	                } else {
	                    System.out.println("Mixed Chain");
	                }
	            } else {
	                // a is even, b is odd → automatically mixed
	                System.out.println("Mixed Chain");
	            }
	        } else {
	            // a is odd → check b
	            if (b % 2 != 0) {
	                // a and b are odd → check c
	                if (c % 2 != 0) {
	                    System.out.println("Odd Chain");
	                } else {
	                    System.out.println("Mixed Chain");
	                }
	            } else {
	                // a is odd, b is even → automatically mixed
	                System.out.println("Mixed Chain");
	            }
	        }
	    }
}
