import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   

        if (a <= 0) return;

        int limit = (a % 2 == 0) ? a - 1 : a;  
        StringBuilder sb = new StringBuilder();

        for (int val = 1; val <= limit; val += 2) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(val);
        }

        System.out.println(sb.toString());
    }
}