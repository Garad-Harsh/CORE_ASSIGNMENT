import java.util.Scanner;
public class Demo17 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature value: ");
	        double temp = sc.nextDouble();
	        System.out.print("Enter unit (C or F): ");
	        char unit = sc.next().toUpperCase().charAt(0);
	     

	        double result;
	        if (unit == 'C') {
	            // Celsius → Fahrenheit
	            result = temp * 9.0 / 5.0 + 32;
	            System.out.println(temp + "°C = " + result + "°F");
	        } else {
	            if (unit == 'F') {
	                // Fahrenheit → Celsius
	                result = (temp - 32) * 5.0 / 9.0;
	                System.out.println(temp + "°F = " + result + "°C");
	            } else {
	                System.out.println("Invalid unit! Please enter 'C' or 'F'.");
	            }
	        }
	    }
}
