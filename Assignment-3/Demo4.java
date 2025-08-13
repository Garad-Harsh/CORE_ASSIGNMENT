import java.util.Scanner;

public class Demo4 {
	public static boolean Triangle(int a, int b, int c) {
		// All angles must be > 0 and their sum must equal 180
		return (a > 0 && b > 0 && c > 0 && a + b + c == 180);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three angles of the triangle (in degrees):");
		int angle1 = input.nextInt();
		int angle2 = input.nextInt();
		int angle3 = input.nextInt();

		if (Triangle(angle1, angle2, angle3)) {
			System.out.println("⚠ Valid triangle!");
		} else {
			System.out.println("❌ Invalid triangle.");
		}
	}

}
