import java.util.Scanner;
public class Demo14 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter current balance: ₹");
	        double balance = sc.nextDouble();

	        System.out.print("Enter withdrawal amount: ₹");
	        double withdrawal = sc.nextDouble();
	        

	        // Nested checks
	        if (withdrawal % 100 == 0) {
	            if (withdrawal <= balance) {
	                System.out.println("Approved");
	            } else {
	                System.out.println("Rejected: Insufficient balance");
	            }
	        } else {
	            System.out.println("Rejected: Amount must be a multiple of 100");
	        }
	    }

}
