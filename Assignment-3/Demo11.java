import java.util.Scanner;
public class Demo11 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter marks for subject 1: ");
	        int m1 = sc.nextInt();
	        System.out.print("Enter marks for subject 2: ");
	        int m2 = sc.nextInt();
	        System.out.print("Enter marks for subject 3: ");
	        int m3 = sc.nextInt();
	        

	        
	        if (m1 >= 33) {
	            if (m2 >= 33) {
	                if (m3 >= 33) {
	                    System.out.println("Pass");
	                } else {
	                    System.out.println("Fail");
	                }
	            } else {
	                System.out.println("Fail");
	            }
	        } else {
	            System.out.println("Fail");
	        }
	    }
}
