import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  

        if (a <= 0) return;

        StringBuilder sb = new StringBuilder();
        for (int i = 0, val = 1; i < a; i++, val += 2) {
            if (i > 0) sb.append(", ");
            sb.append(val);
        }
        System.out.println(sb.toString());
        
        sc.close(); 
    }
}
