import java.util.Scanner;
public class Demo20 {
	 public static void main(String[] args) {
	        final int MIN_VOTING_AGE = 18;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter age: ");
	        int age = sc.nextInt();

	        System.out.print("Are you a citizen? (Y/N): ");
	        char cit = sc.next().toUpperCase().charAt(0);
	        

	        // Nested if-else checks
	        if (age >= MIN_VOTING_AGE) {
	            if (cit == 'Y') {
	                System.out.println("Eligible to vote");
	            } else {
	                System.out.println("Denied");
	            }
	        } else {
	            System.out.println("Denied");
	        }
	    }

}
