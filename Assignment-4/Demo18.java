import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
        }
    }
}
