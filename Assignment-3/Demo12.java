import java.util.Scanner;
public class Demo12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        int choice = sc.nextInt();

       

        double result;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else {
            if (choice == 2) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else {
                if (choice == 3) {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                } else {
                    if (choice == 4) {
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
            }
        }
    }
}
