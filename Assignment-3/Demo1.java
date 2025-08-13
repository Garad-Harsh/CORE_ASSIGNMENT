import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int a = sc.nextInt();

		System.out.print("Enter second integer: ");
		int b = sc.nextInt();

		int larger, smaller;

		if (a > b) {

			larger = a;
			smaller = b;
		} else {
			larger=b;
			smaller=a;

		}
		 if (larger % 2 == 0) {
	            System.out.println(larger);
	        } else {
	            System.out.println(smaller);
	        }

	}

}