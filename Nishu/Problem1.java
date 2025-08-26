import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        if (!sc.hasNext()) {
            System.out.println("No operator entered.");
            return;
        }
        String op = sc.next();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }
        double b = sc.nextDouble();

        double result;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
