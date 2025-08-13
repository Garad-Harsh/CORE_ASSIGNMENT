public class Demo15 {
    public static void main(String[] args) {
        double base=2;
        int exp=3;
         double result = 1;
        int absExp = Math.abs(exp);
        for (int i = 0; i < absExp; i++) {
            result *= base;
        }
        if (exp < 0) {
            result = 1 / result;
        }
        System.out.println(base + " ^ " + exp + " = " + result);
    }
}
