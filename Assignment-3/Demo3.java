import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int greater;

        if (num1 >= num2) {
            if (num1 >= num3) {
                greater = num1;
            } else {
                greater = num3;
            }
        } else {
            if (num2 >= num3) {
                greater = num2;
            } else {
                greater = num3;
            }
        }

        System.out.println("The greater number is: " + greater);
	}

}
