import java.util.Scanner;
public class Dem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		
		char c=sc.nextLine().charAt(0);
		
		 if (Character.isUpperCase(c)) {
	            System.out.println("Uppercase letter");
	        } else if (Character.isLowerCase(c)) {
	            System.out.println("Lowercase letter");
	        } else if (Character.isDigit(c)) {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special character");
	        }
	}

}
