public class Demo21 {
    public static void main(String[] args) {
         int count = 5;
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
            if (i < count) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
