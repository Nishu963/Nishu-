import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] count = new int[10];
        for (int n : nums) {
            for (int d = 1; d <= 9; d++) {
                if (n % d == 0) count[d]++;
            }
        }

        StringBuilder sb = new StringBuilder("{");
        for (int d = 1; d <= 9; d++) {
            sb.append(d).append(": ").append(count[d]);
            if (d < 9) sb.append(", ");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}