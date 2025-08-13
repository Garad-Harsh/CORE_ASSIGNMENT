import java.util.Scanner;
public class Demo18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        

        // Check if a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Now classify
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else {
                // Nested else to check isosceles vs scalene
                if (a == b || b == c || a == c) {
                    System.out.println("Isosceles triangle");
                } else {
                    System.out.println("Scalene triangle");
                }
            }
        } else {
            System.out.println("Invalid triangle sides");
        }
    }

}
