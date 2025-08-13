import java.util.Scanner;
public class Demo15 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter annual income (₹): ");
	        double income = sc.nextDouble();
	        

	        double tax = 0.0;

	        if (income <= 250000) {
	            tax = 0;
	        } else {
	            // Next slab: 2.5L–5L at 5%
	            if (income <= 500000) {
	                tax = (income - 250000) * 0.05;
	            } else {
	                tax = (500000 - 250000) * 0.05;  // full slab

	                // Next slab: 5L–10L at 20%
	                if (income <= 1000000) {
	                    tax += (income - 500000) * 0.20;
	                } else {
	                    tax += (1000000 - 500000) * 0.20;
	                    // Above 10L at 30%
	                    tax += (income - 1000000) * 0.30;
	                }
	            }
	        }

	        System.out.println("Total tax payable: ₹" + tax);
	    }
}
