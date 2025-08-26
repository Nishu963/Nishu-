import java.util.Scanner;

public class Problem1 {
    static class Calculator {
        double calculate(double a, double b, String op) {
            switch (op.toLowerCase()) {
                case "add": return a + b;
                case "subtract": return a - b;
                case "multiply": return a * b;
                case "divide":
                    if (b == 0) throw new ArithmeticException("Division by zero");
                    return a / b;
                default: throw new IllegalArgumentException("Invalid operation: " + op);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();
        System.out.println(new Calculator().calculate(a, b, op));
    }
}