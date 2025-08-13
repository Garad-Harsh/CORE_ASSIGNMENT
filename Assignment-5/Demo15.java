import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();
        sc.close();

        long absValue = Math.abs(n);        
        int sum = sumDigits(absValue);       

        System.out.printf("Sum of digits of %d = %d%n", n, sum);
    }


    public static int sumDigits(long value) {
        if (value == 0) return 0;

        int total = 0;
        while (value != 0) {
            total += (int) (value % 10);
            value /= 10;
        }
        return total;
    }
}

