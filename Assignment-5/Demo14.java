import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();                     
        long temp = Math.abs(n);                      
        int count = 0;

        if (temp == 0) {
            count = 1;                                 
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;                             
            }
        }

        System.out.printf("Number of digits (in %d): %d%n", n, count);
        sc.close();

    }
}
