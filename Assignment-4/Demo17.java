public class Demo17 {
    public static void main(String[] args) {
         int num = 121;
        int original = num;
        int reverse=0;
        int rem;
     while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
if (original == reverse) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

    }
}
