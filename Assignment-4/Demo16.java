public class Demo16 {
    public static void main(String[] args) {
       int num = 1234;
        

        int original = num;
        int reverse = 0;
        for (; num != 0; num /= 10) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reverse);
    }
}
