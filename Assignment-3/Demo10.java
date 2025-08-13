import java.util.Scanner;
public class Demo10 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter total units consumed: ");
	        int units = sc.nextInt();
	        sc.close();

	        double bill = 0.0;

	        if (units <= 100) {
	            bill = units * 5.0;
	        } else {
	            // First 100 units
	            bill = 100 * 5.0;

	            if (units <= 300) {
	                // Next (units − 100)
	                bill += (units - 100) * 7.0;
	            } else {
	                // Units greater than 300
	                bill += (200 * 7.0);             // Units 101–300
	                bill += (units - 300) * 10.0;    // Units above 300
	            }
	        }

	        System.out.println("Total bill: ₹" + bill);
	    }
}
