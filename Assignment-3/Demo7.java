import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();

		if (age < 0) {
			System.out.println("Invalid age!");
		} else {
			if (age <= 12) {
				System.out.println("Child");
			} else { // age >= 13
				if (age <= 17) {
					System.out.println("Teen");
				} else { // age >= 18
					if (age <= 59) {
						System.out.println("Adult");
					} else { // age >= 60
						System.out.println("Senior");
					}
				}

			}
		}
	}
}
