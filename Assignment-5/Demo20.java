public class Demo20 {
    static void Digits(int n) {
        int largest = 0;
        int smallest = 9;

        while (n != 0) {
            int r = n % 10;

            largest = Math.max(r, largest);

            smallest = Math.min(r, smallest);

            n = n / 10;
        }
        System.out.println(largest + " " + smallest);
    }

    public static void main(String[] args) throws java.lang.Exception {
        int n = 2346;

        Digits(n);

    }
}
