import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("No odd numbers.");
            return;
        }

        int limit = (a % 2 == 0) ? a - 1 : a;  
        StringBuilder sb = new StringBuilder();

        for (int val = 1; val <= limit; val += 2) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(val);
        }

        System.out.println(sb.toString());
    }
}
